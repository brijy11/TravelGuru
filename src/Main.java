
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static JButton notepad ;
	public static Point center = GraphicsEnvironment.getLocalGraphicsEnvironment()
			.getCenterPoint();
	public static int windowWidth = 380;
	public static int windowHeight = 550;
	
	
	
	public static void main(String[] args) throws Exception {

		//SplashScreen splash = new SplashScreen(5000);

		//splash.showAndExit();

		final JFrame mainWindow = new JFrame();
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mainWindow.setBounds(center.x - windowWidth / 2, center.y
				- windowHeight / 2, windowWidth, windowHeight);

		
		JPanel panel1 = new JPanel ();

	  //  panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		
	 notepad = new JButton("Notepad");
		 notepad.setBackground(Color.LIGHT_GRAY);
		
		
	
		 
		JButton directions = new JButton("Directions");
		 directions.setBackground(Color.LIGHT_GRAY);
		JButton placesOfInterest = new JButton("Places Of Interest");
		 placesOfInterest.setBackground(Color.LIGHT_GRAY);
		JButton trainPlanner = new JButton("Train Planner");
		 trainPlanner.setBackground(Color.LIGHT_GRAY);
		JButton exit = new JButton("Exit");
		 exit.setBackground(Color.LIGHT_GRAY);
		
		panel1.add(notepad);
		panel1.add(directions);
		panel1.add(trainPlanner);
		panel1.add(placesOfInterest);
		panel1.add(exit);
		
		
		notepad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			
				JFrame notesFrame = new JFrame();
				notesFrame.setVisible(true);
			
				notesFrame.setBounds(center.x - windowWidth / 2, center.y
						- windowHeight / 2, windowWidth, windowHeight);
			
			}
		});
		
		notepad.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        notepad.setBackground(Color.white);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        notepad.setBackground(Color.LIGHT_GRAY);
		    }
		});
		
           directions.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
	
				JFrame directionsFrame = new JFrame();
				directionsFrame.setVisible(true);
	
				directionsFrame.setBounds(center.x - windowWidth / 2, center.y
						- windowHeight / 2, windowWidth, windowHeight);
			
			}
		});
		
         placesOfInterest.addActionListener(new ActionListener() {
   			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				
   	
   			
   				JFrame placesOfI = new JFrame();
   				placesOfI.setVisible(true);
   			
   				placesOfI.setBounds(center.x - windowWidth / 2, center.y
   						- windowHeight / 2, windowWidth, windowHeight);
   			
   			}
   		});
   		
        trainPlanner.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				
 				
 				JFrame trainFrame = new JFrame();
 				trainFrame.setVisible(true);
 		
 				trainFrame.setBounds(center.x - windowWidth / 2, center.y
 						- windowHeight / 2, windowWidth, windowHeight);
 				
 			}
 		});
 		
 exit.addActionListener(new ActionListener() {
			
			@Override
<<<<<<< HEAD
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				mainWindow.setVisible(false);
				Notepad n = new Notepad();
			}
		});
=======
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);				
				
			
			}
		});
		
		
		mainWindow.add(panel1);
		mainWindow.setSize(364, 584);
		mainWindow.setVisible(true);


		
		
		
		
>>>>>>> origin/master

	}

}
