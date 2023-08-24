package entidades;
/*******************************************************************************
Autor: Pedro Henrique Vieira Cruz
Componente Curricular: MI Programa��o
Concluido em: 12/04/2022
Declaro que este c�digo foi elaborado por mim de forma individual e n�o cont�m nenhum
trecho de c�digo de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e p�ginas ou documentos eletr�nicos da Internet. Qualquer trecho de c�digo
de outra autoria que n�o a minha est� destacado com uma cita��o para o autor e a fonte
do c�digo, e estou ciente que estes trechos n�o ser�o considerados para fins de avalia��o.
******************************************************************************************/

import controllers.EditarTurmaController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Turma extends Entidade{
	public int codigo;
	public String dia;
	public String horario;
	public ObservableList<Integer> alunos = FXCollections.observableArrayList();
	EditarTurmaController EditarController = new EditarTurmaController();
	Stage EditStage = new Stage();

	public Turma(int codigo, String dia, String horario, ObservableList<Integer> alunos, EditarTurmaController EditarController, Stage editStage) {
		this.codigo = codigo;
		this.setDia(dia);
		this.setHorario(horario);
		this.alunos = alunos;
		this.setEditStage(editStage);
		this.setEditarController(EditarController);
		this.EditBotao = new Button("Editar");
	}
	
	public void initBotao() {
		this.EditBotao.setOnAction(event->{
			this.EditarController.setData(this.getCodigo());
			this.EditStage.show();
		});
	}

	public Button getEditBotao() {
		return EditBotao;
	}

	public void setEditBotao(Button editBotao) {
		EditBotao = editBotao;
	}

	public EditarTurmaController getEditarController() {
		return EditarController;
	}

	public void setEditarController(EditarTurmaController controller) {
		EditarController = controller;
	}

	public Stage getEditStage() {
		return EditStage;
	}

	public void setEditStage(Stage editStage) {
		EditStage = editStage;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
