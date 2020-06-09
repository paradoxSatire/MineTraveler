package com.paradoxsatire.minetraveler;

import com.paradoxsatire.minetraveler.init.ModItemGroups.ModItemGroup;
import com.paradoxsatire.minetraveler.init.ModItems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = MineTraveler.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP)), "lightsteel_ingot"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP)), "arcsteel_ingot"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP)), "solarsteel_ingot"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP)), "voidsteel_ingot"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "eye_warlock"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "eye_hunter"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "eye_titan"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_warlock_base"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_hunter_base"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_titan_base"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_warlock_arc"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_hunter_arc"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_titan_arc"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_warlock_solar"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_hunter_solar"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_titan_solar"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_warlock_void"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_hunter_void"),
				setup(new Item(new Item.Properties().group(ModItemGroup.MINE_TRAVELER_GROUP).maxStackSize(1)), "ghost_titan_void")
		);
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(MineTraveler.MODID, name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}

}
