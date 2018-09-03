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
 *Clase que nos sirve de pasamanos del controlador y el dao de prestamos para utilizar los metodos
 * @author Fabricio Carrion y Nicolai Mogrovejo
 */
public class PrestamosServicio {
    //objeto de tipo PrestamosDao con el que nos permitira invocar los metodos
    private PrestamosDao obj = new PrestamosDao();
    
    /**
     *servicio que permite obtener los datos de prestamos
     * @return el objeto prestamos
    */  
    public Prestamos getPrestamos() {
        return obj.getPrestamos();
    }
         /**
     *Servicio que permite guardar los prestamos
     * @return objeto guardado
    */  
    public boolean guardar() {
        return obj.guardar();
    }
         /**
     *Servicio que permite listar Prestamos
     * @return objeto listado
    */  
    public List<Prestamos> todos() {
        return obj.listar();
    }
         /**
     *servicio que permite obtener el id de cada prestamo
     * @param id para poder identificar de quien es el prestamo
     * @return objeto con el id del prestamo
    */  
    public Prestamos obtener(Long id) {
        return obj.obtener(id);
    }
         /**
     *Servicio que permite fijar la instancia de los prestamos a un usuario
     * @param prestamos para definir el prestamo que se fijara en el usuario
    */  
    public void fijarPrestamos(Prestamos prestamos) {
        obj.setPrestamos(prestamos);
    }
         /**
     *Servicio que permite listar prestamos
     * @return el objeto con la lista de los prestamos
    */  
   public List<Prestamos> listarPrestamos() {
        return obj.listarPrestamos();
   }
}
