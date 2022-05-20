
public class BookMySeatApp{

	
	public static void main(String[] args) {
		
		BookTheaterSeat bts1= new BookTheaterSeat();
		
		BookTheaterSeat bts2= new BookTheaterSeat();
		
		MyThread1 t1 = new MyThread1(bts1, 7);
		t1.setName("Ram");
		
		MyThread2 t2 = new MyThread2(bts1, 6);
		t2.setName("Sham");
		
		MyThread1 t3 = new MyThread1(bts2, 5);
		t3.setName("Sita");
		
		MyThread2 t4 = new MyThread2(bts2, 8);
		t4.setName("Gita");

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
