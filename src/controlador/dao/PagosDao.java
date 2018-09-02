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
 *
 * @author Fabricio
 */
public class PagosDao extends AdaptadorDao<Pagos> {
 private Pagos pagos;

    public PagosDao() {
        super(Pagos.class);
    }

    public Pagos getPagos() {
        if (pagos == null) {
            pagos = new Pagos();
        }
        return pagos;
    }

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }

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
     public void realizarPago(String datoP){
     try {
            Query q = getManager().createQuery("Update Pagos set estado = false where id  = :id"); 
            q.setParameter("id", Long.parseLong(datoP));
        } catch (Exception e) {
            System.out.println("error "+e);
        }
     }
}


