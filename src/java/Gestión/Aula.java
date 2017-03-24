
package Gestión;

import Personas.Profesor;
import Listas.Imprime;
import Listas.NombreAula;
import java.util.ArrayList;

public class Aula implements Imprime{
    
    private int idAula;
    private Enum<NombreAula> nA;
    private int capacidad;
    private int metros;
    private ArrayList<Profesor> listaAulaProfesor;
    private boolean calefaccion;
    private boolean aire_acondiconado;

    public Aula() {
    }
    
    public Aula(Enum<NombreAula> nA, int capacidad, int metros, ArrayList<Profesor> listaAulaProfesor, boolean calefaccion, boolean aire_acondiconado) {
        this.nA = nA;
        this.capacidad = capacidad;
        this.metros = metros;
        this.listaAulaProfesor = listaAulaProfesor;
        this.calefaccion = calefaccion;
        this.aire_acondiconado = aire_acondiconado;
    }

    public int getIdAula() {
        return idAula;
    }
        
    public void setIdAula(int idAula) {
        this.idAula = idAula;
    }

    
    public Enum<NombreAula> getnA() {
        return nA;
    }

    public void setnA(Enum<NombreAula> nA) {
        this.nA = nA;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public ArrayList<Profesor> getListaAulaProfesor() {
        return listaAulaProfesor;
    }

    public void setListaAulaProfesor(ArrayList<Profesor> listaAulaProfesor) {
        this.listaAulaProfesor = listaAulaProfesor;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public boolean isAire_acondiconado() {
        return aire_acondiconado;
    }

    public void setAire_acondiconado(boolean aire_acondiconado) {
        this.aire_acondiconado = aire_acondiconado;
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
        
        System.out.println("Nombre del aula: "+this.getnA());
        
        for (int i = 0; i < listaAulaProfesor.size(); i++) {
            Profesor profesor = listaAulaProfesor.get(i);
            
            System.out.println("Lista de profesores: "+profesor.getNombre());
        }
    }
    
    @Override
    public void imprimeAulaAlula() {
        
        System.out.println("Nombre del aula: "+this.getnA());
        System.out.println("Capacidad de alumnos: "+this.getCapacidad());
        System.out.println("Calefacción: "+this.isCalefaccion());
        System.out.println("Aire acondicionado: "+this.isAire_acondiconado());
        for (int i = 0; i < listaAulaProfesor.size(); i++) {
            Profesor profesor = listaAulaProfesor.get(i);
            
            System.out.println("Lista de profesores: "+profesor.getNombre());
        }
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
