package com.tjplaysnow.discordgame.api;

import java.util.ArrayList;
import java.util.List;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Space3D {
	
	private int width, height;
	private BufferedImage bufferedImage;
	private Graphics graphics;
	private Graphics2D graphics2D;
	
	public Space3D(int width, int height) {
		this.width = width;
		this.height = height;
		bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		graphics = bufferedImage.getGraphics();
		graphics2D = (Graphics2D) graphics;
		graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
	}
	
	public void drawText(String text, Color color) {
//		graphics2D.setColor(Color.WHITE);
//		graphics2D.fillRect(0,0, width, height);
		graphics2D.setColor(color);
		graphics2D.drawString(text, 4, 11);
	}
	
	
	
	public List<String> getASCII() {
		List<String> lines = new ArrayList<>();
		for (int y = 0; y < height; y++) {
			StringBuilder stringBuilder = new StringBuilder();
			for (int x = 0; x < width; x++) {
				stringBuilder.append(AsciiColor.getChar(bufferedImage.getRGB(x, y)));
			}
//			if (stringBuilder.toString().trim().isEmpty()) {
//				continue;
//			}
			lines.add(stringBuilder.toString());
		}
		return lines;
	}
}