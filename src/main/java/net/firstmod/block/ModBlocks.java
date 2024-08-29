package net.firstmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.firstmod.block.custom.OpBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.firstmod.FirstMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class ModBlocks {

    public static final Block URANIUM_BLOCK = registerBlock("uranium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block URANIUM_ORE = registerBlock("uranium_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block NUKE = registerBlock("nuke", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));
    public static final Block DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
    public static final Block OP_BLOCK = registerBlock("op_block", new OpBlock(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).strength(5.0f, 6.0f)));
    public static final Block BLACK_MATTER = registerBlock("black_matter", new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(0.0f,3600000.0f)));
    // Update this line
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FirstMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        FirstMod.LOGGER.info("Registering ModBlocks for " + FirstMod.MOD_ID);
    }
}
