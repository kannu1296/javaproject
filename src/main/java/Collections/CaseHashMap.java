package Collections;

import java.util.HashMap;
import java.util.Map;

public class CaseHashMap {

    HashMap<Integer, Case> caseHashMap = new HashMap<>();
    private int tpnd;

    public void addCase(int tpnd, int quantity, String supplierName, String productName){
        this.tpnd = tpnd;
        caseHashMap.put(tpnd, new Case(this.tpnd, quantity, supplierName, productName));
    }

    public String getCase(int tpnd){
        if(!caseHashMap.containsKey(tpnd))
            return "Key not Exist";
        return  caseHashMap.get(tpnd).get();
    }

    public void printAllCase(){
        for(Map.Entry entry: caseHashMap.entrySet()){
            System.out.print(entry.getKey() +" -> ");
            caseHashMap.get(entry.getKey()).printAll();
        }
    }

    public boolean exist(int tpnd){
        if(caseHashMap.containsKey(tpnd))
            return true;
        else
            return false;
    }

    public void remove(int tpnd){
        if(caseHashMap.containsKey(tpnd))
            caseHashMap.remove(tpnd);
        else
            System.out.println("OOPS! Key not Exist");
    }

    @Override
    public int hashCode(){
        return tpnd;
    }

}
