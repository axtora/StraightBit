package character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class move extends JFrame implements KeyListener {
	
	int x = 0, y = 0;
		
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if (keyCode == e.VK_RIGHT) {
			y += 10;
		}else if (keyCode == e.VK_LEFT) {
			x -= 10;
		}		
	}

	@Override
	public void keyReleased(KeyEvent e) {} //추 후 추가 예정

	@Override
	public void keyTyped(KeyEvent e) {} //추 후 추가 예정
}