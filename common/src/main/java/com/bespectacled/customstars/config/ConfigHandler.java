package com.bespectacled.customstars.config;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class ConfigHandler {
    @ExpectPlatform
    public static IStarsConfig getConfig() {
        throw new AssertionError();
    }
}
