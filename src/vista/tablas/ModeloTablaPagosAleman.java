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
import modelo.Pagos;

/**
 *
 * @author Fabricio
 */
public class ModeloTablaPagosAleman extends AbstractTableModel{
     @Getter
    @Setter
    private List<Pagos> lista = new ArrayList<>();

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
        Pagos p = lista.get(rowIndex);
        switch(columnIndex) {
            case 0: 
                for(int i=1;i<=p.getNumeroCuotas();i++){
                return i;
                }   
            case 1: return p.getInteres();
            case 2: return p.getCuota();
            case 3: return p.getPago();
            case 4: return p.getAmortizacion();
            case 5: return p.getSaldo();
            default: return null; 
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "Numero de Periodos";            
            case 1: return "Interes";
            case 2: return "Cuota";            
            case 3: return "Pago";
            case 4: return "Amortizacion";
            case 5: return "Saldo Pendiente";
            default: return null; 
        }
    }
}
