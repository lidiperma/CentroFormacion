
package Gestión;

import Personas.Alumno;
import Personas.Profesor;
import Listas.Imprime;
import Listas.Materia;
import java.util.ArrayList;


public class Curso implements Imprime{
    
    private int idCurso;
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private ArrayList<Materia> listaCursoMateria;
    private ArrayList<Alumno> listaCursoAlumno;
    private ArrayList<Profesor> listaCursoProfesor;
    private ArrayList<Aula> listaCursoAula;

    public Curso() {
    }

    public Curso(String nombre, ArrayList<Materia> listaCursoMateria, ArrayList<Alumno> listaCursoAlumno, ArrayList<Profesor> listaCursoProfesor, ArrayList<Aula> listaCursoAula) {
        this.nombre = nombre;
        this.listaCursoMateria = listaCursoMateria;
        this.listaCursoAlumno = listaCursoAlumno;
        this.listaCursoProfesor = listaCursoProfesor;
        this.listaCursoAula = listaCursoAula;
    }
    
    
    public Curso(String nombre, String fechaInicio, String fechaFin, ArrayList<Materia> listaCursoMateria, ArrayList<Alumno> listaCursoAlumno, ArrayList<Profesor> listaCursoProfesor, ArrayList<Aula> listaCursoAula) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.listaCursoMateria = listaCursoMateria;
        this.listaCursoAlumno = listaCursoAlumno;
        this.listaCursoProfesor = listaCursoProfesor;
        this.listaCursoAula = listaCursoAula;
    }
    
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Materia> getListaCursoMateria() {
        return listaCursoMateria;
    }

    public void setListaCursoMateria(ArrayList<Materia> listaCursoMateria) {
        this.listaCursoMateria = listaCursoMateria;
    }

    public ArrayList<Alumno> getListaCursoAlumno() {
        return listaCursoAlumno;
    }

    public void setListaCursoAlumno(ArrayList<Alumno> listaCursoAlumno) {
        this.listaCursoAlumno = listaCursoAlumno;
    }

    public ArrayList<Profesor> getListaCursoProfesor() {
        return listaCursoProfesor;
    }

    public void setListaCursoProfesor(ArrayList<Profesor> listaCursoProfesor) {
        this.listaCursoProfesor = listaCursoProfesor;
    }

    public ArrayList<Aula> getListaCursoAula() {
        return listaCursoAula;
    }

    public void setListaCursoAula(ArrayList<Aula> listaCursoAula) {
        this.listaCursoAula = listaCursoAula;
    }

    @Override
    public void imprimeAlumnoTituloAcademico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimeAlumnoAlumno() {
        
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
         
    }
    
    @Override
    public void imprimeCursoMateria() {
        System.out.println("Nombre del curso: "+this.nombre);
        for (int i = 0; i < listaCursoMateria.size(); i++) {
            Materia get = listaCursoMateria.get(i);
            System.out.println("Lista de materias: "+this.getListaCursoMateria());
        }
    }

    @Override
    public void imprimeCursoAlumno() {
        System.out.println("Nombre del curso: "+this.nombre);
        for (int i = 0; i < listaCursoAlumno.size(); i++) {
            Alumno alumno = listaCursoAlumno.get(i);
            System.out.println("Lista de alumnos por curso: "+alumno.getNombre()+","+alumno.getApellido());
        }
    }

    @Override
    public void imprimeCursoProfesor() {
        System.out.println("Nombre del curso: "+this.nombre);
        for (int i = 0; i < listaCursoProfesor.size(); i++) {
            Profesor profesor = listaCursoProfesor.get(i);
            System.out.println("Lista de profesores y su materia: "+profesor.getNombre()+","+profesor.getApellido()+" que imparte "+profesor.getListaProfesorMateria());
        }
    }
    
    @Override
    public void imprimeCursoAula() {
        System.out.println("Nombre del curso: "+this.nombre);
        for (int i = 0; i < listaCursoAula.size(); i++) {
            Aula aula = listaCursoAula.get(i);
            System.out.println("Lista de aulas del curso:"+aula.getnA());
        }
    }

    
    @Override
    public void imprimeCursoCurso() {
        System.out.println("Nombre del curso: "+this.nombre);
        for (int i = 0; i < listaCursoAlumno.size(); i++) {
            Alumno alumno = listaCursoAlumno.get(i);
            System.out.println("Lista de alumnos por curso: "+alumno.getNombre()+","+alumno.getApellido());
        }
        for (int i = 0; i < listaCursoAula.size(); i++) {
            Aula aula = listaCursoAula.get(i);
            System.out.println("Lista de aulas del curso:"+aula.getnA());
        }
        for (int i = 0; i < listaCursoProfesor.size(); i++) {
            Profesor profesor = listaCursoProfesor.get(i);
            System.out.println("Lista de profesores y su materia: "+profesor.getNombre()+","+profesor.getApellido()+" que imparte "+profesor.getListaProfesorMateria());
        }
        for (int i = 0; i < listaCursoMateria.size(); i++) {
            Materia get = listaCursoMateria.get(i);
            System.out.println("Lista de materias: ");
        }
        
    }
    
    @Override
    public void imprimeAll() {
        
        imprimeAulaAlula();
        imprimeAlumnoAlumno();
        imprimeProfesorProfesor();
        imprimeCursoCurso();
    }
   
}
