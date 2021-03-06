/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.servicios.PersonaServicio;
import controlador.utilidades.Utilidades;
import vista.tablas.ModeloTablaPersonas;
import vista.utilidades.UtilidadesComponente;



/**
 *
 * @author Fabricio
 */
public class FrmPersonas extends javax.swing.JDialog {

    /**
     * Creates new form FrmPersonas
     */
    public FrmPersonas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarTabla();
    }
    private ModeloTablaPersonas modelo = new ModeloTablaPersonas();
    private PersonaServicio ps = new PersonaServicio();
    
    private void cargarTabla(){
        modelo.setLista(ps.todos());
        tbl_tabla.setModel(modelo);
        tbl_tabla.updateUI();
    }
    private void limpiar() {
        txt_apellidos.setText("");
        txt_buscar.setText("");
        txt_cedula.setText("");
        txt_email.setText("");
        txt_telefono.setText("");
        txt_nombre.setText("");
        cargarTabla();
    } 
    private void cargarObjeto() {
        ps.getPersona().setApellido(txt_apellidos.getText());
        ps.getPersona().setNombre(txt_nombre.getText());
        ps.getPersona().setCedula(txt_cedula.getText());
        ps.getPersona().setCorreo(txt_email.getText());
        ps.getPersona().setTelefono(txt_telefono.getText());}
    
     private void cargarVista() {
        int fila = tbl_tabla.getSelectedRow();
        if (fila >= 0) {
            ps.fijarPersona(modelo.getLista().get(fila));
            txt_apellidos.setText(ps.getPersona().getApellido());
            txt_nombre.setText(ps.getPersona().getNombre());
            txt_cedula.setText(ps.getPersona().getCedula());
            txt_cedula.setEditable(false);
            txt_email.setText(ps.getPersona().getCorreo());
            txt_telefono.setText(ps.getPersona().getTelefono());
   
        } else {
            UtilidadesComponente.mensajeError("Error", "Escoja un dato de la tabla");
        }
    }
     private void buscar(){
            modelo.setLista(ps.listarSinAdministradorLike(txt_buscar.getText()));
            tbl_tabla.setModel(modelo);
            tbl_tabla.updateUI();
    }
     
     private void guardar() {
        String mensaje = "Se requiere este dato";
        if (!UtilidadesComponente.mostrarError(txt_cedula, mensaje, 'r')
                && !UtilidadesComponente.mostrarError(txt_apellidos, mensaje, 'r')
                && !UtilidadesComponente.mostrarError(txt_nombre, mensaje, 'r')
                && !UtilidadesComponente.mostrarError(txt_email, mensaje, 'r')
                && !UtilidadesComponente.mostrarError(txt_telefono, mensaje, 'r')) {
            cargarObjeto();
            if (ps.getPersona().getId() != null) {
                //modificar
                if (ps.guardar()) {
                    UtilidadesComponente.mensajeOk("OK", "Se ha modificado correctamente");
                    limpiar();
                } else {
                    UtilidadesComponente.mensajeError("Error", "No se pudo modificar");
                }
            } else {
                //guardar
                if (UtilidadesComponente.validarCedula(txt_cedula.getText())) {
                    if (ps.getPersonaCedula(txt_cedula.getText()) != null) {
                        UtilidadesComponente.mensajeError("Error de cedula", "Cedula ya registrada");
                    } else {
                        //guardar
                        if (ps.guardar()) {
                            UtilidadesComponente.mensajeOk("OK", "Se ha registrado correctamente");
                            limpiar();
                        } else {
                            UtilidadesComponente.mensajeError("Error", "No se pudo guardar");
                        }
                    }
                } else {
                    UtilidadesComponente.mensajeError("Error de cedula", "Cedula no valida");
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tabla = new javax.swing.JTable();
        btn_modificar = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JToggleButton();
        btn_nuevo = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRO PERSONAS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 10, 210, 22);

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
        jScrollPane1.setViewportView(tbl_tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 550, 140);

        btn_modificar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar);
        btn_modificar.setBounds(450, 220, 103, 25);

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton2.setText("VOLVER");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(300, 450, 90, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 260, 120, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Correo Electronico");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 310, 160, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cedula");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 360, 120, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellidos");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 260, 120, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 310, 120, 14);

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(40, 280, 220, 23);

        txt_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_email);
        txt_email.setBounds(40, 330, 220, 20);

        txt_cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cedula);
        txt_cedula.setBounds(40, 380, 220, 20);

        txt_apellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_apellidos);
        txt_apellidos.setBounds(320, 280, 220, 23);

        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_telefono);
        txt_telefono.setBounds(320, 330, 220, 23);

        txt_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txt_buscar);
        txt_buscar.setBounds(20, 220, 200, 23);

        btn_guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(160, 450, 95, 25);

        btn_nuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_nuevo.setText("NUEVO");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevo);
        btn_nuevo.setBounds(360, 220, 77, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Buscar:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 190, 80, 17);

        btn_buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar);
        btn_buscar.setBounds(250, 220, 100, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/asd.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 630);

        setBounds(0, 0, 614, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        cargarVista();
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
      buscar();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tbl_tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tablaMouseClicked
       if (evt.getClickCount() >=2) {
       Object dato = modelo.getValueAt(tbl_tabla.getSelectedRow(), 6);
       ps.cambiarEstado(dato.toString());
       
       }
    }//GEN-LAST:event_tbl_tablaMouseClicked

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new FrmPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPersonas dialog = new FrmPersonas(new javax.swing.JFrame(), true);
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
    private javax.swing.JToggleButton btn_buscar;
    private javax.swing.JToggleButton btn_guardar;
    private javax.swing.JToggleButton btn_modificar;
    private javax.swing.JToggleButton btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable tbl_tabla;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
