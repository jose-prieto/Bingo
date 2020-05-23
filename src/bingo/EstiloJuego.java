package bingo;

//en esta clase se controlan los precios de los cartones por estilo de juego
public class EstiloJuego {
    private int CartonLLeno = 1000;
    private int CartonLinea = 500;

    public EstiloJuego(int CartonLLeno, int CartonLinea) {
        this.CartonLLeno = CartonLLeno;
        this.CartonLinea = CartonLinea;
    }

    public int getCartonLLeno() {
        return CartonLLeno;
    }

    public void setCartonLLeno(int CartonLLeno) {
        this.CartonLLeno = CartonLLeno;
    }

    public int getCartonLinea() {
        return CartonLinea;
    }

    public void setCartonLinea(int CartonLinea) {
        this.CartonLinea = CartonLinea;
    }
    
    
}
