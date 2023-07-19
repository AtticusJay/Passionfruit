package net.atticusjay.passionfruit.block;

import net.atticusjay.passionfruit.Passionfruit;
import net.atticusjay.passionfruit.world.tree.LavenderSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TERMINAL = registerBlock("terminal",
            new Block(FabricBlockSettings.copyOf(Blocks.BEACON).nonOpaque()));

    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ENDERITE_BLOCK = registerBlock("enderite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    static final float LAVENDER_STRENGTH = 9f;
    static final float LAVENDER_HARDNESS = 3f;
    public static final Block LAVENDER_LOG = registerBlock("lavender_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(LAVENDER_STRENGTH).requiresTool().hardness(LAVENDER_HARDNESS)));
    public static final Block LAVENDER_WOOD = registerBlock("lavender_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(LAVENDER_STRENGTH).requiresTool().hardness(LAVENDER_HARDNESS)));
    public static final Block STRIPPED_LAVENDER_LOG = registerBlock("stripped_lavender_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(LAVENDER_STRENGTH).requiresTool().hardness(LAVENDER_HARDNESS)));
    public static final Block STRIPPED_LAVENDER_WOOD = registerBlock("stripped_lavender_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(LAVENDER_STRENGTH).requiresTool().hardness(LAVENDER_HARDNESS)));


    public static final Block LAVENDER_PLANKS = registerBlock("lavender_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(LAVENDER_STRENGTH).requiresTool().hardness(LAVENDER_HARDNESS)));
    public static final Block LAVENDER_LEAVES = registerBlock("lavender_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));


    public static final Block LAVENDER_SAPLING = registerBlock("lavender_sapling",
            new SaplingBlock(new LavenderSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Passionfruit.MOD_ID, name), block);

    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Passionfruit.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Passionfruit.LOGGER.info("Registering ModBlocks for " + Passionfruit.MOD_ID);
    }
}
