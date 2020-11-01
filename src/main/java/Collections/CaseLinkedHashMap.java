package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class CaseLinkedHashMap implements CaseInterface {
    LinkedHashMap<Integer, Case> caseLinkedHashMap = new LinkedHashMap<>();
    private int tpnd;

    @Override
    public void addCase(int tpnd, int quantity, String supplierName, String productName){
        this.tpnd = tpnd;
        caseLinkedHashMap.put(tpnd, new Case(tpnd, quantity, supplierName, productName));
    }

    @Override
    public String getCase(int tpnd){
        if(caseLinkedHashMap.containsKey(tpnd))
            return caseLinkedHashMap.get(tpnd).get();
        return "Key not Exist";
    }

    @Override
    public void printAllCase(){
        for(Map.Entry entry:caseLinkedHashMap.entrySet()){
            System.out.print(entry.getKey()+" -> ");
            caseLinkedHashMap.get(entry.getKey()).printAll();
        }
    }

    @Override
    public boolean exist(int tpnd){
        if(caseLinkedHashMap.containsKey(tpnd))
            return true;
        else
            return false;
    }

    @Override
    public void remove(int tpnd){
        if(caseLinkedHashMap.containsKey(tpnd))
            caseLinkedHashMap.remove(tpnd);
        else
            System.out.println("OOPS! Key not Exist");
    }

}
