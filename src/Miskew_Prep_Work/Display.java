package Miskew_Prep_Work;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {

	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel()  {
		
		public void paintComponent(Graphics g) {
			
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
			
			
			
		}
	};
	
	int[][] map = Map_Setup2.generateMap(50, 50);
	
	
	
	public Display() {
	

		
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
	
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
