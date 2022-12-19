package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener{

	public boolean upside,leftside,rightside,downside;
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_W) {
			upside = true;
		}
		if(code == KeyEvent.VK_S) {
			downside = true;
		}
		if(code == KeyEvent.VK_D) {
			rightside= true;
		}
		if(code == KeyEvent.VK_A) {
			leftside = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		int code  = e.getKeyCode();
		if(code == KeyEvent.VK_W) {
			upside = false;
		}
		if(code == KeyEvent.VK_S) {
			downside = false;
		}
		if(code == KeyEvent.VK_D) {
			rightside= false;
		}
		if(code == KeyEvent.VK_A) {
			leftside = false;
		}
	}
	

}