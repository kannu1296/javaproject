package Collections;

import java.util.Map;
import java.util.TreeMap;

public class CaseTreeMap implements CaseInterface {


    TreeMap<Integer, Case> caseTreeMap = new TreeMap<>();

    private int tpnd;

    @Override
    public void addCase(int tpnd, int quantity, String supplierName, String productName){
        this.tpnd = tpnd;
        caseTreeMap.put(tpnd, new Case(tpnd, quantity, supplierName, productName));
    }

    @Override
    public String getCase(int tpnd){
        if(caseTreeMap.containsKey(tpnd))
            return caseTreeMap.get(tpnd).get();
        return "Key not Exist";
    }

    @Override
    public void printAllCase(){
        for(Map.Entry entry: caseTreeMap.entrySet()){
            System.out.print(entry.getKey()+" -> ");
            caseTreeMap.get(entry.getKey()).printAll();
        }

    }

    @Override
    public boolean exist(int tpnd){
        if(caseTreeMap.containsKey(tpnd))
            return true;
        else
            return false;
    }

    @Override
    public void remove(int tpnd){
        if(caseTreeMap.containsKey(tpnd))
            caseTreeMap.remove(tpnd);
        else
            System.out.println("OOPS! Key not Exist");
    }

    public String getFirst(){
        return caseTreeMap.pollFirstEntry().getValue().get();
    }

    public String getLast(){
        return caseTreeMap.pollLastEntry().getValue().get();
    }
}
