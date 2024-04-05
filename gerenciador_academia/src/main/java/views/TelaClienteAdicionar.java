/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controller.Main;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiovi
 */
public class TelaClienteAdicionar extends javax.swing.JPanel {

    /**
     * Creates new form TelaClienteAdicionar
     */
    public TelaClienteAdicionar() {
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

        lb_cliente = new javax.swing.JLabel();
        lb_treino = new javax.swing.JLabel();
        lb_modalidade = new javax.swing.JLabel();
        lb_exercicio = new javax.swing.JLabel();
        lb_instrutor = new javax.swing.JLabel();
        lb_plano = new javax.swing.JLabel();
        tf_cep = new javax.swing.JTextField();
        tf_Nome = new javax.swing.JTextField();
        lb_dataNasc = new javax.swing.JLabel();
        lb_CPF = new javax.swing.JLabel();
        lb_Nome = new javax.swing.JLabel();
        lb_titPlano = new javax.swing.JLabel();
        lb_titTreino = new javax.swing.JLabel();
        lb_titEndereco = new javax.swing.JLabel();
        lb_titDadosPess = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_sideBar = new javax.swing.JLabel();
        lb_Rua = new javax.swing.JLabel();
        lb_numero = new javax.swing.JLabel();
        lb_bairro = new javax.swing.JLabel();
        lb_cep = new javax.swing.JLabel();
        lb_tipoPlano = new javax.swing.JLabel();
        lb_txtAddCliente = new javax.swing.JLabel();
        lb_botaoAddCliente = new javax.swing.JLabel();
        tf_numero = new javax.swing.JTextField();
        tf_rua = new javax.swing.JTextField();
        cb_treino = new javax.swing.JComboBox<>();
        tf_bairro = new javax.swing.JTextField();
        cb_tipoPlano = new javax.swing.JComboBox<>();
        ftf_cpf = new javax.swing.JFormattedTextField();
        ftf_dataNasc = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lb_cliente.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lb_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cliente.setText("Cliente");
        lb_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_cliente);
        lb_cliente.setBounds(0, 190, 250, 40);

        lb_treino.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_treino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_treino.setText("Treino");
        lb_treino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_treino);
        lb_treino.setBounds(0, 490, 250, 40);

        lb_modalidade.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_modalidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_modalidade.setText("Modalidade");
        lb_modalidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_modalidade);
        lb_modalidade.setBounds(0, 430, 250, 40);

        lb_exercicio.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_exercicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_exercicio.setText("Exercício");
        lb_exercicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_exercicio);
        lb_exercicio.setBounds(0, 370, 250, 40);

        lb_instrutor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_instrutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_instrutor.setText("Instrutor");
        lb_instrutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_instrutor);
        lb_instrutor.setBounds(0, 250, 250, 40);

        lb_plano.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_plano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_plano.setText("Plano");
        lb_plano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_plano);
        lb_plano.setBounds(0, 310, 250, 40);

        tf_cep.setBackground(new java.awt.Color(238, 238, 238));
        tf_cep.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_cep.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cepActionPerformed(evt);
            }
        });
        add(tf_cep);
        tf_cep.setBounds(620, 385, 260, 40);

        tf_Nome.setBackground(new java.awt.Color(238, 238, 238));
        tf_Nome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });
        add(tf_Nome);
        tf_Nome.setBounds(330, 120, 320, 40);

        lb_dataNasc.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_dataNasc.setText("Data de Nascimento:");
        add(lb_dataNasc);
        lb_dataNasc.setBounds(670, 90, 200, 30);

        lb_CPF.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_CPF.setText("CPF:");
        add(lb_CPF);
        lb_CPF.setBounds(330, 170, 80, 20);

        lb_Nome.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_Nome.setText("Nome:");
        add(lb_Nome);
        lb_Nome.setBounds(330, 90, 80, 30);

        lb_titPlano.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titPlano.setText("Plano");
        add(lb_titPlano);
        lb_titPlano.setBounds(330, 460, 170, 20);

        lb_titTreino.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titTreino.setText("Treino");
        add(lb_titTreino);
        lb_titTreino.setBounds(330, 580, 170, 30);

        lb_titEndereco.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titEndereco.setText("Endereço");
        add(lb_titEndereco);
        lb_titEndereco.setBounds(330, 250, 170, 30);

        lb_titDadosPess.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titDadosPess.setText("Dados Pessoais");
        add(lb_titDadosPess);
        lb_titDadosPess.setBounds(330, 70, 170, 20);

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preto.png"))); // NOI18N
        add(lb_logo);
        lb_logo.setBounds(30, 40, 190, 120);

        lb_sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sidebar_verde.png"))); // NOI18N
        add(lb_sideBar);
        lb_sideBar.setBounds(0, 0, 254, 720);

        lb_Rua.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_Rua.setText("Rua:");
        add(lb_Rua);
        lb_Rua.setBounds(330, 280, 80, 30);

        lb_numero.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_numero.setText("Número:");
        add(lb_numero);
        lb_numero.setBounds(670, 280, 120, 30);

        lb_bairro.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_bairro.setText("Bairro:");
        add(lb_bairro);
        lb_bairro.setBounds(330, 365, 120, 20);

        lb_cep.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_cep.setText("CEP:");
        add(lb_cep);
        lb_cep.setBounds(620, 365, 120, 20);

        lb_tipoPlano.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_tipoPlano.setText("Tipo de Plano:");
        add(lb_tipoPlano);
        lb_tipoPlano.setBounds(330, 480, 120, 30);

        lb_txtAddCliente.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        lb_txtAddCliente.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAddCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAddCliente.setText("ADICIONAR CLIENTE");
        lb_txtAddCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_txtAddClienteMouseClicked(evt);
            }
        });
        add(lb_txtAddCliente);
        lb_txtAddCliente.setBounds(970, 600, 260, 30);

        lb_botaoAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-azul.png"))); // NOI18N
        add(lb_botaoAddCliente);
        lb_botaoAddCliente.setBounds(970, 580, 260, 70);

        tf_numero.setBackground(new java.awt.Color(238, 238, 238));
        tf_numero.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_numero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_numeroActionPerformed(evt);
            }
        });
        add(tf_numero);
        tf_numero.setBounds(670, 310, 210, 40);

        tf_rua.setBackground(new java.awt.Color(238, 238, 238));
        tf_rua.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_rua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ruaActionPerformed(evt);
            }
        });
        add(tf_rua);
        tf_rua.setBounds(330, 310, 320, 40);

        cb_treino.setBackground(new java.awt.Color(235, 235, 235));
        cb_treino.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_treino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cb_treino);
        cb_treino.setBounds(330, 610, 300, 40);

        tf_bairro.setBackground(new java.awt.Color(238, 238, 238));
        tf_bairro.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_bairro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bairroActionPerformed(evt);
            }
        });
        add(tf_bairro);
        tf_bairro.setBounds(330, 385, 260, 40);

        cb_tipoPlano.setBackground(new java.awt.Color(235, 235, 235));
        cb_tipoPlano.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_tipoPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cb_tipoPlano);
        cb_tipoPlano.setBounds(332, 510, 300, 40);

        ftf_cpf.setBackground(new java.awt.Color(228, 228, 228));
        ftf_cpf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            ftf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(ftf_cpf);
        ftf_cpf.setBounds(330, 190, 320, 40);

        ftf_dataNasc.setBackground(new java.awt.Color(228, 228, 228));
        ftf_dataNasc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ftf_dataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        add(ftf_dataNasc);
        ftf_dataNasc.setBounds(670, 120, 200, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void tf_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cepActionPerformed

    private void tf_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_numeroActionPerformed

    private void tf_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ruaActionPerformed

    private void tf_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bairroActionPerformed

    private void lb_txtAddClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_txtAddClienteMouseClicked
        try {
            Main.controllerManager.getClienteAdicionarController().btAddCliente(tf_Nome.getText(), ftf_cpf.getText(),
                    ftf_dataNasc.getText(), tf_cep.getText(), tf_rua.getText(), tf_bairro.getText(), 
                    tf_numero.getText(),String.valueOf(cb_tipoPlano.getSelectedIndex() + 1), String.valueOf(cb_treino.getSelectedIndex() + 1));
        } catch (ParseException ex) {
            Logger.getLogger(TelaClienteAdicionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lb_txtAddClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_tipoPlano;
    private javax.swing.JComboBox<String> cb_treino;
    private javax.swing.JFormattedTextField ftf_cpf;
    private javax.swing.JFormattedTextField ftf_dataNasc;
    private javax.swing.JLabel lb_CPF;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_Rua;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_botaoAddCliente;
    private javax.swing.JLabel lb_cep;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_dataNasc;
    private javax.swing.JLabel lb_exercicio;
    private javax.swing.JLabel lb_instrutor;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_modalidade;
    private javax.swing.JLabel lb_numero;
    private javax.swing.JLabel lb_plano;
    private javax.swing.JLabel lb_sideBar;
    private javax.swing.JLabel lb_tipoPlano;
    private javax.swing.JLabel lb_titDadosPess;
    private javax.swing.JLabel lb_titEndereco;
    private javax.swing.JLabel lb_titPlano;
    private javax.swing.JLabel lb_titTreino;
    private javax.swing.JLabel lb_treino;
    private javax.swing.JLabel lb_txtAddCliente;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_bairro;
    private javax.swing.JTextField tf_cep;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_rua;
    // End of variables declaration//GEN-END:variables
}
