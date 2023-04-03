package abstracta;

abstract  public class Persona {
    abstract  public void Mensaje();
     abstract  public void mensaje3();
    final public void mensaje2(){
    }
}

abstract  class Empleado extends  Persona{
    @Override
    public void Mensaje() {

    }

    class Admin extends  Empleado{

        @Override
        public void mensaje3() {

        }
    }
}
