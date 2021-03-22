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
public class Bankberaksi {
     public static void main(String[] args) {
        Bank banku = new Bank(200000, 500000,250000);
        banku.saldo();
        banku.simpanUang(500000);
        banku.ambilUang(250000);    
    }
}
