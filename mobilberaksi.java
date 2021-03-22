/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbasedapplication;

/**
 *
 * @author User
 */
public class mobilberaksi {
    public static void main(String[] args) {
        mobil mobilDiyar = new mobil();
        
        mobilDiyar.warna = "Pink";
        mobilDiyar.tahunProduksi = 2021;
        
        System.out.println("Warna : " + mobilDiyar.warna);
        System.out.println("Tahun Produksi : " + mobilDiyar.tahunProduksi );
}
    }