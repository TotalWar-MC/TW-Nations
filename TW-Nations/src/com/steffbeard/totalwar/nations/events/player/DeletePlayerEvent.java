package com.steffbeard.totalwar.nations.events.player;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DeletePlayerEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private String playerName;

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public DeletePlayerEvent(String player) {
        super(!Bukkit.getServer().isPrimaryThread());
        this.playerName = player;
    }

    /**
     * @return the deleted player's name.
     */
    public String getPlayerName() {
        return playerName;
    }
}
