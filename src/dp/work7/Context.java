package work7;

public class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    public void login(){
        this.strategy.login();
    }
}
