/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import controlador.utilidades.Sesion;
import modelo.Prestamos;
import controlador.utilidades.Utilidades;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 **Clase en donde creamos los metodos necesarios para manejar los datos de prestamos
 * @author Fabricio
 */
public class PrestamosDao extends AdaptadorDao<Prestamos>{
    private Prestamos prestamos;
 //Constructor de la clase PrestamosDao
    public PrestamosDao() {
        super(Prestamos.class);        
    }
    /*Metodo que permite obtener los datos de los prestamos
     * @return prestamo  datos del prestamo
    */  
    public Prestamos getPrestamos() {
        if(prestamos == null)
            prestamos = new Prestamos();
        return prestamos;
    }
    /**
     *Metodo que permite modificar los datos de los prestamos
     * @param prestamos  para definir de que prestamos se modificara
    */  
    public void setPrestamos(Prestamos prestamos) {
        this.prestamos = prestamos;
    }
    
    
    /**
     *Metodo que permite guardar los datos de un prestamo
     * @return verificar si se guardo o no
    */  
    public boolean guardar() {
        boolean verificar = false;
        try {
            String descripcion = "";
            String accion = "";
            getManager().getTransaction().begin();
            if(prestamos.getId() != null) {
                modificar(prestamos);
                descripcion = "Se modifica el prestamo "+prestamos.getId().intValue();
                accion = "Modificar Prestamo";
            } else {
                guardar(prestamos);
                descripcion = "Se registra un nuevo prestamo";
                accion = "Guardar Prestamo";
            }
            getManager().getTransaction().commit();
            verificar = true;
        } catch (Exception e) {
            System.out.println("No se ha podido registrar o modificar" + e);
        }
        return verificar;
    }
     /**
     *Metodo que permite obtener una lista de prestamos enlazados con el id de la Cuenta Bancaria
     * @return lista devuelve la lista con los prestamos correspondientes a la Cuenta Bancaria 
    */  
  public List<Prestamos> listarPrestamos() {
        List<Prestamos> lista = new ArrayList<>();
        try {
            Query q = getManager().createQuery("SELECT p FROM Prestamos p where p.cuentaBancaria.id = :id");
            q.setParameter("id", Sesion.getCuenta().getPersona().getCuentaBancaria().getId());
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return lista;
    }
}
