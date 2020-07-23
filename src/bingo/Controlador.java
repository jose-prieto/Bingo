package bingo;
import javax.swing.JLabel;
//En el controlador haremos control de todo lo necesario que se necesita tanto para el juego como para el usuario
//compra de cartones, saldo del jugador en cuestion, etc
public class Controlador {
    JLabel bola;
    JLabel B1,B2,B3,B4,B5;
    JLabel XB1,XB2,XB3,XB4,XB5;
    JLabel I1,I2,I3,I4,I5;
    JLabel XI1,XI2,XI3,XI4,XI5;
    JLabel N1,N2,N4,N5;
    JLabel XN1,XN2,XN4,XN5;
    JLabel G1,G2,G3,G4,G5;
    JLabel XG1,XG2,XG3,XG4,XG5;
    JLabel O1,O2,O3,O4,O5;
    JLabel XO1,XO2,XO3,XO4,XO5;
    Controles controles = new Controles();
    Jugador[] jugador = new Jugador[4];
    
    public Controlador(JLabel bola,JLabel B1,JLabel B2,JLabel B3,JLabel B4,JLabel B5,JLabel I1,JLabel I2,JLabel I3,JLabel I4,JLabel I5,JLabel N1,JLabel N2,JLabel N4,JLabel N5,JLabel G1,JLabel G2,JLabel G3,JLabel G4,JLabel G5,JLabel O1,JLabel O2,JLabel O3,JLabel O4,JLabel O5,JLabel XB1,JLabel XB2,JLabel XB3,JLabel XB4,JLabel XB5,JLabel XI1,JLabel XI2,JLabel XI3,JLabel XI4,JLabel XI5,JLabel XN1,JLabel XN2,JLabel XN4,JLabel XN5,JLabel XG1,JLabel XG2,JLabel XG3,JLabel XG4,JLabel XG5,JLabel XO1,JLabel XO2,JLabel XO3,JLabel XO4,JLabel XO5){
    this.bola=bola;
    this.B1=B1;
    this.B2=B2;
    this.B3=B3;
    this.B4=B4;
    this.B5=B5;
    this.I1=I1;
    this.I2=I2;
    this.I3=I3;
    this.I4=I4;
    this.I5=I5;
    this.N1=N1;
    this.N2=N2;
    this.N4=N4;
    this.N5=N5;
    this.G1=G1;
    this.G2=G2;
    this.G3=G3;
    this.G4=G4;
    this.G5=G5;
    this.O1=O1;
    this.O2=O2;
    this.O3=O3;
    this.O4=O4;
    this.O5=O5;
    this.XB1=XB1;
    this.XB2=XB2;
    this.XB3=XB3;
    this.XB4=XB4;
    this.XB5=XB5;
    this.XI1=XI1;
    this.XI2=XI2;
    this.XI3=XI3;
    this.XI4=XI4;
    this.XI5=XI5;
    this.XN1=XN1;
    this.XN2=XN2;
    this.XN4=XN4;
    this.XN5=XN5;
    this.XG1=XG1;
    this.XG2=XG2;
    this.XG3=XG3;
    this.XG4=XG4;
    this.XG5=XG5;
    this.XO1=XO1;
    this.XO2=XO2;
    this.XO3=XO3;
    this.XO4=XO4;
    this.XO5=XO5;
    
    }
        
    public void Controlar() {
        CrearUser();
        MostrarCartonUser();
        controles.Juego(bola); //hay que cambiar esto
        Ganadores();
    }
    
    //se crean usuario de forma manual mientras se implementa la interfaz gráfica
    public void CrearUser(){
        jugador[0] = new Jugador("Jugador 1");
        jugador[0].setPresupuesto(1000);
        jugador[1] = new Jugador("Jugador 2");
        jugador[1].setPresupuesto(1000);
        jugador[2] = new Jugador("Jugador 3");
        jugador[2].setPresupuesto(1000);
        jugador[3] = new Jugador("Jugador 4");
        jugador[3].setPresupuesto(1000);
        controles.cartones.AsignaCarton(3);
    }
    
    public void MostrarCartonUser(){ //muestra el carton principal
        String Z="Z";
        Carton CT = controles.cartones.getCarton(Z.charAt(0));
        B1.setText(Integer.toString(CT.ImprimirUI(0, 0)));
        B2.setText(Integer.toString(CT.ImprimirUI(0, 1)));
        B3.setText(Integer.toString(CT.ImprimirUI(0, 2)));
        B4.setText(Integer.toString(CT.ImprimirUI(0, 3)));
        B5.setText(Integer.toString(CT.ImprimirUI(0, 4)));
        I1.setText(Integer.toString(CT.ImprimirUI(1, 0)));
        I2.setText(Integer.toString(CT.ImprimirUI(1, 1)));
        I3.setText(Integer.toString(CT.ImprimirUI(1, 2)));
        I4.setText(Integer.toString(CT.ImprimirUI(1, 3)));
        I5.setText(Integer.toString(CT.ImprimirUI(1, 4)));
        N1.setText(Integer.toString(CT.ImprimirUI(2, 0)));
        N2.setText(Integer.toString(CT.ImprimirUI(2, 1)));
        N4.setText(Integer.toString(CT.ImprimirUI(2, 3)));
        N5.setText(Integer.toString(CT.ImprimirUI(2, 4)));
        G1.setText(Integer.toString(CT.ImprimirUI(3, 0)));
        G2.setText(Integer.toString(CT.ImprimirUI(3, 1)));
        G3.setText(Integer.toString(CT.ImprimirUI(3, 2)));
        G4.setText(Integer.toString(CT.ImprimirUI(3, 3)));
        G5.setText(Integer.toString(CT.ImprimirUI(3, 4)));
        O1.setText(Integer.toString(CT.ImprimirUI(4, 0)));
        O2.setText(Integer.toString(CT.ImprimirUI(4, 1)));
        O3.setText(Integer.toString(CT.ImprimirUI(4, 2)));
        O4.setText(Integer.toString(CT.ImprimirUI(4, 3)));
        O5.setText(Integer.toString(CT.ImprimirUI(4, 4)));
        XB1.setVisible(false);
        XB2.setVisible(false);
        XB3.setVisible(false);
        XB4.setVisible(false);
        XB5.setVisible(false);
        XI1.setVisible(false);
        XI2.setVisible(false);
        XI3.setVisible(false);
        XI4.setVisible(false);
        XI5.setVisible(false);
        XN1.setVisible(false);
        XN2.setVisible(false);
        XN4.setVisible(false);
        XN5.setVisible(false);
        XG1.setVisible(false);
        XG2.setVisible(false);
        XG3.setVisible(false);
        XG4.setVisible(false);
        XG5.setVisible(false);
        XO1.setVisible(false);
        XO2.setVisible(false);
        XO3.setVisible(false);
        XO4.setVisible(false);
        XO5.setVisible(false);
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
    public void Empezar(){
    
    
    
    
    }

}
