package com.shieldcommunity.example.events;

import com.shieldcommunity.example.Test;
import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.config.ListenerInfo;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import net.shieldcommunity.nullcordx.api.events.HAProxyConnectionInitEvent;

import java.net.SocketAddress;

public class HaProxyCatchEvent implements Listener {

    private Test plugin;

    public HaProxyCatchEvent(Test plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onHaProxyCatchEvent(HAProxyConnectionInitEvent event) {
        event.getListener().isProxyProtocol(); //Return the listener is using proxy protocol

        plugin.getLogger().warning(
                "HaProxyEvent seems cancelled" + event.isCancelled()
        ); //Return the state as logger if the event is cancelled
    }
}
