/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicios;

import controlador.dao.CuentaDao;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import modelo.Cuenta;

/**
 *Clase que nos sirve de pasamanos del controlador dao de cuenta para utilizar sus metodos
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class CuentaServicio {
    
    //objeto CuentaDao con el que podemos invocar sus metodos para utlizarlos
    private CuentaDao obj = new CuentaDao();

     /**
     *Servicio que permite obtener una cuenta
     * @return un objeto con los datos de la cuenta
    */ 
    public Cuenta getCuenta() {
        return obj.getCuenta();
    }
     /**
     *Servicio que permite guardar los datos de la cuenta   
     * @return los datos guardados
    */ 
    public boolean guardar() {
        return obj.guardar();
    }
     /**
     *Servicio que permite listar las cuentas creadas
     * @return objeto con el listado de cuentas
    */ 
    public List<Cuenta> todos() {
        return obj.listar();
    }
     /**
     *Servicio que permite obtener el id de cada cuenta creada
     * @param id idetificador para cada cuenta
     * @return el identificador de cada cuenta
    */ 
    public Cuenta obtener(Long id) {
        return obj.obtener(id);
    }
     /**
     *Servicio que permite fijar la cuenta al usuario que la creo
     * @param cuenta define de quien es la cuenta creada
     *
    */ 
    public void fijarCuenta(Cuenta cuenta) {
        obj.setCuenta(cuenta);
    }
     /**
     *Metodo que nos permite crear un administrador
    */ 
    public   void crearCuentaAdmin() {
        if (todos().isEmpty()) {
            PersonaServicio persona = new PersonaServicio();
            persona.getPersona().setApellido("Mogrovejo");
            persona.getPersona().setNombre("Damian");
            persona.getPersona().setCedula("1104706088");
            persona.getPersona().setCorreo("nicomogrovejo98@yahoo.es");
            persona.getPersona().setExternalId(UUID.randomUUID().toString());
            persona.getPersona().setTelefono("0980088875");
            persona.getPersona().setRol(new RolServicio().buscarRolNombre("Administrador"));
            Cuenta c = new Cuenta();
            c.setClave("admin1");
            c.setUsuario("admin1");
            c.setCreatedAt(new Date());
            c.setUpdatedAt(null);
            c.setPersona(persona.getPersona());
            persona.getPersona().setCuenta(c);
            persona.guardar();

        }
    }
     /**
     *Servicio que permite el inicio de sesion
     * @param usuario  son los credenciales del usuario validos para el inicio de sesion
     * @param clave clave ingresada pro el usuario 
     * @return el inicio de sesion
    */ 
    public Cuenta inicioSesion(String usuario, String clave) {
        return obj.inicioSesion(usuario, clave);
    }
}
