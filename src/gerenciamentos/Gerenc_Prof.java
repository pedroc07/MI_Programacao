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

import entidades.Professor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Gerenc_Prof{
	public ObservableList<Professor> lista = FXCollections.observableArrayList();
	
	public void Adicionar(Professor cont) {
			this.lista.add(cont);
	}
	
	public void Editar(int cpf, String nome, ObservableList<String> cursos) {
		 for(Professor cont:this.lista) {
			 if(cpf == cont.cpf) {
				 cont.nome = nome;
				 cont.cursos = cursos;
			 }
	}
	}
	
	public Professor Buscar(int cpf) {
		 for(Professor cont:this.lista) {
			 if(cpf == cont.cpf) {
				 return cont;
	}
	}
		return null;
	}
	
	public void Remover(int cpf) {
		Professor remv = null;
		for(Professor cont:this.lista) {
			if(cpf == cont.cpf){
				remv = cont;
			}
	}
		if(remv != null) {
			this.lista.remove(remv);
		}
	}
	
}
