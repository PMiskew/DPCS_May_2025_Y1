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

public class Display {

	

	/*Data fields */
	int[][] map = Map_Setup2.generateMap(50, 50);
	Player player = new Player(10,10);
	
	
	/*Graphics and Listeners*/
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel() {
	
	
		public void paintComponent(Graphics g) {
			
			//Create Map
			System.out.println(map[0][0]);
			int x = 10;
			int y = 10;
			int ctr = 0; 
			
			for (int r = 0; r < 50; r = r +  1) {
				for (int c = 0; c < 50; c = c + 1) {
					
					// 0 is water
				    // 1 is sand
				    // 2 is grassland
				    // 3 is forest
				    // 4 is hills
				    // 5 is mountains
				    // 6 is dunes
					Color[] colors = {Color.BLUE,new Color(194,178,128),new Color(124,252,0),Color.GREEN,Color.LIGHT_GRAY, Color.GRAY, new Color(200,173,127)};
					
					g.setColor(colors[map[r][c]]);
					
					g.fillRect(x, y, 10, 10);	
					x = x + 10;
				
					
				}
		
				x = 10;
				y = y + 10;
			}
			g.setColor(Color.BLACK);
			
			//Create Player
			g.setColor(Color.RED);
			g.fillRect(player.getX(), player.getY(), 10, 10);
			
			
		}
	};
	
	private KeyListener keyListener = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(e.getKeyChar());
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("P"+e.getKeyChar());
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			char key = e.getKeyChar();
			
			//get position of player
			int xpos = player.getX()/10;
			int ypos = player.getY()/10;
			System.out.println(xpos+" "+ypos);
			
			if (key == 's') {
				
				
				if (ypos < 50) {
					player.decrementY();
				}
				
				
			}
			else if(key =='a') {
				
				if (xpos > 1) {
					player.decrementX();
				}
			
			}
			else if(key == 'd') {
				
				if (xpos < 50) {
					player.incrementX();
			
				}
			
			}
			else if(key == 'w') {
				
				if (ypos > 1) {
					player.incrementY();
				}
			}
			
			panel.repaint();
		}
		
		
	};

	
	private MouseListener mouseListener = new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			int xposPix = (int)e.getPoint().getX();
			int yposPix = (int)e.getPoint().getY();
		
			int xpos = xposPix/10;

			int ypos = yposPix/10;
			
			System.out.println(xpos+" "+ypos);
			
			player.setPosition(xpos*10,ypos*10);
			
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
	
	public Display() {
	

		
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
		// TODO Auto-generated method stub
		Display d = new Display();
	}

}
