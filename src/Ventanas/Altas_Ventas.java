package Ventanas;

import clases.Detalles_Ventas;
import clases.ManipulaBD;
import clases.Productos;
import clases.Ventas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author REYNO21
 */
public class Altas_Ventas extends javax.swing.JFrame implements Runnable
{

    private ArrayList<Productos> nombres = null;
    private ArrayList<Productos> tmp = new ArrayList<>();

    private int totalDV = 0;
    private int totalV = 0;

    private String hora, minuto;
    private Thread hilo;

    /**
     * Creates new form Ventas
     */
    public Altas_Ventas()
    {
        initComponents();
        TFecha.setText(Fecha());
        hilo = new Thread(this);
        hilo.start();
        nombres = ManipulaBD.ConsultasProductos("id!=", "-1");
        for (int i = 0; i < nombres.size(); i++)
        {
            TCProductos.addItem(nombres.get(i).getNombre());
        }

        ArrayList<Ventas> tmp1 = null;
        tmp1 = ManipulaBD.ConsultasVentas("id!=", "-1");
        try
        {
            if (!tmp1.isEmpty())
            {
                totalV = tmp1.get(tmp1.size() - 1).getId() + 1;
            } else
            {
                totalV = 0;
            }
        } catch (java.lang.NullPointerException e)
        {
            totalV = 0;
        }

        ArrayList<Detalles_Ventas> tmp2 = null;
        tmp2 = ManipulaBD.ConsultasDetalles_Ventas("id!=", "-1");
        try
        {
            if (!tmp2.isEmpty())
            {
                totalDV = tmp2.get(tmp2.size() - 1).getId() + 1;
            } else
            {
                totalDV = 0;
            }
        } catch (java.lang.NullPointerException e)
        {
            totalDV = 0;
        }
    }

    public void hora()
    {
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minuto = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
    }

    @Override
    public void run()
    {
        Thread current = Thread.currentThread();

        while (current == hilo)
        {
            hora();
            THora.setText(hora + ":" + minuto);
        }
    }

    public static String Fecha()
    {
        Date Fecha = new Date();
        SimpleDateFormat fomatofecha = new SimpleDateFormat("dd/MM/yyyy");
        return fomatofecha.format(Fecha);
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

        BAgregar = new javax.swing.JButton();
        TCProductos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDV = new javax.swing.JTable();
        BCancelar = new javax.swing.JButton();
        BAceptar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        TFecha = new javax.swing.JLabel();
        THora = new javax.swing.JLabel();
        TTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BAgregar.setText("Agregar");
        BAgregar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAgregarActionPerformed(evt);
            }
        });

        TDV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Producto", "Id Producto", "Cantidad", "Precio"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TDV);

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BCancelarActionPerformed(evt);
            }
        });

        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAceptarActionPerformed(evt);
            }
        });

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BEliminarActionPerformed(evt);
            }
        });

        TFecha.setText("dd/MM/YYYY");

        THora.setText("HH:MM");

        TTotal.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFecha)
                        .addGap(47, 47, 47)
                        .addComponent(THora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(BAgregar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BCancelar)
                                .addGap(297, 297, 297)
                                .addComponent(BAceptar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAgregar)
                    .addComponent(TCProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BEliminar)
                    .addComponent(THora)
                    .addComponent(TFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(TTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCancelar)
                    .addComponent(BAceptar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BCancelarActionPerformed
    {//GEN-HEADEREND:event_BCancelarActionPerformed
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
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAgregarActionPerformed
    {//GEN-HEADEREND:event_BAgregarActionPerformed

        String productoActual = (String) TCProductos.getSelectedItem();

        for (int i = 0; i < nombres.size(); i++)
        {
            if (productoActual.compareTo(nombres.get(i).getNombre()) == 0)
            {
                if (!tmp.contains(nombres.get(i)))
                {
                    tmp.add(nombres.get(i));
                }
            }
        }

        for (int i = 0; i < tmp.size(); i++)
        {
            TDV.setValueAt(tmp.get(i).getNombre(), i, 0);
            TDV.setValueAt(tmp.get(i).getId(), i, 1);
            TDV.setValueAt(1, i, 2);
            TDV.setValueAt(tmp.get(i).getPrecio_Venta(), i, 3);
        }
        System.out.println("Productos detectados; " + tmp.size());

    }//GEN-LAST:event_BAgregarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BEliminarActionPerformed
    {//GEN-HEADEREND:event_BEliminarActionPerformed
        System.out.println(tmp.get(tmp.size() - 1).getNombre());
        TDV.setValueAt("", tmp.size() - 1, 0);
        TDV.setValueAt("", tmp.size() - 1, 1);
        TDV.setValueAt("", tmp.size() - 1, 2);
        TDV.setValueAt("", tmp.size() - 1, 3);
        tmp.remove(tmp.size() - 1);
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAceptarActionPerformed
    {//GEN-HEADEREND:event_BAceptarActionPerformed

        int id = totalV++;
        String fecha = TFecha.getText();
        String Hora = THora.getText();
        ManipulaBD.AltasVentas(id, fecha, Hora, (float) 0.0);
        float total = (float) 0.0;

        for (int i = 0; i < tmp.size(); i++)
        {
            int id2 = totalDV++;
            int id_Producto = tmp.get(i).getId();
            int cantidad = 0;
            float peso = 0;
            float precio_Total = 0;
            if (!tmp.get(i).isCantidad())
            {
                peso = Float.parseFloat(("" + TDV.getValueAt(i, 2) + ""));
                tmp.get(i).setPeso(tmp.get(i).getPeso() - peso);
                if (tmp.get(i).getPeso() < 1)
                {
                    ManipulaBD.ModificarProductos(tmp.get(i).getId(), "peso,estatus,ventas", "0.0,'false'," + (tmp.get(i).getVentas() + peso) + "");
                } else
                {
                    ManipulaBD.ModificarProductos(tmp.get(i).getId(), "peso,ventas", "" + tmp.get(i).getPeso() + "," + (tmp.get(i).getVentas() + peso) + "");
                }
                precio_Total = tmp.get(i).getPrecio_Venta() * peso;
                ManipulaBD.AltasDetalles_Ventas(id2, id, id_Producto, peso, precio_Total);
            } else
            {
                cantidad = Integer.parseInt("" + TDV.getValueAt(i, 2) + "");
                tmp.get(i).setCantidad(tmp.get(i).getCantidad() - cantidad);
                if (tmp.get(i).getCantidad() < 1)
                {
                    ManipulaBD.ModificarProductos(tmp.get(i).getId(), "cantidad,estatus,ventas", "0,'false'," + (tmp.get(i).getVentas() + cantidad) + "");
                } else
                {
                    ManipulaBD.ModificarProductos(tmp.get(i).getId(), "cantidad,ventas", "" + tmp.get(i).getCantidad() + "," + (tmp.get(i).getVentas() + cantidad) + "");
                }
                precio_Total = tmp.get(i).getPrecio_Venta() * cantidad;
                ManipulaBD.AltasDetalles_Ventas(id2, id, id_Producto, cantidad, precio_Total);
            }
            total += precio_Total;
        }
        ManipulaBD.ModificarVentas(id, total);
        
        BCancelarActionPerformed(evt);

    }//GEN-LAST:event_BAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Altas_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Altas_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Altas_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Altas_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Altas_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JComboBox<String> TCProductos;
    private javax.swing.JTable TDV;
    private javax.swing.JLabel TFecha;
    private javax.swing.JLabel THora;
    private javax.swing.JLabel TTotal;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
