package net.dudko.createblazinggold.item;

import net.dudko.createblazinggold.CreateBlazingGold;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CREATE_BLAZING_GOLD = FabricItemGroupBuilder.build(
            new Identifier(CreateBlazingGold.MOD_ID, "createblazinggold"), () -> new ItemStack(ModItems.MAGMAGOLD_INGOT));
}
