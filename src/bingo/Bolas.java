package bingo;

import java.util.Random;

public class Bolas {
    
    private final Bola[] Bolas = new Bola[75];
    private int rango;
    private int aux;
    
    public Bolas (){
        for(int i=0;i<=74;i++){
            Bolas[i] = new Bola(i+1);
        }
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }
    
    public void setRango(int rango) {
        this.rango = rango;
    }

    public int getRango() {
        return rango;
    }
    
    public Bola SacarBola(){
        Random rand = new Random();
        int bola;
        do{
            bola = rand.nextInt(this.rango) + aux;
        }while (this.Bolas[bola].getEstado().equals("No disponible"));
        this.Bolas[bola].setNoDisponible();
        
        return this.Bolas[bola];
    }
    
    public void ReiniciarBolas(){
        for(int i=0;i<=74;i++){
            Bolas[i].setDisponible();
        }
    }
    
    public void ImprimirBolas(){
        for(int i=0;i<=74;i++){
            System.out.println(Bolas[i].getEstado());
        }
    }
}