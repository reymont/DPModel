package work3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Manager {
    private static ArrayList<String> tenantIds =  new ArrayList<>();
    private static Map<String,Manager> managers = new HashMap();

    private Manager(){}

    private Manager(String tenantId){
        tenantIds.add(tenantId);
        managers.put(tenantId,this);
    }

    public static Manager getInstance(String tenantId){
        if(managers.containsKey(tenantId) && managers.get(tenantId)!=null){
            return managers.get(tenantId);
        }else{
            return new Manager(tenantId);
        }
    }

    public static void main(String[] args){
        System.out.println(Manager.getInstance("lily"));
        System.out.println(Manager.getInstance("bruce"));
        System.out.println(Manager.getInstance("lily"));
    }
}
