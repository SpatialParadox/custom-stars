package com.bespectacled.customstars.config;

public interface IStarsConfig {
    float getBaseSize();

    float getMaxSizeMultiplier();

    int getStarCount();

    boolean isStarNoiseEnabled();

    long getStarNoiseSeed();

    double getStarNoiseThreshold();

    int getStarNoisePercentage();

    int getStarRed();

    int getStarGreen();

    int getStarBlue();

    float getStarAlpha();

    int getSkyRed();

    int getSkyGreen();

    int getSkyBlue();

    float getEndSize();

    int getEndRed();

    int getEndGreen();

    int getEndBlue();

    float getEndAlpha();
}
