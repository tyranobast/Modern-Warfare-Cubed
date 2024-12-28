package com.paneedah.mwc.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.paneedah.mwc.asm.Interceptors;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LayerHeldItem.class)
public abstract class MixinLayerHeldItem {
    @Shadow
    private RenderLivingBase<?> livingEntityRenderer;

    @Redirect(method = "renderHeldItem", at = @At(value = "INVOKE", target =
            "Lnet/minecraft/client/renderer/entity/layers/LayerHeldItem;translateToHand(Lnet/minecraft/util/EnumHandSide;)V"))
    private void interceptTranslateToHand(LayerHeldItem layer, EnumHandSide side,
                                          @Local(ordinal = 0, argsOnly = true) EntityLivingBase entity,
                                          @Local(ordinal = 0, argsOnly = true) ItemStack stack,
                                          @Local(ordinal = 0, argsOnly = true) ItemCameraTransforms.TransformType transformType) {
        Interceptors.positionItemSide(this.livingEntityRenderer, entity, stack, transformType, side);
    }
}
