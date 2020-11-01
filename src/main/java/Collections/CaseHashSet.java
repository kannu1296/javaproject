package Collections;

import java.util.HashSet;

public class CaseHashSet implements CaseInterface {
    private HashSet<Case> caseHashSet = new HashSet<>();
    private HashSet<Integer> caseTpnd = new HashSet<>();

    @Override
    public void addCase(int tpnd, int quantity, String supplierName, String productName) {
        if(caseTpnd.isEmpty()){
            caseHashSet.add(new Case(tpnd, quantity, supplierName, productName));
            caseTpnd.add(tpnd);
        }
        else{
            if(!caseTpnd.isEmpty()&&!caseTpnd.contains(tpnd)){
                caseHashSet.add(new Case(tpnd, quantity, supplierName, productName));
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
        for(Case entry: caseHashSet)
            entry.printAll();
    }

    @Override
    public String getCase(int tpnd) {
        for(Case entry: caseHashSet){
            if(entry.getTpnd()==tpnd)
                return entry.get();
        }
        return "Please provide valid tpnd";
    }

    @Override
    public boolean exist(int tpnd) {
        for(Case entry: caseHashSet){
            if(entry.getTpnd() == tpnd)
                return true;
        }
        return false;
    }

    @Override
    public void remove(int tpnd) {
        for(Case entry: caseHashSet){
            if(entry.getTpnd() == tpnd){
                caseHashSet.remove(entry);
                return;
            }
        }
        System.out.println("Please Pass Valid Tpnd");

    }
}
