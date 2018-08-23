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
 *
 * @author Fabricio
 */
public class PersonaDao extends AdaptadorDao<Persona>{
    private Persona persona;

    public PersonaDao() {
        super(Persona.class);
    }

    public Persona getPersona() {
        if (persona == null) {
            persona = new Persona();
        }
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

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

    public List<Persona> listarSinAdministrador() {
        List<Persona> lista = new ArrayList<>();
        try {
            Query q = getManager().createQuery("SELECT p FROM Persona p WHERE p.rol.nombre != :nombre"); //:parametro
            q.setParameter("nombre", "Administrador");
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("No se puede listar sin Administrador " + e);
        }
        return lista;
    }

    public List<Persona> listarSinAdministradorTipo(String tipo) {
        List<Persona> lista = new ArrayList<>();
        try {
            Query q = getManager()
                    .createQuery("SELECT p FROM Persona p WHERE p.rol.nombre != :nombre and p.rol.nombre = :tipo"); //:parametro
            q.setParameter("nombre", "Administrador");
            q.setParameter("tipo", tipo);
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("No se puede listar sin Administrador " + e);
        }
        return lista;
    }

    public List<Persona> listarSinAdministradorLike(String texto) {
        //Like.- permite buscar por coincidencias, propiamente de MySQL
        List<Persona> lista = new ArrayList<>();
        try {
            Query q = getManager().createQuery("SELECT p FROM Persona p WHERE p.rol.nombre != :nombre AND (LOWER(p.apellidos) LIKE CONCAT('%', :texto, '%'))");
            //lower.- convierte a minusculas
            q.setParameter("nombre", "Administrador");
            q.setParameter("texto", texto);
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("No se puede listar sin Administrador " + e);
        }
        return lista;
    }

    public List<Persona> listarSinAdministradorTipoLike(String tipo, String texto) {
        List<Persona> lista = new ArrayList<>();
        try {
            Query q = getManager()
                    .createQuery("SELECT p FROM Persona p WHERE p.rol.nombre != :nombre and p.rol.nombre = :tipo "
                            + "AND (LOWER(p.apellidos) LIKE CONCAT('%', :texto, '%'))");
            q.setParameter("nombre", "Administrador");
            q.setParameter("tipo", tipo);
            q.setParameter("texto", texto);
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("No se puede listar sin Administrador " + e);
        }
        return lista;
    }

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
}
