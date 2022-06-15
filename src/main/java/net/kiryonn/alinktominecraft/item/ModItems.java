package net.kiryonn.alinktominecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kiryonn.alinktominecraft.ALinkToMinecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBI_1 = registerItem("rubi_1", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RUBI_5 = registerItem("rubi_5", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RUBI_10 = registerItem("rubi_10", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RUBI_20 = registerItem("rubi_20", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RUBI_50 = registerItem("rubi_50", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RUBI_100 = registerItem("rubi_100", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item RUBI_200 = registerItem("rubi_200", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ALinkToMinecraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ALinkToMinecraft.LOGGER.debug("Registering items for " + ALinkToMinecraft.MOD_ID);
    }
}
