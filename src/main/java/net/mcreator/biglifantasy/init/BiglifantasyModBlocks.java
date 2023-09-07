
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biglifantasy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.biglifantasy.block.TestBlock;
import net.mcreator.biglifantasy.BiglifantasyMod;

public class BiglifantasyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BiglifantasyMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
}
