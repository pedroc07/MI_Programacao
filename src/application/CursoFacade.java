package application;

import java.io.IOException;

import controllers.InterfaceController;
import javafx.scene.Scene;
import models.CursoModel;

public class CursoFacade {
	
	CursoModel model = new CursoModel();
	
	public void MakeMain(InterfaceController MainController) throws IOException {
		this.model.MainController = MainController;
		this.model.MainController.setCurso_model(this.model);
	}
	
	public void MakeAdicionar() throws IOException {
		this.model.adicionar = this.model.AddCursoLoader.load();
		this.model.AddStage.setScene(new Scene(this.model.adicionar));
		this.model.AddController = this.model.AddCursoLoader.getController();
		this.model.AddController.setModel(this.model);
	}
	
	public void MakeEditar() throws IOException {
		this.model.editar = this.model.EditCursoLoader.load();
		this.model.EditStage.setScene(new Scene(this.model.editar));
		this.model.EditarController = this.model.EditCursoLoader.getController();
		this.model.EditarController.setModel(this.model);
	}
	
	public void MakeRemover() throws IOException {
		this.model.remover = this.model.RemoverCursoLoader.load();
		this.model.RemoveStage.setScene(new Scene(this.model.remover));
		this.model.RemoverController = this.model.RemoverCursoLoader.getController();
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
