package br.edu.iffarroupilha.AvaliacaoDS.modelo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffarroupilha.AvaliacaoDS.modelo.Filme;

public class HibernateDao {
	
	private static SessionFactory fabrica;
	
	static {
		Configuration cfg = new Configuration();
		// depois adicionar as demais entidades
		//apos ter feito o mapeamento
		cfg.addAnnotatedClass(Filme.class);
		cfg.configure();
		
		
		// forma mais facil de criar uma fabrica
		fabrica = cfg.buildSessionFactory();
	}
	
	public static Session getSessao(){
		return fabrica.openSession();
	}
	
}
