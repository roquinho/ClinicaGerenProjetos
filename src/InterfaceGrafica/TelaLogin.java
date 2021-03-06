/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import brr.upe.poo.clinica.entidades.Usuarios;
import brr.upe.poo.clinica.persistencia.InterfaceRepositorioUsuarios;
import brr.upe.poo.clinica.persistencia.RepositorioUsuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author manoel
 */
public class TelaLogin extends javax.swing.JFrame {

    private TelaPrincipalClinica telaPrincipal;
    private TelaPrincipalAdministradores telaAdmin;
    
    public TelaLogin() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        senhaTExt = new javax.swing.JTextField();
        entrarBotao = new javax.swing.JButton();
        SairBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        getContentPane().add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 210, -1));
        getContentPane().add(senhaTExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, -1));

        entrarBotao.setText("Entrar");
        entrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(entrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        SairBotao.setText("sair");
        SairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(SairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarBotaoActionPerformed
        InterfaceRepositorioUsuarios ru = new RepositorioUsuarios();
        Usuarios usuario;
                usuario = ru.buscarUsuarioSenhaNome(senhaTExt.getText(),nomeText.getText());
         if(usuario.getTipoUsuario() == null) {
             JOptionPane.showMessageDialog(null, "usuario invalido");
         }       
         else if(usuario.getTipoUsuario().equals("administrador")){
             this.telaAdmin = new TelaPrincipalAdministradores();
             this.telaAdmin.setVisible(true);
         }
        else if(usuario.getTipoUsuario().equals("funcionario")) {
             this.telaPrincipal = new TelaPrincipalClinica();
             this.telaPrincipal.setVisible(true);
         }
 
    }//GEN-LAST:event_entrarBotaoActionPerformed

    private void SairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairBotaoActionPerformed
               dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SairBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SairBotao;
    private javax.swing.JButton entrarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField senhaTExt;
    // End of variables declaration//GEN-END:variables
}
