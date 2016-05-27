/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

/**
 *
 * @author manoel
 */
public class TelaFiltrarMedicos extends javax.swing.JFrame {

    /**
     * Creates new form TelaFiltrarMedicos
     */
    public TelaFiltrarMedicos() {
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
        cpfText = new javax.swing.JTextField();
        crmText = new javax.swing.JTextField();
        especialidadeText = new javax.swing.JComboBox<>();
        cpfBotao = new javax.swing.JButton();
        nomeBotao = new javax.swing.JButton();
        especialdiadeBotao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sairBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("tela filtrar medicos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 60));

        jLabel2.setText("filtrar por cpf");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("filtrar por nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setText("filtrar por especialidade");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 90, -1));
        getContentPane().add(crmText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, -1));

        especialidadeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(especialidadeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        cpfBotao.setText("filtrar");
        getContentPane().add(cpfBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        nomeBotao.setText("filtrar");
        getContentPane().add(nomeBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        especialdiadeBotao.setText("filtrar");
        getContentPane().add(especialdiadeBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "cpf", "telefone", "especialidade", "endereco", "crm"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 630, 90));

        sairBotao.setText("sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
                dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_sairBotaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cpfBotao;
    private javax.swing.JTextField cpfText;
    private javax.swing.JTextField crmText;
    private javax.swing.JButton especialdiadeBotao;
    private javax.swing.JComboBox<String> especialidadeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nomeBotao;
    private javax.swing.JButton sairBotao;
    // End of variables declaration//GEN-END:variables
}