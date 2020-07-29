package bingo;
import javax.swing.JLabel;
//En el controlador haremos control de todo lo necesario que se necesita tanto para el juego como para el usuario
//compra de cartones, saldo del jugador en cuestion, etc
public class Controlador {
    JLabel bola;
    
    JLabel[] Carton1 = new JLabel[24];;
    JLabel[] Carton1X = new JLabel[24];;
    
    JLabel[] Carton2 = new JLabel[24];;
    JLabel[] Carton2X = new JLabel[24];;
    
    JLabel[] CartonConf = new JLabel[24];
    
     public Controles controles = new Controles();
    
    String nombre;
    int numero_jugador;
    
    public Controlador(JLabel bola,JLabel B1,JLabel B2,JLabel B3,JLabel B4,JLabel B5,JLabel I1,JLabel I2,JLabel I3,JLabel I4,JLabel I5,JLabel N1,JLabel N2,JLabel N4,JLabel N5,JLabel G1,JLabel G2,JLabel G3,JLabel G4,JLabel G5,JLabel O1,JLabel O2,JLabel O3,JLabel O4,JLabel O5,JLabel XB1,JLabel XB2,JLabel XB3,JLabel XB4,JLabel XB5,JLabel XI1,JLabel XI2,JLabel XI3,JLabel XI4,JLabel XI5,JLabel XN1,JLabel XN2,JLabel XN4,JLabel XN5,JLabel XG1,JLabel XG2,JLabel XG3,JLabel XG4,JLabel XG5,JLabel XO1,JLabel XO2,JLabel XO3,JLabel XO4,JLabel XO5,JLabel c2B1,JLabel c2B2,JLabel c2B3,JLabel c2B4,JLabel c2B5,JLabel c2I1,JLabel c2I2,JLabel c2I3,JLabel c2I4,JLabel c2I5,JLabel c2N1,JLabel c2N2,JLabel c2N4,JLabel c2N5,JLabel c2G1,JLabel c2G2,JLabel c2G3,JLabel c2G4,JLabel c2G5,JLabel c2O1,JLabel c2O2,JLabel c2O3,JLabel c2O4,JLabel c2O5,JLabel c2XB1,JLabel c2XB2,JLabel c2XB3,JLabel c2XB4,JLabel c2XB5,JLabel c2XI1,JLabel c2XI2,JLabel c2XI3,JLabel c2XI4,JLabel c2XI5,JLabel c2XN1,JLabel c2XN2,JLabel c2XN4,JLabel c2XN5,JLabel c2XG1,JLabel c2XG2,JLabel c2XG3,JLabel c2XG4,JLabel c2XG5,JLabel c2XO1,JLabel c2XO2,JLabel c2XO3,JLabel c2XO4,JLabel c2XO5,JLabel sB1,JLabel sB2,JLabel sB3,JLabel sB4,JLabel sB5,JLabel sI1,JLabel sI2,JLabel sI3,JLabel sI4,JLabel sI5,JLabel sN1,JLabel sN2,JLabel sN4,JLabel sN5,JLabel sG1,JLabel sG2,JLabel sG3,JLabel sG4,JLabel sG5,JLabel sO1,JLabel sO2,JLabel sO3,JLabel sO4,JLabel sO5){
        this.bola=bola;
        this.Carton1[0]=B1;
        this.Carton1[1]=B2;
        this.Carton1[2]=B3;
        this.Carton1[3]=B4;
        this.Carton1[4]=B5;
        this.Carton1[5]=I1;
        this.Carton1[6]=I2;
        this.Carton1[7]=I3;
        this.Carton1[8]=I4;
        this.Carton1[9]=I5;
        this.Carton1[10]=N1;
        this.Carton1[11]=N2;
        this.Carton1[12]=N4;
        this.Carton1[13]=N5;
        this.Carton1[14]=G1;
        this.Carton1[15]=G2;
        this.Carton1[16]=G3;
        this.Carton1[17]=G4;
        this.Carton1[18]=G5;
        this.Carton1[19]=O1;
        this.Carton1[20]=O2;
        this.Carton1[21]=O3;
        this.Carton1[22]=O4;
        this.Carton1[23]=O5;
        
        this.Carton1X[0]=XB1;
        this.Carton1X[1]=XB2;
        this.Carton1X[2]=XB3;
        this.Carton1X[3]=XB4;
        this.Carton1X[4]=XB5;
        this.Carton1X[5]=XI1;
        this.Carton1X[6]=XI2;
        this.Carton1X[7]=XI3;
        this.Carton1X[8]=XI4;
        this.Carton1X[9]=XI5;
        this.Carton1X[10]=XN1;
        this.Carton1X[11]=XN2;
        this.Carton1X[12]=XN4;
        this.Carton1X[13]=XN5;
        this.Carton1X[14]=XG1;
        this.Carton1X[15]=XG2;
        this.Carton1X[16]=XG3;
        this.Carton1X[17]=XG4;
        this.Carton1X[18]=XG5;
        this.Carton1X[19]=XO1;
        this.Carton1X[20]=XO2;
        this.Carton1X[21]=XO3;
        this.Carton1X[22]=XO4;
        this.Carton1X[23]=XO5;
        
        this.Carton2[0]=c2B1;
        this.Carton2[1]=c2B2;
        this.Carton2[2]=c2B3;
        this.Carton2[3]=c2B4;
        this.Carton2[4]=c2B5;
        this.Carton2[5]=c2I1;
        this.Carton2[6]=c2I2;
        this.Carton2[7]=c2I3;
        this.Carton2[8]=c2I4;
        this.Carton2[9]=c2I5;
        this.Carton2[10]=c2N1;
        this.Carton2[11]=c2N2;
        this.Carton2[12]=c2N4;
        this.Carton2[13]=c2N5;
        this.Carton2[14]=c2G1;
        this.Carton2[15]=c2G2;
        this.Carton2[16]=c2G3;
        this.Carton2[17]=c2G4;
        this.Carton2[18]=c2G5;
        this.Carton2[19]=c2O1;
        this.Carton2[20]=c2O2;
        this.Carton2[21]=c2O3;
        this.Carton2[22]=c2O4;
        this.Carton2[23]=c2O5;
        
        this.Carton2X[0]=c2XB1;
        this.Carton2X[1]=c2XB2;
        this.Carton2X[2]=c2XB3;
        this.Carton2X[3]=c2XB4;
        this.Carton2X[4]=c2XB5;
        this.Carton2X[5]=c2XI1;
        this.Carton2X[6]=c2XI2;
        this.Carton2X[7]=c2XI3;
        this.Carton2X[8]=c2XI4;
        this.Carton2X[9]=c2XI5;
        this.Carton2X[10]=c2XN1;
        this.Carton2X[11]=c2XN2;
        this.Carton2X[12]=c2XN4;
        this.Carton2X[13]=c2XN5;
        this.Carton2X[14]=c2XG1;
        this.Carton2X[15]=c2XG2;
        this.Carton2X[16]=c2XG3;
        this.Carton2X[17]=c2XG4;
        this.Carton2X[18]=c2XG5;
        this.Carton2X[19]=c2XO1;
        this.Carton2X[20]=c2XO2;
        this.Carton2X[21]=c2XO3;
        this.Carton2X[22]=c2XO4;
        this.Carton2X[23]=c2XO5;

        this.CartonConf[0]=sB1;
        this.CartonConf[1]=sB2;
        this.CartonConf[2]=sB3;
        this.CartonConf[3]=sB4;
        this.CartonConf[4]=sB5;
        this.CartonConf[5]=sI1;
        this.CartonConf[6]=sI2;
        this.CartonConf[7]=sI3;
        this.CartonConf[8]=sI4;
        this.CartonConf[9]=sI5;
        this.CartonConf[10]=sN1;
        this.CartonConf[11]=sN2;
        this.CartonConf[12]=sN4;
        this.CartonConf[13]=sN5;
        this.CartonConf[14]=sG1;
        this.CartonConf[15]=sG2;
        this.CartonConf[16]=sG3;
        this.CartonConf[17]=sG4;
        this.CartonConf[18]=sG5;
        this.CartonConf[19]=sO1;
        this.CartonConf[20]=sO2;
        this.CartonConf[21]=sO3;
        this.CartonConf[22]=sO4;
        this.CartonConf[23]=sO5;
    }
        
    public void Controlar(char a,char b, String EstiloJuego) {
        controles.cartones.CartonDisponible();
        Carton CT = controles.cartones.getCarton(a);
        Carton CTT = controles.cartones.getCarton(b);
        CT.setNoDisponible();
        CTT.setNoDisponible();
        
        if (controles.Juego(bola, EstiloJuego)){
            System.out.println("Victoria");
        }
        MostrarCartonUser(b,a);
    }
    
    public void Controlar234(char a,char b, String EstiloJuego,JLabel bola) {
        controles.cartones.CartonDisponible();
        Carton CT = controles.cartones.getCarton(a);
        Carton CTT = controles.cartones.getCarton(b);
        CT.setNoDisponible();
        CTT.setNoDisponible();
        
        if (controles.Juego234(bola, EstiloJuego)){
            System.out.println("Victoria");
        }
        MostrarCartonUser(b,a);
    }
    
    public void seleccionCarton(char n){
        int aux = 0;
        
        Carton aa = controles.cartones.getCarton(n);
        for (int j = 0; j <= 4; j++){
            for (int i = 0; i <= 4; i++){
                if (!(i == 2 && j == 2)){
                    this.CartonConf[aux].setText(Integer.toString(aa.ImprimirUI(i, j)));
                    aux++;
                }
            }
        }
    }
    
    public void MostrarCartonUser(char b,char a){ //muestra el carton principal
        int aux = 0;
        
        Carton CT = controles.cartones.getCarton(a);
        
        for (int j = 0; j <= 4; j++){
            for (int i = 0; i <= 4; i++){
                if (!(i == 2 && j == 2)){
                    if (CT.getCarton()[i][j].getEstado().equals("Disponible")){
                        Carton1[aux].setText(Integer.toString(CT.ImprimirUI(i, j)));
                        Carton1X[aux].setVisible(false);
                    }else{
                        Carton1[aux].setText(Integer.toString(CT.ImprimirUI(i, j)));
                        Carton1X[aux].setVisible(true);
                    }
                    aux++;
                }
            }
        }
        
        aux = 0;
        CT = controles.cartones.getCarton(b);
        
        for (int j = 0; j <= 4; j++){
            for (int i = 0; i <= 4; i++){
                if (!(i == 2 && j == 2)){
                    if (CT.getCarton()[i][j].getEstado().equals("Disponible")){
                        Carton2[aux].setText(Integer.toString(CT.ImprimirUI(i, j)));
                        Carton2X[aux].setVisible(false);
                    }else{
                        Carton2[aux].setText(Integer.toString(CT.ImprimirUI(i, j)));
                        Carton2X[aux].setVisible(true);
                    }
                    aux++;
                }
            }
        }
    }
}
