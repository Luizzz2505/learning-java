package internet;

import java.util.Scanner;

public class aluno {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	String aluno, disciplina;
	int nota1, nota2, nota3;
	double media;
	
	System.out.print("Informe o nome do aluno: ");
	aluno = s.nextLine();
	System.out.println("Informe a disciplina:");
	disciplina = s.nextLine();
	System.out.println("Informe suas notas respectivamente: ");
	nota1 = s.nextInt();
	nota2 = s.nextInt();
	nota3 = s.nextInt();
	
	media = (nota1 + nota2 + nota3) / 3;
	
	if (media >= 7) {
		
		System.out.println("Nome: " + aluno);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Média: " + media + " Aprovado");	
	}
	else {
		System.out.println("Nome: " + aluno);
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Média: " + media + " Reprovado");
	}
		

	
	
	
	
	}

}
