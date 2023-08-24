package controllers;

import java.io.IOException;
import gerenciamentos.Gerenc_Curso;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.ProfessorModel;

public class EditarProfController {

		ProfessorModel model;
		
	    @FXML
	    private Button ConfirmBotao;
	    
	    @FXML
	    private TextField ProfNome;

	    @FXML
	    private Label ProfCpf;
	    
	    @FXML
	    private ChoiceBox<String> ProfCurso = new ChoiceBox<String>();
	    
	    public void setData(int cpf){
	    	ProfNome.setText(this.model.profs.Buscar(cpf).nome);
	    	ProfCpf.setText(Integer.toString(cpf));
	    }
	    
	    @FXML
	    void Editar(ActionEvent event) throws IOException {
	    	this.model.profs.Editar(Integer.parseInt(ProfCpf.getText()), ProfNome.getText(), FXCollections.observableArrayList(this.model.cursos));
	    	this.model.MainController.Refresh("prof");
	    	this.model.cursos.clear();
	     }
	    
	    @FXML
	    void AddCurso(ActionEvent event){
	    	this.model.cursos.add(this.ProfCurso.getValue());
	    	this.ProfCurso.getItems().remove(this.ProfCurso.getValue());
	    }

		public ProfessorModel getModel() {
			return model;
		}

		public void setModel(ProfessorModel model) {
			this.model = model;
		}
		
	    public void initChoiceBox(Gerenc_Curso lista) {
	    	ProfCurso.setItems(lista.getListaIds());
	    }
}
