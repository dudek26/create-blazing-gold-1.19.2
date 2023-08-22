package net.dudko.createblazinggold;

import net.dudko.createblazinggold.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateBlazingGold implements ModInitializer {
	public static final String MOD_ID = "createblazinggold";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}