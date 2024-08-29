package net.firstmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.firstmod.block.ModBlocks;
import net.firstmod.entity.ModEntities;
import net.firstmod.entity.custom.PorcupineEntity;
import net.firstmod.item.ModItems;
import net.firstmod.world.gen.ModWorldGeneration;
import net.minecraft.entity.mob.MobEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerBlocks();

		FuelRegistry.INSTANCE.add(ModBlocks.BLACK_MATTER, 20000);
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createPorcupineAttributes());
		ModWorldGeneration.generateModWorldGen();
	}
}