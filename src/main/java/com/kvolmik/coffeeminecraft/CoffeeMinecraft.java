package com.kvolmik.coffeeminecraft;

import com.kvolmik.coffeeminecraft.registry.ModItems;
import com.kvolmik.coffeeminecraft.registry.ModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CoffeeMinecraft.MODID)
public final class CoffeeMinecraft {
    public static final String MODID = "coffeeminecraft";

    public CoffeeMinecraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModTabs.TABS.register(bus);
    }
}
