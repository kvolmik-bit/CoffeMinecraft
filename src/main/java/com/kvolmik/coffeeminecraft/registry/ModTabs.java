package com.kvolmik.coffeeminecraft.registry;

import com.kvolmik.coffeeminecraft.CoffeeMinecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoffeeMinecraft.MODID);

    public static final RegistryObject<CreativeModeTab> COFFEE = TABS.register("coffee",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.coffeeminecraft"))
                    .icon(() -> new ItemStack(ModItems.COFFEE_GLASS.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.COFFEE_GLASS.get());
                        output.accept(ModItems.COLORFUL_CUP_BLUE.get());
                        output.accept(ModItems.COLORFUL_CUP_RED.get());
                        output.accept(ModItems.COLORFUL_CUP_GREEN.get());
                        output.accept(ModItems.COFFEE_TO_GO.get());
                        output.accept(ModItems.TAVERN_MUG.get());
                    })
                    .build());

    private ModTabs() {}
}
