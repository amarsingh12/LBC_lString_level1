
package database_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase_4 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe", "system", "system");
        
    }
    
}
