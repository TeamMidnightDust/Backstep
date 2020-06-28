package eu.midnightdust.motschen.backstep;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.UniformLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;

public class LootModifier {

    public static void init() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (id.getPath().contains("chests") && id.getPath().contains("nether_bridge")) {
                FabricLootPoolBuilder pigstep = FabricLootPoolBuilder.builder()
                        .withRolls(UniformLootTableRange.between(0, 1))
                        .withCondition(RandomChanceLootCondition.builder(0.2f).build())
                        .withEntry(ItemEntry.builder(Backstep.MUSIC_DISC_PIGSTEP));
                supplier.withPool(pigstep);
            }
        });
    }
}
