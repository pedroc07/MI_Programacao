package entidades;
/*******************************************************************************
Autor: Pedro Henrique Vieira Cruz
Componente Curricular: MI Programação
Concluido em: 12/04/2022
Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
trecho de código de outro colega ou de outro autor, tais como provindos de livros e
apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
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
