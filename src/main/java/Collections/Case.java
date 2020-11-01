package Collections;

import java.util.HashSet;

public class Case implements Comparable<Case> {

    private int tpnd;
    private int quantity;
    private String supplierName;
    private String productName;
    //private static HashSet<Integer> uniqueTpnd;

    /*static{
        uniqueTpnd = new HashSet<>();
    }*/

    public Case(){}

    public Case(int tpnd, int quantity, String supplierName, String productName){
        this.tpnd = tpnd;
        this.quantity = quantity;
        this.supplierName = supplierName;
        this.productName = productName;
    }


    public int getTpnd() {
        return tpnd;
    }

    public void setTpnd(int tpnd) {
        //Check if TPND already exist or not
        /*if(!uniqueTpnd.contains(tpnd)){
            uniqueTpnd.add(tpnd);*/
            this.tpnd = tpnd;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void set(int tpnd, int quantity, String supplierName, String productName){
        this.setTpnd(tpnd);
        this.setQuantity(quantity);
        this.setSupplierName(supplierName);
        this.setProductName(productName);
    }

    public String get(){
        return this.getTpnd()+","+this.getQuantity()+","+this.getSupplierName()+","+this.getProductName();
    }

    public void printAll(){
        System.out.println(this.getTpnd()+","+this.getQuantity()+","+this.getSupplierName()+","+this.getProductName());
    }

    @Override
    public int compareTo(Case o) {
        if(this.tpnd > o.getTpnd())
            return 1;
        else if(this.tpnd < o.getTpnd())
            return -1;
        else
            return 0;
    }

    /* public Boolean checkTpnd(int tpnd){
        if(uniqueTpnd.contains(tpnd))
            return true;
        else
            return false;
    }*/
}
