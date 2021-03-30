package br.com.ProjetoMarina.Modelo;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MediaGuia  {
	
	//private static final Object BorderLayout = null;

	public static void main(String[] args) {
		

		JFrame frame = new JFrame("Calculador Media");
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridBagLayout());
		frame.add(panel);
		
		Insets i = new Insets(5, 5, 5, 5);
		
		JLabel label1 = new JLabel("Nota 1");
		GridBagConstraints cLabel1 = new GridBagConstraints();
		cLabel1.gridx = 0;
		cLabel1.gridy = 0;
		cLabel1.insets = i;
		panel.add(label1, cLabel1);
		
		JTextField textField1 = new JTextField(5);
		GridBagConstraints cText1 = new GridBagConstraints();
		cText1.gridx = 1;
		cText1.gridy = 0;
		//cText1.gridwidth = GridBagConstraints.REMAINDER;
		cText1.insets = i;
		//String nota1 = textField1.getText();
		panel.add(textField1, cText1);
		
		
		
		JLabel label2 = new JLabel("Nota 2");
		GridBagConstraints cLabel2 = new GridBagConstraints();
		cLabel2.gridx = 0;
		cLabel2.gridy = 1;
		cLabel2.insets = i;
		panel.add(label2, cLabel2);
		
		
		JTextField textField2 = new JTextField(5);
		GridBagConstraints cText2 = new GridBagConstraints();
		cText2.gridx = 1;
		cText2.gridy = 1;
		//cText1.gridwidth = GridBagConstraints.REMAINDER;
		cText2.insets = i;
		//String nota2 = textField2.getText();
		panel.add(textField2, cText2);
		
		JLabel label3 = new JLabel("Média");
		GridBagConstraints jlabel3 = new GridBagConstraints();
		jlabel3.gridx = 0;
		jlabel3.gridy = 4;
		jlabel3.insets = i;
		panel.add(label3, jlabel3);
		
		JTextField media = new JTextField(5);
		GridBagConstraints cText3 = new GridBagConstraints();
		cText3.gridx = 1;
		cText3.gridy = 4;
		cText3.insets = i;
		panel.add(media, cText3);
		
		
		JButton calcular = new JButton("Calculador Media");
		GridBagConstraints jBotao = new GridBagConstraints();
		jBotao.gridx = 0;
		jBotao.gridy = 3;
		jBotao.gridwidth = GridBagConstraints.CENTER;
		jBotao.insets = i;
		panel.add(calcular, jBotao);
		calcular.addActionListener(new ActionListener() {
			
			@Override
		public void actionPerformed(ActionEvent e) {
				
				String nota1 = textField1.getText();
				double d1 = Double.valueOf(nota1).doubleValue();
				
				String nota2 = textField2.getText();
				double d2 = Double.valueOf(nota2).doubleValue();
				
				double media1 = (d1+d2)/2;
				
				media.setText(String.valueOf(media1));
				
				
				
			
				
			}
		});
		
		
		
		
	
		
	}

}
