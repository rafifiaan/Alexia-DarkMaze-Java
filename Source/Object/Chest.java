package Object;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Chest extends ObjectParent {

	public Chest() {
		name = "Chest";
		try {
			image =ImageIO.read(getClass().getResourceAsStream("/objects/chest.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
