/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import static controlador.Conexion.getManager;
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

    
}
