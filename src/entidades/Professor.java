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


import controllers.EditarProfController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Professor extends Entidade{
	public int cpf;
	public String nome;
	public ObservableList<String> cursos = FXCollections.observableArrayList();
	EditarProfController EditarController = new EditarProfController();
	Stage EditStage = new Stage();

	public Professor(int cpf, String nome, ObservableList<String> cursos, EditarProfController EditarController, Stage editStage) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.cursos = cursos;
		this.setEditStage(editStage);
		this.setEditarController(EditarController);
		this.EditBotao = new Button("Editar");
	}
	
	public void initBotao() {
		this.EditBotao.setOnAction(event->{
			this.EditarController.setData(this.getCpf());
			this.EditStage.show();
		});
	}

	public Button getEditBotao() {
		return EditBotao;
	}

	public void setEditBotao(Button editBotao) {
		EditBotao = editBotao;
	}

	public EditarProfController getEditarController() {
		return EditarController;
	}

	public void setEditarController(EditarProfController controller) {
		EditarController = controller;
	}

	public Stage getEditStage() {
		return EditStage;
	}

	public void setEditStage(Stage editStage) {
		EditStage = editStage;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
