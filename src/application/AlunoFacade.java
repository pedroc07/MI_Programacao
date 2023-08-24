package application;

import java.io.IOException;

import controllers.InterfaceController;
import javafx.scene.Scene;
import models.AlunoModel;

public class AlunoFacade {
	
	AlunoModel model = new AlunoModel();
	
	public void MakeMain(InterfaceController MainController) throws IOException {
		this.model.MainController = MainController;
		this.model.MainController.setAluno_model(this.model);
	}
	
	public void MakeAdicionar() throws IOException {
		this.model.adicionar = this.model.AddAlunoLoader.load();
		Scene scene = new Scene(this.model.adicionar);
		this.model.AddStage.setScene(scene);
		this.model.AddController = this.model.AddAlunoLoader.getController();
		this.model.AddController.setModel(this.model);
	}
	
	public void MakeEditar() throws IOException {
		this.model.editar = this.model.EditAlunoLoader.load();
		this.model.EditStage.setScene(new Scene(this.model.editar));
		this.model.EditarController = this.model.EditAlunoLoader.getController();
		this.model.EditarController.setModel(this.model);
	}
	
	public void MakeRemover() throws IOException {
		this.model.remover = this.model.RemoverAlunoLoader.load();
		this.model.RemoveStage.setScene(new Scene(this.model.remover));
		this.model.RemoverController = this.model.RemoverAlunoLoader.getController();
		this.model.RemoverController.setModel(this.model);
	}
	
	public void MakeRelatorio() throws IOException {
		this.model.relatorio = this.model.RelatorioLoader.load();
		this.model.RelatorioStage.setScene(new Scene(this.model.relatorio));
	}
	
	public void MakeAll(InterfaceController MainController)throws IOException {
		this.MakeMain(MainController);
		this.MakeAdicionar();
		this.MakeEditar();
		this.MakeRemover();
		this.MakeRelatorio();
	}
}
