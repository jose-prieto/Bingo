package bingo;

public class Marcador {
    
    public boolean Linea(Carton carton){
        int aux = 0;
        for (int i=0;i<=4;i++){
            aux = 0;
            for (int j=0;j<=4;j++){
                if((i == 2 && j == 2) || carton.getCarton()[i][j].getEstado().equals("No disponible")){
                    aux++;
                }
                if (aux == 5){
                    carton.setGanador();
                    return true;
                }
            }
            
        }
        
        for (int j=0;j<=4;j++){
            aux = 0;
            for (int i=0;i<=4;i++){
                
                if((i == 2 && j == 2) || carton.getCarton()[i][j].getEstado().equals("No disponible")){
                    aux++;
                }
                if (aux == 5){
                    carton.setGanador();
                    return true;
                }
            }
        }
        aux = 0;
        for (int i=0;i<=4;i++){
            if((i == 2) || carton.getCarton()[i][i].getEstado().equals("No disponible")){
                    aux++;
                }
            if (aux == 5){
                carton.setGanador();
                return true;
            }
        }
        aux = 0;
        for (int i=0;i<=4;i++){
            if((i == 2) || carton.getCarton()[i][4-i].getEstado().equals("No disponible")){
                aux++;
            }
            if (aux == 5){
                carton.setGanador();
                return true;
            }
        }
        
        return false;
    }
    
    public boolean Completo(Carton carton){
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
            return true;
        }
        
        return false;
    }
}