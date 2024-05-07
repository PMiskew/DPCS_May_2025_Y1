package Class_Basics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class TimerExample {

	private JFrame frame = new JFrame();
	private ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Enemy makes movement decision
			//enemy.move();
			System.out.println("EVENT");
		}
		
	};
	
	public TimerExample() {

		Timer t = new Timer(100, action);
		t.start();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public static void main(String[] args)  {
		

		TimerExample te = new TimerExample();
		
	}
}
