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
