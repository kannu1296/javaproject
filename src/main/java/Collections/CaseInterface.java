package Collections;

public interface CaseInterface {
   void addCase(int tpnd, int quantity, String supplierName, String productName);
   String getCase(int tpnd);
   void printAllCase();
   boolean exist(int tpnd);
   void remove(int tpnd);
}
