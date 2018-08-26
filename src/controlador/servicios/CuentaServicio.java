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
 *
 * @author Fabricio
 */
public class CuentaServicio {
    private CuentaDao obj = new CuentaDao();

    public Cuenta getCuenta() {
        return obj.getCuenta();
    }

    public boolean guardar() {
        return obj.guardar();
    }

    public List<Cuenta> todos() {
        return obj.listar();
    }

    public Cuenta obtener(Long id) {
        return obj.obtener(id);
    }

    public void fijarCuenta(Cuenta cuenta) {
        obj.setCuenta(cuenta);
    }

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

    public Cuenta inicioSesion(String usuario, String clave) {
        return obj.inicioSesion(usuario, clave);
    }
}
