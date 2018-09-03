/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 */
package vista.utilidades;

import controlador.utilidades.Utilidades;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.regex.Pattern;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import java.util.regex.Matcher;
/**
 * Utilidades para validar campos en las vistas del proyecto
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class UtilidadesComponente {
    /**
     * Metodo que permite validar si un campo tipo JComponent se encuentra vacio, ademas muestra un mensaje de error si el campo se encuentra vacio
     * @param componente  es el jComponent q necesita ser validado
     * @param mensaje  cadena de String q mu8estra el mensaje de error 
     * @param tipo secuencia de caracteres q sera comparada 
     * @return retorna un boolean que en caso de q el campo este vacio es true y caso de que tenga algun caracter es false
    */    
    public static boolean mostrarError(JComponent componente, String mensaje, char tipo) {
        boolean band = true;
        switch (tipo) {
            case 'r':
                if (componente instanceof JTextComponent) {
                    JTextComponent txt = (JTextComponent) componente;
                    if (Utilidades.isEmpty(txt.getText())) {
                        componente.setBackground(Color.red);
                        componente.setToolTipText(mensaje);
                    } else {
                        componente.setBackground(Color.white);
                        componente.setToolTipText(null);
                        band = false;
                    }
                }
                
        }
        return band;
    }
     /**
     *Metodo que permite mostrar un mensaje de error
     * @param mensaje parametro que permite definir el mensaje por el cual ocurrio el error
     * @param titulo  parametro que permite definir el titulo de la ventana pop out de error 
    */    
    public static void mensajeError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }
    /**
     *Metodo que permite mostrar un mensaje de verificacion para indicar que la accion fue concretada correctamente
     * @param mensaje parametro que permite definir el mensaje de la accion que se concreto
     * @param titulo  parametro que permite definir el titulo de la ventana pop out de la accion que se concreto correctamente
    */
    public static void mensajeOk(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     *Metodo que permite validar la estructura de un correo electronico
     * @param email  parametro que trae el email que se verificara a continuacion
    */
    public static void validarEmail(String email){
    Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
            
        } else {
           mensajeError("Error","El email ingresado es incorrecto"); 
        }
    }
    /**
     *Metodo que permite validar un numero de cedula Ecuatoriana
     * @param cedula  parametro que trae la cedula que a continuacion se validara
     * @return  retorna un boolean que si esta en true significa que la cedula es correcta y si esta en false que la cedula es incorrecta
    */
    public static boolean validarCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) 
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {

                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            mensajeError("Error","Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            mensajeError("Error","La cedula ingresada es incorrecta");
        }
        return cedulaCorrecta;
    }
}
