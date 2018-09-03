/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicios;

import controlador.dao.RolDao;
import java.util.List;
import modelo.Rol;

/**
 *Clase que nos permite invocar los daos de los roles para poder utilizarlos
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class RolServicio {
    
    //Objeto de tipo RolDao donde invocamos los metodos del dao de Rol
     private RolDao obj = new RolDao();
    /**
     *Servicio que permite obtener los roles
     * @return el rol obtenido
    */    
    public Rol getRol() {
        return obj.getRol();
    }
    /**
     *Servicio que permite guardar los roles
     * @return el rol guardado
    */    
    public boolean guardar() {
        return obj.guardar();
    }
     /**
     *Servicio que permite listar los roles
     * @return una lista de los Roles
    */    
    public List<Rol> todos() {
        return obj.listar();
    }
/**
     *Servicio que permite obtener id de los roles    
    */   
    public Rol obtener(Long id) {
        return obj.obtener(id);
    }
     /**
     *Servicio que permite fijar un rol a x objeto
    */  
    public void fijarRol(Rol rol) {
        obj.setRol(rol);
    }
 
    public Rol buscarRolNombre(String nombre) {
        return obj.buscarRolNombre(nombre);
    }
    /**
     *Metodo que permite crear Roles
    */    
    public void crearRoles() {
        if (todos().isEmpty()) {
            getRol().setNombre("Administrador");
            guardar();
            fijarRol(null);
            getRol().setNombre("Usuario");
            guardar();

            fijarRol(null);
        }
    }
}
