/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import static controlador.Conexion.getManager;
import javax.persistence.Query;
import modelo.CuentaBancaria;

/**
 *
 * @author Fabricio
 */
public class CuentaBancariaDao extends AdaptadorDao<CuentaBancaria>{
    private CuentaBancaria cuentaBancaria;

    public CuentaBancariaDao() {
        super(CuentaBancaria.class);
    }

    public CuentaBancaria getCuentaBancaria() {
        if (cuentaBancaria == null) {
            cuentaBancaria = new CuentaBancaria();
        }
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public boolean guardar() {
        boolean verificar = false;
        try {
            getManager().getTransaction().begin();
            if (cuentaBancaria.getId() != null) {
                modificar(cuentaBancaria);
            } else {
                guardar(cuentaBancaria);
            }
            getManager().getTransaction().commit();
            verificar = true;
        } catch (Exception e) {
            System.out.println("No se ha podido registrar o modificar" + e);
        }
        return verificar;
    }

    //AQUI
   
}
