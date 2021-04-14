package PersonalizedExceptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

	private int roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	//Aqui estou fazendo um formatador de datas para o formato brasileiro
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(int roomNumber, Date checkIn, Date checkOut) throws ReservationException {
		if (!checkOut.after(checkIn)) {
			throw new ReservationException("Check-Out date must be after the check-In date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	//Methods
	public Long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);	
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws ReservationException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)){
			throw new ReservationException("Reservation date must be future date");
		}else if (!checkOut.after(checkIn)) {
			throw new ReservationException("Check-Out date must be after the check-In date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Reservation Room: " + roomNumber + ", check-In: " + sdf.format(checkIn) + ", check-Out: " + sdf.format(checkOut) + ", " +  duration() + " Nights";
	}
	
}
