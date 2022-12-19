package main;

import javax.swing.JFrame;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame layar = new JFrame();
		layar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layar.setResizable(false);
		layar.setTitle("Alexia: Dark Maze");
		GamePanel panel = new GamePanel();
		layar.add(panel);
		layar.pack();
		layar.setLocationRelativeTo(null);
		layar.setVisible(true);
		
		panel.setupGame();
		panel.startGameThread();
	}
}