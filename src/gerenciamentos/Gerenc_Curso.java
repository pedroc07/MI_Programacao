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

package gerenciamentos;

import entidades.Curso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Gerenc_Curso{
	public ObservableList<Curso> lista = FXCollections.observableArrayList();
	
	public void Adicionar(Curso cont) {
			this.lista.add(cont);
	}
	
	public void Editar(String nome, int carga) {
		 for(Curso cont:this.lista) {
			 if(nome.contains(cont.nome)) {
				 cont.carga = carga;
			 }
	}
	}
	
	public ObservableList<String> getListaIds() {
		ObservableList<String> listaIds = FXCollections.observableArrayList();
		 for(Curso cont:this.lista) {  
			 listaIds.add(cont.getNome());
		 }
		 return listaIds;
		 }
	
	public Curso Buscar(String nome) {
		 for(Curso cont:this.lista) {
			 if(nome.contains(cont.nome)) {
				 return cont;
	}
	}
		return null;
	}
	
	public void Remover(String nome) {
		Curso remv = null;
		for(Curso cont:this.lista) {
			if(cont.nome.contains(nome)){
				remv = cont;
			}
	}
		if(remv != null) {
			this.lista.remove(remv);
		}
	}
	
}
