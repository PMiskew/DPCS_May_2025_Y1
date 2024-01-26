package Miskew_Prep_Work;


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
	private Map map = new Map(50,50);
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel() {
		
		public void paint(Graphics g) {
			
			//Note: There are constants for colors in the color class, but 
			//		I want some more subtly with the colors.  Taking some time
			//		to pick a good color combination with RGB will make your work 
			//		look much better. 
			
			Color[] colors = {new Color(52,176,67),new Color(14,135,204),new Color(58,92,17), Color.WHITE};
			
			Color black = new Color(0,0,0);
			Color green = new Color(52,194,48);
			Color red = new Color(255,0,0);
			
			g.setColor(black);
			g.fillRect(0,0,520,520);
			g.setColor(green);
			g.fillRect(10,10,500,500);
			
			

			int row = 10;
			for (int r = 0; r < map.getMap().length; r = r + 1) {
				
				int col = 10;
				for (int c = 0; c < map.getMap()[r].length; c = c + 1 ) {
					
					//Get map value
					int temp = map.getMap()[r][c];
					g.setColor(colors[temp]);
					g.fillRect(row, col, 10,10);
					col = col + 10;
					
				}
				
				row = row + 10;
			
			}
			
			g.setColor(red);

			g.fillOval(player.getC(),player.getR(),10,10);
			
			
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
			System.out.println(player.getC());
			
			if (keyChar == 'w' && player.getR() > 10) {
				player.setR(player.getR() - 10);
			}
			else if (keyChar == 'a' && player.getC() > 10) {
				player.setC(player.getC() - 10);
			}
			else if (keyChar == 's' && player.getR() < 500 ) {
				player.setR(player.getR() + 10);
			}
			else if (keyChar == 'd' && player.getC() < 500) {
				player.setC(player.getC() + 10);
			}
			else if (keyChar == 'l' && player.getC() < 500) {
				
				//System.out.println(player.getC()/10);
				//System.out.println(player.getR()/10);
				int clearValue = map.getMap()[player.getR()/10][player.getC()/10+1];
				System.out.println(clearValue);
				if (clearValue == 1) {
					System.out.println("CLEAR");
					map.setMapValue(player.getR()/10,player.getC()/10 + 1,0);
					
				}
				
			}
			
			panel.repaint();

		}
		
		
	};
	
	private MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			int pixelX = e.getX();
			int pixelY = e.getY();
			
			int row = pixelX/10 * 10;
			int col = pixelY/10 * 10;
			
			System.out.println(row +" "+col);
			
			player.setR(col);
			player.setC(row);
			
			frame.repaint();
			
			
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
