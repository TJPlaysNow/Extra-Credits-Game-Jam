package com.tjplaysnow.discordgame.api;

import java.awt.Color;

public enum AsciiColor {
	
	Black (Color.BLACK, ' '),
	White (Color.WHITE, '*'),
	Blue  (Color.BLUE,  'B'),
	Red   (Color.RED,   'R');
	
//	Blank (Color.WHITE, ' ');
	
//	----------------------------------------------
	
	private Color color;
	private char symbol;
	
	AsciiColor(Color color, char symbol) {
		this.color = color;
		this.symbol = symbol;
	}
	
	public Color getColor() {
		return color;
	}
	public char getSymbol() {
		return symbol;
	}
	
//	----------------------------------------------
	
	public static char getChar(int ColorNumber) {
		Color color = new Color(ColorNumber);
		return AsciiColor.getAsciiColor(color).getSymbol();
	}
	
	public static AsciiColor getAsciiColor(Color color) {
		for (AsciiColor asciiColor : AsciiColor.values()) {
			if (asciiColor.getColor().equals(color)) {
				return asciiColor;
			}
		}
		return Black;
	}
}