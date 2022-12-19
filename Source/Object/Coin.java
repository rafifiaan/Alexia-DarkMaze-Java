package Object;

import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class Coin extends ObjectParent {

	public Coin() {
		name = "Coin";
		try {
			image =ImageIO.read(getClass().getResourceAsStream("/objects/coin.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}