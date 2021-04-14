package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		method1();

	}

	public static void method2() {
		System.out.println("**** AQUI COMEÇOU O MÉTODO 2******");
		Scanner sc = new Scanner(System.in);

		// Aqui estou usando dois tipos de tratamentos de exceções, um é pra quanto a
		// posição nao existe
		// O outro é para quando digita um tipo de dado que não deveria
		try {
			String[] vetor = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vetor[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida! " + e.getMessage());

		} catch (InputMismatchException e) {
			System.out.println("Por favor digite um número! " + e.getMessage());
		}

		System.out.println("**** AQUI TERMINOU O MÉTODO 2******");

		sc.close();
	}

	public static void method1() {
		System.out.println("**** AQUI COMEÇOU O MÉTODO 1******");
		method2();
		System.out.println("**** AQUI TERMINOU O MÉTODO 1******");

	}
}
