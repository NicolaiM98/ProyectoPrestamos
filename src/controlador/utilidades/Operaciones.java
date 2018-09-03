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
import vista.utilidades.UtilidadesComponente;

/**
 *Realiza las operaciones necesarias para calcular los valores de las tablas de amortizacion
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class Operaciones {
    private PrestamosServicio prs = new PrestamosServicio();
    private PagosServicio pgs= new PagosServicio();
    private CuentaBancariaServicio cbs = new CuentaBancariaServicio();
    private Utilidades ut= new Utilidades();
    /**
     *Metodo que permite calcular  los valores de la tabla de amortizacion del prestamo tipo Frances 
     * @param capital parametro que trae el capital total del prestamo para calcular la tabla de amortizacion
     * @param anios parametro que trae los años en los que se pagara el prestamo para calcular la tabla de amortizacion
     * @return mensaje Cadena de string que almacena un mensaje para presentar los intereses, cuotas y periodos de pago del prestamo
    */
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
        mensaje += "Usted pagara una cuota de: " + String.format("%.2f", cuota) + " durante " + n + " periodos mensuales\n ";
        mensaje+= "El total de interes a pagar sera: " +String.format("%.2f",tci)+ " con un interes anual del 5%";
        return mensaje;
    }
    /**
     *Metodo que permite calcular  los valores de la tabla de amortizacion del prestamo tipo Aleman
     * @param capital parametro que trae el capital total del prestamo para calcular la tabla de amortizacion
     * @param anios parametro que trae los años en los que se pagara el prestamo para calcular la tabla de amortizacion
     * @return mensaje Cadena de string que almacena un mensaje para presentar las amortizaciones, intereses y periodos de pago del prestamo
    */
    public String CalcularAleman (double capital , int anios){
        String mensaje="";
        double amortizacion;
        int n = anios*12;
        amortizacion= capital/n;
        double cuota=0;
        double ra= capital;
        double in=0;
        double tci=0;
        for(int i =0 ; i< n ;i++){
            in = ra *0.05; 
            tci= tci  +in;
            cuota= in+ amortizacion;
            ra= ra - amortizacion;        
        }
        mensaje += "Usted pagara una amortizacion de: " + String.format("%.2f", cuota) + " durante " + n + " periodos mensuales\n ";
        mensaje+= "El total de interes a pagar sera: " +String.format("%.2f",tci);
        return mensaje;
    }
    
    /**
     *Metodo que permite calcular  los valores de la tabla de amortizacion del prestamo tipo Americano
     * @param capital parametro que trae el capital total del prestamo para calcular la tabla de amortizacion
     * @param anios parametro que trae los años en los que se pagara el prestamo para calcular la tabla de amortizacion
     * @return mensaje Cadena de string que almacena un mensaje para presentar las cuotass, intereses y periodos de pago del prestamo
    */
     public String CalcularAmericano(double capital , int anios){
        String mensaje="";
        double amortizacion;
        int n = anios;
        double cuota=0;
        cuota= capital*0.05;  
        double ra= capital;
        double in=cuota;
        double tci=0;
        for(int i =0 ; i<= n ;i++){ 
            if(i==n){
            cuota=capital+in;
            amortizacion= capital;
            ra=0;
            }else{
            tci= tci + in;
            amortizacion=0;
            }
        }       
        
        mensaje += "Usted pagara una cuota de: " + String.format("%.2f", cuota) + " durante " + n + " periodos anuales\n ";
        mensaje+= "El total de interes a pagar sera: " +String.format("%.2f",tci);
        return mensaje;
    }
}

