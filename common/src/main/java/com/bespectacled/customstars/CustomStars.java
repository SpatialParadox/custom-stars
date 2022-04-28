package com.bespectacled.customstars;

import com.bespectacled.customstars.config.ConfigHandler;
import com.bespectacled.customstars.config.ConfigObserver;
import com.bespectacled.customstars.config.IStarsConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomStars {
    public static final String MOD_ID = "customstars";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final IStarsConfig CONFIG = ConfigHandler.getConfig();
    public static final ConfigObserver CONFIG_OBSERVER = new ConfigObserver();

    public static void onClientLoad() {
        CONFIG_OBSERVER.registerObservable("baseSize", CONFIG::getBaseSize);
        CONFIG_OBSERVER.registerObservable("sizeModifier", CONFIG::getMaxSizeMultiplier);
        CONFIG_OBSERVER.registerObservable("starCount", CONFIG::getStarCount);
        CONFIG_OBSERVER.registerObservable("starNoise", CONFIG::isStarNoiseEnabled);
        CONFIG_OBSERVER.registerObservable("starNoiseSeed", CONFIG::getStarNoiseSeed);
        CONFIG_OBSERVER.registerObservable("starNoisePercentage", CONFIG::getStarNoisePercentage);
        CONFIG_OBSERVER.registerObservable("starNoiseThreshold", CONFIG::getStarNoiseThreshold);
    }
}
