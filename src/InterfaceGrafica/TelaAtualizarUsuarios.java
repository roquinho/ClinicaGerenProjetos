/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import brr.upe.poo.clinica.entidades.Usuarios;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioAtualizarUsuarios;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioDeletarUsuarios;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegociofiltrarUsuarios;
import brr.upe.poo.clinica.regraNegocio.Fachada;
import brr.upe.poo.clinica.regraNegocio.FachadaImplementa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaAtualizarUsuarios extends javax.swing.JFrame {

    private Usuarios usuario;
    
    public TelaAtualizarUsuarios() {
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
        cpfText = new javax.swing.JTextField();
        filtrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        senhaText = new javax.swing.JTextField();
        atualizarBotao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tipoUsuarioText = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("atualizar usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabel2.setText("Digite cpf do usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        getContentPane().add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, -1));

        filtrar.setText("filtrar");
        filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarActionPerformed(evt);
            }
        });
        getContentPane().add(filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 70, -1));

        jLabel3.setText("nome ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setText("senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        getContentPane().add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 230, -1));
        getContentPane().add(senhaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 130, -1));

        atualizarBotao.setText("atualizar");
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 80, -1));

        jLabel6.setText("tipo de usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        tipoUsuarioText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "funcionario" }));
        getContentPane().add(tipoUsuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarActionPerformed
        Fachada fachada  = new FachadaImplementa();
       this.usuario = new Usuarios();
        try {
            this.usuario = fachada.filtrarUsuarioCpf(cpfText.getText());
        } catch (ExceptionRegraNegociofiltrarUsuarios ex) {
            Logger.getLogger(TelaDeletarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_filtrarActionPerformed

    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBotaoActionPerformed

       String tipoUsuario = new String();
       tipoUsuario = String.valueOf(tipoUsuarioText.getSelectedItem());
       
        Fachada fachada = new FachadaImplementa();
       this.usuario.setNome(nomeText.getText());
       this.usuario.setSenha(senhaText.getText());
       this.usuario.setTipoUsuario(tipoUsuario);
       
        try {
            fachada.atualizarUsuario(this.usuario);
        } catch (ExceptionRegraNegocioAtualizarUsuarios ex) {
            Logger.getLogger(TelaAtualizarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_atualizarBotaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JTextField cpfText;
    private javax.swing.JButton filtrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextField senhaText;
    private javax.swing.JComboBox<String> tipoUsuarioText;
    // End of variables declaration//GEN-END:variables
}
