/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicios;

import controlador.dao.CuentaBancariaDao;
import java.util.List;
import modelo.CuentaBancaria;

/**
 *Clase que nos sirve de pasamanos entre el controlador dao de cuentabancaria para utilizar sus metodos
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class CuentaBancariaServicio {
    
    //objeto CuentaBancariaDao con el cual podemos invocar sus metodos del dao para utilizarlos
    private CuentaBancariaDao obj = new CuentaBancariaDao();

         /**
     *Servicio que permite obtener una cuenta bancaria
     * @return la cuenta bancaria obtenida
    */ 
    public CuentaBancaria getCuentaBancaria() {
        return obj.getCuentaBancaria();
    }
     /**
     *Servicio que permite guardar los datos de la cuenta bancaria
     * @return lso datos de la cuenta bancaria guardados
    */ 
    public boolean guardar() {
        return obj.guardar();
    }
     /**
     *Servicio que permite listar las cuentas bancarias de los usuarios
     * @return el objeto con el listado de cuentas Bancarias
    */ 
    public List<CuentaBancaria> todos() {
        return obj.listar();
    }
     /**
     *Servicio que permite obtener un identificador de cada cuenta bancaria
     * @param id nos servira para identificar cada cuenta bancaria
     * @return el identificador de la cuenta bancaria
    */ 
    public CuentaBancaria obtener(Long id) {
        return obj.obtener(id);
    }
     /**
     *Servicio que permite fijar una cuenta bancaria a un usuario
     * @param cuenta define que cuenta sera fijada en un usuario
     * @return los datos de la cuenta del usuario
    */ 
    public void fijarCuentaBancaria(CuentaBancaria cuenta) {
        obj.setCuentaBancaria(cuenta);
    }
}
