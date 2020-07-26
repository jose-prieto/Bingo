package bingo;

import javax.swing.JLabel;

public class Carton {
    private final Bola[][] carton = new Bola[5][5];
    private final char identificacion;
    private String Disponibilidad;
    private String Estatus;
    
    //inicio del objeto carton con las bolas previamente creadas
    public Carton(char identificacion, Bolas numerosCarton){
        this.identificacion = identificacion;
        this.Disponibilidad = "Disponible";
        this.Estatus = "Perdedor";
        numerosCarton.setRango(15);
        numerosCarton.setAux(0);
        
        for(int j=0;j<=4;j++){
            for (int i=0;i<=4;i++){
                carton[i][j] = numerosCarton.SacarBola();
            }
            numerosCarton.setAux(numerosCarton.getAux() + 15);
        }
        numerosCarton.ReiniciarBolas();
    }

   

    public Bola[][] getCarton() {
        return carton;
    }

    public char getIdentificacion() {
        return identificacion;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setGanador() {
        this.Estatus = "Ganador";
    }
    
    public void setPerdedor() {
        this.Estatus = "Perdedor";
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponible() {
        this.Disponibilidad = "Disponible";
    }
    
    public void setNoDisponible() {
        this.Disponibilidad = "No disponible";
    }
    
    //imprime un carton normalmente
    public void ImprimirCarton(){
        System.out.println("Carton: " + identificacion);
        System.out.println("B    I    N    G    O");
        for(int j=0;j<=4;j++){
            for (int i=0;i<=4;i++){
                if (i == 2 && j == 2){
                    System.out.print("XX   ");
                }else if(carton[j][i].getBola() < 10){
                    System.out.print("0" + carton[j][i].getBola() + "   ");
                }else if(carton[j][i].getBola() >= 10){
                    System.out.print(carton[j][i].getBola() + "   ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    public int ImprimirUI(int i,int j){
        return carton[i][j].getBola();
    
    }
}
