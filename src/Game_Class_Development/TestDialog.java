package Game_Class_Development;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//source: https://stackoverflow.com/questions/13334198/java-custom-buttons-in-showinputdialog

public class TestDialog {

    public static void main(String[] args) {
        
    	//For some reason they make this an array of objects 
    	//	- my initial thought is why not strings. 
    	//	- i'm okay with this because a String IS AN Object
    	Object[] options1 = { "Try This Number", "Choose A Random Number",
                "Quit" };

    	
    	
    	//JPanel is an object we tend to embed in a JFrame think of the the frame like the wood frame of a painting
    	//JPanel like the painting
    	//Notice that there is no JFrame anywhere - this is because the JOptionPane provides the JFrame
        JPanel panel = new JPanel();
        
        //Add JLablel to Pane
        panel.add(new JLabel("Enter number between 0 and 1000"));
        
        //Add the textfield to Pane
        JTextField textField = new JTextField(10);
        panel.add(textField);

        System.out.println(JOptionPane.YES_NO_CANCEL_OPTION)
        
        
        int result = JOptionPane.showOptionDialog(null, panel, "Enter a Number", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options1, null);
        if (result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, textField.getText());
        }
    }
}