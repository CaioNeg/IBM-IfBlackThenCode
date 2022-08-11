import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JTextField nome;
	private JTextField Idade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entre com o email");
		lblNewLabel.setBounds(10, 11, 94, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 42, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idade");
		lblNewLabel_2.setBounds(10, 79, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		email = new JTextField();
		email.setBounds(118, 8, 189, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		nome = new JTextField();
		nome.setBounds(118, 42, 189, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		Idade = new JTextField();
		Idade.setBounds(118, 76, 189, 20);
		contentPane.add(Idade);
		Idade.setColumns(10);
		
		JButton btnNewButton = new JButton("Processar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(15, 128, 89, 23);
		contentPane.add(btnNewButton);
	}
}
