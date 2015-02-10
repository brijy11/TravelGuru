
public class Restaurants extends PlacesOfInterest {

	private String Cuisine;
	
	public Restaurants(String name, String address, String postcode,
			char[] contactNumber) {
		super(name, address, postcode, contactNumber);
		// TODO Auto-generated constructor stub
	}
	
	public String getCuisine(){
		return Cuisine;
	}
}
