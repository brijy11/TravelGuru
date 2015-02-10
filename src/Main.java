import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) throws Exception {
		
		final JFrame mainWindow = new JFrame();
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(364,584);
		mainWindow.setVisible(true);
		
		JButton notepad = new JButton("Notepad");
		mainWindow.add(notepad);
		
		notepad.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Notepad n = new Notepad();
				mainWindow.setVisible(false);
			}
		});
		
		DatabaseConnection db = new DatabaseConnection();
		
		try{
			db.readDataBase("SELECT noteInfo FROM Note");
		} catch (Exception e){
			System.out.println(e);
		}

	}

}
