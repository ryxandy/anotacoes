package Exercise1;

import java.text.DecimalFormat;

public class CurrencyConverter {

	final static double dolar = 5.62 ;
	
	public static final double convertRealToDolar(double dolar, double real) {
		CurrencyConverter.formatDoubleNumber(real);
		CurrencyConverter.formatDoubleNumber(dolar);
		return real * dolar;
	}
	
	public static final double formatDoubleNumber(double value) {
		DecimalFormat f = new DecimalFormat("#.##");
		f.format(value);
		return value;
	}


}
