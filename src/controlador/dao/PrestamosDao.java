/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import modelo.Prestamos;
import controlador.utilidades.Utilidades;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Fabricio
 */
public class PrestamosDao extends AdaptadorDao<Prestamos>{
    private Prestamos prestamos;

    public PrestamosDao() {
        super(Prestamos.class);        
    }

    public Prestamos getPrestamos() {
        if(prestamos == null)
            prestamos = new Prestamos();
        return prestamos;
    }

    public void setPrestamos(Prestamos prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
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
    
    
    public List<Prestamos> listarLikePrestamos(String texto) {
        List<Prestamos> lista = new ArrayList<>();
        try {
            Query q = getManager().createQuery("SELECT p FROM Prestamos p where "                    
                    + "(lower(p.persona.apellidos) LIKE CONCAT('%', :texto, '%'))"
                    + " or (lower(p.codigo) LIKE CONCAT('%', :texto1, '%'))");
            q.setParameter("texto", texto);            
            q.setParameter("texto1", texto);
            lista = q.getResultList();
        } catch (Exception e) {
            System.out.println("error "+e);
        }
        return lista;
    }

}
