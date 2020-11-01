package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class CaseLinkedHashSet implements CaseInterface {
    LinkedHashSet<Case> linkedHashSetObj = new LinkedHashSet<>();
    HashSet<Integer> caseTpnd = new HashSet<>();

    @Override
    public void addCase(int tpnd, int quantity, String supplierName, String productName) {
        if(caseTpnd.isEmpty()){
            linkedHashSetObj.add(new Case(tpnd, quantity, supplierName, productName));
            caseTpnd.add(tpnd);
        }
        else{
            if(!caseTpnd.isEmpty()&&!caseTpnd.contains(tpnd)){
                linkedHashSetObj.add(new Case(tpnd, quantity, supplierName, productName));
                caseTpnd.add(tpnd);
            }
            else{
                System.out.println("Duplicate TPND not allowed");
                return;
            }
        }
    }

    @Override
    public void printAllCase() {
        for(Case entry: linkedHashSetObj)
            entry.printAll();
    }

    @Override
    public String getCase(int tpnd) {
        for(Case entry: linkedHashSetObj){
            if(entry.getTpnd()==tpnd)
                return entry.get();
        }
        return "Please provide valid tpnd";
    }

    @Override
    public boolean exist(int tpnd) {
        for(Case entry: linkedHashSetObj){
            if(entry.getTpnd() == tpnd)
                return true;
        }
        return false;
    }

    @Override
    public void remove(int tpnd) {
        for(Case entry: linkedHashSetObj){
            if(entry.getTpnd() == tpnd){
                linkedHashSetObj.remove(entry);
                return;
            }
        }
        System.out.println("Please Pass Valid Tpnd");

    }
}
