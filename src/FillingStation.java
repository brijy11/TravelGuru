
public class FillingStation extends PlacesOfInterest {

	private Double PetrolPrice;
	private Double DieselPrice;
	
	public FillingStation(String name, String address, String postcode, char[] contactNumber) {
		super(name, address, postcode, contactNumber);
		
	}
	
	public void updatePrices(Double newPetrolValue, Double newDieselValue){
		PetrolPrice = newPetrolValue;
		DieselPrice = newDieselValue;
	}
	
	public Double getPetrolPrice(){
		return PetrolPrice;
	}
	
	public Double getDieselPrice(){
		System.out.println();
		return DieselPrice;
	}
	

}
