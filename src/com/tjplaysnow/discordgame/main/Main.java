package com.tjplaysnow.discordgame.main;

import com.tjplaysnow.discord.object.Bot;
import com.tjplaysnow.discord.object.CommandConsoleManager;
import com.tjplaysnow.discord.object.ProgramCommand;
import com.tjplaysnow.discord.object.ThreadHandle;
import com.tjplaysnow.discordgame.api.Space3D;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

import java.awt.*;
import java.util.List;

public class Main {
	
	
	
	public static void main(String[] args) {
		Bot bot = new Bot("NDgwMDQ1MDY3MzQ5MDAwMTkz.DliE-Q.MIuoI5zO_7WJCemrqxRXDOS_Ils", "!");
		bot.setBotThread(new ThreadHandle());
		bot.setConsoleCommandManager(new CommandConsoleManager());
		
		Space3D space3D = new Space3D(75, 14);
		space3D.drawText("HELLO.", Color.RED);
		space3D.drawText("This is overlapping", Color.WHITE);
		
		bot.addCommand(new ProgramCommand() {
			@Override
			public String getLabel() {
				return "start";
			}
			
			@Override
			protected boolean run(User user, MessageChannel messageChannel, Guild guild, String s, List<String> list) {
				Game game = new Game(user, messageChannel);
				return true;
			}
		});
	}
}