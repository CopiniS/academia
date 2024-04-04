
package controller;

import models.ApplicationModel;
import views.ApplicationView;
import views.TelaClienteAdicionar;
import views.TelaLogin;

public class ControllerManager {
    private ApplicationModel applicationModel;
    private ApplicationView applicationView;
    
    private ClienteController controllerMenuCliente;
    private ExercicioController controllerMenuExercicio;
    private InstrutorController controllerMenuInstrutor;
    private ModalidadeController controllerMenuModalidade;
    private PlanoController controllerMenuPlano;
    private TreinoController controllerMenuTreino;
    private LoginController loginController;

    public ControllerManager(ApplicationModel applicationModel, ApplicationView applicationView) {
        this.applicationModel = applicationModel;
        this.applicationView = applicationView;
        
        this.controllerMenuCliente = new ClienteController();
        this.controllerMenuExercicio = new ExercicioController();
        this.controllerMenuInstrutor = new InstrutorController();
        this.controllerMenuModalidade = new ModalidadeController();
        this.controllerMenuPlano = new PlanoController();
        this.controllerMenuTreino = new TreinoController();
        this.loginController = new LoginController();
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

    public ClienteController getControllerMenuCliente() {
        return controllerMenuCliente;
    }

    public void setControllerMenuCliente(ClienteController controllerMenuCliente) {
        this.controllerMenuCliente = controllerMenuCliente;
    }

    public ExercicioController getControllerMenuExercicio() {
        return controllerMenuExercicio;
    }

    public void setControllerMenuExercicio(ExercicioController controllerMenuExercicio) {
        this.controllerMenuExercicio = controllerMenuExercicio;
    }

    public InstrutorController getControllerMenuInstrutor() {
        return controllerMenuInstrutor;
    }

    public void setControllerMenuInstrutor(InstrutorController controllerMenuInstrutor) {
        this.controllerMenuInstrutor = controllerMenuInstrutor;
    }

    public ModalidadeController getControllerMenuModalidade() {
        return controllerMenuModalidade;
    }

    public void setControllerMenuModalidade(ModalidadeController controllerMenuModalidade) {
        this.controllerMenuModalidade = controllerMenuModalidade;
    }

    public PlanoController getControllerMenuPlano() {
        return controllerMenuPlano;
    }

    public void setControllerMenuPlano(PlanoController controllerMenuPlano) {
        this.controllerMenuPlano = controllerMenuPlano;
    }

    public TreinoController getControllerMenuTreino() {
        return controllerMenuTreino;
    }

    public void setControllerMenuTreino(TreinoController controllerMenuTreino) {
        this.controllerMenuTreino = controllerMenuTreino;
    }

    public LoginController getLoginController() {
        return loginController;
    }

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }
    
    
    
}
