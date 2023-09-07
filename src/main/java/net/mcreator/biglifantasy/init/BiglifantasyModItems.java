
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biglifantasy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.biglifantasy.item.TestSwordItem;
import net.mcreator.biglifantasy.BiglifantasyMod;

public class BiglifantasyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BiglifantasyMod.MODID);
	public static final RegistryObject<Item> TEST_SWORD = REGISTRY.register("test_sword", () -> new TestSwordItem());
	public static final RegistryObject<Item> TEST = block(BiglifantasyModBlocks.TEST);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
