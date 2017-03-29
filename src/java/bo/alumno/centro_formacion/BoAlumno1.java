
package bo.alumno.centro_formacion;


import Personas.Alumno;
import dao.alumno.centro_formacion.DaoAlumno;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoAlumno1 {
    
    public static void procesarInsertarPeticionAlumno(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
    //orientacion a objetos
        
        Alumno alumno=new Alumno();
        alumno.setIdAlumno(request.getParameter("idalumno"));
        alumno.setNombre(request.getParameter("nombre"));
        alumno.setApellido(request.getParameter("apellido"));
        DaoAlumno.insertarAlumno(alumno.getIdAlumno(), alumno.getNombre(), alumno.getApellido());
        response.sendRedirect("/CentroFormacion/mostrarInsertarAlumno");

} 
    
    
    public static void procesarActualizarAlumno(HttpServletRequest request, HttpServletResponse response) throws SQLException, ClassNotFoundException, IOException{
        
        Alumno alumno=new Alumno();
        alumno.setIdAlumno(request.getParameter("idalumno"));
        alumno.setNombre(request.getParameter("nombre"));
        alumno.setApellido(request.getParameter("apellido"));
        DaoAlumno.actualizarAlumno(alumno.getIdAlumno(), alumno.getNombre(), alumno.getApellido());
       //Pendiente de devolver a la vista para mostrar el resultado...por ahora:
        response.sendRedirect("/CentroFormacion/mostrarActualizarAlumno");
       
    }
}
