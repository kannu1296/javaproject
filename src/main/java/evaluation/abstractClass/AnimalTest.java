package evaluation.abstractClass;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dogobj = new Dog();
        Animal catObj = new Cat();

        dogobj.eat();
        catObj.eat();
    }
}
