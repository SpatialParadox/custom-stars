package com.bespectacled.customstars.config.fabric;

import com.bespectacled.customstars.config.IStarsConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "customstars")
public class StarsConfig implements ConfigData, IStarsConfig {

    @ConfigEntry.Category(value = "starsBasic")
    @ConfigEntry.Gui.Tooltip
    public float baseSize = 0.15f;

    @ConfigEntry.Category(value = "starsBasic")
    @ConfigEntry.Gui.Tooltip(count = 2)
    public float maxSizeMultiplier = 0.1f;

    @ConfigEntry.Category(value = "starsBasic")
    @ConfigEntry.Gui.Tooltip
    public int starCount = 1500;
    
    @ConfigEntry.Category(value = "starsNoise")
    @ConfigEntry.Gui.Tooltip
    public boolean starNoise = false;
    
    @ConfigEntry.Category(value = "starsNoise")
    @ConfigEntry.Gui.Tooltip
    public long starNoiseSeed = 10842L;
    
    @ConfigEntry.Category(value = "starsNoise")
    @ConfigEntry.Gui.Tooltip(count = 2)
    public double starNoiseThreshold = 0.5;
    
    @ConfigEntry.Category(value = "starsNoise")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 100, min = 0)
    public int starNoisePercentage = 50;

    @ConfigEntry.Category(value = "starsColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int starRed = 255;

    @ConfigEntry.Category(value = "starsColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int starGreen = 255;

    @ConfigEntry.Category(value = "starsColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int starBlue = 255;

    @ConfigEntry.Category(value = "starsColor")
    @ConfigEntry.Gui.Tooltip(count = 2)
    public float starAlpha = 1.0f;

    @ConfigEntry.Category(value = "skyColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int skyRed = 0;
    
    @ConfigEntry.Category(value = "skyColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int skyGreen = 0;
    
    @ConfigEntry.Category(value = "skyColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int skyBlue = 0;
    
    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.Gui.Tooltip
    public float endSize = 1.0f;
    
    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int endRed = 40;

    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int endGreen = 40;

    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.Gui.Tooltip
    @ConfigEntry.BoundedDiscrete(max = 255)
    public int endBlue = 40;
    
    @ConfigEntry.Category(value = "endColor")
    @ConfigEntry.Gui.Tooltip(count = 2)
    public float endAlpha = 1.0f;

    @Override
    public float getBaseSize() {
        return baseSize;
    }

    @Override
    public float getMaxSizeMultiplier() {
        return maxSizeMultiplier;
    }

    @Override
    public int getStarCount() {
        return starCount;
    }

    @Override
    public boolean isStarNoiseEnabled() {
        return starNoise;
    }

    @Override
    public long getStarNoiseSeed() {
        return starNoiseSeed;
    }

    @Override
    public double getStarNoiseThreshold() {
        return starNoiseThreshold;
    }

    @Override
    public int getStarNoisePercentage() {
        return starNoisePercentage;
    }

    @Override
    public int getStarRed() {
        return starRed;
    }

    @Override
    public int getStarGreen() {
        return starGreen;
    }

    @Override
    public int getStarBlue() {
        return starBlue;
    }

    @Override
    public float getStarAlpha() {
        return starAlpha;
    }

    @Override
    public int getSkyRed() {
        return skyRed;
    }

    @Override
    public int getSkyGreen() {
        return skyGreen;
    }

    @Override
    public int getSkyBlue() {
        return skyBlue;
    }

    @Override
    public float getEndSize() {
        return endSize;
    }

    @Override
    public int getEndRed() {
        return endRed;
    }

    @Override
    public int getEndGreen() {
        return endGreen;
    }

    @Override
    public int getEndBlue() {
        return endBlue;
    }

    @Override
    public float getEndAlpha() {
        return endAlpha;
    }
}
