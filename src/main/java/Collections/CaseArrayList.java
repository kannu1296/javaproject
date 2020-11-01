package Collections;

import java.util.ArrayList;

public class CaseArrayList implements CaseInterface  {

    private ArrayList<Case> arrayList = new ArrayList<>();

    @Override
    public void addCase(int tpnd, int quantity, String supplierName, String productName){
        arrayList.add(new Case(tpnd, quantity, supplierName, productName));
    }

    @Override
    public void printAllCase(){
        for(Case c: arrayList){
            c.printAll();
        }
    }


    public void remove(int index){
        try{
            arrayList.remove(index);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Array index out of bound: "+ex.getMessage());
        }

    }

    @Override
    public boolean exist(int tpnd){

        for(Case entry: arrayList){
            if(entry.getTpnd() == tpnd)
                return true;
        }
        return false;
    }

    //Exception example
    @Override
    public String getCase(int index){
        try{
            return arrayList.get(index).get();
        }catch (IndexOutOfBoundsException ex){
            //System.out.println("Array index out of bound: "+ex.getMessage());
            return "Array index out of bound "+ex.getMessage();
        }

    }
}
