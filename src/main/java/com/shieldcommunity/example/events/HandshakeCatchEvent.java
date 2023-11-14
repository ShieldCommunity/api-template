package com.shieldcommunity.example.events;

import com.shieldcommunity.example.Test;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import net.shieldcommunity.nullcordx.api.events.AttackDetectedEvent;

public class HandshakeCatchEvent implements Listener {

    private Test plugin;

    public HandshakeCatchEvent(Test plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void on(AttackDetectedEvent event) {
       plugin.getLogger().info(
               "Attack time: " + event.getTime()
       ); //Return the time of the attack
    }
}
