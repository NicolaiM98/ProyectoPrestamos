    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicios;

import controlador.dao.PrestamosDao;
import java.util.List;
import modelo.Prestamos;

/**
 *
 * @author Fabricio
 */
public class PrestamosServicio {
    private PrestamosDao obj = new PrestamosDao();
    public Prestamos getPrestamos() {
        return obj.getPrestamos();
    }
    
    public boolean guardar() {
        return obj.guardar();
    }
    
    public List<Prestamos> todos() {
        return obj.listar();
    }
    
    public Prestamos obtener(Long id) {
        return obj.obtener(id);
    }
    
    public void fijarPrestamos(Prestamos prestamos) {
        obj.setPrestamos(prestamos);
    }
   public List<Prestamos> listarPrestamos() {
        return obj.listarPrestamos();
   }
    public List<Prestamos> listarLikePrestamos(String texto) {
        return obj.listarLikePrestamos(texto);
    }
}
