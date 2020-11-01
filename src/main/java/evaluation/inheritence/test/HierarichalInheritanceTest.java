package evaluation.inheritence.test;

import evaluation.inheritance.Cat;
import evaluation.inheritance.Dog;

public class HierarichalInheritanceTest {
    public static void main(String[] args) {
        Dog dogObj = new Dog();
        Cat catObj = new Cat();

        dogObj.eat();
        dogObj.bark();

        catObj.eat();
        catObj.meow();
    }
}
