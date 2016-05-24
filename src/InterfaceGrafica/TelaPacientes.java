/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import br.upe.poo.clinica.entidades.Pacientes;
import br.upe.poo.clinica.persistencia.InterfaceRepositorioPacientes;
import br.upe.poo.clinica.persistencia.RepositorioPacientes;
import br.upe.poo.clinica.regraNegocio.Fachada;
import br.upe.poo.clinica.regraNegocio.FachadaImplementa;
import br.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioPacientesCadastrar;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaPacientes extends javax.swing.JFrame {

    private String sexo;
    
    public TelaPacientes() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NomeText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        enderecoText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telefText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cpfText = new javax.swing.JTextField();
        sexoText = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dataNascimentoText = new javax.swing.JFormattedTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 324, 400, -1));

        jLabel4.setText("                     Tela cadastrar Pacientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Nome do paciente");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, -1));
        jPanel4.add(NomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 21, 254, -1));

        jLabel6.setText("endereco");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 75, -1));
        jPanel4.add(enderecoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 59, 254, -1));

        jLabel7.setText("cpf");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        jPanel4.add(telefText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, -1));

        jLabel8.setText("telefone");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        cpfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTextActionPerformed(evt);
            }
        });
        jPanel4.add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, -1));

        sexoText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        sexoText.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sexoTextItemStateChanged(evt);
            }
        });
        sexoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoTextActionPerformed(evt);
            }
        });
        jPanel4.add(sexoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 192, 90, -1));

        jLabel9.setText("sexo");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, -1, -1));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, 30));

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        jPanel4.add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 80, 30));

        jLabel1.setText("Data de nascimento");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, -1));

        dataNascimentoText.setText("  /  /    ");
        dataNascimentoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascimentoTextActionPerformed(evt);
            }
        });
        jPanel4.add(dataNascimentoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 50, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sexoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoTextActionPerformed
   sexo = new String();
   if(sexoText.getSelectedIndex()==0) {
       sexo = "masculino";
   }
   else{
       sexo = "feminino";
   }
    }//GEN-LAST:event_sexoTextActionPerformed

    private void sexoTextItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sexoTextItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoTextItemStateChanged

    private void cpfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTextActionPerformed
          
    }//GEN-LAST:event_cpfTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                 
    Long cpf = new Long(11);
    cpf = Long.parseLong(cpfText.getText());
    String dataNascimento = new String();
    dataNascimento = dataNascimentoText.getText();
    Fachada fachada = new FachadaImplementa();
      Pacientes paciente = new Pacientes(cpf,NomeText.getText(), enderecoText.getText(), telefText.getText(), sexo,dataNascimento);
        try {
            fachada.cadastrarPaciente(paciente);
        } catch (ExceptionRegraNegocioPacientesCadastrar ex) {
            Logger.getLogger(TelaPacientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void dataNascimentoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascimentoTextActionPerformed


    }//GEN-LAST:event_dataNascimentoTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NomeText;
    private javax.swing.JTextField cpfText;
    private javax.swing.JFormattedTextField dataNascimentoText;
    private javax.swing.JTextField enderecoText;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton sairButton;
    private javax.swing.JComboBox<String> sexoText;
    private javax.swing.JTextField telefText;
    // End of variables declaration//GEN-END:variables
}
