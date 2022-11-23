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
public class VFD extends VF{ //'extends' ile VF sınıfından türetiyoruz.
    
    public float Hesapla(int a,int b,int c) // Arasınav, Final ve Devamsızlık olmak üzere üç parametre giriyoruz. 
                                              // Integer girme sebebimiz ise diğer metoddan buraya gelecek değerlerin integer olmak zorunda olması.
                                             /*Metod overriding edildi. Çünkü VF class'ında 'Hesapla' diye 2 parametreli aynı metod bulunmakta. 
                                               Ve biz VFD sınıfını VF sınıfından türeterek kendimize göre uyarladık.*/
    {
        float ortalama;
        ortalama = (float) ((a*0.4) + (b*0.6) + (14-c)); // ortalamayı float değerinde tanımladık ve formulünü yazdık.
        if(ortalama>100){ //Eğer ortalama 100 den büyükse 
            ortalama = 100; //ortalamayı 100 e eşitliyoruz
        }
        return ortalama ;//'float' ile tür dönüşümü yaparak hesaplama yapıyoruz.
                                             // 'a*0.4' vizenin %40'ı, b*0.6 ise finalin %60'ı anlamına gelmektedir. Daha sonra 14'ten davamsızlığı çıkarıyoruz.
    }
    
}
