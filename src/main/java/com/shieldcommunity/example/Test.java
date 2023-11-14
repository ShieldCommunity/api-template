package com.shieldcommunity.example;

import com.shieldcommunity.example.events.AttackDetectCatchEvent;
import net.md_5.bungee.api.plugin.Plugin;

public final class Test extends Plugin {

    @Override
    public void onEnable() {
        getLogger().info(
                "Test plugin enabled"
        );

        getProxy().getPluginManager().registerListener(
                this,
                new com.shieldcommunity.example.events.HaProxyCatchEvent(this
                ));
        getProxy().getPluginManager().registerListener(
                this,
                new AttackDetectCatchEvent(this)
        );
    }

    @Override
    public void onDisable() {
        getLogger().info(
                "Test plugin disabled"
        );
    }
}
