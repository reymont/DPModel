package work9_3;

public class HeaderDecorator extends Decorator {

	public HeaderDecorator(IOrder sr){
		super(sr);
	}
	
	private void reportHeader(){
		System.out.println("打印表头");
	}
	
	@Override
	public void report(){
		this.reportHeader();
		super.report();
	}
}
