/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtsPBO;

/**
 *
 * @author FAISHAL AKBAR HIDAYAT
 */
public class SoalNo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     for(int counter = 1; counter <= 100; counter++){
            if(counter % 2 == 1){
                continue;
            }
            
            System.out.println("Perulangan Genap" + counter);
        }
    }
    
}

