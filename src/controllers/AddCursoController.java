package controllers;

import java.io.IOException;
import entidades.Curso;
import gerenciamentos.Gerenc_Turma;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.CursoModel;

public class AddCursoController {

		CursoModel model;
		
	    @FXML
	    private Button ConfirmBotao;
	    
	    @FXML
	    private Button TurmaBotao;
	    
	    @FXML
	    private TextField CursoCarga;

	    @FXML
	    private TextField CursoNome;
	    
	    @FXML
	    private ChoiceBox<Integer> CursoTurmas = new ChoiceBox<Integer>();

	    @FXML
	    private Label Titulo;
	    
	    @FXML
	    void Adicionar(ActionEvent event) throws IOException {
	    	Curso curso = new Curso(CursoNome.getText(), Integer.parseInt(CursoCarga.getText()), FXCollections.observableArrayList(this.model.turmas), this.model.EditarController, this.model.EditStage);
	        this.model.cursos.Adicionar(curso);
	        curso.initBotao();
	        this.model.MainController.fazTabelaCurso();
	        this.CursoNome.clear();
	        this.CursoCarga.clear();
	        this.CursoTurmas.getItems().removeAll();
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
