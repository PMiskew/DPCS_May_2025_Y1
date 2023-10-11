
/*
What do Import statements do:

Java is a collection of 1000s of classes.  Think of each class like a file
and in that file are instrucitons how to do something.  By defaul all the 
classes are not loaded. Only certin common ones are.  This is because we 
use so few of them loading them all would take too much space.  All the classes
that are used to create graphics are not common and therefore we have to import
them. 



Q: What does it mean when your RAM is too full?

A:  Think of RAM like working memory.  You computer has a finite (limited) amount
    of working memory or RAM.  When you computer says it is short on RAM it means
    you have too many things active on your computer.  RAM is called volitile memory. 
    Volitle memory is memory that only there when the computer has power. RAM is 
    different than harddisk space.  

Q: Isn't there something that is just Java?

A:  Yes, Java is a piece of software that can read and execute code.  We often 
    write Java programs in diffent IDE (integrated Development Enviroment) and
    this is just to help us write the program.  If you were build "real" program,
    that is programs that are going to be used.  You compile them into an 
    executable file. 

*/
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/* 
In Java the name of the class MUST match the name of the file
Sale is a class that extends JFrame

Q: What does extends mean?  

A:  What this means is that a Sale class is a JFrame
    It means we have access to all the JFrame features through the sales class


*/
public class Sale extends JFrame    {
    
    public void init() {
        
        //Because Sale extends JFrame there are all sorts of methods I can 
        //use to modify the window
        setTitle("Sale Window");  //sets teh title
        setSize(1000, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
/*
Q: You knwo how we have to include args wiht the main method? 

    A:  Computer programs need to know where to start.  When you run what is the
        first line of code that get executed. All programming languages have
        a "main method".  Any program you want to run NEEDS A MAIN METHOD
    
Q:  Wait! Some classes don't have main methods. 
    
    A: Classes that don't have main methods are used by other classes
    
*/
    
    
    public static void main(String[] args) {
        
/*
        
Q: What does the line below mean?
        
        Sale myFrame = new Sale();

A:  The above line is creating a Sale object.  Classes are BLUEPRINTS to make
    objects.  That line is creating a Sale object and the new Sale() is a 
    special section of code that CONSTRUCTS the object. 
        
    Remember a Sale object has all of the features of a JFrame which is a basic
    GUI (Graphical User Interface)
        
 
*/
     
        Sale myFrame = new Sale();
     
   
/*
        Q:  What does the below line do?
        
          myFrame.init(); 
        
        A:  This line takes the myFrame object, created above, and calls
            an instance method called init().  The method is located in the 
            Sale class. 
*/
        myFrame.init(); 
    }
}