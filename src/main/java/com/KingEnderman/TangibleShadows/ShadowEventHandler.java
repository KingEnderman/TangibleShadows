package com.KingEnderman.TangibleShadows;

import net.minecraft.util.ChatComponentTranslation;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;


public class ShadowEventHandler 
{
	@SubscribeEvent
	public void playerLogin (PlayerEvent.PlayerLoggedInEvent event)
	{
		event.player.addChatMessage(new ChatComponentTranslation("ts.thanks", new Object[0]));
	}

}
