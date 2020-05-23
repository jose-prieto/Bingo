package bingo;

public class Bola {
    private final int Bola;
    private String estado;

    //inicia el objeto bola
    public Bola(int bola) {
        this.Bola = bola;
        this.estado = "Disponible";
    }

    //que este disponible significa que la bola no ha salido
    public void setDisponible() {
        this.estado = "Disponible";
    }
    
    //que este no disponible significa que la bola ya está en juego
    public void setNoDisponible() {
        this.estado = "No disponible";
    }

    public int getBola() {
        return Bola;
    }

    public String getEstado() {
        return estado;
    }
}