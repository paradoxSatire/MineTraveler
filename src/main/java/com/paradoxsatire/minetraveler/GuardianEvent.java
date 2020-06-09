package com.paradoxsatire.minetraveler;

import java.util.ArrayList;
import java.util.List;

import com.paradoxsatire.minetraveler.init.ModItems;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GuardianEvent {
	
	int toldWarlock = 0;
	int toldHunter = 0;
	int toldTitan = 0;
	
	@SubscribeEvent
	public void getLight(PlayerTickEvent event) {
		PlayerEntity player = event.player;
		Item wghostb = ModItems.GHOST_WARLOCK_BASE;
		Item hghostb = ModItems.GHOST_HUNTER_BASE;
		Item tghostb = ModItems.GHOST_TITAN_BASE;
		ITextComponent isWarlock= new StringTextComponent("You are now a warlock");
		ITextComponent isHunter = new StringTextComponent("You are now a hunter");
		ITextComponent isTitan = new StringTextComponent("You are now a titan");
		ItemStack heldOff = player.getHeldItemOffhand();/*
		System.out.println("Held: " + heldOff);
		System.out.println("wanted W: " + wghostb);
		System.out.println("wanted H: " + hghostb);
		System.out.println("wanted T: " + tghostb);
		System.out.println("Equal W? " + (heldOff.getItem().equals(wghostb)));
		System.out.println("Equal H? " + (heldOff.getItem().equals(hghostb)));
		System.out.println("Equal T? " + (heldOff.getItem().equals(tghostb))); */
		if(heldOff.getItem() == wghostb) {
			if(toldWarlock == 0) {
				player.sendMessage(isWarlock);
				toldWarlock = 1;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == hghostb) {
			if(toldHunter == 0) {
				player.sendMessage(isHunter);
				toldHunter = 1;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == tghostb) {
			if(toldTitan == 0) {
				player.sendMessage(isTitan);
				toldTitan = 1;
			}
			player.abilities.allowFlying = true;
		}
		else {
			toldWarlock = 0;
			toldHunter = 0;
			toldTitan = 0;
			if(player.abilities.isCreativeMode != true) {
				player.abilities.allowFlying = false;
				player.abilities.isFlying = false;
			}
		}
	}
}
