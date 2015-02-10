import java.util.ArrayList;


public class Hotel extends PlacesOfInterest {
	
	ArrayList<Room> rooms = new ArrayList<Room>();
	
	public Hotel(String name, String address, String postcode, char[] contactNumber) {
		super(name, address, postcode, contactNumber);
		// TODO Auto-generated constructor stub
	}
	
	public int getNumberOfRooms(){
		return rooms.size();
	}
	
	public void addRoom(){
		// Get user to input the type and the price for the rooms here
		//rooms.add());
	}
	
	public void removeRoom(int index){
		rooms.remove(index);
	}
	
}
