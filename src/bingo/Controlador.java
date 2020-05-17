package bingo;

public class Controlador {
    Controles controles = new Controles();
    Jugador[] jugador = new Jugador[4];

    public void Controlar() {
        
        CrearUser();
        controles.Juego();
        Ganadores();
    }
    
    public void CrearUser(){
        jugador[0] = new Jugador("Jose");
        jugador[0].setPresupuesto(1000);
        jugador[1] = new Jugador("pedro");
        jugador[1].setPresupuesto(1000);
        jugador[2] = new Jugador("jaime");
        jugador[2].setPresupuesto(1000);
        jugador[3] = new Jugador("paola");
        jugador[3].setPresupuesto(1000);
        controles.AsignaCarton(3);
    }
    
    public void ordenarJugadores(){
        Jugador player;
        for (int i=3;i>=1;i++){
            player = jugador[i];
            jugador[i] = null;
            for (int j=0;j>=3;j++){
                if (jugador[i] == null){
                    jugador[i] = player;
                }
            }
        }
    }
    
    public void numJugador(){
        for (int i=0;i<=1;i++){
            this.jugador[i].setNumJugador(i);
        }
    }
    
    public void Ganadores(){
        for (int i=0;i<=1;i++){
            for (int j=0;j<=3;j++){
                if(controles.cartonPersona[i][j].getEstatus().equals("Ganador")){
                    System.out.println("Carton ganador: " + jugador[j].getNombre());
                    controles.cartonPersona[i][j].ImprimirCarton2();
                }
            }
        }
    }
}
