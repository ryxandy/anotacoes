package forEach;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> person = new ArrayList<Pessoa>();
			Pessoa p1 = new Pessoa("Alexandre", 25);
			Pessoa p2 = new Pessoa("Karine", 22);
			Pessoa p3 = new Pessoa("Mingau", 1);
		person.add(p1);
		person.add(p2);
		person.add(p3);
		
		//Tipo //Apelido //Array a ser percorrido
		for (Pessoa percorrer : person) {
			System.out.println(percorrer.getNome() + percorrer.getIdade());
		}
	}

}
