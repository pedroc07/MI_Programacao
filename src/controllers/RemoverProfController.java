package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.ProfessorModel;

public class RemoverProfController {
	
	ProfessorModel model;
	
    @FXML
    private Button ConfirmBotao;
    
	@FXML
    private TextField ProfCpf;
	
    @FXML
    void Remover(ActionEvent event) throws IOException {
        this.model.profs.Remover(Integer.parseInt(ProfCpf.getText()));
        this.model.MainController.Refresh("prof");
        this.ProfCpf.clear();
        }

	public ProfessorModel getModel() {
		return model;
	}

	public void setModel(ProfessorModel model) {
		this.model = model;
	}
    }
