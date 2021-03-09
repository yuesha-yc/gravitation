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

import com.teammoeg.gravitation.api.modinitializers.ModInitializer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Gravitation.MOD_ID)
public class Gravitation implements ModInitializer {
    public static final String MOD_ID = "gravitation";
    public static final String MOD_NAME = "Gravitation";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);

    public Gravitation() {
        IEventBus FORGE_BUS = MinecraftForge.EVENT_BUS, MOD_BUS = FMLJavaModLoadingContext.get().getModEventBus();
        MOD_BUS.register(this);
        MOD_BUS.register(new RegistryEventHandler());
        FORGE_BUS.register(new ForgeEventHandler());
    }

    @Override
    public void onModCommonSetup2(FMLCommonSetupEvent aEvent) {
        System.out.println("Hello from Common Setup");
    }

    @Override
    public void onModClientSetup2(FMLClientSetupEvent aEvent) {

    }

    @Override
    public void onModServerSetup2(FMLDedicatedServerSetupEvent event) {

    }

    @Override
    public void onModIMCEnqueue2(InterModEnqueueEvent aEvent) {

    }

    @Override
    public void onModIMCProcess2(InterModProcessEvent aEvent) {

    }

    // Do not modify the codes below

    @Override
    public String getModID() {
        return MOD_ID;
    }

    @Override
    public String getModName() {
        return MOD_NAME;
    }

    @Override
    public String getModNameForLog() {
        return MOD_NAME.toUpperCase().replace(' ', '_') + "_Mod";
    }

    @SubscribeEvent
    public void onCommonSetup(FMLCommonSetupEvent aEvent) {
        onModCommonSetup(aEvent);
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent aEvent) {
        onModClientSetup(aEvent);
    }

    @SubscribeEvent
    public void onServerSetup(FMLDedicatedServerSetupEvent aEvent) {
        onModServerSetup(aEvent);
    }

    @SubscribeEvent
    public void onIMCEnqueue(InterModEnqueueEvent aEvent) {
        onModIMCEnqueue(aEvent);
    }

    @SubscribeEvent
    public void onIMCProcess(InterModProcessEvent aEvent) {
        onModIMCProcess(aEvent);
    }

}
