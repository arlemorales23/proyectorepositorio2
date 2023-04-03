package animalesAbstracto;

public class PrincipalAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sonido();
        Lion lion = new Lion();
        lion.sonido();
        Cat cat = new Cat();
        cat.sonido();
    }
}
