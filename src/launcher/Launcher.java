package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {         
            	
            Student alumno=new Student(122455,"Saucedo","Marcos","marcos20uns@outlook.com","https://github.com/Marcos20NS/tdp-proyecto-1.git","/images/fotoperfil.jpg");
          
            SimplePresentationScreen window=new SimplePresentationScreen(alumno);
            window.setVisible(true);
            }
            
        });
        
    }
}