package com.kvolmik.coffeeminecraft.registry;

import com.kvolmik.coffeeminecraft.CoffeeMinecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoffeeMinecraft.MODID);

    public static final RegistryObject<Item> COFFEE_MUG =
            ITEMS.register("coffee_mug", () -> new Item(new Item.Properties().stacksTo(1)));

    private ModItems() {}
}
