package com.rlnt.ihmam.objects.blocks;

import com.rlnt.ihmam.IHMAM;
import com.rlnt.ihmam.init.ModBlocks;
import com.rlnt.ihmam.init.ModItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFluid extends BlockFluidClassic {

    public BlockFluid(String unlocalizedName, String registryName, Fluid fluid, Material material) {
        super(fluid, material);
        setTranslationKey(unlocalizedName);
        setRegistryName(registryName);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(registryName));
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }
}
