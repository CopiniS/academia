
package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ApplicationView {
    private Janela janela;
    private TelaCliente telaCliente;
    private TelaClienteAdicionar telaClienteAdicionar;
    private TelaClienteAlterar telaClienteAlterar;
    private TelaLogin telaInicial;
    private TelaInstrutor telaInstrutor;
    private TelaInstrutorAdicionar telaInstrutorAdicionar;
    private TelaInstrutorAlterar telaInstrutorAlterar;
    private TelaModalidade telaModalidade;
    private TelaPlano telaPlano;
    private TelaPlanoAdicionar telaPlanoAdicionar;
    private TelaTreino telaTreino;

    public ApplicationView() {
        this.janela = new Janela();
        this.janela.setLocationRelativeTo(null); //Posiciona no meio da tela
        this.janela.setVisible(true); 
    }
    
    public void mostraTela(JPanel tela){
        this.janela.getContentPane().removeAll();       //Remove o conteúdo atual do frame.
        this.janela.add(tela, BorderLayout.CENTER);     //Adiciona o novo painel ao frame.
        this.janela.pack();                             //Redimensiona o frame.
    }
    
    public void fechaJanela(){
        this.janela.dispose(); //Fecha o frame.
    }
    

    public Janela getJanela() {
        return janela;
    }

    public void setJanela(Janela janela) {
        this.janela = janela;
    }

    public TelaCliente getTelaCliente() {
        return telaCliente;
    }

    public void setTelaCliente(TelaCliente telaCliente) {
        this.telaCliente = telaCliente;
    }

    public TelaClienteAdicionar getTelaClienteAdicionar() {
        return telaClienteAdicionar;
    }

    public void setTelaClienteAdicionar(TelaClienteAdicionar telaClienteAdicionar) {
        this.telaClienteAdicionar = telaClienteAdicionar;
    }

    public TelaClienteAlterar getTelaClienteAlterar() {
        return telaClienteAlterar;
    }

    public void setTelaClienteAlterar(TelaClienteAlterar telaClienteAlterar) {
        this.telaClienteAlterar = telaClienteAlterar;
    }

    public TelaLogin getTelaInicial() {
        return telaInicial;
    }

    public void setTelaInicial(TelaLogin telaInicial) {
        this.telaInicial = telaInicial;
    }

    public TelaInstrutor getTelaInstrutor() {
        return telaInstrutor;
    }

    public void setTelaInstrutor(TelaInstrutor telaInstrutor) {
        this.telaInstrutor = telaInstrutor;
    }

    public TelaInstrutorAdicionar getTelaInstrutorAdicionar() {
        return telaInstrutorAdicionar;
    }

    public void setTelaInstrutorAdicionar(TelaInstrutorAdicionar telaInstrutorAdicionar) {
        this.telaInstrutorAdicionar = telaInstrutorAdicionar;
    }

    public TelaInstrutorAlterar getTelaInstrutorAlterar() {
        return telaInstrutorAlterar;
    }

    public void setTelaInstrutorAlterar(TelaInstrutorAlterar telaInstrutorAlterar) {
        this.telaInstrutorAlterar = telaInstrutorAlterar;
    }

    public TelaModalidade getTelaModalidade() {
        return telaModalidade;
    }

    public void setTelaModalidade(TelaModalidade telaModalidade) {
        this.telaModalidade = telaModalidade;
    }

    public TelaPlano getTelaPlano() {
        return telaPlano;
    }

    public void setTelaPlano(TelaPlano telaPlano) {
        this.telaPlano = telaPlano;
    }

    public TelaPlanoAdicionar getTelaPlanoAdicionar() {
        return telaPlanoAdicionar;
    }

    public void setTelaPlanoAdicionar(TelaPlanoAdicionar telaPlanoAdicionar) {
        this.telaPlanoAdicionar = telaPlanoAdicionar;
    }

    public TelaTreino getTelaTreino() {
        return telaTreino;
    }

    public void setTelaTreino(TelaTreino telaTreino) {
        this.telaTreino = telaTreino;
    }
    
    
}
