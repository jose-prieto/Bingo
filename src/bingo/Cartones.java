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
    
    //asigna cartones de manera manual mientras se crea interfaz de algun menu
    public void AsignaCarton(int jugador){
        cartonPersona[0][0] = getCarton('Z');
        cartonPersona[1][0] = getCarton('A');
        cartonPersona[0][1] = getCarton('B');
        cartonPersona[1][1] = getCarton('D');
        cartonPersona[0][2] = getCarton('E');
        cartonPersona[1][2] = getCarton('H');
        cartonPersona[0][3] = getCarton('J');
        cartonPersona[1][3] = getCarton('T');
    }
    
    //imprime todos los cartones
    public void ImprimirCartones(){
        for (int i=0;i<=25;i++){
            cartones[i].ImprimirCarton();
        }
    }
    
    //revisa si existe algun carton ganador
    public boolean RevisarCartones(){
        boolean aux = false;
        for (int i=0;i<=1;i++){
            for (int j=0;j<=1;j++){
                if(marcador.Linea(cartonPersona[i][j]).equals("Ganador")){
                    cartonPersona[i][j].setGanador();
                    aux = true;
                }
            }
        }
        return aux;
    }

}