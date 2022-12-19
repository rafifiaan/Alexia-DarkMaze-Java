package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import Entity.Player;
import Object.ObjectParent;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	
	public final int tilesize = 64; //px
	public final int maxScreenCol = 16; //Menentukan jumlah kolom tile
	public final int maxScreenRow = 12; //Menentukan jumlah baris tile
	public final int screenWidth = tilesize * maxScreenCol; //Total lebar pada layar game (px)
	public final int screenHeight = tilesize * maxScreenRow; //Total tinggi pada layar game
	
	//world settings
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	
	int FPS = 60;
	
	//system
	TileManager tileM = new TileManager(this);
	Controller Ctr = new Controller();
	public CollisionChecker ColC = new CollisionChecker(this);
	public ObjectPlacement ObjP = new ObjectPlacement(this);
	public UI_Format uif = new UI_Format(this);
	Thread game; //Berfungi untuk menjaga agar game terus berjalan
	
	//entity and object
	public Player player = new Player(this,Ctr);
	public ObjectParent obj[] = new ObjectParent[100];
	
	public GamePanel(){
		this.setPreferredSize(new Dimension(screenWidth, screenHeight)); //menentukan ukuran jpanel
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); //improve render performance
		this.addKeyListener(Ctr);
		this.setFocusable(true);
	}
	
	public void setupGame() {
		ObjP.setObject();
	}

	public void startGameThread() {
		game = new Thread(this);
		game.start();
	}
	
	@Override 
	public void run() {
		double drawInterval = 1000000000/FPS; //draw screen every 0,016s (1 / 60 times per second)
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0;
		int drawCount = 0;
		while(game != null) {
			currentTime = System.nanoTime();
			delta += (currentTime - lastTime) / drawInterval;
			timer += (currentTime - lastTime);
			lastTime = currentTime;
			if(delta >= 1) {
				update();
				repaint();
				delta--;
				drawCount++;
			}
			if(timer >= 1000000000) {
				drawCount = 0;
				timer = 0;
			}
		}   
	}
	
	public void update() {
		player.update();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			//tile
			tileM.draw(g2);
			//object
			for(int i = 0; i < obj.length; i++) {
				if(obj[i] != null) {
					obj[i].draw(g2, this);
				}
			}
			//player
			player.draw(g2);
			
			//UI
			uif.draw(g2);
			
			g2.dispose();	
	}
}