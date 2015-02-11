import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;


public class Directions {
	private final static String GoogleAPIKey = "AIzaSyArLu8S4h8epvmM_K8aWPRY_TS9XST_7yw";
	private static String StartingLocation;
	private static String EndingLocation;
	private static String TravellingMethod;
	private static String URL;
	
	
	// To use this, just call Directions.getDirections(), with these parameters and it should work
	// The parameters for way of travelling is 'driving' for Driving, 'walking' for Walking, 'bicycling'
	// for Bicycles and 'transit' for public transport. These are case sensitive so be careful.
	public static void getDirections(String start, String end, String method) {
		
		StartingLocation = start;
		EndingLocation = end;
		TravellingMethod = method;
		
		URL = String.format("https://maps.googleapis.com/maps/api/directions/xml?origin=%s&destination=%s&mode=%s&key=%s",
				StartingLocation,
				EndingLocation,
				TravellingMethod,
				GoogleAPIKey);
		
		try{
			URL url = new URL(URL);
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String line = null;
			
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
		
    }
	
}
