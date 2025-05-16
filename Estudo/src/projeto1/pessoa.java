package projeto1;

public class pessoa {
	
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 95;		
		int nota4 = 30;
		int media = 0;
		int dia = 5;
		
		media = (nota1+nota2+nota3+nota4) / 4;
		
		
		switch (dia) {
		case 1: 
			System.out.println("Segunda");
			break;
		case 2: 
			System.out.println("Terça");
			break;
		case 3: 
			System.out.println("Quarta");
			break;
		case 4: 
			System.out.println("Quinta");
			break;
		case 5: 
			System.out.println("Sexta");
			break;
		case 6: 
			System.out.println("Sabado");
			break;
		case 7: 
			System.out.println("Domingo");
			break;
			
		
		
		default: System.out.println(" Não encontrado");
			break;
		
}
	}

}