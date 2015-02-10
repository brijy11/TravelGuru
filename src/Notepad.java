import java.util.ArrayList;

import javax.swing.JFrame;


public class Notepad {
	private ArrayList<Note> Notes = new ArrayList<Note>();
	
	public Notepad(){
		JFrame notepadFrame = new JFrame();
		notepadFrame.setVisible(true);
		notepadFrame.setSize(364,584);
		
		getNotesFromDatabase();
	}
	
	private void getNotesFromDatabase(){
		try {
			ArrayList<String> ids = DatabaseConnection.readDataBase("SELECT noteID FROM Note");
			ArrayList<String> dates = DatabaseConnection.readDataBase("SELECT noteDate FROM Note");
			ArrayList<String> title = DatabaseConnection.readDataBase("SELECT noteTitle FROM Note");
			ArrayList<String> desc = DatabaseConnection.readDataBase("SELECT noteInfo FROM Note");
			
			for(int i = 0; i < ids.size(); i++){
				Notes.add(new Note(title.get(i), desc.get(i), dates.get(i)));
				System.out.println(title.get(i) + "\t" + desc.get(i) + "\t" + dates.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addNote(String note){
		
	}
}
