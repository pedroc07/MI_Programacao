package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage LoginStage) {
		try {
			ProfessorFacade fachada_prof = new ProfessorFacade();
			fachada_prof.MakeAll();
			AlunoFacade fachada_aluno = new AlunoFacade();
			fachada_aluno.MakeAll(fachada_prof.model.MainController);
			CursoFacade fachada_curso = new CursoFacade();
			fachada_curso.MakeAll(fachada_prof.model.MainController);
			TurmaFacade fachada_turma = new TurmaFacade();
			fachada_turma.MakeAll(fachada_prof.model.MainController);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
