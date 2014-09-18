package com.KingEnderman.TangibleShadows;

import net.minecraft.util.ChatComponentTranslation;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class ShadowDeathEventHandler {
	@SubscribeEvent
	public void playerRespawn (PlayerRespawnEvent event)
	{
		event.player.addChatMessage(new ChatComponentTranslation("ts.respawn", new Object[0]));
	}

}
