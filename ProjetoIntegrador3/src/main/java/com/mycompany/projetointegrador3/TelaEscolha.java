/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetointegrador3;


public class TelaEscolha extends javax.swing.JFrame {

     
    public TelaEscolha() {
        initComponents();
    }
    public TelaEscolha(Usuario u){
    initComponents();
        if (u.getTipo().equalsIgnoreCase("adiministrador")) {
            BotaoCadastroAlunos.setEnabled(true);
            BotaoCadastroProfessores.setEnabled(true);
            BotaoFinanceiro.setEnabled(true);
            BotaoCadastroTurmas.setEnabled(true);
        } else if (u.getTipo().equalsIgnoreCase("operador")) {
            BotaoCadastroAlunos.setEnabled(true);
            BotaoCadastroProfessores.setEnabled(true);
            BotaoFinanceiro.setEnabled(false);
            BotaoCadastroTurmas.setEnabled(false);
        } else {
            BotaoCadastroAlunos.setEnabled(true);
            BotaoCadastroProfessores.setEnabled(false);
            BotaoFinanceiro.setEnabled(false);
            BotaoCadastroTurmas.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoCadastroTurmas = new javax.swing.JButton();
        BotaoCadastroProfessores = new javax.swing.JButton();
        BotaoFinanceiro = new javax.swing.JButton();
        BotaoCadastroAlunos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(161, 184, 214));

        BotaoCadastroTurmas.setBackground(new java.awt.Color(0, 102, 255));
        BotaoCadastroTurmas.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        BotaoCadastroTurmas.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastroTurmas.setText("Cadastro Turmas");
        BotaoCadastroTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroTurmasActionPerformed(evt);
            }
        });

        BotaoCadastroProfessores.setBackground(new java.awt.Color(0, 102, 255));
        BotaoCadastroProfessores.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        BotaoCadastroProfessores.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastroProfessores.setText("Cadastro Professores");
        BotaoCadastroProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroProfessoresActionPerformed(evt);
            }
        });

        BotaoFinanceiro.setBackground(new java.awt.Color(0, 102, 255));
        BotaoFinanceiro.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        BotaoFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        BotaoFinanceiro.setText("Financeiro");
        BotaoFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoFinanceiroActionPerformed(evt);
            }
        });

        BotaoCadastroAlunos.setBackground(new java.awt.Color(0, 102, 255));
        BotaoCadastroAlunos.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        BotaoCadastroAlunos.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastroAlunos.setText("Cadastro Alunos");
        BotaoCadastroAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroAlunosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoFinanceiro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastroAlunos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoCadastroProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastroTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastroProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastroAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastroTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastroAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroAlunosActionPerformed
        TelaCadastroAlunos tca = new TelaCadastroAlunos();
        tca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoCadastroAlunosActionPerformed

    private void BotaoCadastroProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroProfessoresActionPerformed
        TelaCadastroProfessores tcp = new TelaCadastroProfessores();
        tcp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoCadastroProfessoresActionPerformed

    private void BotaoCadastroTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroTurmasActionPerformed
        TelaCadastroTurma tct = new TelaCadastroTurma();
        tct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoCadastroTurmasActionPerformed

    private void BotaoFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoFinanceiroActionPerformed
        TelaCalcularFinanceiro tcf = new TelaCalcularFinanceiro();
        tcf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotaoFinanceiroActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEscolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastroAlunos;
    private javax.swing.JButton BotaoCadastroProfessores;
    private javax.swing.JButton BotaoCadastroTurmas;
    private javax.swing.JButton BotaoFinanceiro;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
