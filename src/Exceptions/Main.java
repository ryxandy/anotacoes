package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		method1();

	}

	public static void method2() {
		System.out.println("**** AQUI COME�OU O M�TODO 2******");
		Scanner sc = new Scanner(System.in);

		// Aqui estou usando dois tipos de tratamentos de exce��es, um � pra quanto a
		// posi��o nao existe
		// O outro � para quando digita um tipo de dado que n�o deveria
		try {
			String[] vetor = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vetor[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida! " + e.getMessage());

		} catch (InputMismatchException e) {
			System.out.println("Por favor digite um n�mero! " + e.getMessage());
		}

		System.out.println("**** AQUI TERMINOU O M�TODO 2******");

		sc.close();
	}

	public static void method1() {
		System.out.println("**** AQUI COME�OU O M�TODO 1******");
		method2();
		System.out.println("**** AQUI TERMINOU O M�TODO 1******");

	}
}
