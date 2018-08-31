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
    public  String CalcularFrances(double capital , int anios ){
    return obj.CalcularFrances(capital, anios);
    }
     public void CalcularPagosFrances (double capital , int anios){
        String mensaje="";
        double cuota = 0.0;
        double interes;
        int n = (anios * 12);
        interes=((1-(Math.pow(1.004074, -n)))/0.004074);
        cuota= capital/interes;
        double ra= capital;
        double ci=0,  tci=0 , ta=0 , ca=0;
        tci=0;
        double exp = 0.083;
        double inte =0.0;
                inte=Math.pow((1+0.05),exp)-1;
        ta=0;
        for(int i =0 ; i< n ;i++){
                ci=ra*inte;
                tci=tci+ci;
                ca=cuota-ci;
                ta=ta+ca;
                ra=capital-ta;
                pg.setNumeroCuotas(i+1);
                pg.setInteres(ci);
                pg.setCuota(cuota);
                pg.setAmortizacion(ta);
                pg.setSaldo(ra);
                pg.setEstado(true);
                pg.setFechaPago(ut.sumarMeses(new Date()));
                
        }
        mensaje += "Usted pagara una cuota de: " + cuota + "durante " + n + " periodos;\n ";
        mensaje+= "El total de interes ah pagar sera: " +tci;
    } 
}
