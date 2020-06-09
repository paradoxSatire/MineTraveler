package com.paradoxsatire.minetraveler.init;

import java.util.function.Supplier;

import com.paradoxsatire.minetraveler.MineTraveler;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModItemGroups {
	
	public static class ModItemGroup extends ItemGroup{
		
		public static final ItemGroup MINE_TRAVELER_GROUP = new ModItemGroup(MineTraveler.MODID, () -> new ItemStack(ModItems.LIGHTSTEEL_INGOT));
		private final Supplier<ItemStack> iconSupplier;
	
		public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}
		
		@Override
		public ItemStack createIcon() {
			return iconSupplier.get();
		}
	}
}

