/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import brr.upe.poo.clinica.entidades.Usuarios;
import brr.upe.poo.clinica.persistencia.InterfaceRepositorioUsuarios;
import brr.upe.poo.clinica.persistencia.RepositorioUsuarios;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioCadastrarUsuarios;
import brr.upe.poo.clinica.regraNegocio.Fachada;
import brr.upe.poo.clinica.regraNegocio.FachadaImplementa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaUsuariosCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form TelaUsuarios
     */
    public TelaUsuariosCadastrar() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        cpfText = new javax.swing.JTextField();
        senhaText = new javax.swing.JTextField();
        tipoText = new javax.swing.JComboBox<>();
        salvarBotao = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 11, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jLabel2.setText("NomeUsuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setText("Cpf");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setText("Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setText("tipo de usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        getContentPane().add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 200, -1));
        getContentPane().add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 110, -1));
        getContentPane().add(senhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 110, -1));

        tipoText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "funcionario" }));
        getContentPane().add(tipoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        salvarBotao.setText("cadastrar");
        salvarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(salvarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        sairBotao.setText("Sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBotaoActionPerformed
        String tipoUsuario = new String();
        tipoUsuario = String.valueOf(tipoText.getSelectedItem());
                
        Fachada fachada = new FachadaImplementa();
        Usuarios usuario = new Usuarios(nomeText.getText(), senhaText.getText(), tipoUsuario, cpfText.getText());
        try {
            fachada.cadastrarUsuario(usuario);
        } catch (ExceptionRegraNegocioCadastrarUsuarios ex) {
            Logger.getLogger(TelaUsuariosCadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_salvarBotaoActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
        dispose();
    }//GEN-LAST:event_sairBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton sairBotao;
    private javax.swing.JButton salvarBotao;
    private javax.swing.JTextField senhaText;
    private javax.swing.JComboBox<String> tipoText;
    // End of variables declaration//GEN-END:variables
}
