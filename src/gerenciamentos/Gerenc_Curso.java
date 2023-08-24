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
