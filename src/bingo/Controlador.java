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
    
    JLabel c2B1,c2B2,c2B3,c2B4,c2B5;
    JLabel c2XB1,c2XB2,c2XB3,c2XB4,c2XB5;
    JLabel c2I1,c2I2,c2I3,c2I4,c2I5;
    JLabel c2XI1,c2XI2,c2XI3,c2XI4,c2XI5;
    JLabel c2N1,c2N2,c2N4,c2N5;
    JLabel c2XN1,c2XN2,c2XN4,c2XN5;
    JLabel c2G1,c2G2,c2G3,c2G4,c2G5;
    JLabel c2XG1,c2XG2,c2XG3,c2XG4,c2XG5;
    JLabel c2O1,c2O2,c2O3,c2O4,c2O5;
    JLabel c2XO1,c2XO2,c2XO3,c2XO4,c2XO5;
    
    JLabel sB1,sB2,sB3,sB4,sB5;
    JLabel sI1,sI2,sI3,sI4,sI5;
    JLabel sN1,sN2,sN4,sN5;
    JLabel sG1,sG2,sG3,sG4,sG5;
    JLabel sO1,sO2,sO3,sO4,sO5;
    
    
    Controles controles = new Controles();
    Jugador[] jugador = new Jugador[4];
    
    public Controlador(JLabel bola,JLabel B1,JLabel B2,JLabel B3,JLabel B4,JLabel B5,JLabel I1,JLabel I2,JLabel I3,JLabel I4,JLabel I5,JLabel N1,JLabel N2,JLabel N4,JLabel N5,JLabel G1,JLabel G2,JLabel G3,JLabel G4,JLabel G5,JLabel O1,JLabel O2,JLabel O3,JLabel O4,JLabel O5,JLabel XB1,JLabel XB2,JLabel XB3,JLabel XB4,JLabel XB5,JLabel XI1,JLabel XI2,JLabel XI3,JLabel XI4,JLabel XI5,JLabel XN1,JLabel XN2,JLabel XN4,JLabel XN5,JLabel XG1,JLabel XG2,JLabel XG3,JLabel XG4,JLabel XG5,JLabel XO1,JLabel XO2,JLabel XO3,JLabel XO4,JLabel XO5,JLabel c2B1,JLabel c2B2,JLabel c2B3,JLabel c2B4,JLabel c2B5,JLabel c2I1,JLabel c2I2,JLabel c2I3,JLabel c2I4,JLabel c2I5,JLabel c2N1,JLabel c2N2,JLabel c2N4,JLabel c2N5,JLabel c2G1,JLabel c2G2,JLabel c2G3,JLabel c2G4,JLabel c2G5,JLabel c2O1,JLabel c2O2,JLabel c2O3,JLabel c2O4,JLabel c2O5,JLabel c2XB1,JLabel c2XB2,JLabel c2XB3,JLabel c2XB4,JLabel c2XB5,JLabel c2XI1,JLabel c2XI2,JLabel c2XI3,JLabel c2XI4,JLabel c2XI5,JLabel c2XN1,JLabel c2XN2,JLabel c2XN4,JLabel c2XN5,JLabel c2XG1,JLabel c2XG2,JLabel c2XG3,JLabel c2XG4,JLabel c2XG5,JLabel c2XO1,JLabel c2XO2,JLabel c2XO3,JLabel c2XO4,JLabel c2XO5,JLabel sB1,JLabel sB2,JLabel sB3,JLabel sB4,JLabel sB5,JLabel sI1,JLabel sI2,JLabel sI3,JLabel sI4,JLabel sI5,JLabel sN1,JLabel sN2,JLabel sN4,JLabel sN5,JLabel sG1,JLabel sG2,JLabel sG3,JLabel sG4,JLabel sG5,JLabel sO1,JLabel sO2,JLabel sO3,JLabel sO4,JLabel sO5){
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
    this.c2B1=c2B1;
    this.c2B2=c2B2;
    this.c2B3=c2B3;
    this.c2B4=c2B4;
    this.c2B5=c2B5;
    this.c2I1=c2I1;
    this.c2I2=c2I2;
    this.c2I3=c2I3;
    this.c2I4=c2I4;
    this.c2I5=c2I5;
    this.c2N1=c2N1;
    this.c2N2=c2N2;
    this.c2N4=c2N4;
    this.c2N5=c2N5;
    this.c2G1=c2G1;
    this.c2G2=c2G2;
    this.c2G3=c2G3;
    this.c2G4=c2G4;
    this.c2G5=c2G5;
    this.c2O1=c2O1;
    this.c2O2=c2O2;
    this.c2O3=c2O3;
    this.c2O4=c2O4;
    this.c2O5=c2O5;
    this.c2XB1=c2XB1;
    this.c2XB2=c2XB2;
    this.c2XB3=c2XB3;
    this.c2XB4=c2XB4;
    this.c2XB5=c2XB5;
    this.c2XI1=c2XI1;
    this.c2XI2=c2XI2;
    this.c2XI3=c2XI3;
    this.c2XI4=c2XI4;
    this.c2XI5=c2XI5;
    this.c2XN1=c2XN1;
    this.c2XN2=c2XN2;
    this.c2XN4=c2XN4;
    this.c2XN5=c2XN5;
    this.c2XG1=c2XG1;
    this.c2XG2=c2XG2;
    this.c2XG3=c2XG3;
    this.c2XG4=c2XG4;
    this.c2XG5=c2XG5;
    this.c2XO1=c2XO1;
    this.c2XO2=c2XO2;
    this.c2XO3=c2XO3;
    this.c2XO4=c2XO4;
    this.c2XO5=c2XO5;
    
    
    this.sB1=sB1;
    this.sB2=sB2;
    this.sB3=sB3;
    this.sB4=sB4;
    this.sB5=sB5;
    this.sI1=sI1;
    this.sI2=sI2;
    this.sI3=sI3;
    this.sI4=sI4;
    this.sI5=sI5;
    this.sN1=sN1;
    this.sN2=sN2;
    this.sN4=sN4;
    this.sN5=sN5;
    this.sG1=sG1;
    this.sG2=sG2;
    this.sG3=sG3;
    this.sG4=sG4;
    this.sG5=sG5;
    this.sO1=sO1;
    this.sO2=sO2;
    this.sO3=sO3;
    this.sO4=sO4;
    this.sO5=sO5;
    
    }
        
    public void Controlar(char a, char b) {
        CrearUser(a,b);
        MostrarCartonUser(b,a);
        controles.Juego(bola); //hay que cambiar esto
        Ganadores();
    }
    
    //se crean usuario de forma manual mientras se implementa la interfaz gráfica
    public void CrearUser(char a, char b){
        jugador[0] = new Jugador("Player 1");
        jugador[0].setPresupuesto(1000);
        controles.cartones.SetCarton(a,b);
    }
    public Cartones DevCarton(){
        return controles.getCartones();
    }
    public void MostrarCartonUser(char a,char b){ //muestra el carton principal
        Carton CT = controles.cartones.getCarton(a);
        System.out.println(a);
        System.out.println(b);
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
        
        Carton CTT = controles.cartones.getCarton(b);
        c2B1.setText(Integer.toString(CTT.ImprimirUI(0, 0)));
        c2B2.setText(Integer.toString(CTT.ImprimirUI(0, 1)));
        c2B3.setText(Integer.toString(CTT.ImprimirUI(0, 2)));
        c2B4.setText(Integer.toString(CTT.ImprimirUI(0, 3)));
        c2B5.setText(Integer.toString(CTT.ImprimirUI(0, 4)));
        c2I1.setText(Integer.toString(CTT.ImprimirUI(1, 0)));
        c2I2.setText(Integer.toString(CTT.ImprimirUI(1, 1)));
        c2I3.setText(Integer.toString(CTT.ImprimirUI(1, 2)));
        c2I4.setText(Integer.toString(CTT.ImprimirUI(1, 3)));
        c2I5.setText(Integer.toString(CTT.ImprimirUI(1, 4)));
        c2N1.setText(Integer.toString(CTT.ImprimirUI(2, 0)));
        c2N2.setText(Integer.toString(CTT.ImprimirUI(2, 1)));
        c2N4.setText(Integer.toString(CTT.ImprimirUI(2, 3)));
        c2N5.setText(Integer.toString(CTT.ImprimirUI(2, 4)));
        c2G1.setText(Integer.toString(CTT.ImprimirUI(3, 0)));
        c2G2.setText(Integer.toString(CTT.ImprimirUI(3, 1)));
        c2G3.setText(Integer.toString(CTT.ImprimirUI(3, 2)));
        c2G4.setText(Integer.toString(CTT.ImprimirUI(3, 3)));
        c2G5.setText(Integer.toString(CTT.ImprimirUI(3, 4)));
        c2O1.setText(Integer.toString(CTT.ImprimirUI(4, 0)));
        c2O2.setText(Integer.toString(CTT.ImprimirUI(4, 1)));
        c2O3.setText(Integer.toString(CTT.ImprimirUI(4, 2)));
        c2O4.setText(Integer.toString(CTT.ImprimirUI(4, 3)));
        c2O5.setText(Integer.toString(CTT.ImprimirUI(4, 4)));
        c2XB1.setVisible(false);
        c2XB2.setVisible(false);
        c2XB3.setVisible(false);
        c2XB4.setVisible(false);
        c2XB5.setVisible(false);
        c2XI1.setVisible(false);
        c2XI2.setVisible(false);
        c2XI3.setVisible(false);
        c2XI4.setVisible(false);
        c2XI5.setVisible(false);
        c2XN1.setVisible(false);
        c2XN2.setVisible(false);
        c2XN4.setVisible(false);
        c2XN5.setVisible(false);
        c2XG1.setVisible(false);
        c2XG2.setVisible(false);
        c2XG3.setVisible(false);
        c2XG4.setVisible(false);
        c2XG5.setVisible(false);
        c2XO1.setVisible(false);
        c2XO2.setVisible(false);
        c2XO3.setVisible(false);
        c2XO4.setVisible(false);
        c2XO5.setVisible(false);
        
        
    }
    public void seleccionCarton(char n){
        
    Carton aa = controles.cartones.getCarton(n);
        sB1.setText(Integer.toString(aa.ImprimirUI(0, 0)));
        sB2.setText(Integer.toString(aa.ImprimirUI(0, 1)));
        sB3.setText(Integer.toString(aa.ImprimirUI(0, 2)));
        sB4.setText(Integer.toString(aa.ImprimirUI(0, 3)));
        sB5.setText(Integer.toString(aa.ImprimirUI(0, 4)));
        sI1.setText(Integer.toString(aa.ImprimirUI(1, 0)));
        sI2.setText(Integer.toString(aa.ImprimirUI(1, 1)));
        sI3.setText(Integer.toString(aa.ImprimirUI(1, 2)));
        sI4.setText(Integer.toString(aa.ImprimirUI(1, 3)));
        sI5.setText(Integer.toString(aa.ImprimirUI(1, 4)));
        sN1.setText(Integer.toString(aa.ImprimirUI(2, 0)));
        sN2.setText(Integer.toString(aa.ImprimirUI(2, 1)));
        sN4.setText(Integer.toString(aa.ImprimirUI(2, 3)));
        sN5.setText(Integer.toString(aa.ImprimirUI(2, 4)));
        sG1.setText(Integer.toString(aa.ImprimirUI(3, 0)));
        sG2.setText(Integer.toString(aa.ImprimirUI(3, 1)));
        sG3.setText(Integer.toString(aa.ImprimirUI(3, 2)));
        sG4.setText(Integer.toString(aa.ImprimirUI(3, 3)));
        sG5.setText(Integer.toString(aa.ImprimirUI(3, 4)));
        sO1.setText(Integer.toString(aa.ImprimirUI(4, 0)));
        sO2.setText(Integer.toString(aa.ImprimirUI(4, 1)));
        sO3.setText(Integer.toString(aa.ImprimirUI(4, 2)));
        sO4.setText(Integer.toString(aa.ImprimirUI(4, 3)));
        sO5.setText(Integer.toString(aa.ImprimirUI(4, 4)));
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
