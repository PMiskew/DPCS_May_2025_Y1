
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game {
	
	//Data Fields
	
	
	//Graphics Fields
	private JFrame frame = new JFrame();
	
	private JPanel panel = new JPanel()  {
		
		public void paint(Graphics g) {
			
			//Anything here gets painted in the panel.  
			int red = (int)(Math.random()*255);

			int green = (int)(Math.random()*255);

			int blue = (int)(Math.random()*255);

			
			for (int i = 1; i < 42; i = i + 1) {
				
				
				red = (int)(Math.random()*255);

				green = (int)(Math.random()*255);

				blue = (int)(Math.random()*255);
				
				Color c = new Color(red,green,blue);
				g.setColor(c);
				
				g.fillRect(10*i, 10*i, 100, 100);
			}
		}
	};
	
	public Game() {
		
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		panel.setPreferredSize(new Dimension(520,520));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
			
	} //end constructors
	
	public static void main(String[] args) {
		Game game = new Game();
	} //end main
	
} //end class


