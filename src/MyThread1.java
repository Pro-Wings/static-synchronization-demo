
public class MyThread1 extends Thread {

	BookTheaterSeat bookTheaterSeat;
	int seats;

	public MyThread1(BookTheaterSeat bookTheaterSeat, int seats) {
		super();
		this.bookTheaterSeat = bookTheaterSeat;
		this.seats = seats;
	}

	public void run() {
		bookTheaterSeat.bookSeats(seats);
	}

}
