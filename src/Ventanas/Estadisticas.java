/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import clases.Informes;
import clases.ManipulaBD;
import java.util.ArrayList;

/**
 *
 * @author REYNO21
 */
public class Estadisticas extends javax.swing.JFrame
  {

    public ArrayList<Informes> info;

    /**
     * Creates new form Estadisticas
     */
    public Estadisticas()
      {
        initComponents();

        String condicion = "*";
        info = ManipulaBD.ConsultasInformes("id!=", condicion);
        for (int i = 0; i < info.size(); i++)
          {

            TInfo.setValueAt(info.get(i).getProducto_Mas(), i, 0);
            //TInfo.setValueAt(info.get(i).getMarca_Menos(), i + 1, 0);
            TInfo.setValueAt(info.get(i).getMarca_Mas(), i, 1);
            //TInfo.setValueAt(info.get(i).getMarca_Menos(), i + 1, 1);
            TInfo.setValueAt(info.get(i).getGanancias(), i, 2);
            //TInfo.setValueAt(info.get(i).getPerdidas(), i + 1, 2);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        TInfo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Producto", "Marca", "Ganancia/Perdida", "Cantidad Vendida"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean []
            {
                true, false, true, true
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
        jScrollPane1.setViewportView(TInfo);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (InstantiationException ex)
          {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (IllegalAccessException ex)
          {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          } catch (javax.swing.UnsupportedLookAndFeelException ex)
          {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
          }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
          {
            public void run()
              {
                new Estadisticas().setVisible(true);
              }
          });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
  }
