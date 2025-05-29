package projeto1;

import javax.swing.JOptionPane;

public class pessoa {
	
	public static void main(String[] args) {
		
		
		String banana = JOptionPane.showInputDialog("Quantas bananas são");
		String pessoa = JOptionPane.showInputDialog("E são quantas pessoas?");
		
		double bananaNumero = Double.parseDouble(banana);
		double pessoaNumero = Double.parseDouble(pessoa);
		
		int divisao = (int)(bananaNumero / pessoaNumero); 
		
		double resto = bananaNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão");
		
		if( resposta == 0) {
			JOptionPane.showMessageDialog(null, "A quantidade de banana para cada ficou de " + divisao);
		
	}else {
		JOptionPane.showMessageDialog(null, "Então ta meu amigo");
	}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o quanto sobrou da operação?");
		
		if(resposta == 0){
			JOptionPane.showMessageDialog(null, "Oque sobrou da divisão foi" + resto);
		}else
			JOptionPane.showMessageDialog(null, "Ta blz");
		
		
	
	}

}