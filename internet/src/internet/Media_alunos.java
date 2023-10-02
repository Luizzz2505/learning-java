package internet;

import java.util.Scanner;

public class Media_alunos {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	double nota1, nota2, nota3, media;
	double notaf = 0;
	
	//Notas
	System.out.print("Digite a primeira nota: ");
	nota1 = s.nextDouble();
	System.out.print("Digite sua segunda nota: ");
	nota2 = s.nextDouble();
	
	//Média
	media = (nota1 + nota2) / 2;
	
	//Primeira condição
	if (media >= 7) {
		System.out.println("Você foi aprovado com média " + media);
	}
	else {
		System.out.println("Você vai para a final com média " + media);
		
	}
	
	if (media < 7) {
		System.out.println("Digite sua nota da final:");
		nota3 = s.nextDouble();
	
	
	 notaf = (media + nota3) / 2;
	 
	 
	
	if (notaf >= 7) {
		System.out.print("Você foi aprovado na final com média " + notaf);
	}
	else {
		System.out.print("Você foi reprovado na final com média " + notaf);
	}
	
	
	}
	 
}
	
}
	
	
