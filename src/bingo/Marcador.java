package bingo;

//en esta clase se revisaran cuales cartones han ganado
public class Marcador {
    
    public String Linea(Carton carton){
        int aux;
        
        //revisa todos los posibles match de lineas horizontales
        for (int i=0;i<=4;i++){
            aux = 0;
            for (int j=0;j<=4;j++){
                if((i == 2 && j == 2) || carton.getCarton()[i][j].getEstado().equals("No disponible")){
                    aux++;
                }
                if (aux == 5){
                    carton.setGanador();
                    System.out.println("gano con horizontal");
                    return "Ganador";
                }
            }
            
        }
        
        //revisa todos los posibles match de lineas verticales
        for (int j=0;j<=4;j++){
            aux = 0;
            for (int i=0;i<=4;i++){
                
                if((i == 2 && j == 2) || carton.getCarton()[i][j].getEstado().equals("No disponible")){
                    aux++;
                }
                if (aux == 5){
                    carton.setGanador();
                    System.out.println("gano con vertical");
                    return "Ganador";
                }
            }
        }
        
        //revisa todos los posibles match diagonales de izquierda a derecha
        aux = 0;
        for (int i=0;i<=4;i++){
            if((i == 2) || carton.getCarton()[i][i].getEstado().equals("No disponible")){
                    aux++;
                }
            if (aux == 5){
                carton.setGanador();
                System.out.println("gano con diagonal de izquierda a derecha");
                return "Ganador";
            }
        }
        
        //revisa todos los posibles matchs de derecha a izquierda
        aux = 0;
        for (int i=0;i<=4;i++){
            if((i == 2) || carton.getCarton()[i][4-i].getEstado().equals("No disponible")){
                aux++;
            }
            if (aux == 5){
                carton.setGanador();
                System.out.println("gano con diagonal de derecha a izquierda");
                return "Ganador";
            }
        }
        
        return "Perdedor";
    }
    
    //revisa si el carton ha sido llenado
    public String Completo(Carton carton){
        int aux = 0;
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                if((i == 2 && j == 2) || carton.getCarton()[i][j].getEstado().equals("No disponible")){
                    aux++;
                }
            }
        }
        if (aux == 25){
            carton.setGanador();
            return "Ganador";
        }
        
        return "Perdedor";
    }
}