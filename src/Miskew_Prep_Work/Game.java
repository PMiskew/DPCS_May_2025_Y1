package Miskew_Prep_Work;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game {


	private Player player = new Player();
	private Map map = new Map(50,50);
	
	private JFrame frame = new JFrame();
	
	JButton b1 = new JButton("Save Map");
	JButton b2 = new JButton("Load Map");
	JTextField textField = new JTextField();

	private JPanel buttonPanel = new JPanel();
	private JPanel panel = new JPanel() {
	
		
		public void paint(Graphics g) {
			
			Color[] colors = {new Color(52,176,67),new Color(14,135,204),new Color(58,92,17), new Color(0,0,0), new Color(244,164,96)};
			
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
			
			g.drawString("Wood: "+player.getWood(),12,660);
				
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
			
		
			
			if (keyChar == 'w' && r > 0 && (map.getMap()[r - 1][c] == 0 || map.getMap()[r - 1][c] == 4)) { //walking north
				
				System.out.println("Move North");
				player.setY(player.getY() - 10);
			
			}
			else if (keyChar == 'd' && c < 49 && (map.getMap()[r][c + 1] == 0 || map.getMap()[r][c + 1] == 4)) { //walking east
			
				System.out.println("Move East");
				player.setX(player.getX() + 10);
			
			}
			else if (keyChar == 's' && r < 49 && (map.getMap()[r + 1][c] == 0 || map.getMap()[r + 1][c] == 4)) { //walking south
			
				System.out.println("Move South");
				player.setY(player.getY() + 10);
			
			}
			else if (keyChar == 'a' && c > 0 && (map.getMap()[r][c - 1] == 0 || map.getMap()[r][c - 1] == 4)) { //walking west
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
			else if (keyChar == 't' && r > 0 && map.getMap()[r - 1][c] != 2) { //placing north
				
				System.out.println("Place North");				
				player.setWood(player.getWood() - 1);
				map.setValue(r - 1, c, 4);
			
			}
			else if (keyChar == 'h' && c < 49 && map.getMap()[r][c + 1] != 2) { //placing east
			
				System.out.println("Clear East");
				player.setWood(player.getWood() - 1);
				map.setValue(r, c + 1, 4);
			
			}
			else if (keyChar == 'g' && r < 49 && map.getMap()[r + 1][c] != 2) { //placing south
			
				System.out.println("Clear South");
				player.setWood(player.getWood() - 1);
				map.setValue(r + 1, c, 4);
			
			}
			else if (keyChar == 'f' && c > 0 && map.getMap()[r][c - 1] != 2) { //placing west
			
				System.out.println("Clear West");
				player.setWood(player.getWood() - 1);
				map.setValue(r, c - 1, 4);
			
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
			
			
			panel.repaint();
			
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
	
	public ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = ((JButton)(e.getSource())).getText();
			
			if (text.equals("Save Map")) {
				saveMap();
			}
			if (text.equals("Load Map")) {
				loadMap();
			}
			frame.requestFocus();
		}
	
		
		
	};
	
	
	public Game() {
		

		frame.setLayout(new BorderLayout());
		
		
		panel.setPreferredSize(new Dimension(520,720));
	
		
		
		
		
		
		//adding listeners 
		b1.addActionListener(action);
		b2.addActionListener(action);
		frame.addKeyListener(keyListener);	
		panel.addMouseListener(mouseListener);
		
		//adding components to panels
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		
		
		


		
		//adding panels
		frame.add(panel, BorderLayout.CENTER);
		frame.add(buttonPanel,BorderLayout.EAST);
		
		
		
		b1.setFocusable(false);
		b2.setFocusable(false);
		buttonPanel.setFocusable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	private void saveMap() {
		
		System.out.println("Save Map");
		try {
			File f = new File("map.txt");
			PrintWriter pw = new PrintWriter(new FileWriter(f));
			
			for (int r = 0; r < map.getMap().length; r = r + 1) {
				for (int c = 0; c < map.getMap()[r].length; c = c + 1) {
					pw.print(map.getMap()[r][c]);				
				}

				pw.println();
			}
			
			pw.close();		
	
		}
		catch(Exception e) {
			
			
		}
	}
	
	public void loadMap() {
		
		System.out.println("Load Map");
		
		try {
			File f = new File("map.txt");
			Scanner s = new Scanner(f);
			
			for (int r = 0; r < 50; r = r + 1) {
				String line = s.next(); //get line from file
				for (int c = 0; c < 50; c = c + 1) {
					int v = (Integer.parseInt(line.charAt(c)+""));
					map.setValue(r, c,v);
				}
			}
			panel.repaint();
		}
		catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		
		Game game = new Game();
	}
}
