/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author jap25
 */
public class Traducción{
    
    public int bola(String binario){
        int bola = Integer.parseInt(binario, 2);
        
        if (bola >= 0 || bola <= 74){
            return bola++;
        }else {
            return -1;
        }
    }
    
    public String Completar(int num){
        String binario;
        binario = Integer.toBinaryString(num);
        
        while (binario.length() != 8){
            binario = '0'+binario;
        }
        
        return binario;
    }
}

    
