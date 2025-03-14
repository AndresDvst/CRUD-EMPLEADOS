
package Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    //Conexion MYSQL
    Connection con;
    
    public Conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://tramway.proxy.rlwy.net:38649/railway", "root", "PymGUfDyiGfNeUZLqGjnajMPgyNgJTzS");
        } catch(Exception e){
        }
    }
    
    public Connection geConnection(){
        return con;
        }
    }
