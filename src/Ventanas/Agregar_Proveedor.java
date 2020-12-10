/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import cjb.ci.Validaciones;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kevin
 */
public class Agregar_Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_Proveedor
     */
    public Agregar_Proveedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TApellidoP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TApellidoM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TRFC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TCP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TPais = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TMunicipio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TEntidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        TNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNombreActionPerformed(evt);
            }
        });
        TNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TNombreKeyTyped(evt);
            }
        });

        jLabel2.setText("Apellido Paterno");

        TApellidoP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TApellidoPKeyTyped(evt);
            }
        });

        jLabel3.setText("Apellido Materno");

        TApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TApellidoMKeyTyped(evt);
            }
        });

        jLabel4.setText("RFC");

        TRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRFCActionPerformed(evt);
            }
        });
        TRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TRFCKeyTyped(evt);
            }
        });

        jLabel5.setText("Código Postal");

        TCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TCPKeyTyped(evt);
            }
        });

        jLabel6.setText("Teléfono");

        TTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TTelefonoKeyTyped(evt);
            }
        });

        jLabel7.setText("Email");

        TEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TEmailKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TEmailKeyTyped(evt);
            }
        });

        jButton1.setText("Aceptar");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Pais");

        TPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TPaisKeyTyped(evt);
            }
        });

        jLabel9.setText("Municipio");

        TMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TMunicipioKeyTyped(evt);
            }
        });

        jLabel10.setText("Entidad");

        TEntidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TEntidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TNombre)
                            .addComponent(TApellidoP)
                            .addComponent(TApellidoM)
                            .addComponent(TRFC)
                            .addComponent(TCP)
                            .addComponent(TTelefono)
                            .addComponent(TEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TPais, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(TEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TRFCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TRFCActionPerformed
    {//GEN-HEADEREND:event_TRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRFCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNombreKeyTyped
        if (TNombre.getText().length() == 30) {
            evt.consume();
        } else {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TNombreKeyTyped

    private void TApellidoPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TApellidoPKeyTyped
        if (TApellidoP.getText().length() == 30) {
            evt.consume();
        } else {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TApellidoPKeyTyped

    private void TNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNombreActionPerformed

    private void TApellidoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TApellidoMKeyTyped
        if (TApellidoM.getText().length() == 30) {
            evt.consume();
        } else {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TApellidoMKeyTyped

    private void TRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TRFCKeyTyped
        if (TRFC.getText().length() == 12) {
            evt.consume();
        } else {
            cjb.ci.Validaciones.validaAlfanumerico(evt);
        }// TODO add your handling code here:
    }//GEN-LAST:event_TRFCKeyTyped

    private void TCPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCPKeyTyped
        if (TCP.getText().length() == 5) {
            evt.consume();
        } else {
            cjb.ci.Validaciones.validaEntero(evt);
        }
    }//GEN-LAST:event_TCPKeyTyped

    private void TTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TTelefonoKeyTyped
        if (TTelefono.getText().length() == 10) {
            evt.consume();
        } else {
            Validaciones.validaEntero(evt);
        }
    }//GEN-LAST:event_TTelefonoKeyTyped

    private void TTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TTelefonoKeyPressed
        if (!((TTelefono.getText().isEmpty()) || (!(validaNumero(TTelefono.getText(), 10))))) {
            Validaciones.enter(this, evt, TEmail);
        }
    }//GEN-LAST:event_TTelefonoKeyPressed

    private void TEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEmailKeyPressed
        if (!((TEmail.getText().isEmpty()) || (!(validaEmail(TEmail.getText()))))) {
            Validaciones.enter(this, evt, TPais);
        }
    }//GEN-LAST:event_TEmailKeyPressed

    private void TEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEmailKeyTyped
        if (TEmail.getText().length() == 35)
        {
            evt.consume();
        }
    }//GEN-LAST:event_TEmailKeyTyped

    private void TPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TPaisKeyTyped
        if (TPais.getText().length() == 30) {
            evt.consume();
        } else {
            Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TPaisKeyTyped

    private void TMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TMunicipioKeyTyped
       if (TMunicipio.getText().length() == 30) {
            evt.consume();
        } else {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TMunicipioKeyTyped

    private void TEntidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEntidadKeyTyped
       if (TEntidad.getText().length() == 30) {
            evt.consume();
        } else {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TEntidadKeyTyped

    /**
     * @param args the command line arguments
     */
    //VALIDACION PARA CORREO
    public boolean validaEmail(String cad) {
        Pattern expReg = null;
        Matcher val = null;

        expReg = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        val = expReg.matcher(cad);

        if (val.find()) {
            return true;
        } else {
            return false;
        }
    }

    //VALIDACION PARA NUMERO TELEFONICO
    public static boolean validaNumero(String cad, int nums) {
        String n = String.valueOf(nums);
        Pattern expReg = null;
        Matcher val = null;

        expReg = Pattern.compile("^[\\d]{" + n + "}$");
        val = expReg.matcher(cad);

        if (val.find()) {
            return true;
        } else {
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(Agregar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TApellidoM;
    private javax.swing.JTextField TApellidoP;
    private javax.swing.JTextField TCP;
    private javax.swing.JTextField TEmail;
    private javax.swing.JTextField TEntidad;
    private javax.swing.JTextField TMunicipio;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TPais;
    private javax.swing.JTextField TRFC;
    private javax.swing.JTextField TTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
