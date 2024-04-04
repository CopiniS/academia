
package controller;

import models.ApplicationModel;
import views.ApplicationView;
import views.TelaClienteAdicionar;
import views.TelaLogin;

public class ControllerManager {
    private ApplicationModel applicationModel;
    private ApplicationView applicationView;
    
    private ClienteController clienteController;
    private ClienteAdicionarController clienteAdicionarController;
    private ExercicioController exercicioController;
    private InstrutorController instrutorController;
    private ModalidadeController modalidadeController;
    private PlanoController planoController;
    private TreinoController treinoController;
    private LoginController loginController;

    public ControllerManager(ApplicationModel applicationModel, ApplicationView applicationView) {
        this.applicationModel = applicationModel;
        this.applicationView = applicationView;
        
        this.clienteController = new ClienteController();
        this.exercicioController = new ExercicioController();
        this.instrutorController = new InstrutorController();
        this.modalidadeController = new ModalidadeController();
        this.planoController = new PlanoController();
        this.treinoController = new TreinoController();
        this.loginController = new LoginController();
        this.clienteAdicionarController = new ClienteAdicionarController();
    }
    
    public void start(){
        this.applicationView.setTelaLogin(new TelaLogin());
        this.applicationView.mostraTela(this.applicationView.getTelaLogin());      //Mostra a tela de cadastro.
    }
    public ApplicationModel getApplicationModel() {
        return applicationModel;
    }

    public void setApplicationModel(ApplicationModel applicationModel) {
        this.applicationModel = applicationModel;
    }

    public ApplicationView getApplicationView() {
        return applicationView;
    }

    public void setApplicationView(ApplicationView applicationView) {
        this.applicationView = applicationView;
    }

    public ClienteController getClienteController() {
        return clienteController;
    }

    public void setClienteController(ClienteController clienteController) {
        this.clienteController = clienteController;
    }

    public ExercicioController getExercicioController() {
        return exercicioController;
    }

    public void setExercicioController(ExercicioController exercicioController) {
        this.exercicioController = exercicioController;
    }

    public InstrutorController getInstrutorController() {
        return instrutorController;
    }

    public void setInstrutorController(InstrutorController instrutorController) {
        this.instrutorController = instrutorController;
    }

    public ModalidadeController getModalidadeController() {
        return modalidadeController;
    }

    public void setModalidadeController(ModalidadeController modalidadeController) {
        this.modalidadeController = modalidadeController;
    }

    public PlanoController getPlanoController() {
        return planoController;
    }

    public void setPlanoController(PlanoController planoController) {
        this.planoController = planoController;
    }

    public TreinoController getTreinoController() {
        return treinoController;
    }

    public void setTreinoController(TreinoController treinoController) {
        this.treinoController = treinoController;
    }


    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    public ClienteAdicionarController getClienteAdicionarController() {
        return clienteAdicionarController;
    }

    public void setClienteAdicionarController(ClienteAdicionarController clienteAdicionarController) {
        this.clienteAdicionarController = clienteAdicionarController;
    }
    
    
    
}
