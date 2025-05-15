package projeto1;

public class pessoa {
	
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 0;
		int nota3 = 95;		
		int nota4 = 0;
		int media = 0;
		
		media = (nota1+nota2+nota3+nota4) / 4;
		
		if (media >= 30) {	
			if (media >=50) {
				if(media >70){
				System.out.println("Aluno aprovado com a nota " + media);
				}
			}else {
				System.out.println("Aluno esta reprovado com a nota " + media);
			}
		}
		
		
		
		
}

}