package Game_Class_Development;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {


	private Player player = new Player();
	private Map map = new Map();
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel() {
		
		public void paint(Graphics g) {
			
			//Note: There are constants for colors in the color class, but 
			//		I want some more subtly with the colors.  Taking some time
			//		to pick a good color combination with RGB will make your work 
			//		look much better. 
			
			Color black = new Color(0,0,0);
			Color green = new Color(52,194,48);
			Color red = new Color(255,0,0);
			
			g.setColor(black);
			g.fillRect(0,0,520,520);
			g.setColor(green);
			g.fillRect(10,10,500,500);
			
			
			g.setColor(red);

			g.fillOval(player.getX(),player.getY(),10,10);
			
			
		}
	};
	
	private KeyListener keyListener = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			
					}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub

			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			//I have used a keyReleased trigger here since
			//I don't want the player to move when holding
			//the key
			
			char keyChar = e.getKeyChar();
			System.out.println(keyChar);
			
			if (keyChar == 'w') {
				player.setY(player.getY() - 10);
			}
			else if (keyChar == 'a') {
				player.setX(player.getX() - 10);
			}
			else if (keyChar == 's') {
				player.setY(player.getY() + 10);
			}
			else if (keyChar == 'd') {
				player.setX(player.getX() + 10);
			}
			
			panel.repaint();

		}
		
		
	};
	
	private MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	};
	
	
	
	public Game() {
		

		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		
		frame.addKeyListener(keyListener);	
		panel.addMouseListener(mouseListener);
		
		panel.setPreferredSize(new Dimension(520,520));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	public static void main(String[] args) {
		
		Game game = new Game();
	}
}
