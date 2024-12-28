package com.paneedah.mwc.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.paneedah.mwc.asm.Interceptors;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SideOnly(Side.CLIENT)
@Mixin(EntityRenderer.class)
public final class EntityRendererMixin {
    @Inject(method = "setupCameraTransform", at = @At(value = "INVOKE", shift = At.Shift.AFTER,
            target = "Lnet/minecraft/client/renderer/EntityRenderer;hurtCameraEffect(F)V"))
    private void injectHurtCameraEffect(float partialTicks, int pass, CallbackInfo ci) {
        Interceptors.hurtCameraEffect(partialTicks);
    }

    @ModifyVariable(method = "setupCameraTransform", ordinal = 2, at = @At(value = "LOAD", ordinal = 0))
    private float intercept(float value, @Local(ordinal = 0, argsOnly = true) float partialTicks) {
        return Interceptors.nauseaCameraEffect(partialTicks) ? value : -1;
    }

    @Inject(method = "applyBobbing", at = @At("HEAD"), cancellable = true)
    private void cancelBobbing(float partialTicks, CallbackInfo ci) {
        if (!Interceptors.setupViewBobbing(partialTicks)) {
            ci.cancel();
        }
    }

    @Inject(method = "hurtCameraEffect", at = @At("HEAD"), cancellable = true)
    private void cancelHurtCameraEffect(float partialTicks, CallbackInfo ci) {
        if (!Interceptors.hurtCameraEffect(partialTicks)) {
            ci.cancel();
        }
    }

    @Redirect(method = "updateCameraAndRender", at = @At(value = "INVOKE_ASSIGN", shift = At.Shift.BEFORE,
            target = "Lnet/minecraft/client/entity/EntityPlayerSP;turn(FF)V"))
    public void injectTurn(EntityPlayerSP player, float yaw, float pitch) {
        Interceptors.turn(player, yaw, pitch);
    }

    @Inject(method = "switchUseShader", at = @At(value = "HEAD"), cancellable = true)
    private void disableSwitchUseShader(CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }
}
