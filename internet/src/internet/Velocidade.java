package internet;

import java.util.Scanner;

public class Velocidade {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int velocidadeCarro, velocidadeRua, diferenca, multa;
	
	System.out.println("Informe a velocidade do carro:");
	velocidadeCarro = sc.nextInt();
	System.out.println("Informe o limite de velocidade da rua: ");
	velocidadeRua = sc.nextInt();
	
	diferenca = velocidadeCarro - velocidadeRua;
	
	if (diferenca <= 0) {
		System.out.println("Sem multa de velocidade");
	}
	else if (diferenca <= 10) {
		System.out.println("Multa de velocidade de 50 reais");
	}
	else if (diferenca <= 30) {
		System.out.println("Multa de velocidade de 100 reais");
	}
	else {
		System.out.println("Multa de velocidade de 300 reais");
	}
	
	
	
	}

}
