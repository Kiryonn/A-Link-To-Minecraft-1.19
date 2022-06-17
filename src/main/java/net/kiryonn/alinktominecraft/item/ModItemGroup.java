package net.kiryonn.alinktominecraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kiryonn.alinktominecraft.ALinkToMinecraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup A_LINK_TO_MINECRAFT = FabricItemGroupBuilder.build(
            new Identifier(ALinkToMinecraft.MOD_ID),
            ()->new ItemStack(ModItems.BLUE_EMERALD));
}
