package com.kvolmik.coffeeminecraft.registry;

import com.kvolmik.coffeeminecraft.CoffeeMinecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoffeeMinecraft.MODID);

    // Intentionally just a decorative item: no use action, crafting recipe, or gameplay effects.
    public static final RegistryObject<Item> COFFEE_GLASS =
            ITEMS.register("coffee_glass", () -> new Item(new Item.Properties().stacksTo(16)));

    private ModItems() {}
}
