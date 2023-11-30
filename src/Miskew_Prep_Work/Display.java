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
			int x = 0;
			int y = 0;
			int ctr = 0; 
			
			for (int r = 0; r < 10; r = r +  1) {
				for (int c = 0; c < 10; c = c + 1) {
					
					Color[] colors = {Color.CYAN,Color.GREEN,Color.BLUE,Color.GRAY,Color.YELLOW};
					
					g.setColor(colors[map[r][c]]);
					
					g.fillRect(x, y, 50, 50);	
					x = x + 50;
					ctr = ctr + 1;
					
				}
				ctr = ctr + 1;
				x = 0;
				y = y + 50;
			}
			g.setColor(Color.BLACK);
			
			
			
		}
	};
	
	int[][] map = Map_Setup.generate2DArrayB(10, 10, 0.3);
	
	
	
	public Display() {
	

		
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
	
		frame.setPreferredSize(new Dimension(500,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display();
	}

}
