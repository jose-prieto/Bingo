
package bingo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
 //con esta clase se controlan las propiedades del juego como tal (bolas, cartones y precios de cartones)
//Ernesto: tambien se va a controlar la interfaz de la bola
public class Controles {
    JLabel bola;
    Bolas bolas = new Bolas();
    Cartones cartones = new Cartones(bolas); //al hacer que cartones trabaje de una vez con bolas permite afectar de una vez
                                             //los cartones que tengan la bola que salió
    
    //procedimientos necesarior par hacer posible el juego
    public void Juego(JLabel bola) { 
        bolas.setRango(75);
        bolas.setAux(0);
        do{
            bolas.SacarBola(bola);           
        }while(cartones.RevisarCartones() == false);
    }
    
    public Cartones getCartones(){
        return cartones;
    }
    
    //para reestablecer cartones
    public void NuevosCartones(){
        this.cartones = new Cartones(bolas);
    }
}
