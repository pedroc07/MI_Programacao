package controllers;

import entidades.Professor;
import gerenciamentos.Gerenc_Curso;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.ProfessorModel;

public class AddProfController {
	
	ProfessorModel model;
	
    @FXML
    private Button ConfirmBotao;
    
    @FXML
    private Button CursoBotao;

    @FXML
    private TextField ProfNome;

    @FXML
    private TextField ProfCpf;
    
    @FXML
    private ChoiceBox<String> ProfCurso = new ChoiceBox<String>();
    
    @FXML
    private Label Titulo;
    
    @FXML
    void Adicionar(ActionEvent event) throws Throwable{
        Professor professor = new Professor(Integer.parseInt(ProfCpf.getText()), ProfNome.getText(), FXCollections.observableArrayList(this.model.cursos), this.model.EditarController, this.model.EditStage);
        this.model.profs.Adicionar(professor);
        professor.initBotao();
        this.model.MainController.fazTabelaProf();
        this.ProfNome.clear();
        this.ProfCpf.clear();
        this.ProfCurso.getItems().removeAll();
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
