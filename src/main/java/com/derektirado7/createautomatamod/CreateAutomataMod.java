package com.derektirado7.createautomatamod;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.slf4j.Logger;

@Mod(CreateAutomataMod.MODID)
public class CreateAutomataMod {
    public static final String MODID = "createautomatamod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CreateAutomataMod(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        LOGGER.info("Create: Automata mod loaded");
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Create: Automata mod setup complete");
    }
}
