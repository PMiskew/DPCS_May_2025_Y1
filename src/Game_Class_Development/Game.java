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
	private Map map = new Map(50,50);
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel() {
		
		public void paint(Graphics g) {
			
			Color[] colors = {new Color(52,176,67),new Color(14,135,204),new Color(58,92,17), new Color(0,0,0)};
			
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
			
			int y = 10;
					
			for (int r = 0; r < map.getMap().length; r = r + 1) {
				
				int x = 10; 
				
				for (int c = 0; c < map.getMap()[r].length; c = c + 1) {
					
					
					g.setColor(colors[map.getMap()[r][c]]);
					g.fillRect(x, y, 10, 10);
					x = x + 10;
					
				}
				
				y = y + 10;
			
			}
			g.setColor(Color.RED);
			g.fillOval(player.getX(),player.getY(),10,10);
			
			//Display
			g.setColor(Color.BLACK);
			g.fillRect(0, 520, 520, 200);
			
			g.setColor(Color.WHITE);
			g.fillRect(10, 521, 500, 190);
			
			g.setColor(Color.BLACK);
			g.drawString("Name: "+player.getName(),12,540);
			g.drawString("Class: "+player.getRole(),12,560);
			g.drawLine(12, 565, 112, 565);
			g.drawString("Strength: "+player.getStrenght(),12,580);
			g.drawString("Dexterity: "+player.getDexterity(),12,600);
			g.drawString("Wisdom: "+player.getWisdom(),12,620);
			g.drawString("Charisma: "+player.getCharisma(),12,640);
			
			g.drawLine(10, 645, 112, 645);
			
			g.drawString("Wood: "+player.getWood(),12,670);
				
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
			int c = player.getX()/10 - 1;
			int r = player.getY()/10 - 1;
			System.out.println(r+" "+c);
			
		
			
			if (keyChar == 'w' && r > 0 && map.getMap()[r - 1][c] == 0) { //walking north
				System.out.println("Move North");
				player.setY(player.getY() - 10);
			}
			else if (keyChar == 'd' && c < 49 && map.getMap()[r][c + 1] == 0) { //walking east
				System.out.println("Move East");
				player.setX(player.getX() + 10);
			}
			else if (keyChar == 's' && r < 49 && map.getMap()[r + 1][c] == 0) { //walking south
				System.out.println("Move South");
				player.setY(player.getY() + 10);
			}
			else if (keyChar == 'a' && c > 0 && map.getMap()[r][c - 1] == 0) { //walking west
				System.out.println("Move West");
				player.setX(player.getX() - 10);
			
			}		
			else if (keyChar == 'i' && r > 0 && map.getMap()[r - 1][c] == 2) { //clearing north
				System.out.println("Clear North");				
				map.setValue(r - 1, c, 0);
				player.setWood(player.getWood() + 1);
			}
			else if (keyChar == 'l' && c < 49 && map.getMap()[r][c + 1] == 2) { //clearing east
				System.out.println("Clear East");
				map.setValue(r, c + 1, 0);
				player.setWood(player.getWood() + 1);
			}
			else if (keyChar == 'k' && r < 49 && map.getMap()[r + 1][c] == 2) { //clearing south
				System.out.println("Clear South");
				map.setValue(r + 1, c, 0);
				player.setWood(player.getWood() + 1);
			}
			else if (keyChar == 'j' && c > 0 && map.getMap()[r][c - 1] == 2) { //clearing west
				System.out.println("Clear West");
				player.setWood(player.getWood() + 1);
				map.setValue(r, c - 1, 0);
			}
			
			
			panel.repaint();

		}
		
		
	};
	
	
	
	private MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(e.getButton());
			
			int pixelX = e.getX();
			int pixelY = e.getY();
			
			int x = pixelX/10 * 10;
			int y= pixelY/10 * 10;
			
			//I want to teleport for testing and maybe a game feature. 
			//I added an if statement here to check what button is pressed. 
			if (e.getButton() == 3) {
			
				player.setX(x);
				player.setY(y);
			
			}
			if (e.getButton() == 1) {
				
				int r = y/10 - 1;
				int c = x/10 - 1;
				map.setValue(r, c, 3);
			
			}
			
			
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
		
		panel.setPreferredSize(new Dimension(520,720));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	public static void main(String[] args) {
		
		Game game = new Game();
	}
}
