package Exercise1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Ol�, atualmente a cota��o do D�lar atual est�: " + CurrencyConverter.dolar);
		System.out.println();
		System.out.println("Quantos d�lares voc� quer comprar? ");
		int qtd = read.nextInt();
		double qtdFinal =CurrencyConverter.convertRealToDolar(CurrencyConverter.dolar, qtd);
		System.out.println("Essa quantidade de D�lares requer: " + qtdFinal + " Reais");
	}

}
