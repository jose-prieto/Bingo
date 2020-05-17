package bingo;

public class Bola {
    private final int Bola;
    private String estado;

    public Bola(int bola) {
        this.Bola = bola;
        this.estado = "Disponible";
    }

    public void setDisponible() {
        this.estado = "Disponible";
    }
    
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