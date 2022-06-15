package net.kiryonn.alinktominecraft;

import net.fabricmc.api.ModInitializer;
import net.kiryonn.alinktominecraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ALinkToMinecraft implements ModInitializer {
	public static final String MOD_ID = "alinktominecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
