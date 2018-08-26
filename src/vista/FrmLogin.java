/*
 * To change thps license header, choose License Headers in Project Properties.
 * To change thps template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.servicios.CuentaBancariaServicio;
import controlador.servicios.CuentaServicio;
import controlador.servicios.PersonaServicio;
import controlador.utilidades.Sesion;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.UUID;
import javax.swing.JFrame;
import javax.swing.UIManager;
import vista.FrmPrincipal;
import vista.utilidades.UtilidadesComponente;
import controlador.servicios.RolServicio;
import modelo.Rol;
/**
 *
 * @author Fabricio
 */
public class FrmLogin extends javax.swing.JDialog {

    private PersonaServicio ps = new PersonaServicio();
    private CuentaServicio cs = new CuentaServicio();
    private CuentaBancariaServicio cbs = new CuentaBancariaServicio();
    private RolServicio rs= new RolServicio();
    /**
     * Creates new form FrmLogin
     */
    public FrmLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Thps method ps called from within the constructor to initialize the form.
     * WARNING: Do NOT modify thps code. The content of thps method ps always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        tbn_cancel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_regApell = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_regNom = new javax.swing.JTextField();
        txt_regEmail = new javax.swing.JTextField();
        txt_regCed = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_regTelef = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_regUsuario = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txt_regClave = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("INICIO DE SESION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 30, 170, 35);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(27, 27, 80, 20);

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 90, 14);

        txt_usuario.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jPanel1.add(txt_usuario);
        txt_usuario.setBounds(170, 30, 115, 15);

        txt_pass.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
        });
        jPanel1.add(txt_pass);
        txt_pass.setBounds(170, 80, 115, 15);

        btn_login.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(0, 102, 204));
        btn_login.setText("Aceptar");
        btn_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login);
        btn_login.setBounds(45, 151, 60, 30);

        tbn_cancel.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        tbn_cancel.setForeground(new java.awt.Color(0, 102, 153));
        tbn_cancel.setText("Cancelar");
        tbn_cancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tbn_cancel);
        tbn_cancel.setBounds(190, 150, 70, 30);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(30, 132, 260, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 90, 330, 210);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("Nombres");

        txt_regApell.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_regApell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_regApell.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_regApellFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regApellFocusLost(evt);
            }
        });
        txt_regApell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regApellActionPerformed(evt);
            }
        });
        txt_regApell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regApellKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Apellidos");

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("N° de cédula");

        txt_regNom.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_regNom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_regNom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_regNomFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regNomFocusLost(evt);
            }
        });
        txt_regNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regNomActionPerformed(evt);
            }
        });
        txt_regNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regNomKeyTyped(evt);
            }
        });

        txt_regEmail.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_regEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_regEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_regEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regEmailFocusLost(evt);
            }
        });
        txt_regEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regEmailActionPerformed(evt);
            }
        });

        txt_regCed.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_regCed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_regCed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_regCedFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regCedFocusLost(evt);
            }
        });
        txt_regCed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regCedKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 153));
        jLabel8.setText("Telefono");

        txt_regTelef.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_regTelef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_regTelef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_regTelefFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regTelefFocusLost(evt);
            }
        });
        txt_regTelef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regTelefActionPerformed(evt);
            }
        });
        txt_regTelef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regTelefKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Nombre de Usuario");

        txt_regUsuario.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        txt_regUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_regUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_regUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regUsuarioFocusLost(evt);
            }
        });
        txt_regUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regUsuarioActionPerformed(evt);
            }
        });

        btn_registrar.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 102, 153));
        btn_registrar.setText("Crear");
        btn_registrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(0, 102, 153));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("MS UI Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 153));
        jLabel11.setText("Contraseña");

        txt_regClave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_regClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_regClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_regClaveFocusLost(evt);
            }
        });
        txt_regClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regClaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addComponent(txt_regUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_regNom)
                            .addComponent(txt_regCed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_regEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_regApell)
                            .addComponent(txt_regTelef)
                            .addComponent(txt_regClave))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_regUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_regClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_regNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_regApell, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_regCed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_regTelef, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_limpiar))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(370, 90, 340, 350);

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("CREAR UNA CUENTA");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 30, 190, 35);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(20, 62, 310, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(380, 60, 320, 10);

        setSize(new java.awt.Dimension(737, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_regApellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regApellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regApellActionPerformed

    private void txt_regTelefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regTelefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regTelefActionPerformed

    private void txt_regNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regNomActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        inicioSesion();

    }//GEN-LAST:event_btn_loginActionPerformed
    private void cargarObjeto() {
        rs.crearRoles();
        ps.getPersona().setApellido(txt_regApell.getText());
        ps.getPersona().setNombre(txt_regNom.getText());
        ps.getPersona().setCedula(txt_regCed.getText());
        ps.getPersona().setCorreo(txt_regEmail.getText());
        ps.getPersona().setTelefono(txt_regTelef.getText());
        ps.getPersona().setExternalId(UUID.randomUUID().toString());
        cs.getCuenta().setUsuario(txt_regUsuario.getText());
        cs.getCuenta().setClave(txt_regClave.getText());
        cs.getCuenta().setCreatedAt(new Date());
        cs.getCuenta().setPersona(ps.getPersona());
        ps.getPersona().setRol(new RolServicio().buscarRolNombre("Usuario"));
        cbs.getCuentaBancaria().setNumerodeCuenta( UUID.randomUUID().toString().replaceAll("[^0-9]", ""));
        cbs.getCuentaBancaria().setPersona(ps.getPersona());
    }

    private void guardar() {
        String mensaje = "Se requiere este campo";
        if (!UtilidadesComponente.mostrarError(txt_regUsuario, "Falta este dato", 'r')
                && !UtilidadesComponente.mostrarError(txt_regNom, "Falta este dato", 'r')
                && !UtilidadesComponente.mostrarError(txt_regApell, "Falta este dato", 'r')
                && !UtilidadesComponente.mostrarError(txt_regEmail, "Falta este dato", 'r')
                && !UtilidadesComponente.mostrarError(txt_regCed, "Falta este dato", 'r')
                && !UtilidadesComponente.mostrarError(txt_regTelef, "Falta este dato", 'r')
                && !UtilidadesComponente.mostrarError(txt_regClave, "Falta este dato", 'r')) {
                cargarObjeto();
            if (ps.getPersona().getId() != null && 
                    (ps.getPersona().getCorreo().toLowerCase().contentEquals(txt_regEmail.getText().toLowerCase()))) {
                if (ps.guardar()&& cs.guardar()&& cbs.guardar()) {
                    UtilidadesComponente.mensajeOk("Se ha guardado correctamente", "");
                    limpiar();
                } else {
                    UtilidadesComponente.mensajeError("Error", "No se pudo guardar");
                }
            } else {
                if (ps.guardar()&& cs.guardar()&& cbs.guardar()) {
                    UtilidadesComponente.mensajeOk("OK", "Se ha modificado correctamente");
                    limpiar();
                } else {
                    UtilidadesComponente.mensajeError("Error", "No se pudo modificar");
                }
            }
        }
    }

    private void limpiar() {
        txt_regApell.setText(null);
        txt_regNom.setText(null);
        txt_regCed.setText(null);;
        txt_regEmail.setText(null);
        txt_regTelef.setText(null);
        txt_regUsuario.setText(null);
        txt_regClave.setText(null);
    }

    private void inicioSesion() {
        if (!UtilidadesComponente.mostrarError(txt_usuario, "Falta este campo", 'r')
                && !UtilidadesComponente.mostrarError(txt_pass, "Falta este campo", 'r')) {
            Sesion.setCuenta(new CuentaServicio().inicioSesion(txt_usuario.getText(),
                    new String(txt_pass.getPassword())));
            if (Sesion.getCuenta() != null) {
                new FrmPrincipal().setVisible(true);
                dispose();
            } else {
                UtilidadesComponente
                        .mensajeError("Error de acceso", "Hubo un error con sus credenciales");
            }
        }
    }
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        guardar();
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_regUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regUsuarioFocusGained
        txt_regUsuario.setToolTipText("Ingrese su nombre de usuario");
    }//GEN-LAST:event_txt_regUsuarioFocusGained

    private void txt_regCedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regCedFocusGained
        txt_regCed.setToolTipText("Ingrese su numero de cédula que no exeda los 10 digitos");        
    }//GEN-LAST:event_txt_regCedFocusGained

    private void txt_regCedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regCedFocusLost
        UtilidadesComponente.validarCedula(txt_regCed.getText());        
    }//GEN-LAST:event_txt_regCedFocusLost

    private void txt_regCedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regCedKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_regCedKeyTyped

    private void txt_regUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regUsuarioFocusLost
       
    }//GEN-LAST:event_txt_regUsuarioFocusLost

    private void txt_regNomFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regNomFocusGained
        txt_regNom.setToolTipText("Ingrese su Nombre");

    }//GEN-LAST:event_txt_regNomFocusGained

    private void txt_regNomFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regNomFocusLost
        if (txt_regNom.getText().trim().length() > 40) {
            UtilidadesComponente.mensajeError("Error", "El nombre contiene demasiados caracteres");
        }
    }//GEN-LAST:event_txt_regNomFocusLost

    private void txt_regNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regNomKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_regNomKeyTyped

    private void txt_regApellFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regApellFocusGained
        txt_regApell.setToolTipText("Ingrese su Apellido");
    }//GEN-LAST:event_txt_regApellFocusGained

    private void txt_regApellFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regApellFocusLost
        if (txt_regApell.getText().trim().length() > 40) {
            UtilidadesComponente.mensajeError("Error", "El apellido contiene demasiados caracteres");
        }
    }//GEN-LAST:event_txt_regApellFocusLost

    private void txt_regApellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regApellKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_regApellKeyTyped

    private void txt_regEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regEmailFocusGained
        txt_regEmail.setToolTipText("Ej:sistemaprestamos@ejemplo.com");
    }//GEN-LAST:event_txt_regEmailFocusGained

    private void txt_regEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regEmailFocusLost
        UtilidadesComponente.validarEmail(txt_regEmail.getText());
    }//GEN-LAST:event_txt_regEmailFocusLost

    private void txt_regTelefFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regTelefFocusGained
        txt_regTelef.setToolTipText("En caso de ser telefono fijo agregue (07) antes del número ");
    }//GEN-LAST:event_txt_regTelefFocusGained

    private void txt_regTelefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regTelefFocusLost
        if ((txt_regTelef.getText().trim().length() < 9) || (txt_regTelef.getText().trim().length() > 10)) {
            UtilidadesComponente.mensajeError("Error", "El numero telefonico debe contener entre 9 y 10 dígitos");
        }
    }//GEN-LAST:event_txt_regTelefFocusLost

    private void txt_regTelefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regTelefKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_regTelefKeyTyped

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_regApell.setText(null);
        txt_regCed.setText(null);
        txt_regEmail.setText(null);
        txt_regNom.setText(null);
        txt_regTelef.setText(null);
        txt_regUsuario.setText(null);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_regUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regUsuarioActionPerformed

    private void txt_regEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regEmailActionPerformed

    private void txt_regClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regClaveActionPerformed

    private void txt_regClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regClaveFocusGained
        // TODO add your handling code here:
        txt_regClave.setToolTipText("Ingrese su Contraseña");
    }//GEN-LAST:event_txt_regClaveFocusGained

    private void txt_regClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_regClaveFocusLost
        // TODO add your handling code here:
        if (txt_regClave.getText().trim().length() > 15) {
            UtilidadesComponente.mensajeError("Error", "La contraseña no puede contener mas de 15 caracteres");
        }
    }//GEN-LAST:event_txt_regClaveFocusLost

    private void txt_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            inicioSesion();
        }
    }//GEN-LAST:event_txt_passKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) ps not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/upswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        JFrame.setDefaultLookAndFeelDecorated(true);
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            // start application
            ;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmLogin dialog = new FrmLogin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton tbn_cancel;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_regApell;
    private javax.swing.JTextField txt_regCed;
    private javax.swing.JPasswordField txt_regClave;
    private javax.swing.JTextField txt_regEmail;
    private javax.swing.JTextField txt_regNom;
    private javax.swing.JTextField txt_regTelef;
    private javax.swing.JTextField txt_regUsuario;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
