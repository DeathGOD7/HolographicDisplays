/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.holographicdisplays.plugin.api.v2;

import com.gmail.filoghost.holographicdisplays.api.handler.PickupHandler;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class V3PickupHandlerAdapter implements me.filoghost.holographicdisplays.api.hologram.PickupHandler {

    private final PickupHandler v2PickupHandler;

    public V3PickupHandlerAdapter(PickupHandler v2PickupHandler) {
        this.v2PickupHandler = v2PickupHandler;
    }

    @Override
    public void onPickup(@NotNull Player player) {
        v2PickupHandler.onPickup(player);
    }

    public PickupHandler getV2PickupHandler() {
        return v2PickupHandler;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V3PickupHandlerAdapter)) {
            return false;
        }

        V3PickupHandlerAdapter other = (V3PickupHandlerAdapter) obj;
        return this.v2PickupHandler.equals(other.v2PickupHandler);
    }

    @Override
    public final int hashCode() {
        return v2PickupHandler.hashCode();
    }

    @Override
    public final String toString() {
        return v2PickupHandler.toString();
    }

}