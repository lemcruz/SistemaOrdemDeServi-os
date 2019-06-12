package GUI;

import java.awt.Dimension;
import java.util.* ;
import sistema.*;

public class TelaEntrada extends javax.swing.JFrame {
    GerenciandorTelas gerenciadorTelas;
    Sistema sys;
    /**
     * Creates new form TelaEntrada
     */
    public TelaEntrada() {
        initComponents(); 
        gerenciadorTelas = GerenciandorTelas.getInstanceOfGerenciadorTealas();
        sys = GerenciandorTelas.getInstanceOfSistema();
        
        //this.setSize(this.getMaximumSize());    
        RedimensionaTelas.redimensiona(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoDeLogin = new javax.swing.JDialog();
        loginTxtField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        senhaTxtField = new javax.swing.JPasswordField();
        senhaLabel = new javax.swing.JLabel();
        entrarButton = new javax.swing.JButton();
        cadastroButton = new javax.swing.JButton();
        castradoLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout dialogoDeLoginLayout = new javax.swing.GroupLayout(dialogoDeLogin.getContentPane());
        dialogoDeLogin.getContentPane().setLayout(dialogoDeLoginLayout);
        dialogoDeLoginLayout.setHorizontalGroup(
            dialogoDeLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dialogoDeLoginLayout.setVerticalGroup(
            dialogoDeLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTxtFieldActionPerformed(evt);
            }
        });
        loginTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginTxtFieldKeyPressed(evt);
            }
        });

        loginLabel.setText("LOGIN :");

        senhaTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaTxtFieldKeyPressed(evt);
            }
        });

        senhaLabel.setText("SENHA :");

        entrarButton.setText("ENTRAR");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        cadastroButton.setText("Cadstrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        castradoLabel.setText("Cadastre-se :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(castradoLabel)
                    .addComponent(cadastroButton)
                    .addComponent(senhaLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginLabel)
                            .addComponent(loginTxtField)
                            .addComponent(senhaTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(entrarButton)))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaLabel)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entrarButton))
                .addGap(69, 69, 69)
                .addComponent(castradoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroButton)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTxtFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_loginTxtFieldActionPerformed

    private void loginTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginTxtFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == Teclas.ENTER) {
            this.entrarButton.doClick();
        }

    }//GEN-LAST:event_loginTxtFieldKeyPressed

    private void senhaTxtFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaTxtFieldKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == Teclas.ENTER) {
            this.entrarButton.doClick();
        }
    }//GEN-LAST:event_senhaTxtFieldKeyPressed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        // TODO add your handling code here:
        if(sys.login(loginTxtField.getText(),String.valueOf(senhaTxtField.getPassword()))){
            this.dialogoDeLogin.setTitle("Login Sucesso!! ");
            this.dialogoDeLogin.setVisible(true);
        }
        else  this.dialogoDeLogin.setTitle("Login Falha!! ");
            this.dialogoDeLogin.setVisible(true);
            
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        // TODO add your handling code here:
        gerenciadorTelas.abrirTelaCadastro();        
        
    }//GEN-LAST:event_cadastroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEntrada().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JLabel castradoLabel;
    private javax.swing.JDialog dialogoDeLogin;
    private javax.swing.JButton entrarButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTxtField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaTxtField;
    // End of variables declaration//GEN-END:variables
}
