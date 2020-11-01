package Collections;

import java.util.LinkedList;

public class CaseLinkedList implements CaseInterface {
    private LinkedList<Case> linkList = new LinkedList<>();

    @Override
    public void addCase(int tpnd, int quantity, String supplierName, String productName){
        linkList.add(new Case(tpnd, quantity, supplierName, productName));
    }

    @Override
    public void printAllCase(){
        for(Case c: linkList){
            c.printAll();
        }
    }

    @Override
    public boolean exist(int tpnd){

        for(Case entry: linkList){
            if(entry.getTpnd() == tpnd)
                return true;
        }
        return false;
    }

    @Override
    public void remove(int index){
        try{
            linkList.remove(index);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Index out of bound: "+ex.getMessage());
        }
    }

    @Override
    public String getCase(int index){
        try{
            return linkList.get(index).get();
        }catch (IndexOutOfBoundsException ex){
            return "Index out of bound: "+ex.getMessage();
        }

    }
}
