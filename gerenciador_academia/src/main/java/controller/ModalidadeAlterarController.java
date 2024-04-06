
package controller;

import java.util.List;
import models.Modalidade;

public class ModalidadeAlterarController {

    public ModalidadeAlterarController() {
    }
    
    public List<Modalidade> retornaListaDeModalidade(){
        return Main.controllerManager.getApplicationModel().getModalidadeDAO().selectModalidadeSql();
    }
    
    public int retornaIdModalidadeParaExcluir(String nomeSelecionado, List<Modalidade> lista){
        for(Modalidade m : lista){
            if(m.getNome().equals(nomeSelecionado)){
                return m.getId();
            }
        }
        return 0;
    }
    
    public boolean btDeletaModalidade(int idModalidade){
        return Main.controllerManager.getApplicationModel().getModalidadeDAO().deleteModalidadeSql(idModalidade);
    }
    

}
