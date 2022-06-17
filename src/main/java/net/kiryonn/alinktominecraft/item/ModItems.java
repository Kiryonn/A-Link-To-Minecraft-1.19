package net.kiryonn.alinktominecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kiryonn.alinktominecraft.ALinkToMinecraft;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BLUE_EMERALD = registerItem("blue_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.A_LINK_TO_MINECRAFT)));
    public static final Item YELLOW_EMERALD = registerItem("yellow_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.A_LINK_TO_MINECRAFT)));
    public static final Item RED_EMERALD = registerItem("red_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.A_LINK_TO_MINECRAFT)));
    public static final Item PURPLE_EMERALD = registerItem("purple_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.A_LINK_TO_MINECRAFT)));
    public static final Item ORANGE_EMERALD = registerItem("orange_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.A_LINK_TO_MINECRAFT)));
    public static final Item SILVER_EMERALD = registerItem("silver_emerald",
            new Item(new FabricItemSettings().group(ModItemGroup.A_LINK_TO_MINECRAFT)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ALinkToMinecraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ALinkToMinecraft.LOGGER.debug("Registering items for " + ALinkToMinecraft.MOD_ID);
    }
}
