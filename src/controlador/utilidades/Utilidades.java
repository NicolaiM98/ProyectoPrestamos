/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utilidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Fabricio
 */

    public class Utilidades extends StringUtils{
      
   public static String formatearFecha(Date fecha){
       String fechaSalida = "";
       try{
           SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");
           fechaSalida = formato.format(fecha);
       }catch(Exception e){}
       
       return fechaSalida;
   } 
    public Date sumarAnios( Date fecha , int anios){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, anios);
        return calendar.getTime();
    }
    public Date sumarMeses( Date fecha ){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 1);
        return calendar.getTime();
    }
}

