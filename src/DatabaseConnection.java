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
				connect = DriverManager.getConnection("jdbc:mysql://localhost:2222/w1423531_0",
				"w1423531", "wycYSk9cc9bt");
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