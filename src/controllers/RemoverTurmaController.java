package controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.TurmaModel;

public class RemoverTurmaController {
	
	TurmaModel model;
	
    @FXML
    private Button ConfirmBotao;
    
	@FXML
    private TextField TurmaCodigo;
	
    @FXML
    void Remover(ActionEvent event) throws IOException {
        this.model.turmas.Remover(Integer.parseInt(TurmaCodigo.getText()));
        this.model.MainController.Refresh("prof");
        this.TurmaCodigo.clear();
        }

	public TurmaModel getModel() {
		return model;
	}

	public void setModel(TurmaModel model) {
		this.model = model;
	}
    }
