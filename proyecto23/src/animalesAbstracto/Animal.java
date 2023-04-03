package animalesAbstracto;

abstract  public class Animal {
      abstract  public  void sonido();
}
class Dog extends  Animal{
    @Override
    public void sonido() {
        System.out.println("gua...gua");
    }
}
class Lion extends  Animal{
    @Override
    public void sonido() {
        System.out.println("Roar...");
    }
}
class Cat extends Animal{

    @Override
    public void sonido() {
        System.out.println("miau...");
    }
}
