package controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.AlunoModel;

public class EditarAlunoController {

		AlunoModel model;
		
	    @FXML
	    private Button ConfirmBotao;
	    
	    @FXML
	    private TextField AlunoNome;

	    @FXML
	    private Label AlunoCpf;
	    
	    @FXML
	    private Label AlunoMatricula;
	    
	    public void setData(int matricula){
	    	AlunoNome.setText(this.model.alunos.Buscar(matricula).nome);
	    	AlunoCpf.setText(Integer.toString(this.model.alunos.Buscar(matricula).cpf));
	    	AlunoMatricula.setText(Integer.toString(matricula));
	    }
	    
	    @FXML
	    void Editar(ActionEvent event) throws IOException {
	    	this.model.alunos.Editar(Integer.parseInt(AlunoCpf.getText()), AlunoNome.getText(), Integer.parseInt(AlunoMatricula.getText()));
	    	this.model.MainController.Refresh("aluno");
	     }

		public AlunoModel getModel() {
			return model;
		}

		public void setModel(AlunoModel model) {
			this.model = model;
		}	
}
