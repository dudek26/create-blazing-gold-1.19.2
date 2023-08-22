package net.dudko.createblazinggold.item;

import net.dudko.createblazinggold.CreateBlazingGold;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item NETHERGOLD_INGOT = registerItem("nethergold_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreateBlazingGold.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CreateBlazingGold.LOGGER.debug("Registering Mod Items for " + CreateBlazingGold.MOD_ID);
    }
}
