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
