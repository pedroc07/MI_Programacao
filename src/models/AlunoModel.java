package models;

import controllers.AddAlunoController;
import controllers.EditarAlunoController;
import controllers.InterfaceController;
import controllers.RemoverAlunoController;
import gerenciamentos.Gerenc_Aluno;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class AlunoModel {
	public AddAlunoController AddController;
	public Stage AddStage = new Stage();
	public EditarAlunoController EditarController;
	public InterfaceController MainController;
	public RemoverAlunoController RemoverController;
	public Stage EditStage = new Stage();
	public Stage RemoveStage = new Stage();
	public Stage RelatorioStage = new Stage();
	public FXMLLoader AddAlunoLoader = new FXMLLoader(getClass().getResource("/scenes/adicionar_aluno.fxml"));
	public FXMLLoader EditAlunoLoader = new FXMLLoader(getClass().getResource("/scenes/editar_aluno.fxml"));
	public FXMLLoader RemoverAlunoLoader = new FXMLLoader(getClass().getResource("/scenes/remover_aluno.fxml"));
	public FXMLLoader RelatorioLoader = new FXMLLoader(getClass().getResource("/scenes/relatorio_aluno.fxml"));
	public Gerenc_Aluno alunos = new Gerenc_Aluno();
	public Parent adicionar;
	public Parent editar;
	public Parent remover;
	public Parent relatorio;
}
