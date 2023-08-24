package models;

import controllers.AddTurmaController;
import controllers.EditarTurmaController;
import controllers.InterfaceController;
import controllers.RelatorioTurmaController;
import controllers.RemoverTurmaController;
import gerenciamentos.Gerenc_Turma;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class TurmaModel {
	public AddTurmaController AddController;
	public Stage AddStage = new Stage();
	public InterfaceController MainController;
	public EditarTurmaController EditarController;
	public RemoverTurmaController RemoverController;
	public RelatorioTurmaController RelatorioController;
	public Stage EditStage = new Stage();
	public Stage RemoveStage = new Stage();
	public Stage RelatorioStage = new Stage();
	public FXMLLoader AddTurmaLoader = new FXMLLoader(getClass().getResource("/scenes/adicionar_turma.fxml"));
	public FXMLLoader EditTurmaLoader = new FXMLLoader(getClass().getResource("/scenes/editar_turma.fxml"));
	public FXMLLoader RemoverTurmaLoader = new FXMLLoader(getClass().getResource("/scenes/remover_turma.fxml"));
	public FXMLLoader RelatorioLoader = new FXMLLoader(getClass().getResource("/scenes/relatorio_turma.fxml"));
	public Gerenc_Turma turmas = new Gerenc_Turma();
	public ObservableList<Integer> alunos = FXCollections.observableArrayList();
	public Parent adicionar;
	public Parent editar;
	public Parent remover;
	public Parent relatorio;
}
