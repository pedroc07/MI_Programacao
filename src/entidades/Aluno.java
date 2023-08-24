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


import controllers.EditarAlunoController;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Aluno extends Entidade{
	public int cpf;
	public String nome;
	public int matricula;
	EditarAlunoController EditarController = new EditarAlunoController();
	Stage EditStage = new Stage();

	public Aluno(int cpf, String nome, int matricula, EditarAlunoController EditarController, Stage editStage) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setEditStage(editStage);
		this.setEditarController(EditarController);
		this.EditBotao = new Button("Editar");
	}
	
	public void initBotao() {
		this.EditBotao.setOnAction(event->{
			this.EditarController.setData(this.getMatricula());
			this.EditStage.show();
		});
	}

	public Button getEditBotao() {
		return EditBotao;
	}

	public void setEditBotao(Button editBotao) {
		EditBotao = editBotao;
	}

	public EditarAlunoController getEditarController() {
		return EditarController;
	}

	public void setEditarController(EditarAlunoController controller) {
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
