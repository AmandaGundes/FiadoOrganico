package Fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Consumidor consumidor = new Consumidor();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();

		System.out.print("Informe o número de compras do cliente: ");
		int compras = scanner.nextInt();
		consumidor.fiados = new int[compras];
		int i = 0;
		while (i < compras) {
			System.out.print("Informe o valor da compra: ");
			int valor = scanner.nextInt();
			while (valor <= 0) {
				System.out.print("Valor deve ser maior que zero. Informe um novo valor: ");
				valor = scanner.nextInt();
				consumidor.fiados[i] = valor;
			}
			consumidor.fiados[i] = valor;
			i++;
		}

		int total = somaFor(consumidor.fiados);

		System.out.println("Cliente " + consumidor.nome + " deve: " + total + " reais.");

	}

	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];
		}
		return total;
	}

}
