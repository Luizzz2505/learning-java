package internet;

import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	int codigo, operacao;
	double n1, n2, media, diferenca, produto, divisao;
	
	System.out.println("Insira o código da operação: ");
	codigo = sc.nextInt();
	
	if (codigo > 4) {
		System.out.println("Número inválido");
	}
	else {	
		System.out.println("Informe os números para a operação: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
	
		media = (n1 + n2) / 2;
		diferenca = n1 - n2;
		produto = n1 * n2;
		divisao = n1 / n2;
	
		switch (codigo) {
		case 1:
			System.out.println("A média dos seus números é: " + media);
			break;
		case 2:
			System.out.println("A diferença dos seus números é: " + diferenca);
			break;
		case 3:
			System.out.println("O produto dos seus números é: " + produto);
			break;
		case 4:
			System.out.println("A divisão dos seus números é: " + divisao);
			break;
		default: 
			System.out.println("Código inválido");
			break;
		}
	}

	
	
	
	}

}
