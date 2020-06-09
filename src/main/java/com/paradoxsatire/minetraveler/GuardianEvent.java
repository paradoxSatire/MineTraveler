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
	int toldWarlockA = 0;
	int toldHunterA = 0;
	int toldTitanA = 0;
	int toldWarlockS = 0;
	int toldHunterS = 0;
	int toldTitanS = 0;
	int toldWarlockV = 0;
	int toldHunterV = 0;
	int toldTitanV = 0;
	
	@SubscribeEvent
	public void getLight(PlayerTickEvent event) {
		PlayerEntity player = event.player;
		Item wghostb = ModItems.GHOST_WARLOCK_BASE;
		Item hghostb = ModItems.GHOST_HUNTER_BASE;
		Item tghostb = ModItems.GHOST_TITAN_BASE;
		Item wghosta = ModItems.GHOST_WARLOCK_ARC;
		Item hghosta = ModItems.GHOST_HUNTER_ARC;
		Item tghosta = ModItems.GHOST_TITAN_ARC;
		Item wghosts = ModItems.GHOST_WARLOCK_SOLAR;
		Item hghosts = ModItems.GHOST_HUNTER_SOLAR;
		Item tghosts = ModItems.GHOST_TITAN_SOLAR;
		Item wghostv = ModItems.GHOST_WARLOCK_VOID;
		Item hghostv = ModItems.GHOST_HUNTER_VOID;
		Item tghostv = ModItems.GHOST_TITAN_VOID;
		ITextComponent isWarlock = new StringTextComponent("You are now a warlock");
		ITextComponent isHunter = new StringTextComponent("You are now a hunter");
		ITextComponent isTitan = new StringTextComponent("You are now a titan");
		ITextComponent isWarlockA = new StringTextComponent("You are now a Stormcaller warlock");
		ITextComponent isHunterA = new StringTextComponent("You are now an Arcstrider hunter");
		ITextComponent isTitanA = new StringTextComponent("You are now a Striker titan");
		ITextComponent isWarlockS = new StringTextComponent("You are now a Dawnblade warlock");
		ITextComponent isHunterS = new StringTextComponent("You are now a Gunslinger hunter");
		ITextComponent isTitanS = new StringTextComponent("You are now a Sunbreaker titan");
		ITextComponent isWarlockV = new StringTextComponent("You are now a Voidwalker warlock");
		ITextComponent isHunterV = new StringTextComponent("You are now a Nightstalker hunter");
		ITextComponent isTitanV = new StringTextComponent("You are now a Sentinal titan");
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
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == hghostb) {
			if(toldHunter == 0) {
				player.sendMessage(isHunter);
				toldWarlock = 0;
				toldHunter = 1;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == tghostb) {
			if(toldTitan == 0) {
				player.sendMessage(isTitan);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 1;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == wghosta) {
			if(toldWarlockA == 0) {
				player.sendMessage(isWarlockA);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 1;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == hghosta) {
			if(toldHunterA == 0) {
				player.sendMessage(isHunterA);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 1;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == tghosta) {
			if(toldTitanA == 0) {
				player.sendMessage(isTitanA);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 1;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == wghosts) {
			if(toldWarlockS == 0) {
				player.sendMessage(isWarlockS);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 1;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == hghosts) {
			if(toldHunterS == 0) {
				player.sendMessage(isHunterS);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 1;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == tghosts) {
			if(toldTitanS == 0) {
				player.sendMessage(isTitanS);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 1;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == wghostv) {
			if(toldWarlockV == 0) {
				player.sendMessage(isWarlockV);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 1;
				toldHunterV = 0;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == hghostv) {
			if(toldHunterV == 0) {
				player.sendMessage(isHunterV);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 1;
				toldTitanV = 0;
			}
			player.abilities.allowFlying = true;
		}
		else if(heldOff.getItem() == tghostv) {
			if(toldTitanV == 0) {
				player.sendMessage(isTitanV);
				toldWarlock = 0;
				toldHunter = 0;
				toldTitan = 0;
				toldWarlockA = 0;
				toldHunterA = 0;
				toldTitanA = 0;
				toldWarlockS = 0;
				toldHunterS = 0;
				toldTitanS = 0;
				toldWarlockV = 0;
				toldHunterV = 0;
				toldTitanV = 1;
			}
			player.abilities.allowFlying = true;
		}
		else {
			toldWarlock = 0;
			toldHunter = 0;
			toldTitan = 0;
			toldWarlockA = 0;
			toldHunterA = 0;
			toldTitanA = 0;
			toldWarlockS = 0;
			toldHunterS = 0;
			toldTitanS = 0;
			toldWarlockV = 0;
			toldHunterV = 0;
			toldTitanV = 0;
			if(player.abilities.isCreativeMode != true) {
				player.abilities.allowFlying = false;
				player.abilities.isFlying = false;
			}
		}
	}
}
