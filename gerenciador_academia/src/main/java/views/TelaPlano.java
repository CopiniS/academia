/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

/**
 *
 * @author tiovi
 */
public class TelaPlano extends javax.swing.JPanel {

    /**
     * Creates new form TelaPlano
     */
    public TelaPlano() {
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

        lb_txtAdd2 = new javax.swing.JLabel();
        lb_botaoAdd2 = new javax.swing.JLabel();
        lb_txtAdd1 = new javax.swing.JLabel();
        lb_botaoAdd1 = new javax.swing.JLabel();
        lb_txtAdd = new javax.swing.JLabel();
        lb_botaoAdd = new javax.swing.JLabel();
        lb_cliente = new javax.swing.JLabel();
        lb_instrutor = new javax.swing.JLabel();
        lb_treino = new javax.swing.JLabel();
        lb_plano = new javax.swing.JLabel();
        lb_modalidade = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_bkg = new javax.swing.JLabel();

        setLayout(null);

        lb_txtAdd2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtAdd2.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAdd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAdd2.setText("MOSTRAR PLANOS");
        lb_txtAdd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_txtAdd2);
        lb_txtAdd2.setBounds(960, 350, 260, 30);

        lb_botaoAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-cinza.png"))); // NOI18N
        lb_botaoAdd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_botaoAdd2);
        lb_botaoAdd2.setBounds(960, 330, 260, 70);

        lb_txtAdd1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtAdd1.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAdd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAdd1.setText("ALTERAR PLANO");
        lb_txtAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_txtAdd1);
        lb_txtAdd1.setBounds(660, 350, 260, 30);

        lb_botaoAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-cinza.png"))); // NOI18N
        lb_botaoAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_botaoAdd1);
        lb_botaoAdd1.setBounds(660, 330, 260, 70);

        lb_txtAdd.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        lb_txtAdd.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAdd.setText("ADICIONAR PLANO");
        lb_txtAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_txtAdd);
        lb_txtAdd.setBounds(350, 350, 260, 30);

        lb_botaoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-cinza.png"))); // NOI18N
        lb_botaoAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_botaoAdd);
        lb_botaoAdd.setBounds(350, 330, 260, 70);

        lb_cliente.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_cliente.setForeground(new java.awt.Color(255, 255, 255));
        lb_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cliente.setText("Cliente");
        lb_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_cliente);
        lb_cliente.setBounds(0, 220, 260, 40);

        lb_instrutor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_instrutor.setForeground(new java.awt.Color(255, 255, 255));
        lb_instrutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_instrutor.setText("Instrutor");
        lb_instrutor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_instrutor);
        lb_instrutor.setBounds(0, 280, 260, 40);

        lb_treino.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_treino.setForeground(new java.awt.Color(255, 255, 255));
        lb_treino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_treino.setText("Treino");
        lb_treino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_treino);
        lb_treino.setBounds(0, 460, 260, 40);

        lb_plano.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lb_plano.setForeground(new java.awt.Color(255, 255, 255));
        lb_plano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_plano.setText("Plano");
        lb_plano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_plano);
        lb_plano.setBounds(0, 340, 260, 40);

        lb_modalidade.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lb_modalidade.setForeground(new java.awt.Color(255, 255, 255));
        lb_modalidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_modalidade.setText("Modalidade");
        lb_modalidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_modalidade);
        lb_modalidade.setBounds(0, 400, 260, 40);

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/branco.png"))); // NOI18N
        add(lb_logo);
        lb_logo.setBounds(30, 40, 200, 120);

        lb_bkg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bkg-telaplano.png"))); // NOI18N
        add(lb_bkg);
        lb_bkg.setBounds(0, 0, 1280, 720);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_bkg;
    private javax.swing.JLabel lb_botaoAdd;
    private javax.swing.JLabel lb_botaoAdd1;
    private javax.swing.JLabel lb_botaoAdd2;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_instrutor;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_modalidade;
    private javax.swing.JLabel lb_plano;
    private javax.swing.JLabel lb_treino;
    private javax.swing.JLabel lb_txtAdd;
    private javax.swing.JLabel lb_txtAdd1;
    private javax.swing.JLabel lb_txtAdd2;
    // End of variables declaration//GEN-END:variables
}
