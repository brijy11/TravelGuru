import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;


public class Directions {
	private final static String GoogleAPIKey = "AIzaSyArLu8S4h8epvmM_K8aWPRY_TS9XST_7yw";
	private static String StartingLocation;
	private static String EndingLocation;
	private static String TravellingMethod;
	private static String URL;
	
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
