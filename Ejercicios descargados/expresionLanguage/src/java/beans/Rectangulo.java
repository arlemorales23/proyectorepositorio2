/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author USUARIO
 */
public class Rectangulo {
private int base = 5;

  private int altura = 10;

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  /**
   * Agregamos un metodo que no mapea con ninguna propiedad
   * sino que es el resultado de un calculo
   */
  public int getArea(){
    return this.base * this.altura;
  }      
}
