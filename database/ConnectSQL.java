package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;



@Test
public class ConnectSQL {
    

	public void testDB() throws ClassNotFoundException, SQLException{
		
    	
		
			
		
			    String dbUrl = "jdbc:mysql://localhost:3036/employeedatabase";					

				//Database Username		
				String username = "root";	
             
				//Database Password		
				String password = "Krishnawaheguru@123";				

             
      	    //Load mysql jdbc driver		
				 Class.forName("com.mysql.jdbc.Driver");
        		//Create Connection to DB		
         	Connection con = DriverManager.getConnection(dbUrl,username,password);
		
	System.out.println("connecting to mysql");	
	}

}
