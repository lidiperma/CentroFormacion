/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import Listas.Imprime;
import Listas.Materia;
import Listas.TituloAcademico;
import java.util.ArrayList;

public class Profesor extends Persona implements Imprime{
    
    private int idProfesor;
    private ArrayList<TituloAcademico> listaProfesorTituloAcademico;
    private ArrayList<Materia> listaProfesorMateria;


    public Profesor (){
        super();
    }

    public Profesor(String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
    }

    public Profesor(ArrayList<Materia> listaProfesorMateria, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.listaProfesorMateria = listaProfesorMateria;
    }
    
    public Profesor(ArrayList<TituloAcademico> listaProfesorTituloAcademico, ArrayList<Materia> listaProfesorMateria, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.listaProfesorTituloAcademico = listaProfesorTituloAcademico;
        this.listaProfesorMateria = listaProfesorMateria;
    }

    
    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public ArrayList<TituloAcademico> getListaProfesorTituloAcademico() {
        return listaProfesorTituloAcademico;
    }

    public void setListaProfesorTituloAcademico(ArrayList<TituloAcademico> listaProfesorTituloAcademico) {
        this.listaProfesorTituloAcademico = listaProfesorTituloAcademico;
    }

    public ArrayList<Materia> getListaProfesorMateria() {
        return listaProfesorMateria;
    }

    public void setListaProfesorMateria(ArrayList<Materia> listaProfesorMateria) {
        this.listaProfesorMateria = listaProfesorMateria;
    }

    @Override
    public void imprimeAlumnoTituloAcademico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeAlumnoAlumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeProfesorTiuloAcademico() {
        System.out.println("Nombre del Profesor: "+this.getNombre());
           for (int i = 0; i < listaProfesorTituloAcademico.size(); i++) {
            TituloAcademico get = listaProfesorTituloAcademico.get(i);
            System.out.println("Lista de Títulos Academicos: ");
            
        }
    }

    @Override
    public void imprimeProfesorMateria() {
        System.out.println("Nombre del Profesor: "+this.getNombre());
           for (int i = 0; i < listaProfesorMateria.size(); i++) {
           Materia get = listaProfesorMateria.get(i);
           System.out.println("Lista de materias: ");
        }
    }

    @Override
    public void imprimeProfesorProfesor() {
        System.out.println("Nombre del profesor: "+this.getNombre());
        System.out.println("Apellido del profesor: "+this.getApellido());
        System.out.println("DNI: "+this.getDNI());
        for (int i = 0; i < listaProfesorMateria.size(); i++) {
           Materia get = listaProfesorMateria.get(i);
           System.out.println("Lista de materias: ");
        }
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
