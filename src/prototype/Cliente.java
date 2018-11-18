package prototype;

/**
 *
 * @author A50
 */
//En esta clase creamos el cliente que va a dar los parametros a gusto del clon del objeto moto.
public class Cliente {
    public static void main( String[] args) throws CloneNotSupportedException{
    Moto  moto =new MotoModificada();
    moto.setColor("NEGRO");
    moto.setPlaca("ADC08");
    Moto motoU =moto.clone();
    motoU.setColor("ROJO");
    motoU.setPlaca("ADC01");
    System.out.println(motoU.verMoto()); // imprimimos los parametros llamando el metodo ver moto que hace
    //referencia al clon
    }
}
