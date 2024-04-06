/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controller.Main;

/**
 *
 * @author alunolages
 */
public class TelaTreinoAdicionar extends javax.swing.JPanel {

    public void apagarCheck(){
        lb_caixaComSelec1.setVisible(false);
        lb_caixaComSelec2.setVisible(false);
        lb_caixaComSelec3.setVisible(false);
        lb_caixaComSelec4.setVisible(false);
        lb_caixaComSelec5.setVisible(false);
    }
    
    public void checkVisible(){
        
    }
    
    public TelaTreinoAdicionar() {
        initComponents();
        apagarCheck();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_caixaComSelec5 = new javax.swing.JLabel();
        lb_caixaSemSelec5 = new javax.swing.JLabel();
        lb_caixaComSelec4 = new javax.swing.JLabel();
        lb_caixaSemSelec4 = new javax.swing.JLabel();
        lb_caixaComSelec3 = new javax.swing.JLabel();
        lb_caixaSemSelec3 = new javax.swing.JLabel();
        lb_caixaComSelec2 = new javax.swing.JLabel();
        lb_caixaSemSelec2 = new javax.swing.JLabel();
        lb_caixaComSelec1 = new javax.swing.JLabel();
        lb_caixaSemSelec1 = new javax.swing.JLabel();
        lb_Nome = new javax.swing.JLabel();
        lb_titEndereco = new javax.swing.JLabel();
        lb_titAddTreino = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_cliente = new javax.swing.JLabel();
        lb_treino = new javax.swing.JLabel();
        lb_modalidade = new javax.swing.JLabel();
        lb_exercicio = new javax.swing.JLabel();
        lb_instrutor = new javax.swing.JLabel();
        lb_plano = new javax.swing.JLabel();
        lb_sideBar = new javax.swing.JLabel();
        lb_txtAddCliente = new javax.swing.JLabel();
        lb_botaoAddCliente = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        lb_txtCaixa1 = new javax.swing.JLabel();
        lb_txtCaixa2 = new javax.swing.JLabel();
        lb_txtCaixa3 = new javax.swing.JLabel();
        lb_txtCaixa4 = new javax.swing.JLabel();
        lb_txtCaixa5 = new javax.swing.JLabel();
        lb_selecDia = new javax.swing.JLabel();
        cb_selecDia = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(null);

        lb_caixaComSelec5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        add(lb_caixaComSelec5);
        lb_caixaComSelec5.setBounds(330, 540, 30, 30);

        lb_caixaSemSelec5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        lb_caixaSemSelec5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaSemSelec5MouseClicked(evt);
            }
        });
        add(lb_caixaSemSelec5);
        lb_caixaSemSelec5.setBounds(330, 540, 30, 30);

        lb_caixaComSelec4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        add(lb_caixaComSelec4);
        lb_caixaComSelec4.setBounds(330, 500, 30, 30);

        lb_caixaSemSelec4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        lb_caixaSemSelec4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaSemSelec4MouseClicked(evt);
            }
        });
        add(lb_caixaSemSelec4);
        lb_caixaSemSelec4.setBounds(330, 500, 30, 30);

        lb_caixaComSelec3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        add(lb_caixaComSelec3);
        lb_caixaComSelec3.setBounds(330, 460, 30, 30);

        lb_caixaSemSelec3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        lb_caixaSemSelec3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaSemSelec3MouseClicked(evt);
            }
        });
        add(lb_caixaSemSelec3);
        lb_caixaSemSelec3.setBounds(330, 460, 30, 30);

        lb_caixaComSelec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        add(lb_caixaComSelec2);
        lb_caixaComSelec2.setBounds(330, 420, 30, 30);

        lb_caixaSemSelec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        lb_caixaSemSelec2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaSemSelec2MouseClicked(evt);
            }
        });
        add(lb_caixaSemSelec2);
        lb_caixaSemSelec2.setBounds(330, 420, 30, 30);

        lb_caixaComSelec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        add(lb_caixaComSelec1);
        lb_caixaComSelec1.setBounds(330, 380, 30, 30);

        lb_caixaSemSelec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        lb_caixaSemSelec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaSemSelec1MouseClicked(evt);
            }
        });
        add(lb_caixaSemSelec1);
        lb_caixaSemSelec1.setBounds(330, 380, 30, 30);

        lb_Nome.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_Nome.setText("Nome Treino:");
        add(lb_Nome);
        lb_Nome.setBounds(330, 160, 180, 30);

        lb_titEndereco.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titEndereco.setText("Músculo Inclusos");
        add(lb_titEndereco);
        lb_titEndereco.setBounds(330, 350, 320, 20);

        lb_titAddTreino.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titAddTreino.setText("Adicionar Treino");
        add(lb_titAddTreino);
        lb_titAddTreino.setBounds(330, 140, 170, 20);

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preto.png"))); // NOI18N
        add(lb_logo);
        lb_logo.setBounds(30, 40, 190, 120);

        lb_cliente.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cliente.setText("Cliente");
        lb_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_clienteMouseClicked(evt);
            }
        });
        add(lb_cliente);
        lb_cliente.setBounds(0, 190, 250, 40);

        lb_treino.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lb_treino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_treino.setText("Treino");
        lb_treino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_treino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_treinoMouseClicked(evt);
            }
        });
        add(lb_treino);
        lb_treino.setBounds(0, 490, 250, 40);

        lb_modalidade.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_modalidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_modalidade.setText("Modalidade");
        lb_modalidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_modalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_modalidadeMouseClicked(evt);
            }
        });
        add(lb_modalidade);
        lb_modalidade.setBounds(0, 430, 250, 40);

        lb_exercicio.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_exercicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exercicio.setText("Exercício");
        lb_exercicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_exercicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exercicioMouseClicked(evt);
            }
        });
        add(lb_exercicio);
        lb_exercicio.setBounds(0, 370, 250, 40);

        lb_instrutor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_instrutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_instrutor.setText("Instrutor");
        lb_instrutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_instrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_instrutorMouseClicked(evt);
            }
        });
        add(lb_instrutor);
        lb_instrutor.setBounds(0, 250, 250, 40);

        lb_plano.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_plano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_plano.setText("Plano");
        lb_plano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_plano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_planoMouseClicked(evt);
            }
        });
        add(lb_plano);
        lb_plano.setBounds(0, 310, 250, 40);

        lb_sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sidebar_verde.png"))); // NOI18N
        add(lb_sideBar);
        lb_sideBar.setBounds(0, 0, 254, 720);

        lb_txtAddCliente.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        lb_txtAddCliente.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAddCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAddCliente.setText("ADICIONAR INSTRUTOR");
        add(lb_txtAddCliente);
        lb_txtAddCliente.setBounds(950, 530, 260, 30);

        lb_botaoAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-azul.png"))); // NOI18N
        add(lb_botaoAddCliente);
        lb_botaoAddCliente.setBounds(950, 510, 260, 70);

        tf_Nome.setBackground(new java.awt.Color(238, 238, 238));
        tf_Nome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });
        add(tf_Nome);
        tf_Nome.setBounds(330, 190, 320, 40);

        lb_txtCaixa1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa1.setText("Peito");
        add(lb_txtCaixa1);
        lb_txtCaixa1.setBounds(360, 380, 180, 30);

        lb_txtCaixa2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa2.setText("Costas");
        add(lb_txtCaixa2);
        lb_txtCaixa2.setBounds(360, 420, 180, 30);

        lb_txtCaixa3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa3.setText("Braço");
        add(lb_txtCaixa3);
        lb_txtCaixa3.setBounds(360, 460, 180, 30);

        lb_txtCaixa4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa4.setText("Perna");
        add(lb_txtCaixa4);
        lb_txtCaixa4.setBounds(360, 500, 180, 30);

        lb_txtCaixa5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa5.setText("Ombro");
        add(lb_txtCaixa5);
        lb_txtCaixa5.setBounds(360, 540, 180, 30);

        lb_selecDia.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_selecDia.setText("Selecione um dia da semana:");
        add(lb_selecDia);
        lb_selecDia.setBounds(330, 240, 250, 30);

        cb_selecDia.setBackground(new java.awt.Color(153, 255, 51));
        cb_selecDia.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        cb_selecDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cb_selecDia);
        cb_selecDia.setBounds(330, 270, 320, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void lb_caixaSemSelec1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaSemSelec1MouseClicked
        checkVisible();
        lb_caixaSemSelec1.setVisible(false);
        lb_caixaComSelec1.setVisible(true);
    }//GEN-LAST:event_lb_caixaSemSelec1MouseClicked

    private void lb_caixaSemSelec2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaSemSelec2MouseClicked
        lb_caixaSemSelec2.setVisible(false);
        lb_caixaComSelec2.setVisible(true);
    }//GEN-LAST:event_lb_caixaSemSelec2MouseClicked

    private void lb_caixaSemSelec3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaSemSelec3MouseClicked
        lb_caixaSemSelec3.setVisible(false);
        lb_caixaComSelec3.setVisible(true);
    }//GEN-LAST:event_lb_caixaSemSelec3MouseClicked

    private void lb_caixaSemSelec4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaSemSelec4MouseClicked
        lb_caixaSemSelec4.setVisible(false);
        lb_caixaComSelec4.setVisible(true);
    }//GEN-LAST:event_lb_caixaSemSelec4MouseClicked

    private void lb_caixaSemSelec5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaSemSelec5MouseClicked
        lb_caixaSemSelec5.setVisible(false);
        lb_caixaComSelec5.setVisible(true);
    }//GEN-LAST:event_lb_caixaSemSelec5MouseClicked

    private void lb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_clienteMouseClicked
        Main.controllerManager.btAcessarTelaCliente();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_clienteMouseClicked

    private void lb_instrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_instrutorMouseClicked
        Main.controllerManager.btAcessarTelaInstrutor();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_instrutorMouseClicked

    private void lb_planoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_planoMouseClicked
        Main.controllerManager.btAcessarTelaPlano();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_planoMouseClicked

    private void lb_exercicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exercicioMouseClicked
        Main.controllerManager.btAcessartelaExercicio();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_exercicioMouseClicked

    private void lb_modalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_modalidadeMouseClicked
        Main.controllerManager.btAcessarTelaModalidade();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_modalidadeMouseClicked

    private void lb_treinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_treinoMouseClicked
        Main.controllerManager.btAcessarTelaTreino();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_treinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_selecDia;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_botaoAddCliente;
    private javax.swing.JLabel lb_caixaComSelec1;
    private javax.swing.JLabel lb_caixaComSelec2;
    private javax.swing.JLabel lb_caixaComSelec3;
    private javax.swing.JLabel lb_caixaComSelec4;
    private javax.swing.JLabel lb_caixaComSelec5;
    private javax.swing.JLabel lb_caixaSemSelec1;
    private javax.swing.JLabel lb_caixaSemSelec2;
    private javax.swing.JLabel lb_caixaSemSelec3;
    private javax.swing.JLabel lb_caixaSemSelec4;
    private javax.swing.JLabel lb_caixaSemSelec5;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_exercicio;
    private javax.swing.JLabel lb_instrutor;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_modalidade;
    private javax.swing.JLabel lb_plano;
    private javax.swing.JLabel lb_selecDia;
    private javax.swing.JLabel lb_sideBar;
    private javax.swing.JLabel lb_titAddTreino;
    private javax.swing.JLabel lb_titEndereco;
    private javax.swing.JLabel lb_treino;
    private javax.swing.JLabel lb_txtAddCliente;
    private javax.swing.JLabel lb_txtCaixa1;
    private javax.swing.JLabel lb_txtCaixa2;
    private javax.swing.JLabel lb_txtCaixa3;
    private javax.swing.JLabel lb_txtCaixa4;
    private javax.swing.JLabel lb_txtCaixa5;
    private javax.swing.JTextField tf_Nome;
    // End of variables declaration//GEN-END:variables
}
