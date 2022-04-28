package com.bespectacled.customstars.fabric;

import com.bespectacled.customstars.CustomStars;
import net.fabricmc.api.ClientModInitializer;

public class CustomStarsFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CustomStars.onClientLoad();
    }
}
