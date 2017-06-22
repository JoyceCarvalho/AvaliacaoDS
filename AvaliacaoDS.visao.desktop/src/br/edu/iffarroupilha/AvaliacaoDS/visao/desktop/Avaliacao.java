package br.edu.iffarroupilha.AvaliacaoDS.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Avaliacao extends JFrame {
	 
	public Avaliacao() {
		
		setTitle(":: Avaliacao Desenvolvimento de Software ::");
		setSize(640,480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes();
		// muda a aparencia da aplicação java
		try {
			UIManager.setLookAndFeel( new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setVisible(true);
	}
	
	private void desenhaComponentes() {
		
		// cria bara de menus
		JMenuBar menu = new JMenuBar();
		
		// cria o menu cadastro
		JMenu cadastro = new JMenu("Cadastro");
		menu.add(cadastro);
		
		// cria os sub-itens
		JMenuItem filme = new JMenuItem("Filme");
		
		//vincula ao menu cadastros
		cadastro.add(filme);
		
		//vincula as ações aos itens
		filme.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				//new FrmFilme(Avaliacao.this);
				
			}
		});
		
		
		// adiciona o menu em tela
		setJMenuBar(menu);
		
	}

	//public static void main(String[] args) {
		
		//new Avaliacao();
	//}
}
