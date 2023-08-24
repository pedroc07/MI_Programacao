package controllers;

import java.io.IOException;
import entidades.Curso;
import entidades.Turma;
import gerenciamentos.Gerenc_Turma;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.CursoModel;

public class RelatorioCursoController {
	
	CursoModel model;
	Gerenc_Turma turmas;
	
	@FXML
	private Button ConfirmBotao;
	
	@FXML
    private TextField CursoNome;
	
	@FXML
    private TableView<Turma> TabelaTurma;
    
    @FXML
    private TableColumn<Turma, Integer> TurmaCodigo;
    
    @FXML
    private TableColumn<Turma, String> TurmaDia;
    
    @FXML
    private TableColumn<Turma, String> TurmaHorario;
    
    @FXML
    void ExibirTurmas(ActionEvent event) throws IOException {
    	ObservableList<Turma> lista = FXCollections.observableArrayList();
    	Curso curso = this.model.cursos.Buscar(CursoNome.getText());
    	for(int turma:curso.turmas) {
    		lista.add(this.turmas.Buscar(turma));
    	}
    	TurmaCodigo.setCellValueFactory(new PropertyValueFactory<Turma, Integer>("codigo"));
    	TurmaDia.setCellValueFactory(new PropertyValueFactory<Turma, String>("dia"));
    	TurmaHorario.setCellValueFactory(new PropertyValueFactory<Turma, String>("horario"));
    	TabelaTurma.setItems(lista);
    }
    
	public CursoModel getModel() {
		return model;
	}

	public void setModel(CursoModel model) {
		this.model = model;
	}

	public Gerenc_Turma getTurmas() {
		return turmas;
	}

	public void setTurmas(Gerenc_Turma turmas) {
		this.turmas = turmas;
	}
}
