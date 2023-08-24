package controllers;

import java.io.IOException;
import entidades.Aluno;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.AlunoModel;

public class AddAlunoController {
	
	AlunoModel model;
	
    @FXML
    private Button ConfirmBotao;

    @FXML
    private TextField AlunoNome;

    @FXML
    private TextField AlunoCpf;
    
    @FXML
    private TextField AlunoMatricula;
    
    @FXML
    private Label Titulo;
    
    @FXML
    void Adicionar(ActionEvent event) throws IOException {
    	Aluno aluno = new Aluno(Integer.parseInt(AlunoCpf.getText()), AlunoNome.getText(), Integer.parseInt(AlunoMatricula.getText()), this.model.EditarController, this.model.EditStage);
        this.model.alunos.Adicionar(aluno);
        aluno.initBotao();
        this.model.MainController.fazTabelaAluno();
        this.AlunoNome.clear();
        this.AlunoCpf.clear();
        this.AlunoMatricula.clear();
    }

	public AlunoModel getModel() {
		return model;
	}
	
    public void setModel(AlunoModel model) {
    	this.model = model;
    }
}
