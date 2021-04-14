package PersonalizedExceptions;

public class ReservationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	//Qual o caso aqui? criei um construtor pra quando eu instanciar essa classe lá no método update
	//passar uma mensagem personalizada
	
	public ReservationException(String msg) {
		super(msg);
	}

	
}
