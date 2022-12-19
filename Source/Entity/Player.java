package Entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.Controller;

public class Player extends Entity{

	GamePanel gp;
	Controller Ctr;
	
	public final int screenX;
	public final int screenY;
	public int hasKey = 0;
	public int hasCoin = 0;
	
	
	public Player(GamePanel gp, Controller Ctr) {
		this.gp = gp;
		this.Ctr = Ctr;
		
		screenX = gp.screenWidth/2 - (gp.tilesize/2);
		screenY = gp.screenHeight/2 - (gp.tilesize/2); 
		
		solidArea = new Rectangle();
		solidArea.x = 8;
		solidArea.y = 16;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 32;
		solidArea.height = 32;
		
		setDefaultValues();
		getPlayerImage();
	}
	
	public void setDefaultValues() {
		worldX = gp.tilesize * 9;
		worldY = gp.tilesize * 12;
		speed = 5;
		direction = "down";
	}
	
	public void getPlayerImage() {
		try {
			up1 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaUp1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaUp2.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaDown1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaDown2.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaLeft1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaLeft2.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaRight1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/AlexiaRight2.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void update() {
		if(Ctr.upside == true || Ctr.downside == true ||
			Ctr.leftside == true || Ctr.rightside == true) {
			
			if(Ctr.upside == true) {
				direction = "up";
			}
			else if(Ctr.downside == true) {
				direction = "down";
			}
			else if(Ctr.leftside == true) {
				direction = "left";
			}
			else if(Ctr.rightside == true) {
				direction = "right";
			}
			
			//Check Tile Collision
			collisionOn = false;
			gp.ColC.checkTile(this);
			
			//Check Object Collision
			int objIndex = gp.ColC.checkObject(this,true);
			pickUpObject(objIndex);
			
			//if collision false, player can move
			if (collisionOn == false) {
				switch(direction) {
				case "up" : worldY -= speed; break;
				case "down" : worldY += speed; break;
				case "left" : worldX -= speed; break;
				case "right" : worldX += speed; break;
				}
			}
			
			spriteCounter++;
			if(spriteCounter > 12) { //player image changes in every 12 frames
				if(spriteNum == 1) {
					spriteNum = 2;
				}else if(spriteNum == 2) {
					spriteNum = 1;
				}
				spriteCounter = 0; //reset spritecounter
			}
		}
	}
	
	public void pickUpObject(int i) {
		if(i != 999) {
			String objectName = gp.obj[i].name;
			
			switch(objectName) {
			case "Coin":
				hasCoin++;
				gp.obj[i] = null;
				gp.uif.showMessage("Yes! You got a coin!");
				break;
			case "Key":
				hasKey++;
				gp.obj[i] = null;
				gp.uif.showMessage("You got it, open the door!");
				break;
			case "Door":
				if(hasKey > 0) {
					gp.obj[i] = null;
					hasKey--;
					gp.uif.showMessage("You opened the door!");
				}
				else {
					gp.uif.showMessage("Let's find another key!");
				}
				break;
			case "SpeedSkill":
				speed += 2;
				gp.obj[i] = null;
				gp.uif.showMessage("Speed was up! GOGOGO!");
				break;
			case "Chest":
				gp.uif.gameFinished = true;
				break;
			}
		}
	}
	public void draw(Graphics2D g2) {
		
		BufferedImage image = null;
		
		switch(direction) {
		case "up":
			if(spriteNum == 1) {
				image = up1;
			}
			if(spriteNum == 2) {
				image = up2;
			}
			break;
		case "down":
			if(spriteNum == 1) {
				image = down1;
			}
			if(spriteNum == 2) {
				image = down2;
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = left1;
			}
			if(spriteNum == 2) {
				image = left2;
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = right1;
			}
			if(spriteNum == 2) {
				image = right2;
			}
			break;
		}
		g2.drawImage(image, screenX, screenY, gp.tilesize, gp.tilesize, null); //null call imageObserver
	}
}
