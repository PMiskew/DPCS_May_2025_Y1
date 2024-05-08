import java.awt.event.*;
import javax.swing.*;

public class SwingTimerDemo {

	static ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
          
            System.out.println("Reading SMTP Info.");
        }
    };
    
    public static void main(String [] args) throws Exception{
        
    	
        Timer timer = new Timer(100 ,taskPerformer);
        timer.setRepeats(false);
        //timer.start();
        //timer.stop();
        //timer.start();
        while (timer.isRunning()) {
        	System.out.println("Processing");
        }
        
        
        System.out.println("DONE");
    }
}
