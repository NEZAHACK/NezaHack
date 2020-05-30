
package ventanas;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class conexion {
        
    static String url = "jdbc:mysql://localhost:3306/ProyectoBase";
    static String user = "root" , pass = "desarrollador";
    public Connection getConection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            System.err.println(e);
        }
        return con;
    
    }
}
