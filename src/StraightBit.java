import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import character.move;


public class StraightBit extends JFrame {
	Image screen;
	Graphics screen_image;
	
	Image character_circle = new ImageIcon(index.class.getResource("Image/circle.png")).getImage();
	
	int charX=0,charY=0;
	
	public StraightBit() {
		setSize(index.SCREEN_WIDTH,index.SCREEN_HEIGHT);
		setTitle("StraightBit");
	
		Color bg = new Color(75, 75, 75);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		setBackground(bg);
		
		Music music = new Music("Keep_You.mp3", true);
		music.start();
		
		Thread th = new Thread();
		
		while(true) {
			charY ++;
			try {
				th.sleep(10);
//				System.out.println(charY);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	@Override
	public void paint(Graphics g) {
		screen = createImage(1280,720);			//가로 * 세로 크기의 이미지 생성(도화지)
		screen_image = screen.getGraphics();  //이미지의 그래픽을 얻어옴
		move keyEvent = new move();
		addKeyListener(keyEvent);
		screenDraw(screen_image);			
		g.drawImage(screen, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(character_circle, 0, charY, null);	//얻어온 그래픽을 화면에 출력
		this.repaint();			//paint 반복
	}
	
}
