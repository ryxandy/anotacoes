package PersonalizedExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Please enter the Room number");
		int number = sc.nextInt();
		System.out.println("What's the checkIn date? (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next()); 
		System.out.println("What's the checkOut date? (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error: CheckOut must be after CheckIn date ");
		}else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("What's the checkIn date? (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next()); 
			System.out.println("What's the checkOut date? (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			
			asdasdsa
			sadasd
			
			if (checkIn.before(now) || checkOut.before(now)){
				System.out.println("Error em Reservation: Reservation must be after now");
			}else if (!checkOut.after(checkIn)) {
				System.out.println("Error em Reservation: Reservation must be after now");
			}else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		}
		
		
		
		sc.close();
	}
}
