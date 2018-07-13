package work7;

public class Client {
    public static void main(String[] args){
        Context context;
        context = new Context(new UserPasswordStrategy());
        context.login();
        context = new Context(new ScanCodeStrategy());
        context.login();
    }
}
