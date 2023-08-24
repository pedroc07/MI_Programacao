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

import entidades.Aluno;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Gerenc_Aluno{
	public ObservableList<Aluno> lista = FXCollections.observableArrayList();
	
	public void Adicionar(Aluno cont) {
			this.lista.add(cont);
	}
	
	public void Editar(int cpf, String nome, int matricula) {
		 for(Aluno cont:this.lista) {
			 if(matricula == cont.matricula) {
				 cont.nome = nome;
			 }
	}
	}
	
	public ObservableList<Integer> getListaIds() {
		ObservableList<Integer> listaIds = FXCollections.observableArrayList();
		 for(Aluno cont:this.lista) {  
			 listaIds.add(cont.getMatricula());
		 }
		 return listaIds;
		 }
	
	public Aluno Buscar(int matricula) {
		 for(Aluno cont:this.lista) {
			 if(matricula == cont.matricula) {
				 return cont;
	}
	}
		return null;
	}
	
	public void Remover(int matricula) {
		Aluno remv = null;
		for(Aluno cont:this.lista) {
			if(cont.matricula == matricula){
				remv = cont;
			}
	}
		if(remv != null) {
			this.lista.remove(remv);
		}
	}
	
}
