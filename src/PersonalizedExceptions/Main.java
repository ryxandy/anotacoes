package PersonalizedExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Please enter the Room number");
			int number = sc.nextInt();
			System.out.println("What's the checkIn date? (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			System.out.println("What's the checkOut date? (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);

			System.out.println();
			System.out.println("What's the checkIn date? (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("What's the checkOut date? (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());

			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		} 
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}catch (ReservationException  e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		
		sc.close();
	}

}
