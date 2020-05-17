package bingo;

public class Cartones {
    private final Carton[] cartones = new Carton[26];
    
    public Cartones(Bolas bolas){
        for (int i=65;i<=90;i++){
            int aux = 1;
            do{
                cartones[i-65] = new Carton((char)i, bolas);
                for (int aux2=0;aux2<=(i-66);aux2++){
                    if (i-65 > 0){
                        if (cartones[i-65] == cartones[aux2]){
                            aux = 0;
                        }
                    }
                }
                bolas.ReiniciarBolas();
            }while (aux == 0);
        }
    }
    
    public Carton getCarton(char nombre){
        int aux = -1;
        do{
            aux++;
        }while (cartones[aux].getIdentificacion() != nombre);
        
        return this.cartones[aux];
    }
    
    public void ImprimirCartones(){
        for (int i=0;i<=25;i++){
            cartones[i].ImprimirCarton();
        }
    }
}