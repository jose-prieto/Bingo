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
    
    public int BinarioDecimal(String binario){
        int codigo = Integer.parseInt(binario, 2);
        
        if (codigo >= 0 || codigo <= 74){
            return codigo++;
        }else {
            return codigo;
        }
    }
    
    public String DecimalBinario(int num){
        String binario;
        binario = Integer.toBinaryString(num);
        
        while (binario.length() != 8){
            binario = '0'+binario;
        }
        
        return binario;
    }
}

    
