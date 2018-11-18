/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author A50
 */
// se crea el objeto moto el cual vamos a estar clonando acorde a las necesidades de un cliente
public abstract class Moto implements Cloneable{
    // variables 
    private String color;
    private String placa;
    // creamos la sobre escritura con una herencia de el objeto moto para clonar teniendo todos sus atributos
    public Moto clone() throws CloneNotSupportedException {
        return (Moto)super.clone(); // retornamos la moto clonada
    }
    public abstract String verMoto();
//creamos el metodo ver moto y getters y setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
