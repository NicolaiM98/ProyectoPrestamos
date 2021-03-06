/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.servicios.CuentaServicio;
import controlador.servicios.RolServicio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *Clase conexion: realiza la coneccion del proyecto con la Base de Datos.
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class Conexion {
    private static EntityManager manager;
     /**
     *Nombre de nuestra persistencia que conecta a la base de datos

    */  
    private static final String NAME_EMPU = "ProyectoFinalPU";
     /**
     *Metodo que permite crear la entidad en la persistencia
     * @return la Persistencia 
    */  
    public static EntityManagerFactory sesion() {
        return Persistence.createEntityManagerFactory(NAME_EMPU);
    }
         /**
     *Metodo que permite obtener la entidad 
     * @return la entidad obtenida
    */  
    public static EntityManager getManager() {
        if (manager == null) {
            manager = sesion().createEntityManager();
        }
        return manager;
    }
/**
 *Crea los roles en la Base de Datos
 * @param args parametro clase main java 
 */
    public static void main(String[] args) {
        new RolServicio().crearRoles();
       
    }
}
