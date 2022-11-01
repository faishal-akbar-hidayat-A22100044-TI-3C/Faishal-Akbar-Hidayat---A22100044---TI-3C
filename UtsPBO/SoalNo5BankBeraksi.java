/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtsPBO;

/**
 *
 * @author USER
 */
public class SoalNo5BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoalNo5 bank = new SoalNo5(100_1000);
        bank.simpanUang(500_000);
        bank.ambilUang(800_000);
    }
    
}
