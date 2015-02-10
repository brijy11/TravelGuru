import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	private void connect(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(
					"jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1423531_0",
					"w1423531", "wycYSk9cc9bt");
		} catch (Exception e){
			e.printStackTrace();
			return;
		}
	}
	
	public void readDataBase(String query) throws Exception {
		
		connect();
	  
		try{
			statement = connect.createStatement();
		} catch (Exception e){
			e.printStackTrace();
			return;
		}
	  
		try{
			resultSet = statement.executeQuery(query);
			  
			while(resultSet.next()){
				int numColumns = resultSet.getMetaData().getColumnCount();
				for(int i = 1; i <= numColumns; i++){
					System.out.println(resultSet.getObject(i));
				}
			} 
		} catch (Exception e){
			throw e;
		} finally {
			close();
		}
	}
	
	private void close() {
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