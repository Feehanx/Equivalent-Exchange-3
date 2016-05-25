package com.pahimar.ee3.test;

import com.pahimar.ee3.api.exchange.EnergyValue;
import com.pahimar.ee3.api.exchange.EnergyValueRegistryProxy;
import com.pahimar.ee3.exchange.WrappedStack;
import com.pahimar.ee3.util.LogHelper;
import com.pahimar.ee3.util.SerializationHelper;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class EnergyValueTestSuite {

    public static final Marker TEST_MARKER = MarkerManager.getMarker("EE3_ENERGY_VALUE_TEST", LogHelper.MOD_MARKER);
    private static final Marker SUCCESS_MARKER = MarkerManager.getMarker("EE3_ENERGY_VALUE_TEST_SUCCESS", TEST_MARKER);
    private static final Marker FAILURE_MARKER = MarkerManager.getMarker("EE3_ENERGY_VALUE_TEST_FAILURE", TEST_MARKER);

    private Map<WrappedStack, EnergyValue> testSuiteValueMap;
    private transient Set<WrappedStack> stacksWithCorrectValue;
    private transient Set<WrappedStack> failureStacksWithWrongValue;
    private transient Set<WrappedStack> failureStacksWithNoValue;

    public EnergyValueTestSuite() {
        testSuiteValueMap = new TreeMap<>();
        stacksWithCorrectValue = new TreeSet<>();
        failureStacksWithWrongValue = new TreeSet<>();
        failureStacksWithNoValue = new TreeSet<>();
    }

    public EnergyValueTestSuite(File file) {
        load(file);
    }

    public EnergyValueTestSuite add(Object object, Object value) {

        if (WrappedStack.canBeWrapped(object)) {

            WrappedStack wrappedStack = WrappedStack.wrap(object, 1);
            if (value instanceof Number) {
                testSuiteValueMap.put(wrappedStack, new EnergyValue((Number) value));
            }
            else if (value instanceof EnergyValue) {
                testSuiteValueMap.put(wrappedStack, (EnergyValue) value);
            }
            else if (value == null) {
                testSuiteValueMap.put(wrappedStack, null);
            }
        }

        return this;
    }

    public EnergyValueTestSuite remove(Object object) {

        if (WrappedStack.canBeWrapped(object)) {
            testSuiteValueMap.remove(WrappedStack.wrap(object, 1));
        }

        return this;
    }

    public void run() {
        run(false);
    }

    public void run(boolean strict) {

        stacksWithCorrectValue.clear();
        failureStacksWithWrongValue.clear();
        failureStacksWithNoValue.clear();

        List<String> successMessages = new ArrayList<>();
        List<String> failureMessagesWrongValue = new ArrayList<>();
        List<String> failureMessagesNoValue = new ArrayList<>();

        for (WrappedStack wrappedStack : testSuiteValueMap.keySet()) {

            EnergyValue expectedValue = testSuiteValueMap.get(wrappedStack);
            EnergyValue actualValue = EnergyValueRegistryProxy.getEnergyValue(wrappedStack, strict);

            if (actualValue == null && expectedValue == null) {
                // Success - anticipated that no value was found and no value was found
                successMessages.add(String.format("SUCCESS: Object '%s' had the expected energy value [Expected (%s), Found (%s)]", wrappedStack, expectedValue, actualValue));
                stacksWithCorrectValue.add(wrappedStack);
            }
            else if (actualValue == null) {
                // Failure - anticipated that a value would be found but no value was found
                failureMessagesNoValue.add(String.format("FAILURE: Object '%s' did not have the expected energy value [Expected (%s), Found (%s)]", wrappedStack, expectedValue, actualValue));
                failureStacksWithNoValue.add(wrappedStack);
            }
            else if (actualValue != null && expectedValue != null) {

                if (actualValue.equals(expectedValue)) {
                    //  Success - anticipated that a specific value would be found and the anticipated value was found
                    successMessages.add(String.format("SUCCESS: Object '%s' had the expected energy value [Expected (%s), Found (%s)]", wrappedStack, expectedValue, actualValue));
                    stacksWithCorrectValue.add(wrappedStack);
                }
                else {
                    // Failure - anticipated that a specific value would be found and while a value was found it was not the anticipated one
                    failureMessagesWrongValue.add(String.format("FAILURE: Object '%s' did not have the expected energy value [Expected (%s), Found (%s)]", wrappedStack, expectedValue, actualValue));
                    failureStacksWithWrongValue.add(wrappedStack);
                }
            }
        }

        for (String successMessage : successMessages) {
            LogHelper.info(SUCCESS_MARKER, successMessage);
        }

        for (String failureMessage : failureMessagesWrongValue) {
            LogHelper.warn(FAILURE_MARKER, failureMessage);
        }

        for (String failureMessage : failureMessagesNoValue) {
            LogHelper.warn(FAILURE_MARKER, failureMessage);
        }
    }

    public EnergyValueTestSuite load(File file) {

        try {
            testSuiteValueMap = SerializationHelper.readMapFromFile(file);
        }
        catch (FileNotFoundException e) {
            LogHelper.warn(TEST_MARKER, "Could not load test file from disk: " + e.getMessage());
            testSuiteValueMap = new TreeMap<>();
        }

        stacksWithCorrectValue = new TreeSet<>();
        failureStacksWithWrongValue = new TreeSet<>();
        failureStacksWithNoValue = new TreeSet<>();

        return this;
    }

    public EnergyValueTestSuite save(File file) {
        SerializationHelper.writeMapToFile(testSuiteValueMap, file);
        return this;
    }
}
