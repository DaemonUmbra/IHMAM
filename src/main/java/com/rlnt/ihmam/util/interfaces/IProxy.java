package com.rlnt.ihmam.util.interfaces;

import net.minecraft.item.Item;

public interface IProxy {
    public void registerItemRenderer(Item item, int meta, String id);
}
