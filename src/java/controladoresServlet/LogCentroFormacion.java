
package controladoresServlet;

import Utilidades.VerificarLogin;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogCentroFormacion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
       
          //solicito/recojo los parametros de login.html
    String userLogin= request.getParameter("usuario");
    String passLogin= request.getParameter("password");
    
    //Ver Utilidades.VerificarLogin
    boolean verificarUsuario=VerificarLogin.comprobarLogin(userLogin, passLogin);
    
        if(verificarUsuario==true){//== es para comparar
    //comprobar los valores de los parametros que recibo del formulario
    //si el usuario esta logeado en otros servelts
        boolean log=true;
        //Creábamos una sesión para recuperarla desde otras páginas:
        HttpSession sesionLogin=request.getSession();
        //guardo en la sesion con sus CLAVE+VALOR
        sesionLogin.setAttribute("usuario", userLogin);
        sesionLogin.setAttribute("password", passLogin);
        sesionLogin.setAttribute("ok", log);
        
        response.sendRedirect("/CentroFormacion/Altas.htm");
        } else{
        response.sendRedirect("/CentroFormacion/login.html"); 
    } 
        
        
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LogCentroFormacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogCentroFormacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LogCentroFormacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogCentroFormacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
