package com.rlnt.ihmam.init;

import com.rlnt.ihmam.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Items
    public static final Item CRAFTING_COMPONENT = new ItemBase("itemCraftingComponent", "crafting_component");
}
