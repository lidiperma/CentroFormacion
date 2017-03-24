

package Personas;

import Listas.Imprime;
import Listas.TituloAcademico;
import java.util.ArrayList;

public class Alumno extends Persona implements Imprime{
    
    private String idAlumno;
    private ArrayList<TituloAcademico> listaAlumnoTitutloAcademico;

    
    public Alumno (){
        super();
    }

    public Alumno(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }
    
    public Alumno(ArrayList<TituloAcademico> listaAlumnoTitutloAcademico, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.listaAlumnoTitutloAcademico = listaAlumnoTitutloAcademico;
    }

    public Alumno(String idAlumno, ArrayList<TituloAcademico> listaAlumnoTitutloAcademico, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.idAlumno = idAlumno;
        this.listaAlumnoTitutloAcademico = listaAlumnoTitutloAcademico;
    }

   
    
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }
    

    public ArrayList<TituloAcademico> getListaAlumnoTitutloAcademico() {
        return listaAlumnoTitutloAcademico;
    }

    public void setListaAlumnoTitutloAcademico(ArrayList<TituloAcademico> listaAlumnoTitutloAcademico) {
        this.listaAlumnoTitutloAcademico = listaAlumnoTitutloAcademico;
    }

    @Override
    public void imprimeAlumnoTituloAcademico() {
        
        System.out.println("Nombre del alumno: "+this.getNombre());
        
        for (int i = 0; i < listaAlumnoTitutloAcademico.size(); i++) {
            TituloAcademico get = listaAlumnoTitutloAcademico.get(i);
            System.out.println("Lista de Títulos Académicos: ");
            
        }
    }

    @Override
    public void imprimeAlumnoAlumno() {
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Apellido: "+this.getApellido());
        System.out.println("DNI: "+this.getDNI());
        for (int i = 0; i < listaAlumnoTitutloAcademico.size(); i++) {
            TituloAcademico get = listaAlumnoTitutloAcademico.get(i);
            System.out.println("Lista de Títulos Académicos: ");
            
        }
    }

    @Override
    public void imprimeProfesorTiuloAcademico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeProfesorMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeProfesorProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeAulaProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void imprimeAulaAlula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public void imprimeCursoMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoProfesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void imprimeCursoAula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeCursoCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void imprimeAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
   
    
}
