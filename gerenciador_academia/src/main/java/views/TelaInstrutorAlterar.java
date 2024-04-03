/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author tiovi
 */
public class TelaInstrutorAlterar extends javax.swing.JPanel {

    /**
     * Creates new form TelaAlterarCliente
     */
    public TelaInstrutorAlterar() {
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

        tf_Nome = new javax.swing.JTextField();
        lb_dataNasc = new javax.swing.JLabel();
        lb_Nome = new javax.swing.JLabel();
        lb_titPlano = new javax.swing.JLabel();
        lb_titDadosPess = new javax.swing.JLabel();
        lb_cliente = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_treino = new javax.swing.JLabel();
        lb_modalidade = new javax.swing.JLabel();
        lb_instrutor = new javax.swing.JLabel();
        lb_plano = new javax.swing.JLabel();
        lb_sideBar = new javax.swing.JLabel();
        lb_bairro = new javax.swing.JLabel();
        lb_tipoPlano = new javax.swing.JLabel();
        tf_bairro = new javax.swing.JTextField();
        cb_tipoPlano = new javax.swing.JComboBox<>();
        ftf_dataNasc2 = new javax.swing.JFormattedTextField();
        tf_Nome1 = new javax.swing.JTextField();
        lb_titCPF = new javax.swing.JLabel();
        lb_txtDeletar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_btDeletar = new javax.swing.JLabel();
        lb_txtAlterar = new javax.swing.JLabel();
        lb_btAlterar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(null);

        tf_Nome.setBackground(new java.awt.Color(153, 255, 102));
        tf_Nome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Nome.setForeground(new java.awt.Color(255, 255, 255));
        tf_Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });
        add(tf_Nome);
        tf_Nome.setBounds(330, 160, 320, 40);

        lb_dataNasc.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_dataNasc.setText("Data de Nascimento:");
        add(lb_dataNasc);
        lb_dataNasc.setBounds(670, 270, 200, 20);

        lb_Nome.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_Nome.setText("Nome:");
        add(lb_Nome);
        lb_Nome.setBounds(330, 270, 80, 20);

        lb_titPlano.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titPlano.setText("Plano");
        add(lb_titPlano);
        lb_titPlano.setBounds(330, 460, 170, 20);

        lb_titDadosPess.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titDadosPess.setText("Dados Pessoais:");
        add(lb_titDadosPess);
        lb_titDadosPess.setBounds(330, 240, 190, 20);

        lb_cliente.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cliente.setText("Cliente");
        lb_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_cliente);
        lb_cliente.setBounds(0, 220, 250, 40);

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preto.png"))); // NOI18N
        add(lb_logo);
        lb_logo.setBounds(30, 40, 190, 120);

        lb_treino.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_treino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_treino.setText("Treino");
        lb_treino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_treino);
        lb_treino.setBounds(0, 460, 250, 40);

        lb_modalidade.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_modalidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_modalidade.setText("Modalidade");
        lb_modalidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_modalidade);
        lb_modalidade.setBounds(0, 400, 250, 40);

        lb_instrutor.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lb_instrutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_instrutor.setText("Instrutor");
        lb_instrutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_instrutor);
        lb_instrutor.setBounds(0, 280, 250, 40);

        lb_plano.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_plano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_plano.setText("Plano");
        lb_plano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_plano);
        lb_plano.setBounds(0, 340, 250, 40);

        lb_sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sidebar_verde.png"))); // NOI18N
        add(lb_sideBar);
        lb_sideBar.setBounds(0, 0, 254, 720);

        lb_bairro.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_bairro.setText("Formação:");
        add(lb_bairro);
        lb_bairro.setBounds(330, 350, 120, 20);

        lb_tipoPlano.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_tipoPlano.setText("Tipo de Plano:");
        add(lb_tipoPlano);
        lb_tipoPlano.setBounds(330, 480, 120, 30);

        tf_bairro.setBackground(new java.awt.Color(238, 238, 238));
        tf_bairro.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_bairro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bairroActionPerformed(evt);
            }
        });
        add(tf_bairro);
        tf_bairro.setBounds(330, 370, 320, 40);

        cb_tipoPlano.setBackground(new java.awt.Color(238, 238, 238));
        cb_tipoPlano.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_tipoPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cb_tipoPlano);
        cb_tipoPlano.setBounds(330, 510, 300, 40);

        ftf_dataNasc2.setBackground(new java.awt.Color(238, 238, 238));
        ftf_dataNasc2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ftf_dataNasc2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        add(ftf_dataNasc2);
        ftf_dataNasc2.setBounds(670, 290, 210, 40);

        tf_Nome1.setBackground(new java.awt.Color(238, 238, 238));
        tf_Nome1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Nome1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Nome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_Nome1ActionPerformed(evt);
            }
        });
        add(tf_Nome1);
        tf_Nome1.setBounds(330, 290, 320, 40);

        lb_titCPF.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titCPF.setText("CPF selecionado");
        add(lb_titCPF);
        lb_titCPF.setBounds(330, 140, 190, 20);

        lb_txtDeletar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtDeletar.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtDeletar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtDeletar.setText("DELETAR INSTRUTOR");
        add(lb_txtDeletar);
        lb_txtDeletar.setBounds(980, 600, 260, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/linha-div.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(940, 0, 20, 720);

        lb_btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-vermelho.png"))); // NOI18N
        add(lb_btDeletar);
        lb_btDeletar.setBounds(980, 580, 260, 70);

        lb_txtAlterar.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtAlterar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAlterar.setText("ALTERAR DADOS");
        add(lb_txtAlterar);
        lb_txtAlterar.setBounds(980, 510, 260, 30);

        lb_btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-verde.png"))); // NOI18N
        add(lb_btAlterar);
        lb_btAlterar.setBounds(980, 490, 260, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void tf_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_bairroActionPerformed

    private void tf_Nome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_Nome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_Nome1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_tipoPlano;
    private javax.swing.JFormattedTextField ftf_dataNasc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_bairro;
    private javax.swing.JLabel lb_btAlterar;
    private javax.swing.JLabel lb_btDeletar;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_dataNasc;
    private javax.swing.JLabel lb_instrutor;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_modalidade;
    private javax.swing.JLabel lb_plano;
    private javax.swing.JLabel lb_sideBar;
    private javax.swing.JLabel lb_tipoPlano;
    private javax.swing.JLabel lb_titCPF;
    private javax.swing.JLabel lb_titDadosPess;
    private javax.swing.JLabel lb_titPlano;
    private javax.swing.JLabel lb_treino;
    private javax.swing.JLabel lb_txtAlterar;
    private javax.swing.JLabel lb_txtDeletar;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_Nome1;
    private javax.swing.JTextField tf_bairro;
    // End of variables declaration//GEN-END:variables
}
