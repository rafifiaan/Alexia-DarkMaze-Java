package Object;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class SpeedSkill extends ObjectParent {

	public SpeedSkill() {
		name = "SpeedSkill";
		try {
			image =ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
