
public class Room {
	
	private String RoomType;
	private Double RoomPrice;
	
	public Room(String roomType, Double roomPrice){
		RoomType = roomType;
		RoomPrice = roomPrice;
	}
	
	public void updateRoomType(String roomType){
		RoomType = roomType;
	}
	
	public void updateRoomPrice(Double roomPrice){
		RoomPrice = roomPrice;
	}
	
	public String getRoomType(){
		return RoomType;
	}
	
	public Double getRoomPrice(){
		return RoomPrice;
	}
	
}
