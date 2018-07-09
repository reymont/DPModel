package work4_2;

public class ConcreteDbOperator implements DbOperator {
    private String state = null;
    public ConcreteDbOperator(String state){
        this.state = state;
    }
    @Override
    public void opertaion(String state) {
        System.out.println("State is "+state);
    }
}
