package br.edu.iffarroupilha.AvaliacaoDS.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.iffarroupilha.AvaliacaoDS.controle.FilmeControle;
import br.edu.iffarroupilha.AvaliacaoDS.modelo.Filme;



public class FrmFilme extends JFrame{

	private Avaliacao telaPrincipal;

	public FrmFilme( Avaliacao telaPrincipal ) {
		
		this.telaPrincipal = telaPrincipal;
		setTitle(":: Avaliacao -> Clientes ::");
		setSize(320, 240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
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
}
