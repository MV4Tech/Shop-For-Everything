
/**
 * CONNECTION BETWEEN MYSQL AND JAVA WITH CONNECTOR
 */

package login_register_design;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.*;


/**
 *
 * @author Lenovo
 */
public class My_CNX {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "users_db";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    public static Connection getConnection(){
        
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
       
        try {
            cnx = datasource.getConnection();
            //cnx = datasource.getConnection().setAutoCommit(true);
        } catch (SQLException ex) {    
            java.util.logging.Logger.getLogger(" Get Connection ->" + My_CNX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
    
        
        return cnx;
        
    }
    
}
