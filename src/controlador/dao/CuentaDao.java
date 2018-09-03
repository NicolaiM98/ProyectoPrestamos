/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import javax.persistence.Query;
import modelo.Cuenta;

/**
 *Clase que permite manejar los datos de la cuenta que creea el usuario o adminsitrador
 * @author Fabricio
 */
public class CuentaDao extends AdaptadorDao<Cuenta>{
    private Cuenta cuenta;
    // constructor de la clase
    public CuentaDao() {
        super(Cuenta.class);
    }
     /**
     *Metodo que permite obtener los datos de cuenta
     * @return cuenta datos de la cuenta
    */  
    public Cuenta getCuenta() {
        if (cuenta == null) {
            cuenta = new Cuenta();
        }
        return cuenta;
    }
    /**
     *Metodo que permite modificar los datos de cuenta
     * @param cuenta para definir de que cuenta se va a modificar
    */   
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    /**
     *Metodo que permite guardar los datos de una cuenta
     * @return verificar si se guardo o no
    */      
    public boolean guardar() {
        boolean verificar = false;
        try {
            getManager().getTransaction().begin();
            if (cuenta.getId() != null) {
                modificar(cuenta);
            } else {
                guardar(cuenta);
            }
            getManager().getTransaction().commit();
            verificar = true;
        } catch (Exception e) {
            System.out.println("No se ha podido registrar o modificar" + e);
        }
        return verificar;
    }

     /**
     *Metodo que permite iniciar sesion comparando los datos ingresados con los datos almacenados
     * @param clave parametro que ingresa el usuario en la ventana de login correspondiente a la contraseña
     * @param usuario parametro que ingresa el usuario en la ventana de login correspondiente al nombre de usuario
     * @return c si se encontro o no una coincidencia de datos
    */  
    public Cuenta inicioSesion(String usuario, String clave) {
        Cuenta c = null;
        try {
            Query q = getManager().createQuery("SELECT c FROM Cuenta c WHERE c.usuario = :user");
            q.setParameter("user", usuario);
            Cuenta aux = (Cuenta) q.getSingleResult();
            if (aux != null && aux.getClave().equals(clave)) {
                c = aux;
            }
        } catch (Exception e) {
            System.out.println("No se ha podido iniciar sesión " + e);
        }
        return c;
    }
}
