
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biglifantasy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BiglifantasyModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("biglifantasy", "big_li_fantasy"),
				builder -> builder.title(Component.translatable("item_group.biglifantasy.big_li_fantasy")).icon(() -> new ItemStack(Items.MUSIC_DISC_FAR)).displayItems((parameters, tabData) -> {
					tabData.accept(BiglifantasyModItems.TEST_SWORD.get());
					tabData.accept(BiglifantasyModBlocks.TEST.get().asItem());
				}).withSearchBar());
	}
}
