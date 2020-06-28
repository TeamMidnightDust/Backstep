package eu.midnightdust.motschen.backstep;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class Backstep implements ModInitializer {

    public static final Item MUSIC_DISC_PIGSTEP = new BackstepMusicDiscItem(13, BackstepSoundEvent.MUSIC_DISC_PIGSTEP,(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.RARE).maxCount(1)));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("backstep","music_disc_pigstep"), MUSIC_DISC_PIGSTEP);
        LootModifier.init();
    }
}
