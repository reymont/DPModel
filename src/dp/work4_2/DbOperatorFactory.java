package work4_2;

import java.util.HashMap;
import java.util.Map;

public class DbOperatorFactory {
    private Map<String, DbOperator> cache = new HashMap<>();
    public DbOperator factory(String state){
        if(cache.containsKey(state)){
            return cache.get(state);
        }else{
            DbOperator operator = new ConcreteDbOperator(state);
            cache.put(state,operator);
            return operator;
        }
    }
    public void check(){
        for(Map.Entry<String,DbOperator> entry: cache.entrySet()){
            System.out.println("State "+entry.getKey()+":\t"+entry.getValue());
        }
    }
}
