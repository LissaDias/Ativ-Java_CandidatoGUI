/**
 * @autor Lissa
 */
package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class CandidatoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JLabel lblInscricao;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblCargo;
	private JButton btnLimpar;
	private JButton btnEnviar;
	private ButtonGroup gb;
	private JRadioButton rdbtnFundamental;
	private JRadioButton rdbtnMedio;
	private JRadioButton rdbtnSuperior;
	
	/**
	 * Create the frame.
	 */
	public CandidatoGUI() {
		setTitle("CONCURSO - INSCRI\u00C7\u00C3O");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Handler ouvinte = new Handler();
		
		lblInscricao = new JLabel("INSCRI\u00C7\u00C3O DO CANDIDATO");
		lblInscricao.setHorizontalAlignment(SwingConstants.CENTER);
		lblInscricao.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblInscricao.setBounds(45, 27, 296, 19);
		contentPane.add(lblInscricao);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNome.setBounds(59, 74, 84, 19);
		contentPane.add(lblNome);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf.setBounds(61, 139, 84, 19);
		contentPane.add(lblCpf);
		
		txtNome = new JTextField();
		txtNome.setBounds(57, 104, 260, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(59, 169, 260, 20);
		contentPane.add(txtCpf);
		
		lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCargo.setBounds(57, 200, 84, 19);
		contentPane.add(lblCargo);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpar.setBounds(55, 329, 103, 29);
		btnLimpar.addActionListener(ouvinte);
		contentPane.add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnviar.setBounds(212, 329, 103, 29);
		btnEnviar.addActionListener(ouvinte);
		contentPane.add(btnEnviar);
		
		rdbtnFundamental = new JRadioButton("Prof. Ensino Fundamental");
		rdbtnFundamental.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnFundamental.setBounds(57, 226, 258, 23);
		rdbtnFundamental.addActionListener(ouvinte);
		contentPane.add(rdbtnFundamental);
		
		rdbtnMedio = new JRadioButton("Prof. Ensino M\u00E9dio");
		rdbtnMedio.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnMedio.setBounds(57, 252, 258, 23);
		rdbtnMedio.addActionListener(ouvinte);
		contentPane.add(rdbtnMedio);
		
		rdbtnSuperior = new JRadioButton("Prof. Ensino Superior");
		rdbtnSuperior.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnSuperior.setBounds(57, 278, 258, 23);
		rdbtnSuperior.addActionListener(ouvinte);
		contentPane.add(rdbtnSuperior);
		
		gb = new ButtonGroup();
		gb.add(rdbtnFundamental);
		gb.add(rdbtnMedio);
		gb.add(rdbtnSuperior);
		
		
		/**
		 * Visualização
		 */
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	/**
	 * Limpar
	 */
		public void limpar() {
			txtCpf.setText("");
			txtNome.setText("");
			gb.clearSelection();
			
		}
		/**
		* Handler
		*/
			public class Handler implements ActionListener
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==btnLimpar) {
						limpar();
					}
					else {
						if(e.getSource()==btnEnviar) {
							String Cpf = txtCpf.getText();
							String Nome = txtNome.getText();
							// COMO PEGAR SELEÇÃO JRADIUN BUTTON?
							
							
							if((Cpf.contentEquals("")) || (Nome.contentEquals("")) || (gb.isSelected(null))) {
								JOptionPane.showMessageDialog(getContentPane(), "Todos os campos devem ser preenchidos", "Atenção", 2, null);
							}
							else {
								JOptionPane.showMessageDialog(getContentPane(), "DADOS CADASTRADOS COM SUCESSO!", "Sucesso", 1, null);
								limpar();
								}
							}
						}
					}
			}
}
