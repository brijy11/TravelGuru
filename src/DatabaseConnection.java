import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DatabaseConnection {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void readDataBase(String query) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(
					"jdbc:mysql://elephant.ecs.westminster.ac.uk:3306/w1423531_0",
					"w1423531", "wycYSk9cc9bt");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	  
		try{
			statement = connect.createStatement();
		} catch (Exception e){
			e.printStackTrace();
			return;
		}
	  
	  try{
		  resultSet = statement.executeQuery(query);
		  int n = 0;
		  
		  while(resultSet.next()){
			  int numColumns = resultSet.getMetaData().getColumnCount();
			  n++;
			  for(int i = 1; i <= numColumns; i++){
				  System.out.println(resultSet.getObject(i));
			  }
		  } 
	  } catch (Exception e){
		  e.printStackTrace();
		  return;
	  }
	  
	  try{
		  resultSet.close();
		  statement.close();
		  connect.close();
	  } catch (Exception e){
		  e.printStackTrace();
		  return;
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
			
		}
  }

} 