package Object;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Key extends ObjectParent {

	public Key() {
		name = "Key";
		try {
			image =ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}