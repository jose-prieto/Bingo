
package bingo;
import javax.swing.JLabel;
 //con esta clase se controlan las propiedades del juego como tal (bolas, cartones y precios de cartones)
//Ernesto: tambien se va a controlar la interfaz de la bola
public class Controles {
    JLabel bola;
    Bolas bolas = new Bolas();
    public Cartones cartones = new Cartones(bolas); //al hacer que cartones trabaje de una vez con bolas permite afectar de una vez
                                             //los cartones que tengan la bola que salió
    
    //procedimientos necesarior par hacer posible el juego
    public boolean Juego(JLabel bola, String StiloJuego) { 
        bolas.setRango(75);
        bolas.setAux(0);
        bolas.SacarBola(bola);
        return cartones.RevisarCartones(StiloJuego);
    }
    
    public boolean Juego234(JLabel bola, String StiloJuego) { 
        bolas.setRango(75);
        bolas.setAux(0);
        bolas.BolaNoDisponible(bola);
        return cartones.RevisarCartones(StiloJuego);
    }
    
    public Cartones getCartones(){
        return cartones;
    }
    //para reestablecer cartones
    public void NuevosCartones(){
        this.cartones = new Cartones(bolas);
    }
    public Bolas getBolas(){
    return bolas;
    }

}
