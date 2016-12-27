  
package InterfaceGrafica;

import brr.upe.poo.clinica.entidades.Medicos;
import brr.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioCadastrarMedicos;
import brr.upe.poo.clinica.regraNegocio.Fachada;
import brr.upe.poo.clinica.regraNegocio.FachadaImplementa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaCadastrarMedicos extends javax.swing.JFrame {
      
    private String especialidade;
    
    public TelaCadastrarMedicos() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        cpfText = new javax.swing.JTextField();
        crmText = new javax.swing.JTextField();
        telefoneText = new javax.swing.JTextField();
        enderecoText = new javax.swing.JTextField();
        especialidadeText = new javax.swing.JComboBox<>();
        cadastarBotao = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();
        limparText = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cadastar Medicos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setText("cpf");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setText("crm");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel5.setText("endereco");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setText("Especialidade");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });
        getContentPane().add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 260, -1));

        cpfText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTextActionPerformed(evt);
            }
        });
        getContentPane().add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 110, -1));
        getContentPane().add(crmText, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 90, -1));
        getContentPane().add(telefoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 260, -1));
        getContentPane().add(enderecoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 80, -1));

        especialidadeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cardiologista", "pediatra", "ortopedista", " " }));
        especialidadeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeTextActionPerformed(evt);
            }
        });
        getContentPane().add(especialidadeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        cadastarBotao.setText("Salvar");
        cadastarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(cadastarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 80, -1));

        sairBotao.setText("sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 80, -1));

        limparText.setText("limpar textos");
        limparText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTextActionPerformed(evt);
            }
        });
        getContentPane().add(limparText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

    private void cpfTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTextActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
                     dispose();       
    }//GEN-LAST:event_sairBotaoActionPerformed

    private void cadastarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarBotaoActionPerformed
        Long cpf = new Long(11); Long crm = new Long(10);
        crm = Long.parseLong(crmText.getText());
        cpf = Long.parseLong(cpfText.getText());
        
        Medicos medico = new Medicos(cpf, nomeText.getText(),telefoneText.getText() , enderecoText.getText(),crm, this.especialidade);
        Fachada fachada = new FachadaImplementa();
        try {
            fachada.cadastrarMedicos(medico);
        } catch (ExceptionRegraNegocioCadastrarMedicos ex) {
            Logger.getLogger(TelaCadastrarMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadastarBotaoActionPerformed

    private void especialidadeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeTextActionPerformed
        this.especialidade = new String();
        
         if(especialidadeText.getSelectedIndex()==0) {
             this.especialidade = "cardiologista";
         }
         else if(especialidadeText.getSelectedIndex()==1) {
             this.especialidade = "pediatra";
         }
         else if(especialidadeText.getSelectedIndex()==2) {
             this.especialidade = "ortopedista";
         }
    }//GEN-LAST:event_especialidadeTextActionPerformed

    private void limparTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTextActionPerformed
       nomeText.setText("");
       cpfText.setText("");
       crmText.setText("");
       enderecoText.setText("");
       telefoneText.setText("");
       especialidadeText.setToolTipText("");
       
    }//GEN-LAST:event_limparTextActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastarBotao;
    private javax.swing.JTextField cpfText;
    private javax.swing.JTextField crmText;
    private javax.swing.JTextField enderecoText;
    private javax.swing.JComboBox<String> especialidadeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparText;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton sairBotao;
    private javax.swing.JTextField telefoneText;
    // End of variables declaration//GEN-END:variables
}
