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


import controllers.EditarCursoController;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Curso extends Entidade{
	public int carga;
	public String nome;
	public ObservableList<Integer> turmas;
	EditarCursoController EditarController = new EditarCursoController();
	Stage EditStage = new Stage();

	public Curso(String nome, int carga, ObservableList<Integer> turmas, EditarCursoController EditarController, Stage editStage) {
		this.setCarga(carga);
		this.setNome(nome);
		this.turmas = turmas;
		this.setEditStage(editStage);
		this.setEditarController(EditarController);
		this.EditBotao = new Button("Editar");
	}
	
	public void initBotao() {
		this.EditBotao.setOnAction(event->{
			this.EditarController.setData(this.getNome());
			this.EditStage.show();
		});
	}

	public Button getEditBotao() {
		return EditBotao;
	}

	public void setEditBotao(Button editBotao) {
		EditBotao = editBotao;
	}

	public EditarCursoController getEditarController() {
		return EditarController;
	}

	public void setEditarController(EditarCursoController controller) {
		EditarController = controller;
	}

	public Stage getEditStage() {
		return EditStage;
	}

	public void setEditStage(Stage editStage) {
		EditStage = editStage;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
