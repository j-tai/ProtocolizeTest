package ca.jtai.protocolizetest;

import com.google.inject.Inject;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import dev.simplix.protocolize.api.Protocolize;
import dev.simplix.protocolize.api.SoundCategory;
import dev.simplix.protocolize.api.player.ProtocolizePlayer;
import dev.simplix.protocolize.data.Sound;
import org.slf4j.Logger;

@Plugin(
    id = "protocolizetest",
    name = "ProtocolizeTest",
    version = BuildConstants.VERSION
)
public class ProtocolizeTest {
    @Inject
    private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }

    @Subscribe
    public void onChat(PlayerChatEvent e) {
        ProtocolizePlayer player = Protocolize.playerProvider().player(e.getPlayer().getUniqueId());
        player.playSound(Sound.BLOCK_NOTE_BLOCK_FLUTE, SoundCategory.MASTER, 1f, 1f);
    }
}
