package com.kvolmik.coffeeminecraft.registry;

import com.kvolmik.coffeeminecraft.CoffeeMinecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoffeeMinecraft.MODID);

    // Intentionally just decorative items: no use action, crafting recipe, or gameplay effects.
    public static final RegistryObject<Item> COFFEE_GLASS =
            ITEMS.register("coffee_glass", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> COLORFUL_CUP_BLUE =
            ITEMS.register("colorful_cup_blue", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> COLORFUL_CUP_RED =
            ITEMS.register("colorful_cup_red", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> COLORFUL_CUP_GREEN =
            ITEMS.register("colorful_cup_green", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> COFFEE_TO_GO =
            ITEMS.register("coffee_to_go", () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> TAVERN_MUG =
            ITEMS.register("tavern_mug", () -> new Item(new Item.Properties().stacksTo(16)));

    private ModItems() {}
}
