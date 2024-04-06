package views;

import controller.Main;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Modalidade;

public class TelaInstrutorAdicionar extends javax.swing.JPanel {

    private List<Modalidade> listaModalidade;
    
    public void preencheCbModalidade(){
        int i = 0;
        
        for(Modalidade modalidade : listaModalidade){
            cb_tipoModalidade.addItem(listaModalidade.get(i).getNome());
            i++;
        }
    }
    
    public void addInstrutor(){
        
    }
    
    public TelaInstrutorAdicionar() {
        initComponents();
        this.listaModalidade = Main.controllerManager.getApplicationModel().getModalidadeDAO().selectModalidadeSql();
        
        preencheCbModalidade();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_Nome = new javax.swing.JTextField();
        lb_cliente = new javax.swing.JLabel();
        lb_treino = new javax.swing.JLabel();
        lb_modalidade = new javax.swing.JLabel();
        lb_exercicio = new javax.swing.JLabel();
        lb_instrutor = new javax.swing.JLabel();
        lb_plano = new javax.swing.JLabel();
        lb_dataNasc = new javax.swing.JLabel();
        lb_CPF = new javax.swing.JLabel();
        lb_Nome = new javax.swing.JLabel();
        lb_titModalidade = new javax.swing.JLabel();
        lb_titFormacao = new javax.swing.JLabel();
        lb_titDadosPess = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_sideBar = new javax.swing.JLabel();
        lb_tipoModalidade = new javax.swing.JLabel();
        lb_txtAddInstrutor = new javax.swing.JLabel();
        lb_botaoAddInstrutor = new javax.swing.JLabel();
        tf_Formacao = new javax.swing.JTextField();
        cb_tipoModalidade = new javax.swing.JComboBox<>();
        ftf_cpf = new javax.swing.JFormattedTextField();
        ftf_dataNasc = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setRequestFocusEnabled(false);
        setLayout(null);

        tf_Nome.setBackground(new java.awt.Color(238, 238, 238));
        tf_Nome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });
        add(tf_Nome);
        tf_Nome.setBounds(330, 210, 320, 40);

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

        lb_treino.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
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

        lb_instrutor.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
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

        lb_dataNasc.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_dataNasc.setText("Data de Nascimento:");
        add(lb_dataNasc);
        lb_dataNasc.setBounds(670, 180, 200, 30);

        lb_CPF.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_CPF.setText("CPF:");
        add(lb_CPF);
        lb_CPF.setBounds(330, 260, 80, 20);

        lb_Nome.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_Nome.setText("Nome:");
        add(lb_Nome);
        lb_Nome.setBounds(330, 180, 80, 30);

        lb_titModalidade.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titModalidade.setText("Modalidade");
        add(lb_titModalidade);
        lb_titModalidade.setBounds(330, 450, 170, 20);

        lb_titFormacao.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titFormacao.setText("Formação");
        add(lb_titFormacao);
        lb_titFormacao.setBounds(330, 350, 170, 20);

        lb_titDadosPess.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titDadosPess.setText("Dados Pessoais");
        add(lb_titDadosPess);
        lb_titDadosPess.setBounds(330, 160, 170, 20);

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preto.png"))); // NOI18N
        add(lb_logo);
        lb_logo.setBounds(30, 40, 190, 120);

        lb_sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sidebar_verde.png"))); // NOI18N
        add(lb_sideBar);
        lb_sideBar.setBounds(0, 0, 254, 720);

        lb_tipoModalidade.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_tipoModalidade.setText("Tipo de Modalidade:");
        add(lb_tipoModalidade);
        lb_tipoModalidade.setBounds(330, 480, 230, 30);

        lb_txtAddInstrutor.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        lb_txtAddInstrutor.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAddInstrutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAddInstrutor.setText("ADICIONAR INSTRUTOR");
        lb_txtAddInstrutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_txtAddInstrutorMouseClicked(evt);
            }
        });
        add(lb_txtAddInstrutor);
        lb_txtAddInstrutor.setBounds(960, 510, 260, 30);

        lb_botaoAddInstrutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-azul.png"))); // NOI18N
        add(lb_botaoAddInstrutor);
        lb_botaoAddInstrutor.setBounds(960, 490, 260, 70);

        tf_Formacao.setBackground(new java.awt.Color(238, 238, 238));
        tf_Formacao.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Formacao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Formacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_FormacaoActionPerformed(evt);
            }
        });
        add(tf_Formacao);
        tf_Formacao.setBounds(330, 380, 320, 40);

        cb_tipoModalidade.setBackground(new java.awt.Color(235, 235, 235));
        cb_tipoModalidade.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cb_tipoModalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cb_tipoModalidade);
        cb_tipoModalidade.setBounds(330, 510, 300, 40);

        ftf_cpf.setBackground(new java.awt.Color(228, 228, 228));
        ftf_cpf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            ftf_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(ftf_cpf);
        ftf_cpf.setBounds(330, 280, 320, 40);

        ftf_dataNasc.setBackground(new java.awt.Color(228, 228, 228));
        ftf_dataNasc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ftf_dataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        add(ftf_dataNasc);
        ftf_dataNasc.setBounds(670, 210, 200, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void tf_FormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_FormacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_FormacaoActionPerformed

    private void lb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_clienteMouseClicked
        Main.controllerManager.btAcessarTelaCliente();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_clienteMouseClicked

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

    private void lb_txtAddInstrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_txtAddInstrutorMouseClicked
        String nome = tf_Nome.getText();
        String cpf = ftf_cpf.getText();
        String idModalidade = "";
        int i = 0;
        for (Modalidade modalidade : listaModalidade) {
            if(cb_tipoModalidade.getSelectedItem().equals(listaModalidade.get(i).getNome())){
                idModalidade = String.valueOf(listaModalidade.get(i).getId());
            }
        }
        
        try {
            Main.controllerManager.getInstrutorAdicionarController().btAddInstrutor(nome, cpf, idModalidade);
        } catch (ParseException ex) {
            Logger.getLogger(TelaInstrutorAdicionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lb_txtAddInstrutorMouseClicked

    private void lb_instrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_instrutorMouseClicked
        Main.controllerManager.btAcessarTelaInstrutor();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_instrutorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_tipoModalidade;
    private javax.swing.JFormattedTextField ftf_cpf;
    private javax.swing.JFormattedTextField ftf_dataNasc;
    private javax.swing.JLabel lb_CPF;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_botaoAddInstrutor;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_dataNasc;
    private javax.swing.JLabel lb_exercicio;
    private javax.swing.JLabel lb_instrutor;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_modalidade;
    private javax.swing.JLabel lb_plano;
    private javax.swing.JLabel lb_sideBar;
    private javax.swing.JLabel lb_tipoModalidade;
    private javax.swing.JLabel lb_titDadosPess;
    private javax.swing.JLabel lb_titFormacao;
    private javax.swing.JLabel lb_titModalidade;
    private javax.swing.JLabel lb_treino;
    private javax.swing.JLabel lb_txtAddInstrutor;
    private javax.swing.JTextField tf_Formacao;
    private javax.swing.JTextField tf_Nome;
    // End of variables declaration//GEN-END:variables
}
