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
//    public  void CalcularPagosFrances(double capital , int anios ){
//      double cuota = 0.0;
//        double interes;
//        int n = (anios * 12);
//        interes=((1-(Math.pow(1.004074, -n)))/0.004074);
//        cuota= capital/interes;
//        double ra= capital;
//        double ci=0,  tci=0 , ta=0 , ca=0;
//        tci=0;
//        double exp = 0.083;
//        double inte =0.0;
//                inte=Math.pow((1+0.05),exp)-1;
//        ta=0;
//        for(int i =0 ; i< n ;i++){
//                ci=ra*inte;
//                tci=tci+ci;
//                ca=cuota-ci;
//                ta=ta+ca;
//                ra=capital-ta;
//                
////                Pago     Cuota     C.Interés     C.Amortiz.     Tot.Amortiz.     Resto");"
////                + "\" \"+(indice+1)+\"      \"+presenta(cuota)+\"      \"+presenta(ci)+\"      \"+presenta(ca)+\"      \"+presenta(ta)+\"      \"+presenta(ra));
//        }
//    }
}

