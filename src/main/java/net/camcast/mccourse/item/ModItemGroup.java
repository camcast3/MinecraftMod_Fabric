package net.camcast.mccourse.item;

import net.camcast.mccourse.MCCourseMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static net.camcast.mccourse.MCCourseMod.*;

public class ModItemGroup {

    public static final ItemGroup ORICHALCUM = Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID,"orichalcum"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.orichalcum"))
                    .icon(() -> new ItemStack(ModItems.ORICHALCUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ORICHALCUM_INGOT);
                        entries.add(ModItems.ORICHALCUM_NUGGET);

                    }).build());

    public static void registerItemGroups() {

    }
}
