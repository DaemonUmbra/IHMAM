package com.rlnt.ihmam.objects.blocks;

import com.rlnt.ihmam.IHMAM;
import com.rlnt.ihmam.init.ModBlocks;
import com.rlnt.ihmam.init.ModItems;
import com.rlnt.ihmam.util.interfaces.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String unlocalizedName, String registryName, Material material) {
        super(material);
        setTranslationKey(unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(IHMAM.IHMAM_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(registryName).setCreativeTab(IHMAM.IHMAM_TAB));
    }

    @Override
    public void registerModels() {
        IHMAM.proxy.registerModel(Item.getItemFromBlock(this), 0);
    }
}
