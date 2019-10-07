package com.rlnt.ihmam.objects.fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidLiquid extends Fluid {

    public FluidLiquid(String unlocalizedName, String registryName, ResourceLocation still, ResourceLocation flow) {
        super(registryName, still, flow);
        this.setUnlocalizedName(unlocalizedName);
    }
}
