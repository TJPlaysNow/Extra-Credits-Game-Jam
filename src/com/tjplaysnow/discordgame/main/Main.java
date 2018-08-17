package com.tjplaysnow.discordgame.main;

import com.tjplaysnow.discord.object.Bot;
import com.tjplaysnow.discord.object.CommandConsoleManager;
import com.tjplaysnow.discord.object.ThreadHandle;
import com.tjplaysnow.discordgame.api.Space3D;

import java.awt.*;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Bot bot = new Bot("NDgwMDQ1MDY3MzQ5MDAwMTkz.DliE-Q.MIuoI5zO_7WJCemrqxRXDOS_Ils", "!");
		bot.setBotThread(new ThreadHandle());
		bot.setConsoleCommandManager(new CommandConsoleManager());
		
		bot.setLoadAction(() -> {
			Space3D space3D = new Space3D(75, 14);
			space3D.drawText("HELLO.", Color.RED);
			space3D.drawText("This is overlapping", Color.WHITE);
			StringBuilder stringBuilder = new StringBuilder("```");
			List<String> lines = space3D.getASCII();
			for (String line : lines) {
				stringBuilder.append(line).append("\n");
			}
			stringBuilder.append("```");
			bot.getBot().getGuildById(479876611835953181L).getTextChannelById(479887638875078656L).sendMessage(stringBuilder).queue((message) -> {bot.logout(); System.out.println("Logged the bot out.");});
		});
	}
}