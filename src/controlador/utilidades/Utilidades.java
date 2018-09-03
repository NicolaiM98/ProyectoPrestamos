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
 * Clase de utilidades para cambiar ciertos valores a fechas tipo Date de java.util
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */

    public class Utilidades extends StringUtils{
      
    /**
     *Metodo que permite sumar años a una fecha tipo Date de java.util
     * @param fecha parametro que trae la fecha a la cual se le sumara los años
     * @param anios parametro que trae los años los cuales se le sumaran a la fecha
     * @return devuelve la fecha con los años sumados
    */    
    public static Date sumarAnios( Date fecha , int anios){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR, anios);
        return calendar.getTime();
    }
     /**
     *Metodo que permite sumar 1 mes a una fecha tipo Date de java.util
     * @param fecha parametro que trae la fecha a la cual se le sumara 1 mes
     * @return devuelve la fecha con el mes sumado
    */    
    public Date sumarMeses( Date fecha ){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 1);
        return calendar.getTime();
    }
}

