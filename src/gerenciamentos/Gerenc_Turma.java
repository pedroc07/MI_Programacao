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

import entidades.Turma;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Gerenc_Turma{
	public ObservableList<Turma> lista = FXCollections.observableArrayList();
	
	public void Adicionar(Turma cont) {
			this.lista.add(cont);
	}
	
	public void Editar(int codigo, String dia, String horario, ObservableList<Integer> alunos) {
		 for(Turma cont:this.lista) {
			 if(codigo == cont.codigo) {
					cont.dia = dia;
					cont.horario = horario;
					cont.alunos = alunos;
			 }
	}
	}
	
	public ObservableList<Integer> getListaIds() {
		ObservableList<Integer> listaIds = FXCollections.observableArrayList();
		 for(Turma cont:this.lista) {  
			 listaIds.add(cont.getCodigo());
		 }
		 return listaIds;
		 }
	
	public Turma Buscar(int codigo) {
		 for(Turma cont:this.lista) {
			 if(codigo == cont.codigo) {
				 return cont;
	}
	}
		return null;
	}
	
	public void Remover(int codigo) {
		Turma remv = null;
		for(Turma cont:this.lista) {
			if(codigo == cont.codigo) {
				remv = cont;
			}
	}
		if(remv != null) {
			this.lista.remove(remv);
		}
	}
	
}
