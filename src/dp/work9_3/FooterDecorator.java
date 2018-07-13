package work9_3;

public class FooterDecorator extends Decorator {

	public FooterDecorator(IOrder sr){
		super(sr);
	}
	
	private void reportFooter(){
		System.out.println("打印表尾");
	}
	
	@Override
	public void report(){
		super.report();
		this.reportFooter();
	}
}
