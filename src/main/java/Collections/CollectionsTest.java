package Collections;

public class CollectionsTest {
    public static void main(String[] args) {

        //ArrayList test
        CaseArrayList arrayListObj = new CaseArrayList();
        System.out.println("-----ArrayList------");
        arrayListObj.addCase(1, 2, "Coca-Cola", "Coke");
        arrayListObj.addCase(6, 2, "Coca-Cola", "Coke");
        arrayListObj.printAllCase();
        arrayListObj.remove(0);
        arrayListObj.printAllCase();
        System.out.println(arrayListObj.getCase(6));
        System.out.println(arrayListObj.exist(1));
        System.out.println();

        //LinkedList test
        CaseLinkedList linkedListObj = new CaseLinkedList();
        System.out.println("-----LinkedList------");
        linkedListObj.addCase(4, 3, "Pepsi", "Pepsi");
        linkedListObj.addCase(6, 2, "Coca-Cola", "Coke");
        linkedListObj.printAllCase();
        linkedListObj.remove(1);
        linkedListObj.printAllCase();
        System.out.println();

        //HashMap test
        CaseHashMap hashMapObj = new CaseHashMap();
        System.out.println("-----HashMap------");
        hashMapObj.addCase(6, 2, "Coca-Cola", "Coke");
        hashMapObj.addCase(4, 3, "Pepsi", "Pepsi");
        hashMapObj.addCase(20, 4, "Pepsi", "Mirinda");
        hashMapObj.addCase(2, 5, "Patanjali", "Patanjali Aata");
        hashMapObj.printAllCase();
        System.out.println("Get from Map--->"+hashMapObj.getCase(3));
        hashMapObj.remove(22);
        hashMapObj.printAllCase();
        System.out.println(hashMapObj.exist(1));
        System.out.println();

        //LinkedHashMapTest
        CaseLinkedHashMap linkedHashMapObj = new CaseLinkedHashMap();
        System.out.println("-----LinkedHashMap-----");
        linkedHashMapObj.addCase(6, 2, "Coca-Cola", "Coke");
        linkedHashMapObj.addCase(4, 3, "Pepsi", "Pepsi");
        linkedHashMapObj.addCase(20, 4, "Pepsi", "Mirinda");
        linkedHashMapObj.addCase(2, 5, "Patanjali", "Patanjali Aata");
        linkedHashMapObj.printAllCase();
        System.out.println("Get from LinkedHashMap --> "+linkedHashMapObj.getCase(4));
        linkedHashMapObj.remove(4);
        linkedHashMapObj.printAllCase();
        System.out.println(linkedHashMapObj.exist(6));
        System.out.println();

        //TreeMapTest
        CaseTreeMap treeMapObj = new CaseTreeMap();
        System.out.println("-----TreeMap-----");
        treeMapObj.addCase(6, 2, "Coca-Cola", "Coke");
        treeMapObj.addCase(4, 3, "Pepsi", "Pepsi");
        treeMapObj.addCase(20, 4, "Pepsi", "Mirinda");
        treeMapObj.addCase(2, 5, "Patanjali", "Patanjali Aata");
        treeMapObj.printAllCase();
        System.out.println("Get from TreeMap --> "+treeMapObj.getCase(4));
        treeMapObj.remove(4);
        treeMapObj.printAllCase();
        System.out.println(treeMapObj.exist(4));
        System.out.println("First Entry -> "+treeMapObj.getFirst());
        System.out.println("Last Entry -> "+treeMapObj.getLast());
        System.out.println();

        //HashSetTest
        CaseHashSet hashSetObj = new CaseHashSet();
        System.out.println("-----HashSet-----");
        hashSetObj.addCase(6, 2, "Coca-Cola", "Coke");
        hashSetObj.addCase(4, 3, "Pepsi", "Pepsi");
        hashSetObj.addCase(20, 4, "Pepsi", "Mirinda");
        hashSetObj.addCase(2, 5, "Patanjali", "Patanjali Aata");
        hashSetObj.printAllCase();

        //Duplicate Entry
        hashSetObj.addCase(6, 2, "Coca-Cola", "Coke");

        hashSetObj.remove(4);
        hashSetObj.printAllCase();
        hashSetObj.remove(7);
        hashSetObj.getCase(20);
        System.out.println(hashSetObj.exist(6));
        System.out.print("\n");

        //LinkedHashSetTest
        CaseLinkedHashSet linkedHashSetObj = new CaseLinkedHashSet();
        System.out.println("-----LinkedHashSet-----");
        linkedHashSetObj.addCase(6, 2, "Coca-Cola", "Coke");
        linkedHashSetObj.addCase(4, 3, "Pepsi", "Pepsi");
        linkedHashSetObj.addCase(20, 4, "Pepsi", "Mirinda");
        linkedHashSetObj.addCase(2, 5, "Patanjali", "Patanjali Aata");
        linkedHashSetObj.printAllCase();

        //Duplicate Entry
        linkedHashSetObj.addCase(6, 2, "Coca-Cola", "Coke");

        linkedHashSetObj.remove(4);
        linkedHashSetObj.printAllCase();
        linkedHashSetObj.remove(7);
        linkedHashSetObj.getCase(20);
        System.out.println(linkedHashSetObj.exist(6));
        System.out.print("\n");

        //TreeSetTest
        CaseTreeSet treeSetObj = new CaseTreeSet();
        System.out.println("-----TreeSet-----");
        treeSetObj.getFirst();
        treeSetObj.getLast();
        treeSetObj.addCase(6, 2, "Coca-Cola", "Coke");
        treeSetObj.getFirst();
        treeSetObj.addCase(4, 3, "Pepsi", "Pepsi");
        treeSetObj.addCase(20, 4, "Pepsi", "Mirinda");
        treeSetObj.addCase(2, 5, "Patanjali", "Patanjali Aata");
        treeSetObj.getLast();
        treeSetObj.printAllCase();

        //Duplicate Entry
        treeSetObj.addCase(6, 2, "Coca-Cola", "Coke");

        treeSetObj.remove(4);
        treeSetObj.printAllCase();
        treeSetObj.remove(7);
        treeSetObj.getCase(20);
        System.out.println(treeSetObj.exist(6));
        System.out.print("\n");


    }
}
