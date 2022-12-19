package Object;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import main.GamePanel;

public class ObjectParent {
	
	public BufferedImage image;
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	public Rectangle solidArea = new Rectangle(0, 0, 48, 48); //48px
	public int solidAreaDefaultX = 0;
	public int solidAreaDefaultY = 0;
	
	public void draw(Graphics2D g2, GamePanel gp) {
		int screenX = worldX - gp.player.worldX + gp.player.screenX;
		int screenY = worldY - gp.player.worldY + gp.player.screenY;
		
		if (worldX + gp.tilesize > gp.player.worldX - gp.player.screenX && 
				worldX - gp.tilesize < gp.player.worldX + gp.player.screenX && 
				worldY + gp.tilesize > gp.player.worldY - gp.player.screenY &&
				worldY - gp.tilesize < gp.player.worldY + gp.player.screenY) {
		
			g2.drawImage(image, screenX, screenY, gp.tilesize, gp.tilesize, null);
		}
	}
}
