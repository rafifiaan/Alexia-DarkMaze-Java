package main;

import Object.SpeedSkill;
import Object.Door;
import Object.Key;
import Object.Chest;
import Object.Coin;

public class ObjectPlacement {

	GamePanel gp;
	
	public ObjectPlacement(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
			//Object Key
			//1
			gp.obj[1] = new Key();
			gp.obj[1].worldX = 7 * gp.tilesize;
			gp.obj[1].worldY = 6 * gp.tilesize;
			//2
			gp.obj[2] = new Key();
			gp.obj[2].worldX = 34 * gp.tilesize;
			gp.obj[2].worldY = 6 * gp.tilesize;
			//3
			gp.obj[3] = new Key();
			gp.obj[3].worldX = 21 * gp.tilesize;
			gp.obj[3].worldY = 11 * gp.tilesize;
			//4
			gp.obj[4] = new Key();
			gp.obj[4].worldX = 25 * gp.tilesize;
			gp.obj[4].worldY = 10 * gp.tilesize;
			//5
			gp.obj[5] = new Key();
			gp.obj[5].worldX = 35 * gp.tilesize;
			gp.obj[5].worldY = 15 * gp.tilesize;
			//6
			gp.obj[6] = new Key();
			gp.obj[6].worldX = 7 * gp.tilesize;
			gp.obj[6].worldY = 17 * gp.tilesize;
			//7
			gp.obj[7] = new Key();
			gp.obj[7].worldX = 8 * gp.tilesize;
			gp.obj[7].worldY = 24 * gp.tilesize;
			//8
			gp.obj[8] = new Key();
			gp.obj[8].worldX = 19 * gp.tilesize;
			gp.obj[8].worldY = 35 * gp.tilesize;
			//9
			gp.obj[9] = new Key();
			gp.obj[9].worldX = 28 * gp.tilesize;
			gp.obj[9].worldY = 34 * gp.tilesize;
			//10
			gp.obj[10] = new Key();
			gp.obj[10].worldX = 37 * gp.tilesize;
			gp.obj[10].worldY = 43 * gp.tilesize;
			
			//Object Door
			// 1
			gp.obj[11] = new Door();
			gp.obj[11].worldX = 19 * gp.tilesize;
			gp.obj[11].worldY = 12 * gp.tilesize;
			//2
			gp.obj[12] = new Door();
			gp.obj[12].worldX = 23 * gp.tilesize;
			gp.obj[12].worldY = 14 * gp.tilesize;
			//3
			gp.obj[13] = new Door();
			gp.obj[13].worldX = 31 * gp.tilesize;
			gp.obj[13].worldY = 10 * gp.tilesize;
			//4
			gp.obj[14] = new Door();
			gp.obj[14].worldX = 22 * gp.tilesize;
			gp.obj[14].worldY = 18 * gp.tilesize;
			//5
			gp.obj[15] = new Door();
			gp.obj[15].worldX = 32 * gp.tilesize;
			gp.obj[15].worldY = 20 * gp.tilesize;
			//6
			gp.obj[16] = new Door();
			gp.obj[16].worldX = 28 * gp.tilesize;
			gp.obj[16].worldY = 25 * gp.tilesize;
			//7
			gp.obj[17] = new Door();
			gp.obj[17].worldX = 11 * gp.tilesize;
			gp.obj[17].worldY = 27 * gp.tilesize;
			//8
			gp.obj[18] = new Door();
			gp.obj[18].worldX = 35 * gp.tilesize;
			gp.obj[18].worldY = 26 * gp.tilesize;
			//9
			gp.obj[19] = new Door();
			gp.obj[19].worldX = 17 * gp.tilesize;
			gp.obj[19].worldY = 30 * gp.tilesize;
			//10
			gp.obj[20] = new Door();
			gp.obj[20].worldX = 10 * gp.tilesize;
			gp.obj[20].worldY = 35 * gp.tilesize;
			//11
			gp.obj[21] = new Door();
			gp.obj[21].worldX = 23 * gp.tilesize;
			gp.obj[21].worldY = 39 * gp.tilesize;
			//12
			gp.obj[22] = new Door();
			gp.obj[22].worldX = 38 * gp.tilesize;
			gp.obj[22].worldY = 38 * gp.tilesize;
			
			//Object Coin
			//1
			gp.obj[23] = new Coin();
			gp.obj[23].worldX = 23 * gp.tilesize;
			gp.obj[23].worldY = 10 * gp.tilesize;
			//2
			gp.obj[24] = new Coin();
			gp.obj[24].worldX = 28 * gp.tilesize;
			gp.obj[24].worldY = 22 * gp.tilesize;
			//3
			gp.obj[25] = new Coin();
			gp.obj[25].worldX = 9 * gp.tilesize;
			gp.obj[25].worldY = 39 * gp.tilesize;
			
			//Object Ability (Speed)
			//1
			gp.obj[26] = new SpeedSkill ();
			gp.obj[26].worldX = 10 * gp.tilesize;
			gp.obj[26].worldY = 20 * gp.tilesize;
			
			//Object Chest
			//Primary 
			gp.obj[28] = new Chest ();
			gp.obj[28].worldX = 40 * gp.tilesize;
			gp.obj[28].worldY = 42 * gp.tilesize;
	}
}
