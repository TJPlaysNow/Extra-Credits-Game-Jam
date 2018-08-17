package com.tjplaysnow.discordgame.main;

import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.entities.User;

public class Game {
	
	private final String WINDOW = "┌─────────────┬─────────────────────────────────────────────────────────────────────────────┐\n│             │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│ xxxxxxxxxxx │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n│             │ ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo │\n├─────────────┴─────────────────────────────────────────────────────────────────────────────┤\n│ ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc │\n│ ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc │\n│ ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc │\n│ ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc │\n└───────────────────────────────────────────────────────────────────────────────────────────┘";
	
	User user;
	MessageChannel gameMessage;
	
	public Game(User user, MessageChannel gameMessage) {
	
	}
	
	public String drawWindow() {
		StringBuilder stringBuilder = new StringBuilder();
		
		return "";
	}
	
}