//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

package curso_programacao;

import java.util.Scanner;

public class Numero_par_impar {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Informe um número: ");
	numero = sc.nextInt();
	
	if (numero % 2 == 0) {
		System.out.println("Número par");
	}
	else {
		System.out.println("Número ímpar");
	}
		
	}

}
