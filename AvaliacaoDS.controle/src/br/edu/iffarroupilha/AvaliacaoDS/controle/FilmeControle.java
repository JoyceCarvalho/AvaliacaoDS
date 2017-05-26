package br.edu.iffarroupilha.AvaliacaoDS.controle;

import br.edu.iffarroupilha.AvaliacaoDS.controle.AControle;
import br.edu.iffarroupilha.AvaliacaoDS.modelo.Filme;


public class FilmeControle extends AControle{
	
	
	public String validarFilme(Filme f){
		if (f != null) {
			if (f.getAnoLancamento() == 0) {
				return "Informe o ano de lan�amento";
			} else if(f.getTitulo() == null || f.getTitulo().isEmpty()){
				return "Por favor, informe um titulo";
			}
		} else {
			return "Dados do Filme n�o informados!";
		}
		return null;
	}
	

}