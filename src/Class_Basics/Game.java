package Class_Basics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {

	private int xpos = 10;
	private int ypos = 10;
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel() {
	
		public void paint(Graphics g) {
			

			Color red = new Color(255,0,0);
			g.setColor(red);	
			g.fillRect(xpos, ypos, 10, 10);
		}
		
	};
	
	private KeyListener keyListener = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Key Typed");
			
			System.out.println(e.getKeyChar());
			xpos = xpos + 10;
			panel.repaint();
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	
	public Game() {
		

		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		
		frame.addKeyListener(keyListener);
		
		panel.setPreferredSize(new Dimension(520,520));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
	public static void main(String[] args) {
		
		Game g = new Game();
	}
}
