package evaluation.overloading;

public class OverloadingExampleTest {
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
    }
}
