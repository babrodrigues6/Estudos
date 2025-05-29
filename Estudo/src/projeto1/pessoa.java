package projeto1;

import javax.swing.JOptionPane;

public class pessoa {
	
	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
		
		double nota1Numero = Double.parseDouble(nota1);
		double nota2Numero = Double.parseDouble(nota2);
		double nota3Numero = Double.parseDouble(nota3);
		double nota4Numero = Double.parseDouble(nota4);
		
		double media = (nota1Numero + nota2Numero + nota3Numero + nota4Numero) / 4;
		
		if (media >= 50) {
			if( media >= 70) {
				 JOptionPane.showMessageDialog(null, "Aluno aprovado com a nota " + media);
			 }else {
					JOptionPane.showMessageDialog(null, "Ficou de recuperação com a nota " + media);
		}
				
		}else {
		   JOptionPane.showMessageDialog(null, "REPROVADOOOOOOOOOO " + media);
			}
				
	}
	}

