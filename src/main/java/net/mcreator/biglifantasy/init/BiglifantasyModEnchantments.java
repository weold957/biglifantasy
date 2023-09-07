
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biglifantasy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.biglifantasy.enchantment.BlessEnchantment;
import net.mcreator.biglifantasy.BiglifantasyMod;

public class BiglifantasyModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BiglifantasyMod.MODID);
	public static final RegistryObject<Enchantment> BLESS = REGISTRY.register("bless", () -> new BlessEnchantment());
}
