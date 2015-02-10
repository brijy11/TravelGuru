
public abstract class PlacesOfInterest {
	private String Name;
	private String Address;
	private String Postcode;
	private char[] ContactNumber = new char[10];
	
	public PlacesOfInterest(String name, String address, String postcode, char[] contactNumber){
		Name = name;
		Address = address;
		Postcode = postcode;
		ContactNumber = contactNumber;
	}
	
	public String getName(){
		return Name;
	}
	
	public String getAddress(){
		return Address;
	}
	
	public String getPostcode(){
		return Postcode;
	}
	
	public char[] getContactNumber(){
		return ContactNumber;
	}
}
