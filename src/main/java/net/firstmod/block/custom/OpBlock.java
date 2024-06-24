package net.firstmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import java.util.Random;

public class OpBlock extends Block {
    private static final Random RANDOM = new Random();

    public OpBlock(Settings settings) {
        super(settings);
    }

    // Function to give the player a random ore block with a 10% chance
    public void giveOreWithChance(PlayerEntity player) {
        if (RANDOM.nextDouble() < 0.9) { // 10% chance
            ItemStack oreStack = new ItemStack(getRandomOreBlock(), 1);
            player.giveItemStack(oreStack);
        }
    }

    // Function to get a random ore block as an item
    private net.minecraft.item.Item getRandomOreBlock() {
        net.minecraft.item.Item[] oreBlocks = {
                Items.DIAMOND_ORE,
                Items.IRON_ORE,
                Items.GOLD_ORE,
                Items.COAL_ORE,
                Items.EMERALD_ORE,
                Items.ANCIENT_DEBRIS
        };
        return oreBlocks[RANDOM.nextInt(oreBlocks.length)];
    }

    // You may want to override onBlockStep or other relevant methods to invoke giveOreWithChance
    // This depends on how you want to trigger the ore giving functionality.
}
