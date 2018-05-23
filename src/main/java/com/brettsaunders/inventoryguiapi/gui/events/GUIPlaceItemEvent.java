package com.brettsaunders.inventoryguiapi.gui.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.brettsaunders.inventoryguiapi.gui.elements.GUIElement;
import com.brettsaunders.inventoryguiapi.gui.session.GUISession;

/**
 * Cancellable event that is fired when a GUIElement has been an item placed in it but has not yet handled it
 */
public class GUIPlaceItemEvent extends GUIClickEvent implements Cancellable {
    public GUIPlaceItemEvent(GUISession session, Player viewer, int inventorySlot, GUIElement interactedElement, InventoryClickEvent bukkitEvent){
        super(session, viewer, inventorySlot, interactedElement, bukkitEvent);
    }

    private static final HandlerList handlers = new HandlerList(); //Required for Bukkit Events, can't just inherit
    
    public HandlerList getHandlers() { //Required for Bukkit Events, can't just inherit
        return handlers;
    }
    public static HandlerList getHandlerList() { //Required for Bukkit Events, can't just inherit
        return handlers;
    }
}
