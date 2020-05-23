package bingo;
//En el controlador haremos control de todo lo necesario que se necesita tanto para el juego como para el usuario
//compra de cartones, saldo del jugador en cuestion, etc
public class Controlador {
    Controles controles = new Controles();
    Jugador[] jugador = new Jugador[4];

    public void Controlar() {
        CrearUser();
        controles.Juego();
        Ganadores();
    }
    
    //se crean usuario de forma manual mientras se implementa la interfaz gráfica
    public void CrearUser(){
        jugador[0] = new Jugador("Jose");
        jugador[0].setPresupuesto(1000);
        jugador[1] = new Jugador("pedro");
        jugador[1].setPresupuesto(1000);
        jugador[2] = new Jugador("jaime");
        jugador[2].setPresupuesto(1000);
        jugador[3] = new Jugador("paola");
        jugador[3].setPresupuesto(1000);
        controles.cartones.AsignaCarton(3);
    }
    
    //para evitar conflictos de espacios vacios en el array jugador se ordenan los jugadores desde la posicion 0
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
    
    //se le asigna un numero al jugador segun su sposicion en el array jugador
    public void numJugador(){
        for (int i=0;i<=1;i++){
            this.jugador[i].setNumJugador(i);
        }
    }
    
    //con esto se sabra cuales son los cartones ganadores y a quien pertenece
    public void Ganadores(){
        for (int i=0;i<=1;i++){
            for (int j=0;j<=3;j++){
                if(controles.cartones.cartonPersona[i][j].getEstatus().equals("Ganador")){
                    System.out.println("Carton ganador: " + jugador[j].getNombre());
                    controles.cartones.cartonPersona[i][j].ImprimirCarton2();
                }
            }
        }
    }
}
