package com.derektirado7.createautomatamod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

public class AutomatonEntity extends Mob {
    private int kineticCharge = 100;

    public AutomatonEntity(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    public int getKineticCharge() {
        return kineticCharge;
    }

    public void setKineticCharge(int kineticCharge) {
        this.kineticCharge = kineticCharge;
    }

    @Override
    public void tick() {
        super.tick();
        if (kineticCharge > 0) {
            kineticCharge--;
        }
        if (kineticCharge < 15) {
            // Trigger return-to-station AI
        }
    }
}
