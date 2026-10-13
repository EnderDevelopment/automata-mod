package com.derektirado7.createautomatamod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;

public class RechargingStationBlockEntity extends BlockEntity {
    public RechargingStationBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityType.RECHARGING_STATION, pos, state);
    }

    public void tick() {
        // Read RPM from attached shafts and refill docked Automaton charge
    }
}
