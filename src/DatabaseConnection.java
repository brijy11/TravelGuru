import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseConnection {
	private static Connection connect = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;

	private static void connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(
					"jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1423531_0?verifyServerCertificate=false&useSSL=true&requireSSL=true",
					"w1423531@support.ecs.westminster.ac.uk", "wycYSk9cc9bt");
			// So with the connect string, you might need to change it at home and at uni. 
		} catch (Exception e){
			e.printStackTrace();
			return;
		}
	}
	
	public static ArrayList<String> readDataBase(String query) throws Exception {
		
		connect();
	  
		try{
			statement = connect.createStatement();
		} catch (Exception e){
			throw e;
		}
	  
		try{
			resultSet = statement.executeQuery(query);
			ArrayList<String> results = new ArrayList<String>();
			while(resultSet.next()){
				int numColumns = resultSet.getMetaData().getColumnCount();
				for(int i = 1; i <= numColumns; i++){
					results.add(resultSet.getObject(i).toString());
				}
			return results;
			} 
		} catch (Exception e){
			throw e;
		} finally {
			close();
		}
		return null;
	}
	
	private static void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
  }

} 