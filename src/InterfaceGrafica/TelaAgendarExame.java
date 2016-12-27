/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import brr.upe.poo.clinica.entidades.Exames;
import brr.upe.poo.clinica.entidades.Pacientes;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioAgendarExame;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioPacienteBuscarPaciente;
import brr.upe.poo.clinica.regraNegocio.Fachada;
import brr.upe.poo.clinica.regraNegocio.FachadaImplementa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaAgendarExame extends javax.swing.JFrame {
    
      private String diaExame;
      private String mesExame;
      private String horaExame;
      private String tipoExame;
            
    public TelaAgendarExame() {
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
        cpfPacienteText = new javax.swing.JTextField();
        diaExameText = new javax.swing.JComboBox<>();
        horaExameText = new javax.swing.JComboBox<>();
        mesExameText = new javax.swing.JComboBox<>();
        tipoExameText = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        agendarBotao = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Agendar Exames");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jLabel2.setText("Cpf do paciente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(cpfPacienteText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, -1));

        diaExameText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dia 1", "dia 2", "dia 3", "dia 4", "dia 5", "dia 6", "dia 7", "dia 8", "dia 9", "dia 10", "dia 11", "dia 12", "dia 13", "dia 14", "dia 15", "dia 16", "dia 17", "dia 18", "dia 19", "dia 20", " " }));
        diaExameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaExameTextActionPerformed(evt);
            }
        });
        getContentPane().add(diaExameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        horaExameText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "09:00", "10:00", "11:00", "14:00", "15:30", "16:30" }));
        getContentPane().add(horaExameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        mesExameText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mes 1", "mes 2", "mes 3", "mes 4", "mes 5", "mes 6", "mes 7", "mes 8", "mes 9", "mes 10", "mes 11", "mes 12" }));
        getContentPane().add(mesExameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        tipoExameText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cardiologia", "sangue", "radiografia", "indoscopia" }));
        getContentPane().add(tipoExameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel3.setText("Dia do Exame");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setText("Hora do Exame");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setText("tipo de Exame");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        agendarBotao.setText("agendar");
        agendarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(agendarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        sairBotao.setText("sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diaExameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaExameTextActionPerformed
        
    }//GEN-LAST:event_diaExameTextActionPerformed

    private void agendarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarBotaoActionPerformed
        this.diaExame  = new String();
        this.diaExame = String.valueOf(diaExameText.getSelectedItem());
        this.mesExame = new String();
        this.mesExame = String.valueOf(mesExameText.getSelectedItem());
        this.horaExame = new String();
        this.horaExame = String.valueOf(horaExameText.getSelectedItem());
        this.tipoExame = new String();
        this.tipoExame = String.valueOf(tipoExameText.getSelectedItem());
        String dataExame = new String();
        dataExame = ""+this.diaExame+"/"+""+this.mesExame;
        
            Pacientes paciente = new Pacientes();
            Long cpf = new Long(11);cpf = Long.parseLong(cpfPacienteText.getText());
             Fachada fachada = new FachadaImplementa();
          try {            
              paciente = fachada.buscarPacienteCpf(cpf);
          } catch (ExceptionRegraNegocioPacienteBuscarPaciente ex) {
              Logger.getLogger(TelaAgendarConsultas.class.getName()).log(Level.SEVERE, null, ex);
          }
          Exames exame = new Exames(tipoExame, dataExame, horaExame, paciente);
          try {
              fachada.agendarExame(exame);
          } catch (ExceptionRegraNegocioAgendarExame ex) {
              Logger.getLogger(TelaAgendarExame.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_agendarBotaoActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
        dispose();
    }//GEN-LAST:event_sairBotaoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agendarBotao;
    private javax.swing.JTextField cpfPacienteText;
    private javax.swing.JComboBox<String> diaExameText;
    private javax.swing.JComboBox<String> horaExameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mesExameText;
    private javax.swing.JButton sairBotao;
    private javax.swing.JComboBox<String> tipoExameText;
    // End of variables declaration//GEN-END:variables
}
