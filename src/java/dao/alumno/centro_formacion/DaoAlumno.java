
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

    
    public static void actualizarAlumno(String idalumno, String nombre,String apellido) throws SQLException, ClassNotFoundException {
    
      Connection conexion=ConexionCentroFormacion.ConexionCentroFormacion();
      String consultaSQL = "update alumno set nombre='"+nombre+"', apellido='"+apellido+"' where idalumno='"+idalumno+"'";
      PreparedStatement actualizar=conexion.prepareStatement(consultaSQL);  
      
      actualizar.setString(1, idalumno);
      actualizar.setString(2, nombre);
      actualizar.setString(3, apellido);
      
      
      int filasAfectadas=actualizar.executeUpdate(consultaSQL);
      System.out.println("Numero de filas insertadas:"+filasAfectadas);
      actualizar.close();
      ConexionCentroFormacion.cerrarConexion();
        
    }
    
    //metodo delete
      public static void borrarAlumno (String idalumno) throws ClassNotFoundException, SQLException{
      Connection conexion=ConexionCentroFormacion.ConexionCentroFormacion();
      String consultaSQL = "delete from alumno where idalumno=?";
      PreparedStatement buscar=conexion.prepareStatement(consultaSQL);
      buscar.setString(1, idalumno);
      int filasAfectadas=buscar.executeUpdate(consultaSQL);
      System.out.println("Numero de filas insertadas:"+filasAfectadas);
      buscar.close();
      ConexionCentroFormacion.cerrarConexion();
      
      }
      
}
