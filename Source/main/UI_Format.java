package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

import Object.Coin;
import Object.Key;

public class UI_Format {
	GamePanel gp;
	Font serif_40, arial_80;
	BufferedImage keyImage;
	BufferedImage coinImage;
	public boolean messageOn = false;
	public String message = "";
	int messageCounter = 0;
	public boolean gameFinished = false;
	
	double playTime;
	DecimalFormat dFormat = new DecimalFormat("#0.00");
	
	public UI_Format (GamePanel gp) {
		this.gp = gp;
		serif_40 = new Font("Serif", Font.ITALIC, 40);
		arial_80 = new Font("Arial", Font.BOLD, 80);
		
		//extract object to screen
		Key key = new Key();
		keyImage = key.image;
		Coin coin = new Coin();
		coinImage = coin.image;
	}
	
	public void showMessage(String text) {
		message = text;
		messageOn = true;
	}
	
	public void draw(Graphics2D g2) {
		
		if(gameFinished == true) {
			g2.setFont(serif_40);
			g2.setColor(Color.WHITE);
			String text, text2;
			int textLength;
			int x, y;
			
			text = "You success did it, you found the treasure!";
			text2 = "You have earn : " + gp.player.hasCoin + "/3 coin!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth / 2 - textLength / 2;
			y = gp.screenHeight / 2 - (gp.tilesize * 3);
			g2.drawString(text, x, y);
			g2.drawString(text2, 320, 350);
			
			text = "You have successfully completed in : " + dFormat.format(playTime) + "s!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth / 2 - textLength / 2;
			y = gp.screenHeight / 2 + (gp.tilesize * 4);
			g2.drawString(text, x, y);
			
			g2.setFont(arial_80);
			g2.setColor(Color.YELLOW);
			text = "Congratulations!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth / 2 - textLength / 2;
			y = gp.screenHeight / 2 + (gp.tilesize * 2);
			g2.drawString(text, x, y);
			
			gp.game = null;
			
		}
		else {
			g2.setFont(serif_40);
			g2.setColor(Color.WHITE);
			g2.drawImage(keyImage, gp.tilesize / 2, gp.tilesize / 2, gp.tilesize, gp.tilesize, null);
			g2.drawString("x " + gp.player.hasKey, 98, 65);
			
			g2.setFont(serif_40);
			g2.setColor(Color.WHITE);
			g2.drawImage(coinImage, 35, 96, gp.tilesize, gp.tilesize, null);
			g2.drawString("x " + gp.player.hasCoin, 98, 140);
			
			//time
			playTime +=(double)1/60;
			g2.drawString("Time: " + dFormat.format(playTime), gp.tilesize*12, 65);
			
			//message
			if(messageOn == true) {
				g2.setFont(g2.getFont().deriveFont(30F));
				g2.drawString(message, gp.tilesize / 2, gp.tilesize * 5);
				
				messageCounter++;
				
				if(messageCounter > 120) {
					messageCounter = 0;
					messageOn = false;
				}
			}
		}
	}
}
