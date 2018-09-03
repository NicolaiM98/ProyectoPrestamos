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
 *Clase que nos sirve de pasamanos del controlador y el dao de pagos para utilizar los metodos
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class PagosServicio {
   //objetos del modelo, daos de Pagos y utilidades con el que nos permiten utilizar los metodos
   private PagosDao obj = new PagosDao();
   private Pagos pg = new Pagos();
   private Utilidades ut= new Utilidades();
   
    /**
     *Servicio que permite obtener los datos de pagos
     * @return objeto con datos de pagos
    */ 
    public Pagos getPagos() {
        return obj.getPagos();
    }
     /**
     *Servicio que permite guardar los datos de los pagos
     * @return los pagos guardados
    */ 
    public boolean guardar() {
        return obj.guardar();
    }
     /**
     *Servicio que permite listar los pagos
     * @return la lista con los pagos
    */ 
    public List<Pagos> todos() {
        return obj.listar();
    }
     /**
     *Servicio que permite obtener el id de cada pago 
     * @param id identificador de cada pago
     * @return id obtenido de cada pago
    */ 
    public Pagos obtener(Long id) {
        return obj.obtener(id);
    }
     /**
     *Servicio que permite fijar los pagos a x personas
     * @param pagos dija el pago al usuario que lo realizo
     * @return pagos realizados
    */ 
    public void fijarPagos(Pagos pagos) {
        obj.setPagos(pagos);
    } 
         /**
     *Servicio que permite listar los pagos
     * @return la lista de pagos 
    */ 
    public List<Pagos> listarPagos(String dato) {
        return  obj.listarPagos( dato);
    }
         /**
     *Servicio que permite realizar pagos 
     * @param datoP define la cantidad con la que se va a realizar el pago
     * @return el pago realizado
    */ 
    public void realizarPago(String datoP){
     obj.realizarPago(datoP);
    }
}
