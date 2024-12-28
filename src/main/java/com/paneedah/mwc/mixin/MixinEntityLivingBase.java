package com.paneedah.mwc.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.paneedah.mwc.asm.ServerInterceptors;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(EntityLivingBase.class)
public abstract class MixinEntityLivingBase {
    @Shadow
    public abstract void knockBack(Entity entityIn, float strength, double xRatio, double zRatio);

    @Redirect(method = "attackEntityFrom", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;knockBack(Lnet/minecraft/entity/Entity;FDD)V"))
    private void redirectKnockback(EntityLivingBase instance, Entity entity, float strength, double xRatio,
                                   double yRatio, @Local(ordinal = 0, argsOnly = true) DamageSource source) {
        this.knockBack(entity, ServerInterceptors.getKnockback(source), xRatio, yRatio);
    }
}
