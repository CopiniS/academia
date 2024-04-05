/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author tiovi
 */
public class TelaExercicioDeletar extends javax.swing.JPanel {

    /**
     * Creates new form TelaExercicioAlterar
     */
    public TelaExercicioDeletar() {
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

        lb_NomeExercicio = new javax.swing.JLabel();
        lb_titNomeExercicio = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_cliente = new javax.swing.JLabel();
        lb_treino = new javax.swing.JLabel();
        lb_modalidade = new javax.swing.JLabel();
        lb_exercicio = new javax.swing.JLabel();
        lb_instrutor = new javax.swing.JLabel();
        lb_plano = new javax.swing.JLabel();
        lb_sideBar = new javax.swing.JLabel();
        lb_txtAddDeletar = new javax.swing.JLabel();
        lb_botaoAddDeletar = new javax.swing.JLabel();
        cb_NomeExercicio = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lb_NomeExercicio.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_NomeExercicio.setText("Nome do exercício:");
        add(lb_NomeExercicio);
        lb_NomeExercicio.setBounds(460, 320, 180, 30);

        lb_titNomeExercicio.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titNomeExercicio.setText("Deletar Exercicio");
        add(lb_titNomeExercicio);
        lb_titNomeExercicio.setBounds(460, 300, 270, 20);

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/preto.png"))); // NOI18N
        add(lb_logo);
        lb_logo.setBounds(30, 40, 190, 120);

        lb_cliente.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
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

        lb_exercicio.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
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

        lb_sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sidebar_verde.png"))); // NOI18N
        add(lb_sideBar);
        lb_sideBar.setBounds(0, 0, 254, 720);

        lb_txtAddDeletar.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        lb_txtAddDeletar.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAddDeletar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAddDeletar.setText("DELETAR EXERCÍCIO");
        add(lb_txtAddDeletar);
        lb_txtAddDeletar.setBounds(880, 350, 260, 30);

        lb_botaoAddDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-vermelho.png"))); // NOI18N
        add(lb_botaoAddDeletar);
        lb_botaoAddDeletar.setBounds(880, 330, 260, 70);

        cb_NomeExercicio.setBackground(new java.awt.Color(153, 255, 51));
        cb_NomeExercicio.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        cb_NomeExercicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cb_NomeExercicio);
        cb_NomeExercicio.setBounds(460, 350, 320, 40);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_NomeExercicio;
    private javax.swing.JLabel lb_NomeExercicio;
    private javax.swing.JLabel lb_botaoAddDeletar;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_exercicio;
    private javax.swing.JLabel lb_instrutor;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_modalidade;
    private javax.swing.JLabel lb_plano;
    private javax.swing.JLabel lb_sideBar;
    private javax.swing.JLabel lb_titNomeExercicio;
    private javax.swing.JLabel lb_treino;
    private javax.swing.JLabel lb_txtAddDeletar;
    // End of variables declaration//GEN-END:variables
}
