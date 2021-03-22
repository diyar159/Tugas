/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mhs;

/**
 *
 * @author User
 */
public class Mahasiswa {
    String membaca;
    int nyontek;
    String modifikasi;


    void printMahasiswa(){
        System.out.println("Cara membaca cepat : \n"
                            + membaca +"\n"
                            + membaca +"\n"
                            + membaca);
        System.out.println("Ada " + nyontek + " Cara nyontek yang baik dan benar");
        System.out.println("Cara memodifikasi contekan agar tidak ketahuan : " + modifikasi);

  }    
}


