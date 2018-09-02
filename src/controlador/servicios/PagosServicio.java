/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicios;

import controlador.dao.PagosDao;
import java.util.List;
import modelo.Pagos;
import controlador.utilidades.Utilidades;
import java.util.Date;

/**
 *
 * @author Fabricio
 */
public class PagosServicio {
   private PagosDao obj = new PagosDao();
   private Pagos pg = new Pagos();
   private Utilidades ut= new Utilidades();
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
    public List<Pagos> listarPagos(String dato) {
        return  obj.listarPagos( dato);
    }
    public void realizarPago(String datoP){
     obj.realizarPago(datoP);
    }
}
