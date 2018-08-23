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
 *
 * @author Fabricio
 */
public class CuentaBancariaServicio {
    private CuentaBancariaDao obj = new CuentaBancariaDao();

    public CuentaBancaria getCuentaBancaria() {
        return obj.getCuentaBancaria();
    }

    public boolean guardar() {
        return obj.guardar();
    }

    public List<CuentaBancaria> todos() {
        return obj.listar();
    }

    public CuentaBancaria obtener(Long id) {
        return obj.obtener(id);
    }

    public void fijarCuentaBancaria(CuentaBancaria cuenta) {
        obj.setCuentaBancaria(cuenta);
    }
}
