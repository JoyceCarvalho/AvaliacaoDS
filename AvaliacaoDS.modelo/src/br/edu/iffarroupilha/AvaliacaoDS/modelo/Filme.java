package br.edu.iffarroupilha.AvaliacaoDS.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Filme {
	
	@Id
	@Column(nullable = false)
	private int idFilme;
	
	@Column(length=4, nullable = false)
	private String anoLancamento;
	
	@Column(length=4, nullable = false)
	private String titulo;

	public int getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
