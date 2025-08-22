package com.paneedah.mwc.asm;

import com.paneedah.weaponlib.WeaponSpawnEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class ServerInterceptors {

    public static float getKnockback(DamageSource source) {
        return source instanceof WeaponSpawnEntity.ProjectileDamageSource ? 0 : 0.4f;
    }
}
