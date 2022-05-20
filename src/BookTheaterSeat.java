
public class BookTheaterSeat {

	static int total_seats = 20;

	static synchronized void bookSeats(int seats) {

		if (total_seats >= seats) {
			System.out.println(Thread.currentThread().getName() + " Booked " + seats + " seats successfully!!");
			total_seats = total_seats - seats;
			System.out.println("Remaining " + total_seats + " seats");
		} else {
			System.out.println("Sorry " + Thread.currentThread().getName() + "... Can not book " + seats + " seats");
			System.out.println("Remaining " + total_seats + " seats");
		}
	}
}
