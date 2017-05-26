package br.edu.iffarroupilha.AvaliacaoDS.visao.web;

import java.util.List;

import br.com.caelum.vraptor.Result;
import br.edu.iffarroupilha.AvaliacaoDS.controle.FilmeControle;
import br.edu.iffarroupilha.AvaliacaoDS.modelo.Filme;

public class FilmeController {
	
	private FilmeControle controle;
	private Result result;
	
	public FilmeController(FilmeControle controle, Result result) {
		
		this.controle = controle;
		this.result = result;
		
	}
	
	public void listar(){
		
		List itens = controle.buscarTodos(Filme.class);
		result.include("filmes", itens);
		
	}
	
	public void cadastrar(){
		
	}
	
	public void gravar(Filme filme){
		
		controle.gravar(filme);
		
	}
}
