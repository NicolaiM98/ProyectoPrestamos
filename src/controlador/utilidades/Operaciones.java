/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utilidades;

import controlador.servicios.CuentaBancariaServicio;
import controlador.servicios.PagosServicio;
import controlador.servicios.PrestamosServicio;
import java.util.Date;

/**
 *
 * @author Fabricio
 */
public class Operaciones {
    private PrestamosServicio prs = new PrestamosServicio();
    private PagosServicio pgs= new PagosServicio();
    private CuentaBancariaServicio cbs = new CuentaBancariaServicio();
    private Utilidades ut= new Utilidades();
  public String CalcularFrances (double capital , int anios){
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
        }
        mensaje += "Usted pagara una cuota de: " + cuota + "durante " + n + " periodos;\n ";
        mensaje+= "El total de interes ah pagar sera: " +tci;
        return mensaje;
    }
public void CalcularPagosFrances (double capital , int anios){
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
               
                cbs.fijarCuentaBancaria(Sesion.getCuenta().getPersona().getCuentaBancaria());
                pgs.getPagos().setNumeroCuotas(i+1);
                pgs.getPagos().setInteres(ci);
                pgs.getPagos().setCuota(cuota);
                pgs.getPagos().setAmortizacion(ta);
                pgs.getPagos().setSaldo(ra);
                pgs.getPagos().setEstado(true);
                pgs.getPagos().setFechaPago(ut.sumarMeses(new Date()));
                pgs.getPagos().setPrestamos(prs.getPrestamos());
        }
    }   
}
