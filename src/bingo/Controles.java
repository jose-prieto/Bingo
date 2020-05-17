package bingo;

public class Controles {
    Bolas bolas = new Bolas();
    Cartones cartones = new Cartones(bolas);
    Marcador marcador = new Marcador();
    Carton[][] cartonPersona = new Carton[2][4];
    
    public void Juego(){
        bolas.setRango(75);
        bolas.setAux(0);
        do{
            bolas.SacarBola();
        }while(marcador.Linea(cartonPersona[0][0]) == false);
        RevisarCartones();
            
    }
    
    public boolean RevisarCartones(){
        boolean aux = false;
        for (int i=0;i<=1;i++){
            for (int j=0;j<=1;j++){
                if(marcador.Linea(cartonPersona[i][j])){
                    aux = true;
                }
            }
        }
        
        return aux;
    }
    
    public void AsignaCarton(int jugador){
        
        cartonPersona[0][0] = this.cartones.getCarton('Z');
        cartonPersona[1][0] = this.cartones.getCarton('A');
        cartonPersona[0][1] = this.cartones.getCarton('B');
        cartonPersona[1][1] = this.cartones.getCarton('D');
        cartonPersona[0][2] = this.cartones.getCarton('E');
        cartonPersona[1][2] = this.cartones.getCarton('H');
        cartonPersona[0][3] = this.cartones.getCarton('J');
        cartonPersona[1][3] = this.cartones.getCarton('T');
    }
    
    public void NuevosCartones(){
        this.cartones = new Cartones(bolas);
    }
}
