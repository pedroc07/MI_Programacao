package controllers;

import entidades.Turma;
import gerenciamentos.Gerenc_Aluno;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.TurmaModel;

public class AddTurmaController {
	
	TurmaModel model;
	
    @FXML
    private Button ConfirmBotao;
    
    @FXML
    private TextField TurmaCodigo;

    @FXML
    private TextField TurmaDia;
    
    @FXML
    private TextField TurmaHorario;
    
    @FXML
    private ChoiceBox<Integer> TurmaAlunos = new ChoiceBox<Integer>();
    
    @FXML
    private Label Titulo;
    @FXML
    void Adicionar(ActionEvent event){
        Turma turma = new Turma(Integer.parseInt(TurmaCodigo.getText()), TurmaDia.getText(), TurmaHorario.getText(), FXCollections.observableArrayList(this.model.alunos), this.model.EditarController, this.model.EditStage);
        this.model.turmas.Adicionar(turma);
        turma.initBotao();
        this.model.MainController.fazTabelaTurma();
        this.TurmaCodigo.clear();
        this.TurmaHorario.clear();
        this.TurmaDia.clear();
        this.TurmaAlunos.getItems().removeAll();
        this.model.alunos.clear();
    }
    
    @FXML
    void AddAluno(ActionEvent event){
    	this.model.alunos.add(this.TurmaAlunos.getValue());
    	this.TurmaAlunos.getItems().remove(this.TurmaAlunos.getValue());
    }
    
    public void initChoiceBox(Gerenc_Aluno lista) {
    	TurmaAlunos.setItems(lista.getListaIds());
    }

	public TurmaModel getModel() {
		return model;
	}

	public void setModel(TurmaModel model) {
		this.model = model;
	}
}
