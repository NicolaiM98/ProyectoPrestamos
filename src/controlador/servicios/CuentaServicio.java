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

    public void crearCuentaAdmin() {
        if (todos().isEmpty()) {
            PersonaServicio persona = new PersonaServicio();
            persona.getPersona().setApellido("Rojas");
            persona.getPersona().setNombre("Victor");
            persona.getPersona().setCedula("1105834939");
            persona.getPersona().setCorreo("Loja");
            persona.getPersona().setExternalId(UUID.randomUUID().toString());
            persona.getPersona().setTelefono("S/T");
            persona.getPersona().setRol(new RolServicio().buscarRolNombre("Administrador"));
            Cuenta c = new Cuenta();
            c.setClave("victor");
            c.setUsuario("victor");
            c.setExternalId(UUID.randomUUID().toString());
            c.setCreatedAt(new Date());
            c.setUpdatedAt(new Date());
            c.setPersona(persona.getPersona());
            persona.getPersona().setCuenta(c);
            persona.guardar();

        }
    }

    public Cuenta inicioSesion(String usuario, String clave) {
        return obj.inicioSesion(usuario, clave);
    }
}
