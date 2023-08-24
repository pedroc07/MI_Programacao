package controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.AlunoModel;

public class RemoverAlunoController {
	
	AlunoModel model;
	
    @FXML
    private Button ConfirmBotao;
    
	@FXML
    private TextField AlunoMatricula;
	
    @FXML
    void Remover(ActionEvent event) throws IOException {
        this.model.alunos.Remover(Integer.parseInt(AlunoMatricula.getText()));
        this.model.MainController.Refresh("aluno");
        this.AlunoMatricula.clear();
        }

	public AlunoModel getModel() {
		return model;
	}

	public void setModel(AlunoModel model) {
		this.model = model;
	}
    }
