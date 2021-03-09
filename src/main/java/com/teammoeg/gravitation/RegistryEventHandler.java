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

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEventHandler {
    public static List<Item> registeredItems = new ArrayList<>();
    public static List<Block> registeredBlocks = new ArrayList<>();

    @SubscribeEvent
    public void onBlocksRegistry(RegistryEvent.Register<Block> blockRegistryEvent) {
        for (Block block : registeredBlocks) {
            blockRegistryEvent.getRegistry().register(block);
        }
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> itemRegistryEvent) {
        for (Item item : registeredItems) {
            itemRegistryEvent.getRegistry().register(item);
        }
    }
}
