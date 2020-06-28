package eu.midnightdust.motschen.backstep;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BackstepSoundEvent {
    public static final SoundEvent MUSIC_DISC_PIGSTEP = register("backstep:music_disc.pigstep");

    private static SoundEvent register(String id) {
        return (SoundEvent) Registry.register(Registry.SOUND_EVENT, (String) id, new SoundEvent(new Identifier(id)));
    }
}
