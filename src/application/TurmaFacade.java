package application;

import java.io.IOException;

import controllers.InterfaceController;
import javafx.scene.Scene;
import models.TurmaModel;

public class TurmaFacade {
	
	TurmaModel model = new TurmaModel();
	
	public void MakeMain(InterfaceController MainController) throws IOException {
		this.model.MainController = MainController;
		this.model.MainController.setTurma_model(this.model);
	}
	
	public void MakeAdicionar() throws IOException {
		this.model.adicionar = this.model.AddTurmaLoader.load();
		this.model.AddStage.setScene(new Scene(this.model.adicionar));
		this.model.AddController = this.model.AddTurmaLoader.getController();
		this.model.AddController.setModel(this.model);
	}
	
	public void MakeEditar() throws IOException {
		this.model.editar = this.model.EditTurmaLoader.load();
		this.model.EditStage.setScene(new Scene(this.model.editar));
		this.model.EditarController = this.model.EditTurmaLoader.getController();
		this.model.EditarController.setModel(this.model);
	}
	
	public void MakeRemover() throws IOException {
		this.model.remover = this.model.RemoverTurmaLoader.load();
		this.model.RemoveStage.setScene(new Scene(this.model.remover));
		this.model.RemoverController = this.model.RemoverTurmaLoader.getController();
		this.model.RemoverController.setModel(this.model);
	}
	
	public void MakeRelatorio() throws IOException {
		this.model.relatorio = this.model.RelatorioLoader.load();
		this.model.RelatorioStage.setScene(new Scene(this.model.relatorio));
		this.model.RelatorioController = this.model.RelatorioLoader.getController();
		this.model.RelatorioController.setModel(this.model);
	}
	
	public void MakeAll(InterfaceController MainController)throws IOException {
		this.MakeMain(MainController);
		this.MakeAdicionar();
		this.MakeEditar();
		this.MakeRemover();
		this.MakeRelatorio();
	}
}
