package work8;

/**
 * https://www.cnblogs.com/SamFlynn/p/4501154.html
 */
public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        ctx.assign(a, true);
        ctx.assign(b, true);
        ctx.assign(c, false);
        ctx.assign(d, true);
        Expression exp = new Or(new And(a,b) , new And(c,new Not(d)));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
    }

}