/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ESCOLA
 */
public class JFLogin extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public JFLogin() {
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
        jTextFieldwitiin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldSENHA = new javax.swing.JPasswordField();
        jButtonentrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autêntricaçâo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldwitiin.setText("witiin");
        jTextFieldwitiin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldwitiinActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldwitiin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 180, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        jPasswordFieldSENHA.setText("SENHA");
        jPasswordFieldSENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSENHAActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordFieldSENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 180, 20));

        jButtonentrar.setText("entrar");
        jButtonentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonentrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 280, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wwwwwwwwwwwwwww.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fffffffffffffff.png"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, 460));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/qqqwww.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, -10, 210, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldSENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSENHAActionPerformed

    private void jTextFieldwitiinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldwitiinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldwitiinActionPerformed

    private void jButtonentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonentrarActionPerformed
        // TODO add your handling code here:
        String usuario = jTextFieldwitiin.getText();
        String senha = jPasswordFieldSENHA.getText ();
        
        if(usuario.equals("witiin") &&
         senha.equals("senha")){
        Main main = new Main();
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        main.setVisible(true);
        dispose();
     
     }else{
        JOptionPane.showMessageDialog
        (null, "login ou senha invalidos!");
      }
    }//GEN-LAST:event_jButtonentrarActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonentrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSENHA;
    private javax.swing.JTextField jTextFieldwitiin;
    // End of variables declaration//GEN-END:variables
}
