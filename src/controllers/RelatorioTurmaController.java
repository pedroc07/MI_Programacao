package controllers;

import java.io.IOException;

import entidades.Aluno;
import entidades.Turma;
import gerenciamentos.Gerenc_Aluno;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.TurmaModel;

public class RelatorioTurmaController {
	
	TurmaModel model;
	Gerenc_Aluno alunos;
	
	@FXML
	private Button ConfirmBotao;
	
	@FXML
    private TextField TurmaCodigo;
	
	@FXML
    private TableView<Aluno> TabelaAluno;
    
    @FXML
    private TableColumn<Aluno, String> AlunoCpf;
    
    @FXML
    private TableColumn<Aluno, String> AlunoNome;
    
    @FXML
    private TableColumn<Aluno, String> AlunoMatricula;
    
    @FXML
    void ExibirAlunos(ActionEvent event) throws IOException {
    	ObservableList<Aluno> lista = FXCollections.observableArrayList();
    	Turma turma = this.model.turmas.Buscar(Integer.parseInt(TurmaCodigo.getText()));
    	for(int aluno:turma.alunos) {
    		lista.add(this.alunos.Buscar(aluno));
    	}
    	AlunoCpf.setCellValueFactory(new PropertyValueFactory<Aluno, String>("cpf"));
    	AlunoNome.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome"));
    	AlunoMatricula.setCellValueFactory(new PropertyValueFactory<Aluno, String>("matricula"));
    	TabelaAluno.setItems(lista);
    }
    
	public TurmaModel getModel() {
		return model;
	}

	public void setModel(TurmaModel model) {
		this.model = model;
	}

	public Gerenc_Aluno getAlunos() {
		return alunos;
	}

	public void setAlunos(Gerenc_Aluno alunos) {
		this.alunos = alunos;
	}
}
