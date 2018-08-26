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
import modelo.Prestamos;

/**
 *
 * @author usu
 */
public class ModeloTablaPrestamos extends AbstractTableModel {
    @Getter
    @Setter
    private List<Prestamos> lista = new ArrayList<>();

    @Override
    public int getColumnCount() {
        return 5;
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Prestamos p = lista.get(rowIndex);
        switch(columnIndex) {
            case 0: return p.getNumeroCuotas();
            case 1: return p.getFechaEmision();
            case 2: return p.getFechaLimite();
            case 3: return p.getSaldoPendiente();
            case 4: return p.getSaldoTotal();
            case 5: return p.getTipo();
            default: return null; 
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Numero de Cuotas";
            case 1: return "Fecha de emision";
            case 2: return "Fecha limite";
            case 3: return "Saldo Pendiente";
            case 4: return "Saldo Total";
            case 5: return "Tipo";
            default: return null; 
        }
    }
    }
    

