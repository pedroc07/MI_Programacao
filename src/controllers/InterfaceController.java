package controllers;

import java.io.IOException;
import entidades.Aluno;
import entidades.Curso;
import entidades.Professor;
import entidades.Turma;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.AlunoModel;
import models.CursoModel;
import models.ProfessorModel;
import models.TurmaModel;

public class InterfaceController {
	
	ProfessorModel prof_model;
	AlunoModel aluno_model;
	CursoModel curso_model;
	TurmaModel turma_model;
	
    @FXML
    private Button NovoProfessor;
	
	@FXML
	private Button RemoverProf;
	
	@FXML
	private Button RelatProfBotao;
	
    @FXML
    private Button NovoAluno;
	
	@FXML
	private Button RemoverAluno;
	
	@FXML
	private Button RelatAlunoBotao;
	
    @FXML
    private Button NovoCurso;
	
	@FXML
	private Button RemoverCurso;
	
	@FXML
	private Button RelatCursoBotao;
	
    @FXML
    private Button NovaTurma;
	
	@FXML
	private Button RemoverTurma;
	
	@FXML
	private Button RelatTurmaBotao;
	
    @FXML
    private TableView<Professor> TabelaProfessor;
    
    @FXML
    private TableColumn<Professor, Integer> ProfCpf;
    
    @FXML
    private TableColumn<Professor, String> ProfNome;
    
    @FXML
    private TableColumn<Professor, Button> ProfEditar;
    
    @FXML
    private TableView<Aluno> TabelaAluno;
    
    @FXML
    private TableColumn<Aluno, Integer> AlunoCpf;
    
    @FXML
    private TableColumn<Aluno, String> AlunoNome;
    
    @FXML
    private TableColumn<Aluno, Integer> AlunoMatricula;
    
    @FXML
    private TableColumn<Aluno, Button> AlunoEditar;
    
    @FXML
    private TableView<Curso> TabelaCurso;
    
    @FXML
    private TableColumn<Curso, Integer> CursoCarga;
    
    @FXML
    private TableColumn<Curso, String> CursoNome;
    
    @FXML
    private TableColumn<Curso, Button> CursoEditar;
    
    @FXML
    private TableView<Turma> TabelaTurma;
    
    @FXML
    private TableColumn<Turma, String> TurmaDia;
    
    @FXML
    private TableColumn<Turma, Integer> TurmaCodigo;
    
    @FXML
    private TableColumn<Turma, String> TurmaHorario;
    
    @FXML
    private TableColumn<Turma, Button> TurmaEditar;
    
	@FXML
	void AddProfessor(ActionEvent event) throws IOException {
		this.prof_model.AddStage.show();
		this.prof_model.AddController.initChoiceBox(this.curso_model.cursos);
	}
	
	@FXML
	void RemoveProfessor(ActionEvent event) throws IOException {
		this.prof_model.RemoveStage.show();
	}
	
	@FXML
	void RelatorioProfessor(ActionEvent event) throws IOException {
		this.prof_model.RelatorioStage.show();
		this.prof_model.RelatorioController.setTurmas(this.turma_model.turmas);
		this.prof_model.RelatorioController.setCursos(this.curso_model.cursos);
	}
	
	@FXML
	void AddAluno(ActionEvent event) throws IOException {
		this.aluno_model.AddStage.show();	}
	
	@FXML
	void RemoveAluno(ActionEvent event) throws IOException {
		this.aluno_model.RemoveStage.show();
	}
	
	@FXML
	void RelatorioAluno(ActionEvent event) throws IOException {
		this.aluno_model.RelatorioStage.show();
	}
	
	@FXML
	void AddCurso(ActionEvent event) throws IOException {
		this.curso_model.AddStage.show();
		this.curso_model.AddController.initChoiceBox(this.turma_model.turmas);
	}
	
	@FXML
	void RemoveCurso(ActionEvent event) throws IOException {
		this.curso_model.RemoveStage.show();
	}
	
	@FXML
	void RelatorioCurso(ActionEvent event) throws IOException {
		this.curso_model.RelatorioStage.show();
		this.curso_model.RelatorioController.setTurmas(this.turma_model.turmas);
	}
	
	@FXML
	void AddTurma(ActionEvent event) throws IOException {
		this.turma_model.AddStage.show();
		this.turma_model.AddController.initChoiceBox(this.aluno_model.alunos);
	}
	
	@FXML
	void RemoveTurma(ActionEvent event) throws IOException {
		this.turma_model.RemoveStage.show();
	}
	
	@FXML
	void RelatorioTurma(ActionEvent event) throws IOException {
		this.turma_model.RelatorioStage.show();
		this.turma_model.RelatorioController.setAlunos(this.aluno_model.alunos);
	}
	
    public void fazTabelaProf() {
    	ProfCpf.setCellValueFactory(new PropertyValueFactory<Professor, Integer>("cpf"));
    	ProfNome.setCellValueFactory(new PropertyValueFactory<Professor, String>("nome"));
    	ProfEditar.setCellValueFactory(new PropertyValueFactory<Professor, Button>("EditBotao"));
    	TabelaProfessor.setItems(this.prof_model.profs.lista);
    }
    
    public void fazTabelaAluno() {
    	AlunoCpf.setCellValueFactory(new PropertyValueFactory<Aluno, Integer>("cpf"));
    	AlunoNome.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome"));
    	AlunoEditar.setCellValueFactory(new PropertyValueFactory<Aluno, Button>("EditBotao"));
    	AlunoMatricula.setCellValueFactory(new PropertyValueFactory<Aluno, Integer>("matricula"));
    	TabelaAluno.setItems(this.aluno_model.alunos.lista);
    }
    
    public void fazTabelaCurso() {
    	CursoCarga.setCellValueFactory(new PropertyValueFactory<Curso, Integer>("carga"));
    	CursoNome.setCellValueFactory(new PropertyValueFactory<Curso, String>("nome"));
    	CursoEditar.setCellValueFactory(new PropertyValueFactory<Curso, Button>("EditBotao"));
    	TabelaCurso.setItems(this.curso_model.cursos.lista);
    }
    
    public void fazTabelaTurma() {
        TurmaDia.setCellValueFactory(new PropertyValueFactory<Turma, String>("dia"));
        TurmaCodigo.setCellValueFactory(new PropertyValueFactory<Turma, Integer>("codigo"));
        TurmaHorario.setCellValueFactory(new PropertyValueFactory<Turma, String>("horario"));
        TurmaEditar.setCellValueFactory(new PropertyValueFactory<Turma, Button>("EditBotao"));
        TabelaTurma.setItems(this.turma_model.turmas.lista);
    }
    
    public void Refresh(String tipo) {
    	switch(tipo) {
    	case "prof":
    		TabelaProfessor.refresh();
    		break;
    		
    	case "aluno":
    		TabelaAluno.refresh();
    		break;
    		
    	case "curso":
    		TabelaCurso.refresh();
    		break;
    		
    	case "turma":
    		TabelaProfessor.refresh();
    		break;
    	}
    }

	public ProfessorModel getProfessorModel() {
		return prof_model;
	}

	public void setProfessorModel(ProfessorModel model) {
		this.prof_model = model;
	}

	public AlunoModel getAluno_model() {
		return aluno_model;
	}

	public void setAluno_model(AlunoModel aluno_model) {
		this.aluno_model = aluno_model;
	}

	public CursoModel getCurso_model() {
		return curso_model;
	}

	public void setCurso_model(CursoModel curso_model) {
		this.curso_model = curso_model;
	}

	public TurmaModel getTurma_model() {
		return turma_model;
	}

	public void setTurma_model(TurmaModel turma_model) {
		this.turma_model = turma_model;
	}
}