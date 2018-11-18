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
// en esta parte del codigo creamos el override para ver moto dependiendo del clon que deseamos ver traemos
//los valores a la pantalla
public class MotoModificada extends Moto {

    @Override
    public String verMoto() {
    return "la moto es de color: "+ this.getColor()+ "\nla placa es: "+ this.getPlaca();
    
    }
    
}
