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
import java.awt.Color;
import javax.swing.JButton;
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
     * @param parent componente awt
     * @param modal boolean
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

        jLabel12 = new javax.swing.JLabel();
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
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Nombres");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 180, 100, 14);

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
        getContentPane().add(txt_regApell);
        txt_regApell.setBounds(530, 220, 150, 20);

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Apellidos");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 220, 90, 14);

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 260, 80, 14);

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel7.setText("N° de cédula");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 300, 110, 14);

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
        getContentPane().add(txt_regNom);
        txt_regNom.setBounds(530, 180, 150, 20);

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
        getContentPane().add(txt_regEmail);
        txt_regEmail.setBounds(530, 260, 150, 20);

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
        getContentPane().add(txt_regCed);
        txt_regCed.setBounds(530, 300, 150, 20);

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Telefono");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(400, 340, 90, 14);

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
        getContentPane().add(txt_regTelef);
        txt_regTelef.setBounds(530, 340, 150, 20);

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Nombre de Usuario");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 100, 130, 14);

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
        getContentPane().add(txt_regUsuario);
        txt_regUsuario.setBounds(530, 100, 150, 20);

        btn_registrar.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar);
        btn_registrar.setBounds(420, 380, 100, 30);

        btn_limpiar.setBackground(new java.awt.Color(204, 204, 255));
        btn_limpiar.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        btn_limpiar.setText("Cancelar");
        btn_limpiar.setBorder(null);
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpiar);
        btn_limpiar.setBounds(580, 380, 100, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 0, 0, 2);

        jLabel11.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Contraseña");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(400, 140, 90, 14);

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
        getContentPane().add(txt_regClave);
        txt_regClave.setBounds(530, 140, 150, 20);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(40, 50, 90, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(390, 50, 70, 10);

        txt_usuario.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        txt_usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        getContentPane().add(txt_usuario);
        txt_usuario.setBounds(90, 100, 200, 30);

        txt_pass.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        txt_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passKeyPressed(evt);
            }
        });
        getContentPane().add(txt_pass);
        txt_pass.setBounds(90, 170, 200, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(60, 250, 260, 10);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(240, 50, 90, 10);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 270, 100, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("SIGN IN");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 40, 90, 29);

        jLabel3.setText("Ingrese su contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 210, 200, 14);

        jLabel2.setText("Ingrese su usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 130, 200, 14);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(630, 50, 70, 10);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 0, 0));
        jToggleButton1.setText("X");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(680, 0, 40, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTER IN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(470, 40, 150, 29);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/asd.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 720, 440);

        setSize(new java.awt.Dimension(738, 480));
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
    private void cargarObjeto() {
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
        ps.getPersona().setRol(new RolServicio().buscarRolNombre("Administrador"));
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
                    UtilidadesComponente.mensajeOk("!BIENVENID@¡", "Se ha registrado correctamente");
                    limpiar();
                } else {
                    UtilidadesComponente.mensajeError("NO SE HA PODIDO REGISTRAR", "Revise que sus datos sean correctos");
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
        txt_usuario.setText("Usuario");
        txt_pass.setText("Contraseña");
        
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
        if ((txt_regTelef.getText().trim().length() < 7) || (txt_regTelef.getText().trim().length() > 10)) {
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        inicioSesion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToggleButton jToggleButton1;
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
