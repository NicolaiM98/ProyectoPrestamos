/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import modelo.Persona;

/**
 *Clase en donde creamos los metodos necesarios para utilizar los datos de una persona
 * @author Fabricio Carrion y Nicolai Mogrovejo
 * 
 */
public class PersonaDao extends AdaptadorDao<Persona>{
    private Persona persona;

    //Constructor de la clase PersonaDao
    public PersonaDao() {
        super(Persona.class);
    }
     /**
     *Metodo que permite obtener los datos de la persona
     * @return persona  datos de la persona
    */  
    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return persona;
    }
     /**
     *Metodo que permite modificar los datos de la persona
     * @param persona para definir de que persona se va a modificar
    */  
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
     /**
     *Metodo que permite guardar los datos de una persona
     * @return verificar si se guardo o no
    */  
    public boolean guardar() {
        boolean verificar = false;
        try {
            getManager().getTransaction().begin();
            if (persona.getId() != null) {
                modificar(persona);
            } else {
                guardar(persona);
            }
            getManager().getTransaction().commit();
            verificar = true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se ha podido registrar o modificar" + e);
        }
        return verificar;
    }

     /**
     *Metodo que permite obtener la cedula de una persona   
     * @param cedula para definir la cedula que queremos obtener
     * @return p retorna la cedula de la persona, en caso contrario nos retornara un null si no existen personas en el registro
    */  
    public Persona getPersonaCedula(String cedula) {
        Persona p = null;
        try {
            Query q = getManager().createQuery("SELECT p FROM Persona p where p.cedula = :ced"); //:parametro
            q.setParameter("ced", cedula);
            p = (Persona) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("No se ha encontrado la cedula " + e);
        }
        return p;
    }
    /**
     *Metodo que permite buscar entre  todas las personas a exepcion del administrador 
     * @param texto  obtiene el texto o apellido que se desea buscar 
     * @return devuelve la lista de coincidencias
    */ 
    public List<Persona> listarSinAdministradorLike(String texto) {
        List<Persona> lista = new ArrayList<>();
        try {
            Query q = getManager()
                    .createQuery("SELECT p FROM Persona p where "
                            + "p.rol.nombre != :nombre and (lower(p.apellido) LIKE CONCAT('%', :texto, '%'))");
            q.setParameter("nombre", "Administrador");
            q.setParameter("texto", texto);
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return lista;
    }
     /**
     *Metodo que permite cambiar el estado de un pago de false a true
     * @param dato id de la persona de la cual se necesita cambiar el estado
    */  
    public void cambiarEstado(String dato){
     try {
            Query q = getManager().createQuery("Update Persona set estado = true where id  = :id"); 
            q.setParameter("id", Long.parseLong(dato));
            getManager().getTransaction().begin();
            q.executeUpdate();
            getManager().getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error "+e);
        }
     }

}
