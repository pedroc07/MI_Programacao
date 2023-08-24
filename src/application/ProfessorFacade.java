package application;

import java.io.IOException;
import javafx.scene.Scene;
import models.ProfessorModel;

public class ProfessorFacade {
	
	ProfessorModel model = new ProfessorModel();
	
	public void MakeMain() throws IOException {
		this.model.main = this.model.MainLoader.load();
		this.model.MainStage.setScene(new Scene(this.model.main));
		this.model.MainController = this.model.MainLoader.getController();
		this.model.MainController.setProfessorModel(this.model);
		this.model.MainStage.show();
	}
	
	public void MakeAdicionar() throws IOException {
		this.model.adicionar = this.model.AddProfLoader.load();
		this.model.AddStage.setScene(new Scene(this.model.adicionar));
		this.model.AddController = this.model.AddProfLoader.getController();
		this.model.AddController.setModel(this.model);
	}
	
	public void MakeEditar() throws IOException {
		this.model.editar = this.model.EditProfLoader.load();
		this.model.EditStage.setScene(new Scene(this.model.editar));
		this.model.EditarController = this.model.EditProfLoader.getController();
		this.model.EditarController.setModel(this.model);
	}
	
	public void MakeRemover() throws IOException {
		this.model.remover = this.model.RemoverProfLoader.load();
		this.model.RemoveStage.setScene(new Scene(this.model.remover));
		this.model.RemoverController = this.model.RemoverProfLoader.getController();
		this.model.RemoverController.setModel(this.model);
	}
	
	public void MakeRelatorio() throws IOException {
		this.model.relatorio = this.model.RelatorioLoader.load();
		this.model.RelatorioStage.setScene(new Scene(this.model.relatorio));
		this.model.RelatorioController = this.model.RelatorioLoader.getController();
		this.model.RelatorioController.setModel(this.model);
	}
	
	public void MakeAll()throws IOException {
		this.MakeMain();
		this.MakeAdicionar();
		this.MakeEditar();
		this.MakeRemover();
		this.MakeRelatorio();
	}
}
