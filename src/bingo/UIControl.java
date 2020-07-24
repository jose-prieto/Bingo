/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;
import javax.swing.JLabel;

public class UIControl {
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

public UIControl(JLabel bola,JLabel B1,JLabel B2,JLabel B3,JLabel B4,JLabel B5,JLabel I1,JLabel I2,JLabel I3,JLabel I4,JLabel I5,JLabel N1,JLabel N2,JLabel N4,JLabel N5,JLabel G1,JLabel G2,JLabel G3,JLabel G4,JLabel G5,JLabel O1,JLabel O2,JLabel O3,JLabel O4,JLabel O5){ 
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
}
public void setCarton(){




}
public void setX(int i,int j){



}


public void setBola(String Bola){
bola.setText(Bola);
}

}
