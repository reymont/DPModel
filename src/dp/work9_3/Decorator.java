package work9_3;

public abstract class Decorator extends IOrder {

	private IOrder sr;
	
	public Decorator(IOrder sr){
		this.sr = sr;
	}
	
	public void report(){
		this.sr.report();
	}
	
}
