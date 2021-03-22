/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankDiyarganteng;

/**
 *
 * @author User
 */
public class Bank {
     int saldo,simpanUang, ambilUang;
    public Bank(int saldo,int simpanUang,int ambilUang){
        this.saldo = 200000;
        this.simpanUang = 500000;
        this.ambilUang = 250000;
    }
    public void saldo(){
        System.out.println("Selamat Datang di Bank Diyarganteng\n");
        System.out.println("Saldo saat ini = " + saldo);      
        System.out.println("-----------------------------------");
    }
    public void simpanUang(int simpanUang){
        saldo = saldo+simpanUang;
        System.out.println("Simpan Uang    = " + simpanUang);
        System.out.println("Saldo saat ini = " + saldo);      
        System.out.println("-----------------------------------");
    }
    public void ambilUang(int ambilUang){
        saldo = saldo-ambilUang;
        System.out.println("Ambil uang     = " + ambilUang);
        System.out.println("Saldo saat ini = " + saldo);  
        
    }    
    int getSaldo(){
        return saldo;
    }
}
