package views;

import javax.swing.ImageIcon;

public class TelaLogin extends javax.swing.JPanel {


    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_logo = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        pf_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lb_bkg = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(null);

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/branco.png"))); // NOI18N
        add(lb_logo);
        lb_logo.setBounds(540, 140, 200, 120);

        tf_nome.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        tf_nome.setForeground(new java.awt.Color(51, 51, 51));
        tf_nome.setText("Nome");
        tf_nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });
        add(tf_nome);
        tf_nome.setBounds(430, 330, 420, 60);

        pf_senha.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        pf_senha.setForeground(new java.awt.Color(51, 51, 51));
        pf_senha.setText("Senha");
        add(pf_senha);
        pf_senha.setBounds(430, 410, 420, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt_entrarInicio.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jLabel1);
        jLabel1.setBounds(480, 510, 321, 69);
        add(lb_bkg);
        lb_bkg.setBounds(0, 0, 1280, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        ImageIcon bkgLogin = new ImageIcon("img/bkg-inicio.png");
        lb_bkg.setIcon(bkgLogin);
    }//GEN-LAST:event_tf_nomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_bkg;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JPasswordField pf_senha;
    private javax.swing.JTextField tf_nome;
    // End of variables declaration//GEN-END:variables
}
