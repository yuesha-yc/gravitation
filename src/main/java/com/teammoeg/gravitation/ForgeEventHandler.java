/*
 *  Copyright (c) 2021 TeamMoeg
 *
 *  This file is part of Gravitation.
 *
 *  Gravitation is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Gravitation is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Gravitation. If not, see <http://www.gnu.org/licenses/>.
 */

package com.teammoeg.gravitation;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartedEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.server.FMLServerStoppedEvent;
import net.minecraftforge.fml.event.server.FMLServerStoppingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 */
@Mod.EventBusSubscriber(modid = Gravitation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventHandler {
    private static final Logger LOGGER = LogManager.getLogger("Gravitation");

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent aEvent) {

    }

    @SubscribeEvent
    public void onServerStarted(FMLServerStartedEvent aEvent) {

    }

    @SubscribeEvent
    public void onServerStopping(FMLServerStoppingEvent aEvent) {

    }

    @SubscribeEvent
    public void onServerStopped(FMLServerStoppedEvent aEvent) {

    }
}
