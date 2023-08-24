package controllers;

import java.io.IOException;

import gerenciamentos.Gerenc_Turma;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.CursoModel;

public class EditarCursoController {

		CursoModel model;
		
	    @FXML
	    private Button ConfirmBotao;
	    
	    @FXML
	    private TextField CursoCarga;

	    @FXML
	    private Label CursoNome;
	    
	    @FXML
	    private ChoiceBox<Integer> CursoTurmas = new ChoiceBox<Integer>();
	    
	    public void setData(String nome){
	    	CursoCarga.setText(Integer.toString(this.model.cursos.Buscar(nome).carga));
	    	CursoNome.setText(nome);
	    }
	    
	    @FXML
	    void Editar(ActionEvent event) throws IOException {
	    	this.model.cursos.Editar(CursoNome.getText(), Integer.parseInt(CursoCarga.getText()));
	    	this.model.MainController.Refresh("curso");
	    	this.model.turmas.clear();
	     }

	    @FXML
	    void AddTurma(ActionEvent event){
	    	this.model.turmas.add(this.CursoTurmas.getValue());
	    	this.CursoTurmas.getItems().remove(this.CursoTurmas.getValue());
	    }
	    
		public CursoModel getModel() {
			return model;
		}

		public void setModel(CursoModel model) {
			this.model = model;
		}
		
	    public void initChoiceBox(Gerenc_Turma lista) {
	    	CursoTurmas.setItems(lista.getListaIds());
	    }
	    
	    
}
