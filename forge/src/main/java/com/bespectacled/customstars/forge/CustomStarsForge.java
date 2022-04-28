package com.bespectacled.customstars.forge;

import com.bespectacled.customstars.CustomStars;
import com.bespectacled.customstars.config.forge.StarsConfig;
import dev.architectury.platform.forge.EventBuses;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraftforge.client.ConfigGuiHandler;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkConstants;

@Mod(CustomStars.MOD_ID)
public class CustomStarsForge {
    public CustomStarsForge() {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class,
                () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(CustomStars.MOD_ID, eventBus);
        eventBus.addListener(this::onClientLoad);

        ModLoadingContext.get().registerExtensionPoint(ConfigGuiHandler.ConfigGuiFactory.class,
                () -> new ConfigGuiHandler.ConfigGuiFactory((client, parent) ->
                        AutoConfig.getConfigScreen(StarsConfig.class, parent).get()));
    }

    private void onClientLoad(FMLClientSetupEvent event) {
        CustomStars.onClientLoad();
    }
}
