/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import clases.DenominadorCeroException;
import clases.Mixto;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
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

        jPanel1 = new javax.swing.JPanel();
        txtMix1 = new javax.swing.JTextField();
        txtNum1 = new javax.swing.JTextField();
        txtDen1 = new javax.swing.JTextField();
        cmbOp = new javax.swing.JComboBox<>();
        txtMix2 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        txtDen2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMix3 = new javax.swing.JTextField();
        txtNum3 = new javax.swing.JTextField();
        txtDen3 = new javax.swing.JTextField();
        cmdOperar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtMix1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, -1));
        jPanel1.add(txtNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, -1));
        jPanel1.add(txtDen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));

        cmbOp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir" }));
        cmbOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));
        jPanel1.add(txtMix2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, -1));
        jPanel1.add(txtNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 60, -1));
        jPanel1.add(txtDen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 60, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("=");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 30, -1));
        jPanel1.add(txtMix3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 60, -1));
        jPanel1.add(txtNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 60, -1));
        jPanel1.add(txtDen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 60, -1));

        cmdOperar.setText("Operar");
        cmdOperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdOperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        cmdConvertir.setText("Convertir");
        cmdConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOpActionPerformed

    private void cmdOperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperarActionPerformed
       int op,n1,n2,n3,d1,d2,d3,m1,m2,m3;
       Mixto mi1,mi2,mi3=null;
       n1=Integer.parseInt(txtNum1.getText());
       d1=Integer.parseInt(txtDen1.getText());
       n2=Integer.parseInt(txtNum2.getText());
       d2=Integer.parseInt(txtDen2.getText());
       m1=Integer.parseInt(txtMix1.getText());
       m2=Integer.parseInt(txtMix2.getText());
       op=cmbOp.getSelectedIndex();
       try{
           mi1=new Mixto(n1,d1,m1);
           mi2=new Mixto(n2,d2,m2);
           switch (op){
               case 0:
                   mi3=mi1.Suma(mi2);
                   break;
               case 1:
                   mi3=mi1.Resta(mi2);
                   break;
               case 2:
                   mi3=mi1.Multiplicacion(mi2);
                   break;
               case 3:
                   mi3=mi1.Divicion(mi2);
                   break;
           }
          txtMix3.setText(""+mi3.getMixto());
          txtDen3.setText(""+mi3.getDenominador());
          txtNum3.setText(""+mi3.getNumerador());
                  
                   
                   } catch ( DenominadorCeroException e){
                   JOptionPane.showMessageDialog(this, "el denominador no puede ser cero");
       }
    }//GEN-LAST:event_cmdOperarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtDen1.setText("");
        txtDen2.setText("");
        txtDen3.setText("");
        txtMix1.setText("");
        txtMix2.setText("");
        txtMix3.setText("");
        txtNum1.setText("");
        txtNum2.setText("");
        txtNum3.setText("");
        cmbOp.setSelectedIndex(0);
        txtMix1.requestFocusInWindow();
        
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertirActionPerformed
     int  m1,n1,d1,n2;
        m1=Integer.parseInt(txtMix3.getText());
        d1=Integer.parseInt(txtDen3.getText());
        n1=Integer.parseInt(txtNum3.getText());
        n2=(m1*d1)+n1;
        txtMix3.setText("");
        txtNum3.setText(String.valueOf(n2));
        
    }//GEN-LAST:event_cmdConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOp;
    private javax.swing.JButton cmdConvertir;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdOperar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDen1;
    private javax.swing.JTextField txtDen2;
    private javax.swing.JTextField txtDen3;
    private javax.swing.JTextField txtMix1;
    private javax.swing.JTextField txtMix2;
    private javax.swing.JTextField txtMix3;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    private javax.swing.JTextField txtNum3;
    // End of variables declaration//GEN-END:variables
}
