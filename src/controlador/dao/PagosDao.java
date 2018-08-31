/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import static controlador.Conexion.getManager;
import java.util.ArrayList;
import java.util.List;
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
     public  List CalcularFrances(double capital , int anios ){
        double cuota = 0.0;
        double interes;
        int n = (anios * 12);
        interes=((1-(Math.pow(1.004074, -120)))/0.004074);
        cuota= capital/interes;
        double  ta, ca, ci, ra, tci;
        ta=0;
        ra=capital;
        tci=0;
        List lista = new ArrayList<>();
        for (int i=1;i <= n ;i++)
            {
                ci=ra*interes;
                tci=tci+ci;
                ca=cuota-ci;
                ta=ta+ca;
                ra=capital-ta;
               
                pagos.setNumeroCuotas(n);
                pagos.setCuota(cuota);
                pagos.setInteres(ci);
                pagos.setAmortizacion(ca);
                pagos.setSaldo(ra);
//                lista.add(i,getPagos().setEstado(true) );
            }  
        return lista;
    }
}

