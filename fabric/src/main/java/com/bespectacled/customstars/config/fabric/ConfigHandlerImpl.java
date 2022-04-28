package com.bespectacled.customstars.config.fabric;

import com.bespectacled.customstars.config.IStarsConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class ConfigHandlerImpl {
    private static StarsConfig config;

    public static IStarsConfig getConfig() {
        return AutoConfig.register(StarsConfig.class, GsonConfigSerializer::new).getConfig();
    }
}
