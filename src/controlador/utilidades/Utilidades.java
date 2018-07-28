/*
clase por defecto que permite hacer validaciones
 */
package controlador.utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Programacion I 2B
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
}
