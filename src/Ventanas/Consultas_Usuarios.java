package Ventanas;

import clases.ManipulaBD;
import clases.Personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author REYNO21
 */
public class Consultas_Usuarios extends javax.swing.JFrame
{

    public static ArrayList<Personas> personases;
    //public static ArrayList<Personas> usid;

    /**
     * Creates new form Consultas
     */
    public Consultas_Usuarios()
    {
        initComponents();

        String condicion = "-1";
        personases = ManipulaBD.ConsultasPersonas("id!=", condicion);
        for (int i = 0; i < personases.size(); i++)
        {
            TUsuarios.setValueAt(personases.get(i).getId(), i, 0);
            TUsuarios.setValueAt(personases.get(i).getClasificacion(), i, 1);
            TUsuarios.setValueAt(personases.get(i).getSueldo(), i, 2);
            TUsuarios.setValueAt(personases.get(i).getNombre(), i, 3);
            TUsuarios.setValueAt(personases.get(i).getApellidoP(), i, 4);
            TUsuarios.setValueAt(personases.get(i).getApellidoM(), i, 5);
            TUsuarios.setValueAt(personases.get(i).getSexo(), i, 6);
            TUsuarios.setValueAt(personases.get(i).isEstatus(), i, 7);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        BRegresar = new javax.swing.JButton();
        BModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BRegresar.setText("Regresar");
        BRegresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BRegresarActionPerformed(evt);
            }
        });

        BModificar.setText("Modificar");
        BModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BModificarActionPerformed(evt);
            }
        });

        TUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Id", "Clasificacion", "Sueldo", "Nombre", "ApellidoP", "ApellidoM", "Sexo", "Estado"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean []
            {
                false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BModificar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BRegresar)
                    .addComponent(BModificar))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BRegresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BRegresarActionPerformed
    {//GEN-HEADEREND:event_BRegresarActionPerformed
        switch (InicioSesion.usuario.get(0).getClasificacion())
        {
            case 1:
                new Menu_Gerente().setVisible(true);
                break;
            case 2:
                new Menu_SubGerente().setVisible(true);
                break;
            case 3:
                new Menu_Empleado().setVisible(true);
                break;
        }
        this.setVisible(false);

    }//GEN-LAST:event_BRegresarActionPerformed

    private void BModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BModificarActionPerformed
    {//GEN-HEADEREND:event_BModificarActionPerformed

        for (int i = 0; i < personases.size(); i++)
        {

            boolean estatus = (boolean) TUsuarios.getValueAt(i, 7);
            String estatusS = String.valueOf(estatus);

            ManipulaBD.ModificarPersona(personases.get(i).getId(), "clasificacion", "" + TUsuarios.getValueAt(i, 1) + "");
            ManipulaBD.ModificarPersona(personases.get(i).getId(), "sueldo", "" + TUsuarios.getValueAt(i, 2) + "");
            ManipulaBD.ModificarPersona(personases.get(i).getId(), "nombre", "'" + TUsuarios.getValueAt(i, 3) + "'");
            ManipulaBD.ModificarPersona(personases.get(i).getId(), "apellidoP", "'" + TUsuarios.getValueAt(i, 4) + "'");
            ManipulaBD.ModificarPersona(personases.get(i).getId(), "apellidoM", "'" + TUsuarios.getValueAt(i, 5) + "'");
            ManipulaBD.ModificarPersona(personases.get(i).getId(), "sexo", "'" + "'" + TUsuarios.getValueAt(i, 6) + "'");
            ManipulaBD.ModificarPersona(personases.get(i).getId(), "estatus", "'" + estatusS + "'");

        }

    }//GEN-LAST:event_BModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Consultas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Consultas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Consultas_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Consultas_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BModificar;
    private javax.swing.JButton BRegresar;
    private javax.swing.JTable TUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
