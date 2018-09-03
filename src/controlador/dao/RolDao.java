/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import javax.persistence.Query;
import modelo.Rol;

/**
 *Clase en donde creamos los metodos para utilizar Roles
 * @author Fabricio Carrion y Nicolai Mogrovejo

 */
public class RolDao extends AdaptadorDao<Rol>{
    private Rol rol;
     /**
     *Constructor de la clase RolDao
    */  
    public RolDao() {
        super(Rol.class);
    }
     /**
     *Metodo que permite obtener un Rol
     * @return rol obtenido
    */  
    public Rol getRol() {
        if (rol == null) {
            rol = new Rol();
        }
        return rol;
    }
     /**
     *Metodo que permite modificar un rol
     * @param rol parametro que define el rol que queremos modificar
    */  
    public void setRol(Rol rol) {
        this.rol = rol;
    }
     /**
     *Metodo que permite guardar los roles
     * @return verificar si se ha guardado correctamente o no
    */  
    public boolean guardar() {
        boolean verificar = false;
        try {
            getManager().getTransaction().begin();
            if (rol.getId() != null) {
                modificar(rol);
            } else {
                guardar(rol);
            }
            getManager().getTransaction().commit();
            verificar = true;
        } catch (Exception e) {
            System.out.println("No se ha podido registrar o modificar" + e);
        }
        return verificar;
    }

    public Rol buscarRolNombre(String nombre) {
        Rol r = null;
        try {
            Query q = getManager().createQuery("SELECT r FROM Rol r where r.nombre = :data");
            q.setParameter("data", nombre);
            r = (Rol) q.getSingleResult();
        } catch (Exception e) {
            System.out.println("No se pudo encontrar el rol por nombre " + e);
        }
        return r;
    }
}
