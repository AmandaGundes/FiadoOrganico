package Fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();
		
		System.out.print("Informe o telefone do cliente: ");
		String telefone = scanner.nextLine();

		System.out.print("Informe o número de compras do cliente: ");
		int compras = scanner.nextInt();
		
		Consumidor consumidor = new Consumidor(nome, telefone, compras);
		
		int i = 0;
		while (i < compras) {
			System.out.print("Informe o valor da compra: ");
			int valor = scanner.nextInt();
			while (valor <= 0) {
				System.out.print("Valor deve ser maior que zero. Informe um novo valor: ");
				valor = scanner.nextInt();
			}
			consumidor.registrarFiado(valor);
			i++;
		}

		int total = consumidor.getFiado();

		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " reais. Seu telefone é: " + consumidor.getTelefone());
		} else {
			System.out.println("Cliente " + consumidor.getNome() + " deve menos que 100 reais. Seu telefone é: " + consumidor.getTelefone());
		}

	}

}
