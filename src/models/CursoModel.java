package models;

import controllers.AddCursoController;
import controllers.EditarCursoController;
import controllers.InterfaceController;
import controllers.RelatorioCursoController;
import controllers.RemoverCursoController;
import gerenciamentos.Gerenc_Curso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class CursoModel {
	public AddCursoController AddController;
	public Stage AddStage = new Stage();
	public EditarCursoController EditarController;
	public InterfaceController MainController;
	public RemoverCursoController RemoverController;
	public RelatorioCursoController RelatorioController;
	public Stage EditStage = new Stage();
	public Stage RemoveStage = new Stage();
	public Stage RelatorioStage = new Stage();
	public FXMLLoader AddCursoLoader = new FXMLLoader(getClass().getResource("/scenes/adicionar_curso.fxml"));
	public FXMLLoader EditCursoLoader = new FXMLLoader(getClass().getResource("/scenes/editar_curso.fxml"));
	public FXMLLoader RemoverCursoLoader = new FXMLLoader(getClass().getResource("/scenes/remover_curso.fxml"));
	public FXMLLoader RelatorioLoader = new FXMLLoader(getClass().getResource("/scenes/relatorio_curso.fxml"));
	public Gerenc_Curso cursos = new Gerenc_Curso();
	public ObservableList<Integer> turmas = FXCollections.observableArrayList();
	public Parent adicionar;
	public Parent editar;
	public Parent remover;
	public Parent relatorio;
}
