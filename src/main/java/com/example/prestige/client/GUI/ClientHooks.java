package com.example.prestige.client.GUI;

import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;

public class ClientHooks {
    public static void openItemOpenScreen() {
        Minecraft.getInstance().setScreen(new GetItemScreen());
    }
}