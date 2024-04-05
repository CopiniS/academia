package views;

import controller.Main;

public class TelaPlanoAdicionar extends javax.swing.JPanel {

    public void apagarModalidades(){
        lb_txtCaixa1.setVisible(false);
        lb_txtCaixa2.setVisible(false);
        lb_txtCaixa3.setVisible(false);
        lb_txtCaixa4.setVisible(false);
        lb_txtCaixa5.setVisible(false);
        lb_txtCaixa6.setVisible(false);
        lb_txtCaixa7.setVisible(false);
        lb_txtCaixa8.setVisible(false);
        
        lb_caixaSemSelec1.setVisible(false);
        lb_caixaSemSelec2.setVisible(false);
        lb_caixaSemSelec3.setVisible(false);
        lb_caixaSemSelec4.setVisible(false);
        lb_caixaSemSelec5.setVisible(false);
        lb_caixaSemSelec6.setVisible(false);
        lb_caixaSemSelec7.setVisible(false);
        lb_caixaSemSelec8.setVisible(false);
        
        lb_caixaComSelec1.setVisible(false);
        lb_caixaComSelec2.setVisible(false);
        lb_caixaComSelec3.setVisible(false);
        lb_caixaComSelec4.setVisible(false);
        lb_caixaComSelec5.setVisible(false);
        lb_caixaComSelec6.setVisible(false);
        lb_caixaComSelec7.setVisible(false);
        lb_caixaComSelec8.setVisible(false);
    }
    
    public void mostrarModalidadeExistente(){
        
    }
    
    public TelaPlanoAdicionar() {
        initComponents();
        apagarModalidades();       
        
        mostrarModalidadeExistente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_caixaComSelec5 = new javax.swing.JLabel();
        lb_caixaSemSelec5 = new javax.swing.JLabel();
        lb_caixaComSelec6 = new javax.swing.JLabel();
        lb_caixaSemSelec6 = new javax.swing.JLabel();
        lb_caixaComSelec7 = new javax.swing.JLabel();
        lb_caixaSemSelec7 = new javax.swing.JLabel();
        lb_caixaComSelec8 = new javax.swing.JLabel();
        lb_caixaSemSelec8 = new javax.swing.JLabel();
        lb_caixaComSelec4 = new javax.swing.JLabel();
        lb_caixaSemSelec4 = new javax.swing.JLabel();
        lb_caixaComSelec3 = new javax.swing.JLabel();
        lb_caixaSemSelec3 = new javax.swing.JLabel();
        lb_caixaComSelec2 = new javax.swing.JLabel();
        lb_caixaSemSelec2 = new javax.swing.JLabel();
        lb_caixaComSelec1 = new javax.swing.JLabel();
        lb_caixaSemSelec1 = new javax.swing.JLabel();
        lb_TempoContrato = new javax.swing.JLabel();
        lb_Nome = new javax.swing.JLabel();
        lb_titValor = new javax.swing.JLabel();
        lb_titModalidade = new javax.swing.JLabel();
        lb_titPlano = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_cliente = new javax.swing.JLabel();
        lb_treino = new javax.swing.JLabel();
        lb_modalidade = new javax.swing.JLabel();
        lb_exercicio = new javax.swing.JLabel();
        lb_instrutor = new javax.swing.JLabel();
        lb_plano = new javax.swing.JLabel();
        lb_sideBar = new javax.swing.JLabel();
        lb_txtAddPlano = new javax.swing.JLabel();
        lb_botaoAddPlano = new javax.swing.JLabel();
        tf_Valor = new javax.swing.JTextField();
        tf_TempoContrato = new javax.swing.JTextField();
        lb_txtCaixa1 = new javax.swing.JLabel();
        lb_txtCaixa2 = new javax.swing.JLabel();
        lb_txtCaixa3 = new javax.swing.JLabel();
        lb_txtCaixa4 = new javax.swing.JLabel();
        lb_txtCaixa5 = new javax.swing.JLabel();
        lb_txtCaixa6 = new javax.swing.JLabel();
        lb_txtCaixa7 = new javax.swing.JLabel();
        lb_txtCaixa8 = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lb_caixaComSelec5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec5MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec5);
        lb_caixaComSelec5.setBounds(550, 350, 30, 30);

        lb_caixaSemSelec5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        add(lb_caixaSemSelec5);
        lb_caixaSemSelec5.setBounds(550, 350, 30, 30);

        lb_caixaComSelec6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec6MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec6);
        lb_caixaComSelec6.setBounds(550, 390, 30, 30);

        lb_caixaSemSelec6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        add(lb_caixaSemSelec6);
        lb_caixaSemSelec6.setBounds(550, 390, 30, 30);

        lb_caixaComSelec7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec7MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec7);
        lb_caixaComSelec7.setBounds(550, 430, 30, 30);

        lb_caixaSemSelec7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        add(lb_caixaSemSelec7);
        lb_caixaSemSelec7.setBounds(550, 430, 30, 30);

        lb_caixaComSelec8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec8MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec8);
        lb_caixaComSelec8.setBounds(550, 470, 30, 30);

        lb_caixaSemSelec8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        add(lb_caixaSemSelec8);
        lb_caixaSemSelec8.setBounds(550, 470, 30, 30);

        lb_caixaComSelec4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec4MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec4);
        lb_caixaComSelec4.setBounds(330, 470, 30, 30);

        lb_caixaSemSelec4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        add(lb_caixaSemSelec4);
        lb_caixaSemSelec4.setBounds(330, 470, 30, 30);

        lb_caixaComSelec3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec3MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec3);
        lb_caixaComSelec3.setBounds(330, 430, 30, 30);

        lb_caixaSemSelec3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        add(lb_caixaSemSelec3);
        lb_caixaSemSelec3.setBounds(330, 430, 30, 30);

        lb_caixaComSelec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec2MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec2);
        lb_caixaComSelec2.setBounds(330, 390, 30, 30);

        lb_caixaSemSelec2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        add(lb_caixaSemSelec2);
        lb_caixaSemSelec2.setBounds(330, 390, 30, 30);

        lb_caixaComSelec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa com selecao.png"))); // NOI18N
        lb_caixaComSelec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaComSelec1MouseClicked1(evt);
            }
        });
        add(lb_caixaComSelec1);
        lb_caixaComSelec1.setBounds(330, 350, 30, 30);

        lb_caixaSemSelec1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caixa sem selecao.png"))); // NOI18N
        lb_caixaSemSelec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaSemSelec1MouseClicked1(evt);
            }
        });
        add(lb_caixaSemSelec1);
        lb_caixaSemSelec1.setBounds(330, 350, 30, 30);

        lb_TempoContrato.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_TempoContrato.setText("Tempo Contrato:");
        add(lb_TempoContrato);
        lb_TempoContrato.setBounds(330, 215, 180, 20);

        lb_Nome.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        lb_Nome.setText("Nome Plano:");
        add(lb_Nome);
        lb_Nome.setBounds(330, 130, 180, 30);

        lb_titValor.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titValor.setText("Valor");
        add(lb_titValor);
        lb_titValor.setBounds(330, 535, 170, 20);

        lb_titModalidade.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titModalidade.setText("Modalidades Inclusas");
        add(lb_titModalidade);
        lb_titModalidade.setBounds(330, 320, 320, 20);

        lb_titPlano.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 18)); // NOI18N
        lb_titPlano.setText("Plano");
        add(lb_titPlano);
        lb_titPlano.setBounds(330, 110, 170, 20);

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

        lb_plano.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lb_plano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_plano.setText("Plano");
        lb_plano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_plano);
        lb_plano.setBounds(0, 310, 250, 40);

        lb_sideBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sidebar_verde.png"))); // NOI18N
        add(lb_sideBar);
        lb_sideBar.setBounds(0, 0, 254, 720);

        lb_txtAddPlano.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 16)); // NOI18N
        lb_txtAddPlano.setForeground(new java.awt.Color(255, 255, 255));
        lb_txtAddPlano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_txtAddPlano.setText("ADICIONAR PLANO");
        lb_txtAddPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_txtAddPlano);
        lb_txtAddPlano.setBounds(970, 560, 260, 30);

        lb_botaoAddPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bt-azul.png"))); // NOI18N
        lb_botaoAddPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(lb_botaoAddPlano);
        lb_botaoAddPlano.setBounds(970, 540, 260, 70);

        tf_Valor.setBackground(new java.awt.Color(238, 238, 238));
        tf_Valor.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Valor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ValorActionPerformed(evt);
            }
        });
        add(tf_Valor);
        tf_Valor.setBounds(330, 560, 320, 40);

        tf_TempoContrato.setBackground(new java.awt.Color(238, 238, 238));
        tf_TempoContrato.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_TempoContrato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_TempoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_TempoContratoActionPerformed(evt);
            }
        });
        add(tf_TempoContrato);
        tf_TempoContrato.setBounds(330, 240, 320, 40);

        lb_txtCaixa1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa1.setText("jLabel1");
        lb_txtCaixa1.setPreferredSize(new java.awt.Dimension(1280, 720));
        lb_txtCaixa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_caixaSemSelec1MouseClicked(evt);
            }
        });
        add(lb_txtCaixa1);
        lb_txtCaixa1.setBounds(360, 350, 180, 30);

        lb_txtCaixa2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa2.setText("jLabel1");
        add(lb_txtCaixa2);
        lb_txtCaixa2.setBounds(360, 390, 180, 30);

        lb_txtCaixa3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa3.setText("jLabel1");
        add(lb_txtCaixa3);
        lb_txtCaixa3.setBounds(360, 430, 180, 30);

        lb_txtCaixa4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa4.setText("jLabel1");
        add(lb_txtCaixa4);
        lb_txtCaixa4.setBounds(360, 470, 180, 30);

        lb_txtCaixa5.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa5.setText("jLabel1");
        add(lb_txtCaixa5);
        lb_txtCaixa5.setBounds(580, 350, 180, 30);

        lb_txtCaixa6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa6.setText("jLabel1");
        add(lb_txtCaixa6);
        lb_txtCaixa6.setBounds(580, 390, 180, 30);

        lb_txtCaixa7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa7.setText("jLabel1");
        add(lb_txtCaixa7);
        lb_txtCaixa7.setBounds(580, 430, 180, 30);

        lb_txtCaixa8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lb_txtCaixa8.setText("jLabel1");
        add(lb_txtCaixa8);
        lb_txtCaixa8.setBounds(580, 470, 180, 30);

        tf_Nome.setBackground(new java.awt.Color(238, 238, 238));
        tf_Nome.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        tf_Nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });
        add(tf_Nome);
        tf_Nome.setBounds(330, 160, 320, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ValorActionPerformed

    private void tf_TempoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_TempoContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_TempoContratoActionPerformed

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void lb_caixaSemSelec1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaSemSelec1MouseClicked
    }//GEN-LAST:event_lb_caixaSemSelec1MouseClicked

    private void lb_caixaSemSelec1MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaSemSelec1MouseClicked1
        lb_caixaSemSelec1.setVisible(false);
        lb_caixaComSelec1.setVisible(true);
    }//GEN-LAST:event_lb_caixaSemSelec1MouseClicked1

    private void lb_caixaComSelec1MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec1MouseClicked1
        lb_caixaSemSelec1.setVisible(true);
        lb_caixaComSelec1.setVisible(false);
    }//GEN-LAST:event_lb_caixaComSelec1MouseClicked1

    private void lb_caixaComSelec2MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec2MouseClicked1
        lb_caixaSemSelec2.setVisible(true);
        lb_caixaComSelec2.setVisible(false);
    }//GEN-LAST:event_lb_caixaComSelec2MouseClicked1

    private void lb_caixaComSelec3MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec3MouseClicked1
        lb_caixaSemSelec3.setVisible(true);
        lb_caixaComSelec3.setVisible(false);
    }//GEN-LAST:event_lb_caixaComSelec3MouseClicked1

    private void lb_caixaComSelec4MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec4MouseClicked1
        lb_caixaSemSelec4.setVisible(true);
        lb_caixaComSelec4.setVisible(false);
    }//GEN-LAST:event_lb_caixaComSelec4MouseClicked1

    private void lb_caixaComSelec5MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec5MouseClicked1
        lb_caixaSemSelec5.setVisible(true);
        lb_caixaComSelec5.setVisible(false);
    }//GEN-LAST:event_lb_caixaComSelec5MouseClicked1

    private void lb_caixaComSelec6MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec6MouseClicked1
        lb_caixaSemSelec6.setVisible(true);
        lb_caixaComSelec6.setVisible(false);
    }//GEN-LAST:event_lb_caixaComSelec6MouseClicked1

    private void lb_caixaComSelec7MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec7MouseClicked1
        lb_caixaSemSelec7.setVisible(true);
        lb_caixaComSelec7.setVisible(false);    }//GEN-LAST:event_lb_caixaComSelec7MouseClicked1

    private void lb_caixaComSelec8MouseClicked1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_caixaComSelec8MouseClicked1
        lb_caixaSemSelec8.setVisible(true);
        lb_caixaComSelec8.setVisible(false);    }//GEN-LAST:event_lb_caixaComSelec8MouseClicked1

    private void lb_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_clienteMouseClicked
        Main.controllerManager.btAcessarTelaCliente();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_clienteMouseClicked

    private void lb_instrutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_instrutorMouseClicked
        Main.controllerManager.btAcessarTelaInstrutor();        // TODO add your handling code here:
    }//GEN-LAST:event_lb_instrutorMouseClicked

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
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_TempoContrato;
    private javax.swing.JLabel lb_botaoAddPlano;
    private javax.swing.JLabel lb_caixaComSelec1;
    private javax.swing.JLabel lb_caixaComSelec2;
    private javax.swing.JLabel lb_caixaComSelec3;
    private javax.swing.JLabel lb_caixaComSelec4;
    private javax.swing.JLabel lb_caixaComSelec5;
    private javax.swing.JLabel lb_caixaComSelec6;
    private javax.swing.JLabel lb_caixaComSelec7;
    private javax.swing.JLabel lb_caixaComSelec8;
    private javax.swing.JLabel lb_caixaSemSelec1;
    private javax.swing.JLabel lb_caixaSemSelec2;
    private javax.swing.JLabel lb_caixaSemSelec3;
    private javax.swing.JLabel lb_caixaSemSelec4;
    private javax.swing.JLabel lb_caixaSemSelec5;
    private javax.swing.JLabel lb_caixaSemSelec6;
    private javax.swing.JLabel lb_caixaSemSelec7;
    private javax.swing.JLabel lb_caixaSemSelec8;
    private javax.swing.JLabel lb_cliente;
    private javax.swing.JLabel lb_exercicio;
    private javax.swing.JLabel lb_instrutor;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_modalidade;
    private javax.swing.JLabel lb_plano;
    private javax.swing.JLabel lb_sideBar;
    private javax.swing.JLabel lb_titModalidade;
    private javax.swing.JLabel lb_titPlano;
    private javax.swing.JLabel lb_titValor;
    private javax.swing.JLabel lb_treino;
    private javax.swing.JLabel lb_txtAddPlano;
    private javax.swing.JLabel lb_txtCaixa1;
    private javax.swing.JLabel lb_txtCaixa2;
    private javax.swing.JLabel lb_txtCaixa3;
    private javax.swing.JLabel lb_txtCaixa4;
    private javax.swing.JLabel lb_txtCaixa5;
    private javax.swing.JLabel lb_txtCaixa6;
    private javax.swing.JLabel lb_txtCaixa7;
    private javax.swing.JLabel lb_txtCaixa8;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_TempoContrato;
    private javax.swing.JTextField tf_Valor;
    // End of variables declaration//GEN-END:variables
}
