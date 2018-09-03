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
 * Clase en la que se crean los metodos necesarios para manejar los datos de una Cuenta Bancaria
 * @author Fabricio
 */
public class CuentaBancariaDao extends AdaptadorDao<CuentaBancaria>{
    private CuentaBancaria cuentaBancaria;
    // constructor de la clase
    public CuentaBancariaDao() {
        super(CuentaBancaria.class);
    }
    /**
     *Metodo que permite obtener los datos de la Cuenta Bancaria
     * @return cuentaBancaria  datos de la cuenta Bancaria
    */  
    public CuentaBancaria getCuentaBancaria() {
        if (cuentaBancaria == null) {
            cuentaBancaria = new CuentaBancaria();
        }
        return cuentaBancaria;
    }
     /**
     *Metodo que permite modificar los datos de la Cuenta Bancaria
     * @param cuentaBancaria para definir de que Cuenta Bancaria se va a modificar
    */  
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    /**
     *Metodo que permite guardar los datos de una Cuenta Bancaria
     * @return verificar si se guardo o no
    */  
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
