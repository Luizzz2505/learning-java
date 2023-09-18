//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

package curso_programacao;

import java.util.Scanner;

public class Numeros_multiplos {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n1, n2;
	
	System.out.println("Informe o primeiro número: ");
	n1 = sc.nextInt();
	System.out.println("Informe o segundo número: ");
	n2 = sc.nextInt();
	
	if (n1 % n2 == 0 || n2 % n1 == 0) {
		System.out.println("São múltiplos");
	}
	else {
		System.out.println("Não são múltiplos");
	}
	

	}

}
