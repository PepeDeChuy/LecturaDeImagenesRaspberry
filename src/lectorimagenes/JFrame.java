package lectorimagenes;

import java.awt.Component;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class JFrame extends javax.swing.JFrame 
{   
    ArrayList<String> array = new ArrayList();
    DefaultListModel defult = new DefaultListModel();
    
    HiloLectura hL;
    HiloCaptura hC;
    
    public JFrame() 
    {
        initComponents();
        defult.clear();
        jList1.setModel(defult);
        
        hL = new HiloLectura(this);
        hC = new HiloCaptura(this);
    }
    
    private void ejecutarLectura()
    {
        defult.clear();
        hL.start();
    }
    
    private void terminarLectura()
    {
        hL.terminarHilo();
        hL = null;
        hL = new HiloLectura(this);
    }
    
    //Metodos de la captura
    private void ejecutarCaptura()
    {
        hC.start();
    }
    
    private void terminarCaptura()
    {
        hC.terminarCaptuta();
        hC = null;
        hC = new HiloCaptura(this);
    }
    
    public String getLc()
    {
        return jTextFieldDireccion.getText();
    }
    
    public void agregarElemento(String name)
    {
        defult.addElement(name);
        jLabelTotal.setText(Integer.toString(defult.getSize()));
    }
    
    public int getMinBorrar()
    {
        return Integer.parseInt(jTextFieldMin.getText());
    }
    
    public String getDireccionPY()
    {
        return jTextFieldDireccionPY.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonIniciar1 = new javax.swing.JButton();
        jTextFieldDireccion1 = new javax.swing.JTextField();
        jButtonIniciar5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextFieldDireccion = new javax.swing.JTextField();
        jButtonIniciar2 = new javax.swing.JButton();
        jButtonIniciar4 = new javax.swing.JButton();
        jButtonIniciar6 = new javax.swing.JButton();
        jButtonIniciar3 = new javax.swing.JButton();
        jButtonIniciar7 = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldMin = new javax.swing.JTextField();
        jTextFieldDireccionPY = new javax.swing.JTextField();
        jButtonIniciar8 = new javax.swing.JButton();

        jButtonIniciar1.setLabel("Iniciar");
        jButtonIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar1ActionPerformed(evt);
            }
        });

        jTextFieldDireccion1.setText("/home/pi/Desktop/Face-classification/Photos-analyze");
        jTextFieldDireccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccion1ActionPerformed(evt);
            }
        });

        jButtonIniciar5.setText("Iniciar hilo");
        jButtonIniciar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jTextFieldDireccion.setText("/home/pi/Desktop/Face-Classification/Photos-Analyze/");
        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        jButtonIniciar2.setText("Iniciar lectura");
        jButtonIniciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar2ActionPerformed(evt);
            }
        });

        jButtonIniciar4.setText("Direccion");
        jButtonIniciar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar4ActionPerformed(evt);
            }
        });

        jButtonIniciar6.setText("Iniciar captura");
        jButtonIniciar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar6ActionPerformed(evt);
            }
        });

        jButtonIniciar3.setText("Terminar lectura");
        jButtonIniciar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar3ActionPerformed(evt);
            }
        });

        jButtonIniciar7.setText("Terminar captura");
        jButtonIniciar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar7ActionPerformed(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelTotal.setText("Total imagenes: ");

        jTextFieldMin.setText("15");
        jTextFieldMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMinActionPerformed(evt);
            }
        });

        jTextFieldDireccionPY.setText("/home/pi/Desktop/Codigos/record_images.py");
        jTextFieldDireccionPY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionPYActionPerformed(evt);
            }
        });

        jButtonIniciar8.setText("Direccion");
        jButtonIniciar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciar8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonIniciar4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonIniciar8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDireccionPY)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jTextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonIniciar6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIniciar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonIniciar7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIniciar3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonIniciar7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIniciar6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonIniciar2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIniciar3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jTextFieldMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonIniciar4))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDireccionPY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonIniciar8))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jButtonIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciar1ActionPerformed

    private void jButtonIniciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar2ActionPerformed
        ejecutarLectura();
    }//GEN-LAST:event_jButtonIniciar2ActionPerformed

    private void jButtonIniciar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar4ActionPerformed
        jTextFieldDireccion.setText("G:\\PitosGrandes");
    }//GEN-LAST:event_jButtonIniciar4ActionPerformed

    private void jTextFieldDireccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccion1ActionPerformed

    private void jButtonIniciar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciar5ActionPerformed

    private void jButtonIniciar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar6ActionPerformed
        ejecutarCaptura();
    }//GEN-LAST:event_jButtonIniciar6ActionPerformed

    private void jButtonIniciar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar3ActionPerformed
        terminarLectura();
    }//GEN-LAST:event_jButtonIniciar3ActionPerformed

    private void jButtonIniciar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar7ActionPerformed
        terminarCaptura();
    }//GEN-LAST:event_jButtonIniciar7ActionPerformed

    private void jTextFieldMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMinActionPerformed

    private void jTextFieldDireccionPYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionPYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionPYActionPerformed

    private void jButtonIniciar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciar8ActionPerformed

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar1;
    private javax.swing.JButton jButtonIniciar2;
    private javax.swing.JButton jButtonIniciar3;
    private javax.swing.JButton jButtonIniciar4;
    private javax.swing.JButton jButtonIniciar5;
    private javax.swing.JButton jButtonIniciar6;
    private javax.swing.JButton jButtonIniciar7;
    private javax.swing.JButton jButtonIniciar8;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldDireccion1;
    private javax.swing.JTextField jTextFieldDireccionPY;
    private javax.swing.JTextField jTextFieldMin;
    // End of variables declaration//GEN-END:variables
}
