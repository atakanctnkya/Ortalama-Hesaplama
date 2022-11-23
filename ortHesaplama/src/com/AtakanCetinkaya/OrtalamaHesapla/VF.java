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
public class VF {
    
    public float Hesapla(int a,int b)/*Ortalama değeri ondalıklı bir sayı olabileceğindan 'float' kullanıyoruz.
                                       Daha sonra hesapla metodu ile de iki parametre giriyoruz*/
    {
        return (float) ((a*0.4) + (b*0.6));//Bu kısımda 'return' ile hesaplamayı yapıp geri döndürüyoruz.
                             // 'a*0.4' vizenin %40'ı, b*0.6 ise finalin %60'ı anlamına gelmektedir.
                             //Tur dönüşümü yapacağız çünkü girdiğimiz değerler integer ve bunu ondalıklı (float) sayıya dönüştüreceğiz.
    }
    
}
