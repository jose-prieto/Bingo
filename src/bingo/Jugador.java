package bingo;

public class Jugador {
    private String nombre;
    private int presupuesto;
    private int NumJugador;
    
    //Actova la clase jugador asignandole nombre de una vez
    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    //asigna presupuesto a jugador, luego esto debe sumarse al constructor
    public void setPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumJugador() {
        return NumJugador;
    }

    public void setNumJugador(int NumJugador) {
        this.NumJugador = NumJugador;
    }
    
    public String comprar(int cantidad, int precio){
        
        if (this.presupuesto - (precio * cantidad) >= 0){
            this.presupuesto -= precio * cantidad;
            return "Acaba de comprar " + cantidad + " cartones.";
        }else{
            return "Dinero insuficiente.";
        }
    }
}
