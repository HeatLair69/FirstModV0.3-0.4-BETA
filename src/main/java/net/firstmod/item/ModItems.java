package net.firstmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.firstmod.FirstMod;
import net.firstmod.block.ModBlocks;
import net.firstmod.item.custom.UraniumDetectorItem;
import net.minecraft.block.TntBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PENIS = registerItem("penis", new Item(new FabricItemSettings()));
    public static final Item URANIUM = registerItem("uranium", new Item(new FabricItemSettings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new FabricItemSettings()));
    public static final Item URANIUM_DETECTOR = registerItem("uranium_detector", new UraniumDetectorItem(new FabricItemSettings()));

    private static void addItemsToIngridientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(PENIS);
        entries.add(URANIUM);
        entries.add(RAW_URANIUM);
        entries.add(ModBlocks.URANIUM_BLOCK);
        entries.add(ModBlocks.URANIUM_ORE);
        entries.add(ModBlocks.NUKE);
        entries.add(ModBlocks.DEEPSLATE_URANIUM_ORE);
        entries.add(ModBlocks.RAW_URANIUM_BLOCK);
        entries.add(URANIUM_DETECTOR);
        entries.add(ModBlocks.OP_BLOCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FirstMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FirstMod.LOGGER.info("Registering Mod Items for " + FirstMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToIngridientTabItemGroup);
    }
}
