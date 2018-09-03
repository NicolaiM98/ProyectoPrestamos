/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicios;

import controlador.dao.PersonaDao;
import java.util.List;
import modelo.Persona;

/**
 *clase que nos sirve de pasamanos del PersonaDao para utilizar sus metodos
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class PersonaServicio {
    //Objeto PersonaDao con el que podemos invocar los metodos del PersonaDao
     private PersonaDao obj = new PersonaDao();
     /**
     *Servicio que permite obtener los datos de la persona
     * @return el objeto con los datos de la persona
    */  
    public Persona getPersona() {
        return obj.getPersona();
    }
     /**
     *Servicio que permite guardar los datos de la persona
     * @return datos de la persona guardados
    */ 
    public boolean guardar() {
        return obj.guardar();
    }
     /**
     *Servicio que permite listar personas
     * @return el objeto con la lista de las personas
    */ 
    public List<Persona> todos() {
        return obj.listar();
    }
     /**
     *Servicio que permite obtener el id de cada persona
     * @return el id de cada persona
     * @param id obtiene el id de la persona
    */ 
    public Persona obtener(Long id) {
        return obj.obtener(id);
    }
     /**
     *Servicio que permite fijar una persona a un objeto
     * @param persona define que persona se va a fijar con x objeto
    */ 
    public void fijarPersona(Persona persona) {
        obj.setPersona(persona);
    }
    
    /**
     *Servicio que permite consultar las cedulas de los usuarios y compararla con  otra cedula
     * @param cedula obtiene uan cedula para comparar
     * @return devuelve el objeto del metodo
    */ 
    public Persona getPersonaCedula(String cedula) {
    return obj.getPersonaCedula(cedula);
    }
    
    /**
     *Servicio que permite buscar entre  todas las personas a exepcion del administrador
     * @param texto  obtiene el texto o apellido que se desea buscar 
     * @return devuelve el objeto del metodo
    */ 
    public List<Persona> listarSinAdministradorLike(String texto) {
     return obj.listarSinAdministradorLike(texto);
    }

}
