package com.pahimar.ee3.test;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class VanillaEnergyValueTest extends EnergyValueMappingsTestSuite
{
    public VanillaEnergyValueTest()
    {
        buildTestSuite();
    }

    private void buildTestSuite()
    {
        addBuildingBlocksTabTestCases();
        addDecorationBlocksTabTestCases();
        addRedstoneTabTestCases();
        addTransportationTabTestCases();
        addMiscellaneousTabTestCases();
        addFoodstuffsTabTestCases();
        addToolsTabTestCases();
        addCombatTabTestCases();
        addBrewingTabTestCases();
        addMaterialsTabTestCases();
    }

    private void addBuildingBlocksTabTestCases()
    {
        add(Blocks.stone, 1);
        add(Blocks.grass, 1);
        add(Blocks.dirt, 1);
        add(new ItemStack(Blocks.dirt, 1, 2), 1);
        add(Blocks.cobblestone, 1);
        add(new ItemStack(Blocks.planks, 1, 0), 8);
        add(new ItemStack(Blocks.planks, 1, 1), 8);
        add(new ItemStack(Blocks.planks, 1, 2), 8);
        add(new ItemStack(Blocks.planks, 1, 3), 8);
        add(new ItemStack(Blocks.planks, 1, 4), 8);
        add(new ItemStack(Blocks.planks, 1, 5), 8);
        add(Blocks.bedrock, null);
        add(Blocks.sand, 1);
        add(Blocks.gravel, 4);
        add(Blocks.gold_ore, 2048);
        add(Blocks.iron_ore, 256);
        add(Blocks.coal_ore, 32);
        add(new ItemStack(Blocks.log, 1, 0), 32);
        add(new ItemStack(Blocks.log, 1, 1), 32);
        add(new ItemStack(Blocks.log, 1, 2), 32);
        add(new ItemStack(Blocks.log, 1, 3), 32);
        add(Blocks.sponge, null);
        add(Blocks.glass, 1);
        add(Blocks.lapis_ore, 864);
        add(Blocks.lapis_block, 9 * 864);
        add(new ItemStack(Blocks.sandstone, 1, 0), 4);
        add(new ItemStack(Blocks.sandstone, 1, 1), 4);
        add(new ItemStack(Blocks.sandstone, 1, 2), 4);
        add(new ItemStack(Blocks.wool, 1, 0), 48);
        add(new ItemStack(Blocks.wool, 1, 1), 56);
        add(new ItemStack(Blocks.wool, 1, 2), 56);
        add(new ItemStack(Blocks.wool, 1, 3), 56);
        add(new ItemStack(Blocks.wool, 1, 4), 56);
        add(new ItemStack(Blocks.wool, 1, 5), 56);
        add(new ItemStack(Blocks.wool, 1, 6), 56);
        add(new ItemStack(Blocks.wool, 1, 7), 56);
        add(new ItemStack(Blocks.wool, 1, 8), 56);
        add(new ItemStack(Blocks.wool, 1, 9), 56);
        add(new ItemStack(Blocks.wool, 1, 10), 56);
        add(new ItemStack(Blocks.wool, 1, 11), 56);
        add(new ItemStack(Blocks.wool, 1, 12), 56);
        add(new ItemStack(Blocks.wool, 1, 13), 56);
        add(new ItemStack(Blocks.wool, 1, 14), 56);
        add(new ItemStack(Blocks.wool, 1, 15), 56);
        add(Blocks.gold_block, 9 * 2048);
        add(Blocks.iron_block, 9 * 256);
        add(new ItemStack(Blocks.stone_slab, 1, 0), 0.5);
        add(new ItemStack(Blocks.stone_slab, 1, 1), 2);
        add(new ItemStack(Blocks.stone_slab, 1, 3), 0.5);
        add(new ItemStack(Blocks.stone_slab, 1, 4), 128);
        add(new ItemStack(Blocks.stone_slab, 1, 5), 0.5);
        add(new ItemStack(Blocks.stone_slab, 1, 6), 2);
        add(new ItemStack(Blocks.stone_slab, 1, 7), 512);
        add(Blocks.brick_block, 256);
        add(Blocks.bookshelf, 528);
        add(Blocks.mossy_cobblestone, 1);
        add(Blocks.obsidian, 64);
        add(Blocks.oak_stairs, 12);
        add(Blocks.diamond_ore, 8192);
        add(Blocks.diamond_block, 9 * 8192);
        add(Blocks.stone_stairs, 1.5);
        add(Blocks.redstone_ore, 32);
        add(Blocks.ice, 1);
        add(Blocks.snow, 1);
        add(Blocks.clay, 256);
        add(Blocks.pumpkin, 144);
        add(Blocks.netherrack, 1);
        add(Blocks.soul_sand, 49);
        add(Blocks.glowstone, 1536);
        add(Blocks.lit_pumpkin, 153);
        add(new ItemStack(Blocks.stained_glass, 1, 0), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 1), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 2), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 3), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 4), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 5), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 6), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 7), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 8), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 9), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 10), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 11), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 12), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 13), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 14), 9);
        add(new ItemStack(Blocks.stained_glass, 1, 15), 9);
        add(new ItemStack(Blocks.stonebrick, 1, 0), 1);
        add(new ItemStack(Blocks.stonebrick, 1, 1), 1);
        add(new ItemStack(Blocks.stonebrick, 1, 2), 1);
        add(new ItemStack(Blocks.stonebrick, 1, 3), 1);
        add(Blocks.melon_block, 144);
        add(Blocks.brick_stairs, 384);
        add(Blocks.stone_brick_stairs, 1.5);
        add(Blocks.mycelium, 1);
        add(Blocks.nether_brick, 4);
        add(Blocks.nether_brick_stairs, 6);
        add(Blocks.end_stone, 1);
        add(new ItemStack(Blocks.wooden_slab, 1, 0), 4);
        add(new ItemStack(Blocks.wooden_slab, 1, 1), 4);
        add(new ItemStack(Blocks.wooden_slab, 1, 2), 4);
        add(new ItemStack(Blocks.wooden_slab, 1, 3), 4);
        add(new ItemStack(Blocks.wooden_slab, 1, 4), 4);
        add(new ItemStack(Blocks.wooden_slab, 1, 5), 4);
        add(Blocks.sandstone_stairs, 6);
        add(Blocks.emerald_ore, 8192);
        add(Blocks.emerald_block, 9 * 8192);
        add(Blocks.spruce_stairs, 12);
        add(Blocks.birch_stairs, 12);
        add(Blocks.jungle_stairs, 12);
        add(new ItemStack(Blocks.cobblestone_wall, 1, 0), 1);
        add(new ItemStack(Blocks.cobblestone_wall, 1, 1), 1);
        add(Blocks.quartz_ore, 256);
        add(new ItemStack(Blocks.quartz_block, 1, 0), 1024);
        add(new ItemStack(Blocks.quartz_block, 1, 1), 1024);
        add(new ItemStack(Blocks.quartz_block, 1, 2), 1024);
        add(Blocks.quartz_stairs, 1536);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 0), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 1), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 2), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 3), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 4), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 5), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 6), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 7), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 8), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 9), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 10), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 11), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 12), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 13), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 14), 257);
        add(new ItemStack(Blocks.stained_hardened_clay, 1, 15), 257);
        add(new ItemStack(Blocks.log2, 1, 0), 32);
        add(new ItemStack(Blocks.log2, 1, 1), 32);
        add(Blocks.acacia_stairs, 12);
        add(Blocks.dark_oak_stairs, 12);
        add(Blocks.hay_block, 216);
        add(Blocks.hardened_clay, 256);
        add(Blocks.coal_block, 288);
        add(Blocks.packed_ice, null);
    }

    private void addDecorationBlocksTabTestCases()
    {
        add(new ItemStack(Blocks.sapling, 1, 0), 32);
        add(new ItemStack(Blocks.sapling, 1, 1), 32);
        add(new ItemStack(Blocks.sapling, 1, 2), 32);
        add(new ItemStack(Blocks.sapling, 1, 3), 32);
        add(new ItemStack(Blocks.sapling, 1, 4), 32);
        add(new ItemStack(Blocks.sapling, 1, 5), 32);
        add(new ItemStack(Blocks.leaves, 1, 0), 1);
        add(new ItemStack(Blocks.leaves, 1, 1), 1);
        add(new ItemStack(Blocks.leaves, 1, 2), 1);
        add(new ItemStack(Blocks.leaves, 1, 3), 1);
        add(Blocks.web, 12);
        add(new ItemStack(Blocks.tallgrass, 1, 0), 1);
        add(new ItemStack(Blocks.tallgrass, 1, 1), 1);
        add(Blocks.deadbush, 1);
        add(Blocks.yellow_flower, 16);
        add(new ItemStack(Blocks.red_flower, 1, 0), 16);
        add(new ItemStack(Blocks.red_flower, 1, 1), 16);
        add(new ItemStack(Blocks.red_flower, 1, 2), 16);
        add(new ItemStack(Blocks.red_flower, 1, 3), 16);
        add(new ItemStack(Blocks.red_flower, 1, 4), 16);
        add(new ItemStack(Blocks.red_flower, 1, 5), 16);
        add(new ItemStack(Blocks.red_flower, 1, 6), 16);
        add(new ItemStack(Blocks.red_flower, 1, 7), 16);
        add(new ItemStack(Blocks.red_flower, 1, 8), 16);
        add(Blocks.brown_mushroom, 32);
        add(Blocks.red_mushroom, 32);
        add(Blocks.torch, 9);
        add(Blocks.chest, 64);
        add(Blocks.crafting_table, 32);
        add(Blocks.furnace, 8);
        add(Blocks.ladder, 9.333);
        add(Blocks.snow_layer, 0.125);
        add(Blocks.cactus, 8);
        add(Blocks.jukebox, 8256);
        add(Blocks.fence, 12);
        add(new ItemStack(Blocks.monster_egg, 1, 0), null);
        add(new ItemStack(Blocks.monster_egg, 1, 1), null);
        add(new ItemStack(Blocks.monster_egg, 1, 2), null);
        add(new ItemStack(Blocks.monster_egg, 1, 3), null);
        add(new ItemStack(Blocks.monster_egg, 1, 4), null);
        add(new ItemStack(Blocks.monster_egg, 1, 5), null);
        add(Blocks.iron_bars, 96);
        add(Blocks.glass_pane, 0.375);
        add(Blocks.vine, 8);
        add(Blocks.waterlily, 16);
        add(Blocks.nether_brick_fence, 4);
        add(Blocks.enchanting_table, 16800);
        add(Blocks.end_portal_frame, null);
        add(Blocks.ender_chest, 2304);
        add(new ItemStack(Blocks.anvil, 1, 0), 7936);
        add(new ItemStack(Blocks.anvil, 1, 1), 5290.666);
        add(new ItemStack(Blocks.anvil, 1, 2), 2645.333);
        add(Blocks.trapped_chest, 198);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 0), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 1), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 2), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 3), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 4), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 5), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 6), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 7), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 8), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 9), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 10), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 11), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 12), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 13), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 14), 3.375);
        add(new ItemStack(Blocks.stained_glass_pane, 1, 15), 3.375);
        add(new ItemStack(Blocks.leaves2, 1, 0), 1);
        add(new ItemStack(Blocks.leaves2, 1, 1), 1);
        add(new ItemStack(Blocks.carpet, 1, 0), 32);
        add(new ItemStack(Blocks.carpet, 1, 1), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 2), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 3), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 4), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 5), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 6), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 7), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 8), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 9), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 10), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 11), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 12), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 13), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 14), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 15), 37.333);
        add(new ItemStack(Blocks.carpet, 1, 15), 37.333);
        add(new ItemStack(Blocks.double_plant, 1, 0), 16);
        add(new ItemStack(Blocks.double_plant, 1, 1), 16);
        add(new ItemStack(Blocks.double_plant, 1, 2), 16);
        add(new ItemStack(Blocks.double_plant, 1, 3), 16);
        add(new ItemStack(Blocks.double_plant, 1, 4), 16);
        add(new ItemStack(Blocks.double_plant, 1, 5), 16);
        add(Items.painting, 80);
        add(Items.sign, 52);
        add(Items.flower_pot, 192);
        add(new ItemStack(Blocks.skull, 1, 0), null);
        add(new ItemStack(Blocks.skull, 1, 1), null);
        add(new ItemStack(Blocks.skull, 1, 2), null);
        add(new ItemStack(Blocks.skull, 1, 3), null);
        add(new ItemStack(Blocks.skull, 1, 4), null);
    }

    private void addRedstoneTabTestCases()
    {
        add(Blocks.dispenser, 87);
        add(Blocks.noteblock, 96);
        add(Blocks.sticky_piston, 340);
        add(Blocks.piston, 316);
        add(Blocks.tnt, 964);
        add(Blocks.lever, 5);
        add(Blocks.stone_pressure_plate, 2);
        add(Blocks.wooden_pressure_plate, 16);
        add(Blocks.redstone_torch, 36);
        add(Blocks.stone_button, 1);
        add(Blocks.trapdoor, 48);
        add(Blocks.fence_gate, 32);
        add(Blocks.redstone_lamp, 1664);
        add(Blocks.tripwire_hook, 134);
        add(Blocks.wooden_button, 8);
        add(Blocks.light_weighted_pressure_plate, 4096);
        add(Blocks.heavy_weighted_pressure_plate, 512);
        add(Blocks.daylight_detector, 783);
        add(Blocks.redstone_block, 288);
        add(Blocks.hopper, 1344);
        add(Blocks.dropper, 39);
        add(Items.wooden_door, 48);
        add(Items.iron_door, 1536);
        add(Items.redstone, 32);
        add(Items.repeater, 107);
        add(Items.comparator, 367);
    }

    private void addTransportationTabTestCases()
    {
        add(Blocks.golden_rail, 2054);
        add(Blocks.detector_rail, 261.666);
        add(Blocks.rail, 96.25);
        add(Blocks.activator_rail, 263.333);
        add(Items.minecart, 1280);
        add(Items.saddle, 192);
        add(Items.boat, 40);
        add(Items.chest_minecart, 1344);
        add(Items.furnace_minecart, 1288);
        add(Items.carrot_on_a_stick, 60);
        add(Items.tnt_minecart, 2244);
        add(Items.hopper_minecart, 2624);
    }

    private void addMiscellaneousTabTestCases()
    {
        add(Blocks.beacon, 24773);
        add(Items.bucket, 768);
        add(Items.water_bucket, 769);
        add(Items.lava_bucket, 832);
        add(Items.snowball, 0.25);
        add(Items.milk_bucket, 832);
        add(Items.paper, 32);
        add(Items.book, 160);
        add(Items.slime_ball, 24);
        add(Items.bone, 24);
        add(Items.ender_pearl, 1024);
        add(Items.ender_eye, 1792);
        add(new ItemStack(Items.spawn_egg, 1, 50), null);
        add(new ItemStack(Items.spawn_egg, 1, 51), null);
        add(new ItemStack(Items.spawn_egg, 1, 52), null);
        add(new ItemStack(Items.spawn_egg, 1, 54), null);
        add(new ItemStack(Items.spawn_egg, 1, 55), null);
        add(new ItemStack(Items.spawn_egg, 1, 56), null);
        add(new ItemStack(Items.spawn_egg, 1, 57), null);
        add(new ItemStack(Items.spawn_egg, 1, 58), null);
        add(new ItemStack(Items.spawn_egg, 1, 59), null);
        add(new ItemStack(Items.spawn_egg, 1, 60), null);
        add(new ItemStack(Items.spawn_egg, 1, 61), null);
        add(new ItemStack(Items.spawn_egg, 1, 62), null);
        add(new ItemStack(Items.spawn_egg, 1, 65), null);
        add(new ItemStack(Items.spawn_egg, 1, 66), null);
        add(new ItemStack(Items.spawn_egg, 1, 90), null);
        add(new ItemStack(Items.spawn_egg, 1, 91), null);
        add(new ItemStack(Items.spawn_egg, 1, 92), null);
        add(new ItemStack(Items.spawn_egg, 1, 93), null);
        add(new ItemStack(Items.spawn_egg, 1, 94), null);
        add(new ItemStack(Items.spawn_egg, 1, 95), null);
        add(new ItemStack(Items.spawn_egg, 1, 96), null);
        add(new ItemStack(Items.spawn_egg, 1, 98), null);
        add(new ItemStack(Items.spawn_egg, 1, 100), null);
        add(new ItemStack(Items.spawn_egg, 1, 120), null);
        add(new ItemStack(Items.spawn_egg, 1, 97), null);
        add(new ItemStack(Items.spawn_egg, 1, 99), null);
        add(Items.experience_bottle, null);
        add(Items.fire_charge, 330.667);
        add(Items.writable_book, 216);
        add(Items.map, 1312);
        add(Items.firework_charge, null);
        add(Items.iron_horse_armor, null);
        add(Items.golden_horse_armor, null);
        add(Items.diamond_horse_armor, null);
        add(Items.record_13, 2048);
        add(Items.record_cat, 2048);
        add(Items.record_blocks, 2048);
        add(Items.record_chirp, 2048);
        add(Items.record_far, 2048);
        add(Items.record_mellohi, 2048);
        add(Items.record_stal, 2048);
        add(Items.record_strad, 2048);
        add(Items.record_ward, 2048);
        add(Items.record_11, 2048);
        add(Items.record_wait, 2048);
    }

    private void addFoodstuffsTabTestCases()
    {
        add(Items.apple, 24);
        add(Items.mushroom_stew, 68);
        add(Items.bread, 72);
        add(Items.porkchop, 24);
        add(Items.cooked_porkchop, 24);
        add(new ItemStack(Items.golden_apple, 1, 0), 16408);
        add(new ItemStack(Items.golden_apple, 1, 1), 147480);
        add(new ItemStack(Items.fish, 1, 0), 24);
        add(new ItemStack(Items.fish, 1, 1), 24);
        add(new ItemStack(Items.fish, 1, 2), 24);
        add(new ItemStack(Items.fish, 1, 3), 24);
        add(new ItemStack(Items.cooked_fished, 1, 0), 24);
        add(new ItemStack(Items.cooked_fished, 1, 1), 24);
        add(Items.cake, 360);
        add(Items.cookie, 7);
        add(Items.melon, 16);
        add(Items.beef, 24);
        add(Items.cooked_beef, 24);
        add(Items.chicken, 24);
        add(Items.cooked_chicken, 24);
        add(Items.rotten_flesh, 24);
        add(Items.spider_eye, 128);
        add(Items.carrot, 24);
        add(Items.potato, 24);
        add(Items.baked_potato, 24);
        add(Items.poisonous_potato, 24);
        add(Items.golden_carrot, 1844.448);
        add(Items.pumpkin_pie, 208);
    }

    private void addToolsTabTestCases()
    {
        add(Items.iron_shovel, 264);
        add(Items.iron_pickaxe, 776);
        add(Items.iron_axe, 776);
        add(Items.flint_and_steel, 260);
        add(Items.wooden_shovel, 16);
        add(Items.wooden_pickaxe, 32);
        add(Items.wooden_axe, 32);
        add(Items.stone_shovel, 9);
        add(Items.stone_pickaxe, 11);
        add(Items.stone_axe, 11);
        add(Items.diamond_shovel, 8200);
        add(Items.diamond_pickaxe, 24584);
        add(Items.diamond_axe, 24584);
        add(Items.golden_shovel, 2056);
        add(Items.golden_pickaxe, 6152);
        add(Items.golden_axe, 6152);
        add(Items.wooden_hoe, 24);
        add(Items.stone_hoe, 10);
        add(Items.iron_hoe, 520);
        add(Items.diamond_hoe, 16392);
        add(Items.golden_hoe, 4104);
        add(Items.compass, 1056);
        add(Items.fishing_rod, 36);
        add(Items.clock, 8224);
        add(Items.shears, 512);
        add(Items.lead, 72);
        add(Items.name_tag, null);
        add(new ItemStack(Items.enchanted_book, 1, OreDictionary.WILDCARD_VALUE), null);
    }

    private void addCombatTabTestCases()
    {
        add(Items.bow, 48);
        add(Items.arrow, 14);
        add(Items.iron_sword, 516);
        add(Items.wooden_sword, 20);
        add(Items.stone_sword, 6);
        add(Items.diamond_sword, 16388);
        add(Items.golden_sword, 4100);
        add(Items.leather_helmet, 320);
        add(Items.leather_chestplate, 512);
        add(Items.leather_leggings, 448);
        add(Items.leather_boots, 256);
        add(Items.chainmail_helmet, null);
        add(Items.chainmail_chestplate, null);
        add(Items.chainmail_leggings, null);
        add(Items.chainmail_boots, null);
        add(Items.iron_helmet, 1280);
        add(Items.iron_chestplate, 2048);
        add(Items.iron_leggings, 1792);
        add(Items.iron_boots, 1024);
        add(Items.diamond_helmet, 40960);
        add(Items.diamond_chestplate, 65536);
        add(Items.diamond_leggings, 57344);
        add(Items.diamond_boots, 32768);
        add(Items.golden_helmet, 10240);
        add(Items.golden_chestplate, 16384);
        add(Items.golden_leggings, 14336);
        add(Items.golden_boots, 8192);
    }

    private void addBrewingTabTestCases()
    {
        add(Items.ghast_tear, 4096);
        add(new ItemStack(Items.potionitem, 1, 0), 2);
        add(new ItemStack(Items.potionitem, 1, 16), 26);
        add(new ItemStack(Items.potionitem, 1, 8193), 4122);
        add(new ItemStack(Items.potionitem, 1, 8225), 4506);
        add(new ItemStack(Items.potionitem, 1, 8257), 4154);
        add(new ItemStack(Items.potionitem, 1, 16385), 4314);
        add(new ItemStack(Items.potionitem, 1, 16417), 4698);
        add(new ItemStack(Items.potionitem, 1, 16449), 4346);
        add(new ItemStack(Items.potionitem, 1, 8194), 58);
        add(new ItemStack(Items.potionitem, 1, 8226), 442);
        add(new ItemStack(Items.potionitem, 1, 8258), 90);
        add(new ItemStack(Items.potionitem, 1, 16386), 250);
        add(new ItemStack(Items.potionitem, 1, 16418), 634);
        add(new ItemStack(Items.potionitem, 1, 16450), 282);
        add(new ItemStack(Items.potionitem, 1, 8227), null);
        add(new ItemStack(Items.potionitem, 1, 8259), null);
        add(new ItemStack(Items.potionitem, 1, 16419), null);
        add(new ItemStack(Items.potionitem, 1, 16451), null);
        add(new ItemStack(Items.potionitem, 1, 8196), 154);
        add(new ItemStack(Items.potionitem, 1, 8228), 538);
        add(new ItemStack(Items.potionitem, 1, 8260), 570);
        add(new ItemStack(Items.potionitem, 1, 16388), 346);
        add(new ItemStack(Items.potionitem, 1, 16420), 730);
        add(new ItemStack(Items.potionitem, 1, 16452), 762);
        add(new ItemStack(Items.potionitem, 1, 8261), null);
        add(new ItemStack(Items.potionitem, 1, 8229), 2246.448);
        add(new ItemStack(Items.potionitem, 1, 16453), null);
        add(new ItemStack(Items.potionitem, 1, 16421), 2438.448);
        add(new ItemStack(Items.potionitem, 1, 8230), null);
        add(new ItemStack(Items.potionitem, 1, 8262), 1902.448);
        add(new ItemStack(Items.potionitem, 1, 16422), null);
        add(new ItemStack(Items.potionitem, 1, 16454), 2094.448);
        add(new ItemStack(Items.potionitem, 1, 8232), null);
        add(new ItemStack(Items.potionitem, 1, 8264), 226);
        add(new ItemStack(Items.potionitem, 1, 16424), null);
        add(new ItemStack(Items.potionitem, 1, 16456), 418);
        add(new ItemStack(Items.potionitem, 1, 8201), 794);
        add(new ItemStack(Items.potionitem, 1, 8233), 1178);
        add(new ItemStack(Items.potionitem, 1, 8265), 826);
        add(new ItemStack(Items.potionitem, 1, 16393), 986);
        add(new ItemStack(Items.potionitem, 1, 16425), 1370);
        add(new ItemStack(Items.potionitem, 1, 16457), 1018);
        add(new ItemStack(Items.potionitem, 1, 8234), null);
        add(new ItemStack(Items.potionitem, 1, 8266), 634);
        add(new ItemStack(Items.potionitem, 1, 16426), null);
        add(new ItemStack(Items.potionitem, 1, 16458), 826);
        add(new ItemStack(Items.potionitem, 1, 8268), null);
        add(new ItemStack(Items.potionitem, 1, 8236), 730);
        add(new ItemStack(Items.potionitem, 1, 16460), null);
        add(new ItemStack(Items.potionitem, 1, 16428), 922);
        add(new ItemStack(Items.potionitem, 1, 8237), null);
        add(new ItemStack(Items.potionitem, 1, 8269), null);
        add(new ItemStack(Items.potionitem, 1, 16429), null);
        add(new ItemStack(Items.potionitem, 1, 16461), null);
        add(new ItemStack(Items.potionitem, 1, 8238), null);
        add(new ItemStack(Items.potionitem, 1, 8270), 2094.448);
        add(new ItemStack(Items.potionitem, 1, 16430), null);
        add(new ItemStack(Items.potionitem, 1, 16462), 2286.448);
        add(Items.glass_bottle, 1);
        add(Items.fermented_spider_eye, 192);
        add(Items.blaze_powder, 768);
        add(Items.magma_cream, 792);
        add(Items.brewing_stand, 1539);
        add(Items.speckled_melon, 1836.448);
    }

    private void addMaterialsTabTestCases()
    {
        add(new ItemStack(Items.coal, 1, 0), 32);
        add(new ItemStack(Items.coal, 1, 1), 32);
        add(Items.diamond, 8192);
        add(Items.iron_ingot, 256);
        add(Items.gold_ingot, 2048);
        add(Items.stick, 4);
        add(Items.bowl, 6);
        add(Items.string, 12);
        add(Items.feather, 48);
        add(Items.gunpowder, 192);
        add(Items.wheat_seeds, 16);
        add(Items.wheat, 24);
        add(Items.flint, 4);
        add(Items.leather, 64);
        add(Items.brick, 64);
        add(Items.clay_ball, 64);
        add(Items.reeds, 32);
        add(Items.egg, 32);
        add(Items.glowstone_dust, 384);
        add(new ItemStack(Items.dye, 1, 0), 8);
        add(new ItemStack(Items.dye, 1, 1), 8);
        add(new ItemStack(Items.dye, 1, 2), 8);
        add(new ItemStack(Items.dye, 1, 3), 8);
        add(new ItemStack(Items.dye, 1, 4), 864);
        add(new ItemStack(Items.dye, 1, 5), 8);
        add(new ItemStack(Items.dye, 1, 6), 8);
        add(new ItemStack(Items.dye, 1, 7), 8);
        add(new ItemStack(Items.dye, 1, 8), 8);
        add(new ItemStack(Items.dye, 1, 9), 8);
        add(new ItemStack(Items.dye, 1, 10), 8);
        add(new ItemStack(Items.dye, 1, 11), 8);
        add(new ItemStack(Items.dye, 1, 12), 8);
        add(new ItemStack(Items.dye, 1, 13), 8);
        add(new ItemStack(Items.dye, 1, 14), 8);
        add(new ItemStack(Items.dye, 1, 15), 8);
        add(Items.sugar, 32);
        add(Items.pumpkin_seeds, 36);
        add(Items.melon_seeds, 16);
        add(Items.blaze_rod, 1536);
        add(Items.gold_nugget, 227.556);
        add(Items.nether_wart, 24);
        add(Items.emerald, 8192);
        add(Items.nether_star, 24576);
        add(Items.netherbrick, 1);
        add(Items.quartz, 256);
    }
}
