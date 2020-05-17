package bingo;

public class Jugador {
    private String nombre;
    private Presupuesto presupuesto;
    private int NumJugador;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPresupuesto(int presupuesto){
        this.presupuesto = new Presupuesto(presupuesto);
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
}
