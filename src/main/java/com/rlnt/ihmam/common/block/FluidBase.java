package com.rlnt.ihmam.common.block;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBase extends Fluid {

    public FluidBase(String unlocalizedName, String registryName, ResourceLocation still, ResourceLocation flow) {
        super(registryName, still, flow);
        setUnlocalizedName(unlocalizedName);
    }
}
