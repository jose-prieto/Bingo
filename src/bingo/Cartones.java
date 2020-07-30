package bingo;

//aqui se controlaran los cartones en general
public class Cartones {
    private final Carton[] cartones = new Carton[26];
    public Carton[][] cartonPersona = new Carton[2][4];
    private final Marcador marcador = new Marcador();
    
    //inicia cada carton y le asigna valores asi como tambien el nombre de una vez y los objetos bolas creado en controladores
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
            }while (aux == 0);
        }
    }
    
    //para obtener un carton usando su nombre
    public Carton getCarton(char nombre){
        int aux = -1;
        do{
            aux++;
        }while (cartones[aux].getIdentificacion() != nombre);
        
        return this.cartones[aux];
    }
    
    //imprime todos los cartones
    public void ImprimirCartones(){
        for (int i=0;i<=25;i++){
            cartones[i].ImprimirCarton();
        }
    }
    
    //revisa si existe algun carton ganador
    public boolean RevisarCartones(String juego){
        boolean aux = false;
        for (int i=0;i<=25;i++){
            if(cartones[i].getDisponibilidad().equals("No disponible")){
                if (juego.equals("Juego de línea")){
                    if (marcador.Linea(cartones[i]).equals("Ganador")){
                        cartones[i].setGanador();
                        aux = true;
                    }
                }else{
                    if (marcador.Completo(cartones[i]).equals("Ganador")){
                        cartones[i].setGanador();
                        aux = true;
                    }
                }
                
            }
        }
        return aux;
    }
    
    public boolean RevisarCarton(String juego, Carton carton){
        boolean aux = false;
        
        if (juego.equals("Juego de línea")){
            if (marcador.Linea(carton).equals("Ganador")){
                carton.setGanador();
                aux = true;
            }
        }else{
            if (marcador.Completo(carton).equals("Ganador")){
                carton.setGanador();
                aux = true;
            }
        }
        
        return aux;
    }
    
    public boolean CartonDisponible(){
        boolean aux = false;
        for (int i=0;i<=25;i++){
            cartones[i].setDisponible();
        }
        return aux;
    }

}