/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import javax.persistence.Query;
import modelo.Cuenta;

/**
 *
 * @author Fabricio
 */
public class CuentaDao extends AdaptadorDao<Cuenta>{
    private Cuenta cuenta;

    public CuentaDao() {
        super(Cuenta.class);
    }

    public Cuenta getCuenta() {
        if (cuenta == null) {
            cuenta = new Cuenta();
        }
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

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

    //AQUI
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
