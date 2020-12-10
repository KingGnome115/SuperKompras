package Ventanas;

import clases.Entidades;
import clases.ManipulaBD;
import clases.Municipio;
import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Agregar_Municipio extends javax.swing.JFrame
{

    int total;
    ArrayList<Entidades> nombres = null;

    /**
     * Creates new form Agregar_Municipio
     */
    public Agregar_Municipio()
    {
        initComponents();

        ArrayList<Municipio> tmp = null;
        tmp = ManipulaBD.ConsultasMunicipio("id!=", "-1");
        try
        {
            System.out.println(tmp.isEmpty());
            if (!tmp.isEmpty())
            {
                total = tmp.get(tmp.size() - 1).getId() + 1;
                System.out.println(total);
            } else
            {
                total = 0;
            }
        } catch (java.lang.NullPointerException e)
        {
            total = 0;
        }

        nombres = ManipulaBD.ConsultasEntidades("id!=", "-1");
        System.out.println(nombres.size());
        for (int i = 0; i < nombres.size(); i++)
        {
            JCEntidad.addItem(nombres.get(i).getNombre());
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

        Entidad = new javax.swing.JLabel();
        JCEntidad = new javax.swing.JComboBox<>();
        Municipio = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        BRegresar = new javax.swing.JButton();
        BAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Entidad.setText("Entidad");

        Municipio.setText("Municipio");

        TNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TNombreKeyTyped(evt);
            }
        });

        BRegresar.setText("Regresar");

        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(BAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Entidad)
                            .addComponent(Municipio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JCEntidad, 0, 130, Short.MAX_VALUE)
                            .addComponent(TNombre))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Entidad)
                    .addComponent(JCEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Municipio)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRegresar)
                    .addComponent(BAceptar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAceptarActionPerformed
    {//GEN-HEADEREND:event_BAceptarActionPerformed
        int id = total++;
        int id_Entidad=0;
        String item = (String) JCEntidad.getSelectedItem();
        for (int i = 0; i < nombres.size(); i++)
        {
            if (item.compareTo(nombres.get(i).getNombre()) == 0)
            {
                id_Entidad = nombres.get(i).getId();
            }
        }
        boolean estatus = true;
        String nombre = TNombre.getText();
        ManipulaBD.AltasMunicipio(id, id_Entidad, estatus, nombre);

    }//GEN-LAST:event_BAceptarActionPerformed

    private void TNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNombreKeyTyped
        if (TNombre.getText().length() == 30)
        {
            evt.consume();
        } else
        {
            cjb.ci.Validaciones.validaAlfabeticos(evt);
        }
    }//GEN-LAST:event_TNombreKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Municipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Municipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Municipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Agregar_Municipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Agregar_Municipio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BRegresar;
    private javax.swing.JLabel Entidad;
    private javax.swing.JComboBox<String> JCEntidad;
    private javax.swing.JLabel Municipio;
    private javax.swing.JTextField TNombre;
    // End of variables declaration//GEN-END:variables
}