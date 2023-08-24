package models;

import controllers.AddProfController;
import controllers.EditarProfController;
import controllers.InterfaceController;
import controllers.RelatorioProfController;
import controllers.RemoverProfController;
import gerenciamentos.Gerenc_Prof;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class ProfessorModel {
	public AddProfController AddController;
	public Stage AddStage = new Stage();
	public EditarProfController EditarController;
	public InterfaceController MainController;
	public RemoverProfController RemoverController;
	public RelatorioProfController RelatorioController;
	public Stage MainStage = new Stage();
	public Stage EditStage = new Stage();
	public Stage RemoveStage = new Stage();
	public Stage RelatorioStage = new Stage();
	public FXMLLoader MainLoader = new FXMLLoader(getClass().getResource("/scenes/interface.fxml"));
	public FXMLLoader AddProfLoader = new FXMLLoader(getClass().getResource("/scenes/adicionar_professor.fxml"));
	public FXMLLoader EditProfLoader = new FXMLLoader(getClass().getResource("/scenes/editar_professor.fxml"));
	public FXMLLoader RemoverProfLoader = new FXMLLoader(getClass().getResource("/scenes/remover_professor.fxml"));
	public FXMLLoader RelatorioLoader = new FXMLLoader(getClass().getResource("/scenes/relatorio_professor.fxml"));
	public Gerenc_Prof profs = new Gerenc_Prof();
	public ObservableList<String> cursos = FXCollections.observableArrayList();
	public Parent main;
	public Parent adicionar;
	public Parent editar;
	public Parent remover;
	public Parent relatorio;
}
