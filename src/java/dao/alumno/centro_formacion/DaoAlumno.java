
package dao.alumno.centro_formacion;

import Utilidades.ConexionCentroFormacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DaoAlumno {
    
    public static void insertarAlumno(String idAlumno,String nombre,String apellido) throws SQLException, ClassNotFoundException{
    
    Connection conexion=ConexionCentroFormacion.ConexionCentroFormacion();
    Statement sentencia=conexion.createStatement();
    String consultaSQL = "insert into alumno (idalumno,nombre,apellido) values ";
    consultaSQL += "('" + idAlumno + "','" + nombre + "','" + apellido + "')";
    int filas=sentencia.executeUpdate(consultaSQL);
    System.out.println("Numero de filas insertadas:"+filas);
    sentencia.close();
    ConexionCentroFormacion.cerrarConexion();
    
    
}
    
    public static ResultSet verAlumnos() throws ClassNotFoundException, SQLException{
    
      Connection conexion=ConexionCentroFormacion.ConexionCentroFormacion();
      Statement sentencia = conexion.createStatement();
      String consultaSQL = "select idalumno,nombre,apellido from alumno";
      ResultSet lista_alumnos=sentencia.executeQuery(consultaSQL);
      return lista_alumnos;
    
    
}

    
    public static void actualizarAlumno(String nombre,String apellido, String idalumno) throws SQLException, ClassNotFoundException {
    
      Connection conexion=ConexionCentroFormacion.ConexionCentroFormacion();
      String consultaSQL = "update into alumno (idalumno,nombre,apellido) values ";
      consultaSQL += "('" + idalumno + "','" + nombre + "','" + apellido + "')";
      PreparedStatement actualizar=conexion.prepareStatement(consultaSQL);  
      
      actualizar.setString(1, nombre);
      actualizar.setString(2, apellido);
      actualizar.setString(3, idalumno);
      
      int filasAfectadas=actualizar.executeUpdate(consultaSQL);
      System.out.println("Numero de filas insertadas:"+filasAfectadas);
      actualizar.close();
      ConexionCentroFormacion.cerrarConexion();
        
    }
    
      //falta metodo delete 
}
