package work9_3;

public class Client {
	
	public static void main(String[] args) {
		IOrder sr;
		sr = new Order();
		sr = new HeaderDecorator(sr);
		sr = new FooterDecorator(sr);
		sr.report();
	}
}
