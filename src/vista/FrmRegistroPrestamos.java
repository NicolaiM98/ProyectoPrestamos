/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.servicios.CuentaBancariaServicio;
import controlador.servicios.CuentaServicio;
import controlador.servicios.PagosServicio;
import controlador.servicios.PersonaServicio;
import controlador.servicios.PrestamosServicio;
import controlador.utilidades.Sesion;
import javax.swing.JFrame;
import javax.swing.UIManager;
import vista.tablas.ModeloTablaPagosAleman;
import vista.tablas.ModeloTablaPagosAmericano;
import vista.tablas.ModeloTablaPagosFrances;
import vista.tablas.ModeloTablaPrestamos;
import vista.utilidades.UtilidadesComponente;

/**
 *
 * @author Fabricio
 */
public class FrmRegistroPrestamos extends javax.swing.JDialog {

    /**
     * Creates new form FrmCuentaBancaria
     * @param parent componente awt
     * @param modal boolean
     */
    public FrmRegistroPrestamos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        cargarTablaPrestamos();
        btn_prestamos.setVisible(false);
        
    }
    private PersonaServicio ps = new PersonaServicio();
    private CuentaServicio cs = new CuentaServicio();
    private CuentaBancariaServicio cbs = new CuentaBancariaServicio();
    private PrestamosServicio prs = new PrestamosServicio();
    private PagosServicio pgs = new PagosServicio();
    private ModeloTablaPrestamos modelopr = new ModeloTablaPrestamos();
    private ModeloTablaPagosAmericano modelopa = new ModeloTablaPagosAmericano();
    private ModeloTablaPagosAleman modelopal = new ModeloTablaPagosAleman();
    private ModeloTablaPagosFrances modelofr = new ModeloTablaPagosFrances();
    private boolean bandera = true;
    private Object tipo = null;
    
     private void cargarTablaPrestamos(){
     //ps.fijarPrestamos((Prestamos) Sesion.getCuenta().getPersona().getCuentaBancaria().getListaPrestamos());
        modelopr.setLista(prs.listarPrestamos());
        tbl_tabla.setModel(modelopr);
        tbl_tabla.updateUI();
    }
     private void cargarTablaPagos( String dato , String tipo){ 
         
      if(tipo.trim().toLowerCase().equals("americano")){
        modelopa.setLista(pgs.listarPagos(dato));
        tbl_tabla.setModel(modelopa);
        tbl_tabla.updateUI();}
      if(tipo.toLowerCase().equals("frances")){
        modelofr.setLista(pgs.listarPagos(dato));
        tbl_tabla.setModel(modelofr);
        tbl_tabla.updateUI();}
     else if(tipo.toLowerCase().equals("aleman")){
        modelopal.setLista(pgs.listarPagos(dato));
        tbl_tabla.setModel(modelopal);
        tbl_tabla.updateUI();}
     }
     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_tabla = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btn_prestamos = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("REGISTRO DE PRESTAMOS");

        tbl_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_tabla);

        btn_prestamos.setText("VER PRESTAMO");
        btn_prestamos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamosActionPerformed(evt);
            }
        });

        jToggleButton1.setText("VOLVER");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btn_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(633, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tablaMouseClicked
        if (evt.getClickCount() >=2 && bandera==true) {
            bandera = false;
            Object dato = modelopr.getValueAt(tbl_tabla.getSelectedRow(), 5);
            tipo = modelopr.getValueAt(tbl_tabla.getSelectedRow(), 4);
            cargarTablaPagos(dato.toString(), tipo.toString());
            btn_prestamos.setVisible(true);
        }
        else if(evt.getClickCount() >=2 && bandera==false)   
        {  
            if(tipo.toString().trim().toLowerCase().equals("americano")){
            Object datoIdPagoamr = modelopa.getValueAt(tbl_tabla.getSelectedRow(), 6);
            pgs.realizarPago(datoIdPagoamr.toString());
                UtilidadesComponente.mensajeOk("Pago Realizado", "Su pago se ah realizado correctamente");
            }
            if(tipo.toString().toLowerCase().equals("frances")){
             Object datoIdPagofr = modelofr.getValueAt(tbl_tabla.getSelectedRow(), 6);
            pgs.realizarPago(datoIdPagofr.toString());
            UtilidadesComponente.mensajeOk("Pago Realizado", "Su pago se ah realizado correctamente");
            }
            else if(tipo.toString().toLowerCase().equals("aleman")){
            Object datoIdPagoal = modelopal.getValueAt(tbl_tabla.getSelectedRow(), 6);
            pgs.realizarPago(datoIdPagoal.toString());
            UtilidadesComponente.mensajeOk("Pago Realizado", "Su pago se ah realizado correctamente");
            }
        }
    }//GEN-LAST:event_tbl_tablaMouseClicked

    private void btn_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamosActionPerformed
      bandera= true;
      btn_prestamos.setVisible(false);
      Object dato = modelopr.getValueAt(tbl_tabla.getSelectedRow(), 5);
      tipo = modelopr.getValueAt(tbl_tabla.getSelectedRow(), 4);
      cargarTablaPagos(dato.toString(), tipo.toString());
    }//GEN-LAST:event_btn_prestamosActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       new FrmPrincipal().setVisible(true);
       dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            // start application
           ;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistroPrestamos dialog = new FrmRegistroPrestamos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_prestamos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tbl_tabla;
    // End of variables declaration//GEN-END:variables
}
