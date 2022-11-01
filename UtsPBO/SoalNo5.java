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
public class SoalNo5 {
    int saldo;
    SoalNo5 ( int saldo){
        this.saldo = saldo;
        
    }
void getSaldo(){
    System.out.println("Selamat Datang di Bank ABC");
    System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
}
int simpanUang (int saldo){
    this.saldo += saldo;
    System.out.println("Simpan uang : Rp. " + saldo);
    System.out.println("Saldo saat ini : Rp." + this.saldo +"\n");
    return this.saldo;
}
int ambilUang(int saldo){
    System.out.println("ambil uang : Rp. " + saldo);
    if(this.saldo >= saldo ){
        this.saldo -= saldo;
        System.out.println("Saldo saat ini : Rp. "+ this.saldo);
    }else {
        System.out.println("Saldo Anda Tidak Mencukupi");
    }
    return this.saldo;
}
}
