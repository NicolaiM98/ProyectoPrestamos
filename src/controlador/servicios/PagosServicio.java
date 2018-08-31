/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicios;

import controlador.dao.PagosDao;
import java.util.List;
import modelo.Pagos;

/**
 *
 * @author Fabricio
 */
public class PagosServicio {
   private PagosDao obj = new PagosDao();

    public Pagos getPagos() {
        return obj.getPagos();
    }

    public boolean guardar() {
        return obj.guardar();
    }

    public List<Pagos> todos() {
        return obj.listar();
    }

    public Pagos obtener(Long id) {
        return obj.obtener(id);
    }

    public void fijarPagos(Pagos pagos) {
        obj.setPagos(pagos);
    } 
    public  List CalcularFrances(double capital , int anios ){
    return obj.CalcularFrances(capital, anios);
    }
}
