//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa

package curso_programacao;

import java.util.Scanner;

public class Exercicio_soma {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int a, b, soma;
	
	System.out.println("Insira o primeiro valor: ");
	a = sc.nextInt();
	System.out.println("Insira o segundo valor: ");
	b = sc.nextInt();
	
	soma = a + b;
	
	System.out.println("SOMA = " + soma);
		

	}

}