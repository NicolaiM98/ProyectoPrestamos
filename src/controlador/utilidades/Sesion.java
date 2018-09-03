/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utilidades;

import modelo.Cuenta;

/**
 * Clase que nos permite obtener la cuenta de un usuario para fijar instancias de los objetos
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class Sesion {
    private static Cuenta cuenta;
/**
     *Metodo que permite obtener la cuenta de un usuario
     * @return devuelve la cuenta del usuario
    */    
    public static Cuenta getCuenta() {
        return cuenta;
    }
/**
     *Metodo que permite modificar datos de la cuenta del usuario
     * @param cuenta parametro que trae los datos de la cuenta
    */    
    public static void setCuenta(Cuenta cuenta) {
        Sesion.cuenta = cuenta;
    }
}
