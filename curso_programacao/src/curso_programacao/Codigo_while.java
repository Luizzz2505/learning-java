//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.
package curso_programacao;

import java.util.Scanner;

public class Codigo_while {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int codigo;
	
	System.out.println("Informe o código do produto: ");
	codigo = sc.nextInt();
	
	while (codigo < 5)
	
	switch (codigo) {
	case 1: 
		System.out.println("Álcool");
		break;
	case 2:
		System.out.println("Gasolina");
		break;
	case 3:
		System.out.println("Diesel");
		break;
	default:
		System.out.println("Fim");
		break;	
	}
		
	
	System.out.println("Código inválido!");
	System.out.println("Tente novamente: ");
	codigo = sc.nextInt();
	
	
	
		
	}

}
