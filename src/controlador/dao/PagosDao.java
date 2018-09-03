/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import static controlador.Conexion.getManager;
import controlador.utilidades.Sesion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import modelo.Pagos;
import modelo.Pagos;

/**
 *Clase en donde creamos los metodos necesarios para manejar los datos de los pagos del prestamo
 * @author Fabricio
 */
public class PagosDao extends AdaptadorDao<Pagos> {
 private Pagos pagos;
    // constructor de la clase
    public PagosDao() {
        super(Pagos.class);
    }
     /**
     *Metodo que permite obtener los datos del pago
     * @return pagos datos del pago
    */  
    public Pagos getPagos() {
        if (pagos == null) {
            pagos = new Pagos();
        }
        return pagos;
    }
    /**
     *Metodo que permite modificar los datos del pago
     * @param pagos para definir de que pagos se va a modificar
    */  
    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }
    /**
     *Metodo que permite guardar los datos de un pago
     * @return verificar si se guardo o no
    */  
    public boolean guardar() {
        boolean verificar = false;
        try {
            getManager().getTransaction().begin();
            if (pagos.getId() != null) {
                modificar(pagos);
            } else {
                guardar(pagos);
            }
            getManager().getTransaction().commit();
            verificar = true;
        } catch (Exception e) {
            System.out.println("No se ha podido registrar o modificar" + e);
        }
        return verificar;
    } 
     /**
     *Metodo que permite obtener una lista de pagos enlazados con el id del Prestamo
     * @param dato el id que lelga del prestamo
     * @return lista devuelve la lista con los pagos correspondientes al prestamo
    */  
     public List<Pagos> listarPagos(String dato) {
        List<Pagos> lista = new ArrayList<>();
        try {
            Query q = getManager().createQuery("SELECT p FROM Pagos p where p.prestamos.id  = :id"); 
            q.setParameter("id", Long.parseLong(dato));
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return lista;
    }
      /**
     *Metodo que permite cambiar el estado de un pago de true a false
     * @param datoP id del pago del cual se necesita cambiar el estado
    */  
     public void realizarPago(String datoP){
     try {
            Query q = getManager().createQuery("Update Pagos set estado = false where id  = :id"); 
            q.setParameter("id", Long.parseLong(datoP));
            getManager().getTransaction().begin();
            q.executeUpdate();
            getManager().getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error "+e);
        }
     }
}


