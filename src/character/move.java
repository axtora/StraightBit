package character;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class move {
	Image character = new ImageIcon(getClass().getResource("../Image/circle.png")).getImage();
	
	int x, y;
	
	public void moving(Graphics g) {
		System.out.println("moving method in");
		g.drawImage(character, x, y, null);
	}
	
	class keyEvent extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();

			switch (key) {
			case KeyEvent.VK_LEFT:
				x = x - 10;
				System.out.println("right Click");
				break;

			case KeyEvent.VK_RIGHT:
				y = y + 10;
				System.out.println("left Click");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("move.java in");
	}
}
