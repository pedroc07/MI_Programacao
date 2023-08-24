package controllers;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.CursoModel;

public class RemoverCursoController {
	
	CursoModel model;
	
    @FXML
    private Button ConfirmBotao;
    
	@FXML
    private TextField CursoNome;
	
    @FXML
    void Remover(ActionEvent event) throws IOException {
        this.model.cursos.Remover(CursoNome.getText());
        this.model.MainController.Refresh("curso");
        this.CursoNome.clear();
        }

	public CursoModel getModel() {
		return model;
	}

	public void setModel(CursoModel model) {
		this.model = model;
	}
    }
