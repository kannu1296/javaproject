package Collections;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class CaseTreeSet implements CaseInterface {
    TreeSet<Case> caseTreeSet = new TreeSet<>();
    HashSet<Integer> caseTpnd = new HashSet<>();

    @Override
    public void addCase(int tpnd, int quantity, String supplierName, String productName) {
        if(caseTpnd.isEmpty()){
            caseTreeSet.add(new Case(tpnd, quantity, supplierName, productName));
            caseTpnd.add(tpnd);
        }
        else{
            if(!caseTpnd.isEmpty()&&!caseTpnd.contains(tpnd)){
                caseTreeSet.add(new Case(tpnd, quantity, supplierName, productName));
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
        for(Case entry: caseTreeSet)
            entry.printAll();
    }

    @Override
    public String getCase(int tpnd) {
        for(Case entry: caseTreeSet){
            if(entry.getTpnd()==tpnd)
                return entry.get();
        }
        return "Please provide valid tpnd";
    }

    @Override
    public boolean exist(int tpnd) {
        for(Case entry: caseTreeSet){
            if(entry.getTpnd() == tpnd)
                return true;
        }
        return false;
    }

    @Override
    public void remove(int tpnd) {
        for(Case entry: caseTreeSet){
            if(entry.getTpnd() == tpnd){
                caseTreeSet.remove(entry);
                return;
            }
        }
        System.out.println("Please Pass Valid Tpnd");
    }

    public void getFirst(){
        try{
            caseTreeSet.first().printAll();
        }catch (NoSuchElementException ex){
            System.out.println("TreeSet is Empty");

        }
    }

    public void getLast(){
        try{
            caseTreeSet.last().printAll();
        }catch (NoSuchElementException ex){
            System.out.println("TreeSet is Empty");
        }
    }

}
