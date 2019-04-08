package Pruebas;

import Daos.DaoAlumno;
import Daos.DaoContenido;
import Daos.DaoCurso;
import Daos.DaoEjemplar;
import Daos.DaoHistorial;
import Daos.DaoLibro;
import Daos.DaoMatricula;
import Pojos.Alumno;
import Pojos.Contenido;
import Pojos.Curso;
import Pojos.Ejemplar;
import Pojos.Grupo;
import Pojos.Historial;
import Pojos.Libro;
import Pojos.Matricula;
import Vistas.FrameCarga;
import Vistas.FrameEjemplares;
import Vistas.FrameLibroOld;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.UtilesHibernate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingWorker;
import net.bytebuddy.asm.Advice;

public class PruebaHibernate {

    static List<Alumno> listaAlumnos;
    static FrameCarga frameCarga;

    public static void main(String[] args) {
        Curso curso = new Curso("1", "DAM", "a", "a", "a", "a");
        Contenido contenido = new Contenido(6, curso, "a", "a", "a", "a");
        Libro l = new Libro("444", contenido, "Libro nuevo", "nombre", 40, true, 0);
        Ejemplar ejemplar = new Ejemplar("96799999002", l, 1, true);
        
        try {
            SessionFactory factory = UtilesHibernate.getSessionFactory();
            Session session = factory.openSession();
            session.beginTransaction();
            
            DaoLibro dao = new DaoLibro(session);
            
            dao.grabar(l);
            
            
            List<Libro> al = new DaoLibro(session).buscarTodos();
            
            for (int i = 0; i < al.size(); i++) {
                System.out.println(al.get(i).getEjemplares().size());
            }
            
            
            session.getTransaction().commit();
            session.close();
            //DaoContenido daoc = new DaoContenido();

            //System.out.println(daoc.buscarTodos().get(0).getLibros().size());

            //session.close();
            /*DaoMatricula dao = new DaoMatricula();
            
             Matricula m = new Matricula(4, 2020, a, "", "", "", "ssssss", 
             "A", "B", "C", new Date(1), new Date(1) , "", "");
            
             dao.actualizar(m);
            
             System.out.println("Total: " + dao.buscarTodos().size());
            
             //dao.grabar(new Historial(4, ejemplar, a, 0, 0, 0, new Date(3), new Date(22), "zi"));
            
             //System.out.println(dao.buscarTodos().size());
             //System.out.println(dao.buscarPorEjemplar(ejemplar).size());
            
             /*
             SessionFactory factory = UtilesHibernate.getSessionFactory();
             Session session = factory.getCurrentSession();
             session.beginTransaction();
             
             session.save(contenido);
            
             session.getTransaction().commit();
            
            
             DaoContenido dao = new DaoContenido();
            
             System.out.println("Individual: " + dao.buscar("71230212"));
            
             System.out.println("Total: " + dao.buscarTodos().size());
             /*
             DaoLibro daol = new DaoLibro();
            
             daol.grabar(l);
            
             Ejemplar e = new Ejemplar("99999999001", l, 10, true);
                    
             DaoEjemplar dao = new DaoEjemplar();
            
             dao.actualizar(e);
            
             System.out.println("Ejemplar modificado: " + dao.buscar(e.getCodigo()).toString());
            
             System.out.println("Todos ejemplares: ");
            
             List<Ejemplar> ej = dao.buscarTodos();
            
             ej.toString();
             SessionFactory factory = UtilesHibernate.getSessionFactory();
             Session session = factory.getCurrentSession();
             session.beginTransaction();
             /*
             //session.save(curso);
            
             //session.save(contenido);
            
             //session.getTransaction().commit();
            
             //session.close();
            
             /*DaoLibro dao = new DaoLibro();
            
             for (int i = 0; i < dao.buscarTodos().size(); i++) {
             System.out.println(dao.buscarTodos().get(i).toString());
             }
             //dao.generarEjemplares(l);
            

             
            
             Alumno objeto = (Alumno) session.get(Alumno.class, "71230212");

             System.out.println("===================");
             System.out.println("ALUMNO");
             System.out.println("===================");
            
             System.out.println( objeto.toString());
            
             System.out.println("Nombre: " + objeto.getNombre() + " " + objeto.getApellido1() + " " + objeto.getApellido2());

             System.out.println("===================");
             System.out.println("MATRICULAS");
             System.out.println("===================");
            
             System.out.println("N º Matriculas: " + objeto.getMatriculas().size());

             for (int i = 0; i < objeto.getMatriculas().size(); i++) {
             objeto.getMatriculas().get(i).toString();
             }
            
             System.out.println("===================");
             System.out.println("HISTORIAL");
             System.out.println("===================");
            
             System.out.println("N º Historial: " + objeto.getHistoriales().size());

             for (int i = 0; i < objeto.getHistoriales().size(); i++) {
             Historial historial = objeto.getHistoriales().get(i);
                
             System.out.println("Historial " + i + historial.toString());
                
             System.out.println("Ejemplar: " + historial.getEjemplar().getCodigo());
                
             System.out.println("Libro del ejemplar: " + historial.getEjemplar().getLibro().getCodigo());
                
             System.out.println("Contenido del libro: " + historial.getEjemplar().getLibro().getContenido().getNombre_cas());
                
             Syst
             */
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No existe ningún objeto con ese id.");
        }

    }
}
