/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import brr.upe.poo.clinica.entidades.Exames;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioFiltrarExame;
import brr.upe.poo.clinica.regraNegocio.Fachada;
import brr.upe.poo.clinica.regraNegocio.FachadaImplementa;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaFitrarExames extends javax.swing.JFrame {

    private Exames exame;
    
    public TelaFitrarExames() {
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        nomeText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("filtrar exames");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabel2.setText("filtrar por cpf");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        getContentPane().add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, -1));

        jLabel3.setText("filtrar por nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jButton1.setText("Filtrar por cpf");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 70, -1));
        getContentPane().add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 130, -1));

        jButton3.setText("filtrar por nome");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "nome do paciente", "cpf do paciente", "dia da consulta", "hora da consulta", "tipo do exame"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 580, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Long cpf = new Long(11);cpf = Long.parseLong(cpfText.getText());
        Fachada fachada = new FachadaImplementa();
        this.exame = new Exames();
        try {
           exame =  fachada.filtrarExameCpfPaciente(cpf);
        jTable1.setValueAt(this.exame.getPaciente().getNome(), 0, 0);
        jTable1.setValueAt(this.exame.getPaciente().getCpf(), 0, 1);
        jTable1.setValueAt(this.exame.getDataExame(), 0, 2);
        jTable1.setValueAt(this.exame.getHoraExame(), 0, 3);
        jTable1.setValueAt(this.exame.getTipoExame(), 0, 4);
       
           
        } catch (ExceptionRegraNegocioFiltrarExame ex) {
            Logger.getLogger(TelaFitrarExames.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        List<Exames> exames;
        Fachada fachada = new FachadaImplementa();
        try {
            exames = fachada.filtrarExameNomePaciente(nomeText.getText());
             for(int i = 0; i <exames.size(); i++ ) {
                 
        jTable1.setValueAt(exames.get(i).getPaciente().getNome(), 0, 0);
        jTable1.setValueAt(exames.get(i).getPaciente().getCpf(), 0, 1);
        jTable1.setValueAt(exames.get(i).getDataExame(), 0, 2);
        jTable1.setValueAt(exames.get(i).getHoraExame(), 0, 3);
        jTable1.setValueAt(exames.get(i).getTipoExame(), 0, 4);
             }
       
        } catch (ExceptionRegraNegocioFiltrarExame ex) {
            Logger.getLogger(TelaFitrarExames.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeText;
    // End of variables declaration//GEN-END:variables
}
