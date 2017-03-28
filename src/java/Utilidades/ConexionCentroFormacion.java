
package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public  class ConexionCentroFormacion {
    
private static Connection conexion;

public static Connection ConexionCentroFormacion() throws ClassNotFoundException, SQLException{
    
    String classname="com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost/academia";
    String user = "root";
    String password = "root";
    
    Class.forName(classname);
    conexion=DriverManager.getConnection(url,user,password);
    
    if(conexion !=null){
        
        System.out.println("Conexion establecida");
    } else{
        
        System.out.println("Conexion abortada");
    }
    return conexion;
}


 public static void cerrarConexion() throws ClassNotFoundException, SQLException{
     if(conexion!=null){
     conexion.close();
     System.out.println("Conexion Cerrada");
     }
else{
    System.out.println("Se ha producido un error");
}
} 

}