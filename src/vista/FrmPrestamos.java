/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.servicios.CuentaBancariaServicio;
import controlador.servicios.PagosServicio;
import controlador.servicios.PrestamosServicio;
import controlador.servicios.RolServicio;
import controlador.utilidades.Sesion;
import java.util.Date;
import java.util.UUID;
import javax.swing.JFrame;
import javax.swing.UIManager;
import modelo.Prestamos;
import vista.utilidades.UtilidadesComponente;
import controlador.utilidades.Utilidades;
import controlador.utilidades.Operaciones;
import java.text.DecimalFormat;
import javafx.beans.binding.Bindings;
import javax.persistence.Convert;
import vista.tablas.ModeloTablaPagosFrances;

/**
 *
 * @author Fabricio
 */
public class FrmPrestamos extends javax.swing.JDialog {

    /**
     * Creates new form FrmPrestamos
     * @param parent componente awt
     * @param modal boolean
     */
    public FrmPrestamos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    private PrestamosServicio prs = new PrestamosServicio();
    private PagosServicio pgs = new PagosServicio();
    private CuentaBancariaServicio cbs = new CuentaBancariaServicio();
    private Utilidades ut = new Utilidades();
    private ModeloTablaPagosFrances modelo = new ModeloTablaPagosFrances();
    private Operaciones op = new Operaciones();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbx_tipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_anios = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_calcular = new javax.swing.JTextArea();
        btn_calcular = new javax.swing.JToggleButton();
        btn_solic = new javax.swing.JToggleButton();
        btn_volver = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        cbx_tipo.setFont(new java.awt.Font("MS UI Gothic", 0, 11)); // NOI18N
        cbx_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Americano", "Aleman", "Frances" }));
        cbx_tipo.setBorder(new javax.swing.border.MatteBorder(null));
        cbx_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        jLabel1.setText("Solicitar Prestamo Bancario");

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Escriba un monto a solicitar");

        txt_monto.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_monto.setText("1000.00");
        txt_monto.setBorder(null);
        txt_monto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_montoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_montoFocusLost(evt);
            }
        });
        txt_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_montoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("El monto debe ser entre 1000 y 500000");

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Elija el tipo de prestamo");

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Elija la cantidad de años");

        txt_anios.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_anios.setText("1");
        txt_anios.setBorder(null);
        txt_anios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_aniosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_aniosFocusLost(evt);
            }
        });
        txt_anios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aniosKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("Los años deben ser entre 1 y 10 ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Informacion del prestamo:");

        txt_calcular.setColumns(20);
        txt_calcular.setRows(5);
        jScrollPane2.setViewportView(txt_calcular);

        btn_calcular.setText("CALCULAR");
        btn_calcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        btn_solic.setText("SOLICITAR");
        btn_solic.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_solic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_solicActionPerformed(evt);
            }
        });

        btn_volver.setText("VOLVER");
        btn_volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btn_solic, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_monto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_anios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_anios, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_solic)
                    .addComponent(btn_volver))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(482, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(572, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void limpiar() {
        txt_monto.setText("10000");
        txt_anios.setText("1");
        cbx_tipo.setSelectedIndex(0);
        txt_calcular.setText("Al dar click en calcular, aqui se mostrara informacion segun el tipo de prestamo seleccionado..");
    }

    private void guardarObjetoFrances() {
        cbs.fijarCuentaBancaria(Sesion.getCuenta().getPersona().getCuentaBancaria());
        prs.getPrestamos().setValorPrestamo(Double.parseDouble(txt_monto.getText()));
        prs.getPrestamos().setNumeroCuotas(Integer.parseInt(txt_anios.getText())*12);
        prs.getPrestamos().setSaldoTotal(Double.parseDouble(txt_monto.getText()));
        prs.getPrestamos().setFechaLimite(ut.sumarAnios(new Date(), (Integer.parseInt(txt_anios.getText()))));
        pgs.getPagos().setAnios(Integer.parseInt(txt_anios.getText()));
        prs.getPrestamos().setTipo(cbx_tipo.getSelectedItem().toString());
        prs.getPrestamos().setCuentaBancaria(cbs.getCuentaBancaria());
        prs.getPrestamos().setFechaEmision(new Date());
        double cuota = 0.0;
        double interes;
        int n = ((Integer.parseInt(txt_anios.getText())) * 12);
        interes = ((1 - (Math.pow(1.004074, -n))) / 0.004074);
        cuota = (Double.parseDouble(txt_monto.getText())) / interes;
        double ra = (Double.parseDouble(txt_monto.getText()));
        double ci = 0, tci = 0, ta = 0, ca = 0;
        tci = 0;
        double exp = 0.083;
        double inte = 0.0;
        inte = Math.pow((1 + 0.05), exp) - 1;
        ta = 0;
        Date fecha = new Date();
        prs.guardar();
        for (int i = 0; i < n; i++) {
            if( i == n-1){
            ci = ra * inte;
            cuota= ra;
            tci = tci + ci;
            ca = cuota - ci;
            ta = ta + ca;
            ra=0;
            fecha = ut.sumarMeses(fecha);
            }
            else{ci = ra * inte;
            tci = tci + ci;
            ca = cuota - ci;
            ta = ta + ca;
            ra = (Double.parseDouble(txt_monto.getText())) - ta;
            fecha = ut.sumarMeses(fecha);}
            cbs.fijarCuentaBancaria(Sesion.getCuenta().getPersona().getCuentaBancaria());
            pgs.getPagos().setId((long) (Math.random()));
            pgs.getPagos().setNumeroCuotas(i + 1);
            pgs.getPagos().setInteres(Math.round(ci * 100) / 100d);
            pgs.getPagos().setCuota(Math.round(cuota * 100) / 100d);
            pgs.getPagos().setAmortizacion(Math.round(ta * 100) / 100d);
            pgs.getPagos().setSaldo(Math.round(ra * 100) / 100d);
            pgs.getPagos().setEstado(true);
            pgs.getPagos().setFechaPago(fecha);
            pgs.getPagos().setPrestamos(prs.getPrestamos());

            try {

                pgs.guardar();
            } catch (Exception e) {
                UtilidadesComponente.mensajeError("ERROR", e.getMessage());
            }

        }
        limpiar();
        UtilidadesComponente.mensajeOk("Se ha guardado correctamente", "");
    }

    private void guardarObjetoAleman() {
        cbs.fijarCuentaBancaria(Sesion.getCuenta().getPersona().getCuentaBancaria());
        prs.getPrestamos().setValorPrestamo(Double.parseDouble(txt_monto.getText()));
        prs.getPrestamos().setNumeroCuotas(Integer.parseInt(txt_anios.getText())*12);
        prs.getPrestamos().setSaldoTotal(Double.parseDouble(txt_monto.getText()));
        prs.getPrestamos().setFechaLimite(ut.sumarAnios(new Date(), (Integer.parseInt(txt_anios.getText()))));
        pgs.getPagos().setAnios(Integer.parseInt(txt_anios.getText()));
        prs.getPrestamos().setTipo(cbx_tipo.getSelectedItem().toString());
        prs.getPrestamos().setCuentaBancaria(cbs.getCuentaBancaria());
        prs.getPrestamos().setFechaEmision(new Date());
        double cuota = 0.0;
        int n = ((Integer.parseInt(txt_anios.getText())) * 12);
        double amortizacion;
        amortizacion = Double.parseDouble(txt_monto.getText()) / n;
        double ra = Double.parseDouble(txt_monto.getText());
        double in = 0;
        double tci = 0;
        Date fecha = new Date();
        prs.guardar();
        for (int i = 0; i < n; i++) {
            if(i==n-1){
            ra=0;
            }
            in = ra * 0.05;
            tci = tci + in;
            cuota = in + amortizacion;
            ra = ra - amortizacion;

            fecha = ut.sumarMeses(fecha);
            cbs.fijarCuentaBancaria(Sesion.getCuenta().getPersona().getCuentaBancaria());
            pgs.getPagos().setId((long) (Math.random()));
            pgs.getPagos().setNumeroCuotas(i + 1);
            pgs.getPagos().setInteres(Math.round(in * 100) / 100d);
            pgs.getPagos().setCuota(Math.round(cuota * 100) / 100d);
            pgs.getPagos().setAmortizacion(Math.round(amortizacion * 100) / 100d);
            pgs.getPagos().setSaldo(Math.round(ra * 100) / 100d);
            pgs.getPagos().setEstado(true);
            pgs.getPagos().setFechaPago(fecha);
            pgs.getPagos().setPrestamos(prs.getPrestamos());
            try {

                pgs.guardar();
            } catch (Exception e) {
                UtilidadesComponente.mensajeError("ERROR", e.getMessage());
            }
        }
        limpiar();
        UtilidadesComponente.mensajeOk("Se ha guardado correctamente", "");
    }
    private void guardarObjetoAmericano() {
        cbs.fijarCuentaBancaria(Sesion.getCuenta().getPersona().getCuentaBancaria());
        prs.getPrestamos().setValorPrestamo(Double.parseDouble(txt_monto.getText()));
        prs.getPrestamos().setNumeroCuotas(Integer.parseInt(txt_anios.getText()));
        prs.getPrestamos().setSaldoTotal(Double.parseDouble(txt_monto.getText()));
        prs.getPrestamos().setFechaLimite(ut.sumarAnios(new Date(), (Integer.parseInt(txt_anios.getText()))));
        pgs.getPagos().setAnios(Integer.parseInt(txt_anios.getText()));
        prs.getPrestamos().setTipo(cbx_tipo.getSelectedItem().toString());
        prs.getPrestamos().setCuentaBancaria(cbs.getCuentaBancaria());
        prs.getPrestamos().setFechaEmision(new Date());
        double cuota = 0.0;
        int n = (Integer.parseInt(txt_anios.getText()));
        double amortizacion;
        cuota= Double.parseDouble(txt_monto.getText())*0.05;  
        double ra= Double.parseDouble(txt_monto.getText());
        double in=cuota;
        double tci=0;
        Date fecha = new Date();
        prs.guardar();
        for(int i =0 ; i<= n ;i++){ 
            if(i== n){
            cuota=Double.parseDouble(txt_monto.getText())+in;
            amortizacion= Double.parseDouble(txt_monto.getText());
            ra=0;
            }else{
            tci= tci + in;
            amortizacion=0;
            }
            fecha = ut.sumarAnios(fecha , 1);
            cbs.fijarCuentaBancaria(Sesion.getCuenta().getPersona().getCuentaBancaria());
            pgs.getPagos().setId((long) (Math.random()));
            pgs.getPagos().setNumeroCuotas(i + 1);
            pgs.getPagos().setInteres(Math.round(in * 100) / 100d);
            pgs.getPagos().setCuota(Math.round(cuota * 100) / 100d);
            pgs.getPagos().setAmortizacion(Math.round(amortizacion * 100) / 100d);
            pgs.getPagos().setSaldo(Math.round(ra * 100) / 100d);
            pgs.getPagos().setEstado(true);
            pgs.getPagos().setFechaPago(fecha);
            pgs.getPagos().setPrestamos(prs.getPrestamos());
            try {
                pgs.guardar();
            } catch (Exception e) {
                UtilidadesComponente.mensajeError("ERROR", e.getMessage());
            }
        } 
        limpiar();
        UtilidadesComponente.mensajeOk("Se ha guardado correctamente", "");
    }


    private void cbx_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipoActionPerformed

    }//GEN-LAST:event_cbx_tipoActionPerformed

    private void txt_montoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_montoFocusGained
        txt_monto.setToolTipText("El monto debe ser un numero decimal");
    }//GEN-LAST:event_txt_montoFocusGained

    private void txt_montoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_montoFocusLost
        if ((Double.parseDouble(txt_monto.getText()) > 500000.00) || (Double.parseDouble(txt_monto.getText()) < 1000.00)) {
            UtilidadesComponente.mensajeError("Error", "Ingrese una cantidad valida ");
        }
    }//GEN-LAST:event_txt_montoFocusLost

    private void txt_montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_montoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_montoKeyTyped

    private void txt_aniosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_aniosFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aniosFocusGained

    private void txt_aniosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_aniosFocusLost
        if ((Integer.parseInt(txt_anios.getText()) > 10) || (Integer.parseInt(txt_anios.getText()) < 1)) {
            UtilidadesComponente.mensajeError("Error", "Ingrese una cantidad valida ");
        } else {
        }
    }//GEN-LAST:event_txt_aniosFocusLost

    private void txt_aniosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aniosKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_aniosKeyTyped

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new FrmPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_solicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_solicActionPerformed
       if (cbx_tipo.getSelectedIndex()==0) {
            guardarObjetoAmericano();
        }if (cbx_tipo.getSelectedItem().toString().toLowerCase().equals("frances")) {
            guardarObjetoFrances();
        } else if(cbx_tipo.getSelectedItem().toString().toLowerCase().equals("aleman")){
            guardarObjetoAleman();
        }
    }//GEN-LAST:event_btn_solicActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        if (cbx_tipo.getSelectedIndex()==0) {
            txt_calcular.setText(op.CalcularAmericano(Double.parseDouble(txt_monto.getText()), Integer.parseInt(txt_anios.getText())));
        } if (cbx_tipo.getSelectedItem().toString().toLowerCase().equals("frances")) {
            txt_calcular.setText(op.CalcularFrances(Double.parseDouble(txt_monto.getText()), Integer.parseInt(txt_anios.getText())));
        } else if(cbx_tipo.getSelectedItem().toString().toLowerCase().equals("aleman")){
            txt_calcular.setText(op.CalcularAleman(Double.parseDouble(txt_monto.getText()), Integer.parseInt(txt_anios.getText())));
        }
    }//GEN-LAST:event_btn_calcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            // start application
            ;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPrestamos dialog = new FrmPrestamos(new javax.swing.JFrame(), true);
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
    private javax.swing.JToggleButton btn_calcular;
    private javax.swing.JToggleButton btn_solic;
    private javax.swing.JToggleButton btn_volver;
    private javax.swing.JComboBox<String> cbx_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txt_anios;
    private javax.swing.JTextArea txt_calcular;
    private javax.swing.JTextField txt_monto;
    // End of variables declaration//GEN-END:variables
}
