/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.tablas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import lombok.Getter;
import lombok.Setter;
import modelo.Persona;

/**
 *
 * @author sissysebas
 */
public class ModeloTablaPersonas extends AbstractTableModel {
    @Getter
    @Setter
    private List<Persona> lista = new ArrayList<>();

    @Override
    public int getColumnCount() {
        return 6;
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = lista.get(rowIndex);
        switch(columnIndex) {
            case 0: return p.getNombre();
            case 1: return p.getApellido();
            case 2: return p.getCorreo();
            case 3: return p.getTelefono();
            case 4: return p.getRol().getNombre();
            case 5: if(p.getEstado()== false){
            return "No Habilitada";
            }
            else{
            return "Habilitada";
            }
            case 6: return p.getId();
            default: return null; 
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Nombres";
            case 1: return "Apellidos";
            case 2: return "Email";
            case 3: return "Telefono";
            case 4: return "Rol";
            case 5: return "Estado";
            default: return null; 
        }
        
    }
    
    
    
    
}











