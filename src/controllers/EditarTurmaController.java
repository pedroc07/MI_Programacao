package controllers;

import java.io.IOException;
import gerenciamentos.Gerenc_Aluno;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.TurmaModel;

public class EditarTurmaController {

		TurmaModel model;
		
	    @FXML
	    private Button AlunoBotao;
		
	    @FXML
	    private Button ConfirmBotao;
	    
	    @FXML
	    private Label TurmaCodigo;

	    @FXML
	    private TextField TurmaDia;
	    
	    @FXML
	    private TextField TurmaHorario;
	    
	    @FXML
	    private ChoiceBox<Integer> TurmaAlunos = new ChoiceBox<Integer>();
	    
	    public void setData(int codigo){
	    	TurmaDia.setText(this.model.turmas.Buscar(codigo).dia);
	    	TurmaCodigo.setText(Integer.toString(codigo));
	    	TurmaHorario.setText(this.model.turmas.Buscar(codigo).horario);
	    }
	    
	    @FXML
	    void Editar(ActionEvent event) throws IOException {
	    	this.model.turmas.Editar(Integer.parseInt(TurmaCodigo.getText()), TurmaDia.getText(), TurmaHorario.getText(), FXCollections.observableArrayList(this.model.alunos));
	    	this.model.MainController.Refresh("turma");
	    	this.model.alunos.clear();
	     }

	    @FXML
	    void AddAluno(ActionEvent event){
	    	this.model.alunos.add(this.TurmaAlunos.getValue());
	    	this.TurmaAlunos.getItems().remove(this.TurmaAlunos.getValue());
	    }
	    
		public TurmaModel getModel() {
			return model;
		}

		public void setModel(TurmaModel model) {
			this.model = model;
		}
		
	    public void initChoiceBox(Gerenc_Aluno lista) {
	    	TurmaAlunos.setItems(lista.getListaIds());
	    }
}
