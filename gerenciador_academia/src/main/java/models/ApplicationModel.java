
package models;

public class ApplicationModel {
    private Cliente cliente;
    private ClienteDAO clienteDAO;
    private Exercicio exercicio;
    private ExercicioDAO exercicioDAO;
    private Instrutor instrutor;
    private InstrutorDAO instrutorDAO;
    private Modalidade modalidade;
    private ModalidadeDAO modalidadeDAO;
    private Pedido pedido;
    private PedidoDAO pedidoDAO;
    private Plano plano;
    private PlanoDAO planoDAO;
    private Treino treino;
    private TreinoDAO treinoDAO;
    private LoginDAO loginDAO;

    public ApplicationModel() {
        startDAOModels();
    }
    
    public void startDAOModels(){
        clienteDAO = new ClienteDAO();
        exercicioDAO = new ExercicioDAO();
        instrutorDAO = new InstrutorDAO();
        modalidadeDAO = new ModalidadeDAO();
        pedidoDAO = new PedidoDAO();
        planoDAO = new PlanoDAO();
        treinoDAO = new TreinoDAO();
        loginDAO = new LoginDAO();
    }
}
