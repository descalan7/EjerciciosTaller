/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import clases.Complejo;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        txtR1 = new javax.swing.JTextField();
        txtI1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbop = new javax.swing.JComboBox<>();
        txtR2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtI2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmdOp = new javax.swing.JButton();
        cmdCl = new javax.swing.JButton();
        txtR3 = new javax.swing.JTextField();
        txtI3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtR1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtR1KeyTyped(evt);
            }
        });
        jPanel1.add(txtR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, -1));

        txtI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtI1KeyTyped(evt);
            }
        });
        jPanel1.add(txtI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 50, -1));

        jLabel1.setText(",");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 20, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("i");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 10, -1));

        cmbop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir", " " }));
        jPanel1.add(cmbop, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        txtR2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtR2KeyTyped(evt);
            }
        });
        jPanel1.add(txtR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 50, -1));

        jLabel3.setText(",");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 20, -1));

        txtI2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtI2KeyTyped(evt);
            }
        });
        jPanel1.add(txtI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 50, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("i");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        cmdOp.setText("Operar");
        cmdOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOpActionPerformed(evt);
            }
        });
        jPanel1.add(cmdOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        cmdCl.setText("Clean");
        cmdCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdClActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        txtR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtR3ActionPerformed(evt);
            }
        });
        jPanel1.add(txtR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 60, -1));
        jPanel1.add(txtI3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, -1));

        jLabel5.setText(",");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 20, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("i");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 20, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtR3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtR3ActionPerformed

    private void cmdOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOpActionPerformed
        double nr1, nr2, ni1, ni2, d;
        int op;
        Complejo c1, c2, c3=null;
        op=cmbop.getSelectedIndex();
        nr1=Double.parseDouble(txtR1.getText());
        nr2=Double.parseDouble(txtR2.getText());
        ni1=Double.parseDouble(txtI1.getText());
        ni2=Double.parseDouble(txtI2.getText());
        
            c1= new Complejo (nr1, ni1);
            c2= new Complejo (nr2, ni2);
            
            switch(op){
                case 0:
                c3=c1.Suma(c2);
                break;
                case 1:
                c3=c1.Resta(c2);
                break;
                case 2:
                c3=c1.Multiplicacion(c2);
                break;
                case 3:
                c3=c1.Division(c2);
                break;
            }
            txtR3.setText(""+c3.getNumeroReal());
            txtI3.setText(""+c3.getNumeroI());
    }//GEN-LAST:event_cmdOpActionPerformed

    private void cmdClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdClActionPerformed
        txtI1.setText("");
        txtI2.setText("");
        txtI3.setText("");
        txtR1.setText("");
        txtR2.setText("");
        txtR3.setText("");
        cmbop.setSelectedIndex(0);
        txtR1.requestFocusInWindow();
    }//GEN-LAST:event_cmdClActionPerformed

    private void txtR1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtR1KeyTyped
    
    char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
                    }        
    }//GEN-LAST:event_txtR1KeyTyped

    private void txtI1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtI1KeyTyped
    
    char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
                    }        
    }//GEN-LAST:event_txtI1KeyTyped

    private void txtR2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtR2KeyTyped
    
    char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
                    }        
    }//GEN-LAST:event_txtR2KeyTyped

    private void txtI2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtI2KeyTyped
    
    char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            getToolkit().beep();
            evt.consume();
                    }       
    }//GEN-LAST:event_txtI2KeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbop;
    private javax.swing.JButton cmdCl;
    private javax.swing.JButton cmdOp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtI1;
    private javax.swing.JTextField txtI2;
    private javax.swing.JTextField txtI3;
    private javax.swing.JTextField txtR1;
    private javax.swing.JTextField txtR2;
    private javax.swing.JTextField txtR3;
    // End of variables declaration//GEN-END:variables
}