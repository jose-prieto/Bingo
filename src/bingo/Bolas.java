package bingo;

import java.util.Random;
//se encarga de controlar las bolas del juego 75 en total
public class Bolas {
    
    private final Bola[] Bolas = new Bola[75];
    private int rango; //rango del random del metodo sacar bola
    private int aux; //modificador del rando sacar bola
    
    //activador de cada objeto del tipo bola
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
    
    //escoge de manera random el objeto bola a jugar
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