package Object;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Door extends ObjectParent {
	public Door() {
		name = "Door";
		try {
			image =ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}