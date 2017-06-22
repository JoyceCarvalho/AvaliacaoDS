package br.edu.iffarroupilha.AvaliacaoDS.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import br.edu.iffarroupilha.AvaliacaoDS.controle.FilmeControle;
import br.edu.iffarroupilha.AvaliacaoDS.modelo.Filme;



public class FrmFilme extends JFrame{

	//private Avaliacao telaPrincipal;

	public FrmFilme() {
		
		//this.telaPrincipal = telaPrincipal;
		setTitle(":: Avaliacao Desenvolvimento de Software ::");
		setSize(320, 240);
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

		JLabel lblAno = new JLabel("Ano: ");
		JLabel lblTitulo = new JLabel("Titulo: ");
		final JTextField txtAno = new JTextField(30);
		final JTextField txtTitulo = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		setLayout( new FlowLayout(FlowLayout.LEFT));
		
		btnGravar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				FilmeControle controle = new FilmeControle();
				// pegar os dados da tela
				Filme c = new Filme();
				int ano = controle.converteInteiro(txtAno.getText());
				c.setAnoLancamento(ano);
				c.setTitulo(txtTitulo.getText());
				
				// valida os dados
				
				String erro = controle.validarFilme(c);
				if (erro == null) {
					// realiza gravação
					controle.gravar(c);
					
					JOptionPane.showMessageDialog(null, "Feitooooo!!!");
				} else{
					JOptionPane.showMessageDialog(null, erro, "Validação", JOptionPane.WARNING_MESSAGE);
				}
				
				
				
			}
		});
		
		// adiciona os componentes em tela
		add(lblAno);
		add(txtAno);
		add(lblTitulo);
		add(txtTitulo);
		add(btnGravar);
		
	}
	
	public static void main(String[] args) {
		new FrmFilme();
	}
}
