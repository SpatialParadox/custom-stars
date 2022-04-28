package com.bespectacled.customstars.config.forge;

import com.bespectacled.customstars.config.IStarsConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class ConfigHandlerImpl {
    public static IStarsConfig getConfig() {
        return AutoConfig.register(StarsConfig.class, GsonConfigSerializer::new).getConfig();
    }

    public static void registerScreen() {
    }
}
