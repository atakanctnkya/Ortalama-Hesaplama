/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.AtakanCetinkaya.OrtalamaHesapla;

/**
 *
 * @author ataka
 */
public class VOPF extends VFD{ //'extends' ile VFD sınıfından türetiyoruz.
    
    public float Hesapla(int a, int b, int c, int d) // Arasınav, Final, Ödev ve Proje olmak üzere dört parametre giriyoruz.
                                                    // Integer girme sebebimiz ise bir üst sınıfta olduğu gibi diğer metoddan buraya gelecek değerlerin integer olmak zorunda olması.
                                                    //Metod overriding edildi..
    {
        return (float) ((a*0.3)+(b*0.2)+(c*0.2)+(d*0.3)); //'float' ile tür dönüşümü yaparak hesaplama yapıyoruz.
                                                         //vizenin %30'u, finalin %30'u, ödevin %20'si ve projenin %20'sini topluyoruz.
    }
    
}
