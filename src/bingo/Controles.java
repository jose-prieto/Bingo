package bingo;

//con esta clase se controlan las propiedades del juego como tal (bolas, cartones y precios de cartones)
public class Controles {
    Bolas bolas = new Bolas();
    Cartones cartones = new Cartones(bolas); //al hacer que cartones trabaje de una vez con bolas permite afectar de una vez
                                             //los cartones que tengan la bola que salió
    
    //procedimientos necesarior par hacer posible el juego
    public void Juego(){
        bolas.setRango(75);
        bolas.setAux(0);
        do{
            bolas.SacarBola();
        }while(cartones.RevisarCartones() == false);
    }
    
    //para reestablecer cartones
    public void NuevosCartones(){
        this.cartones = new Cartones(bolas);
    }
}
