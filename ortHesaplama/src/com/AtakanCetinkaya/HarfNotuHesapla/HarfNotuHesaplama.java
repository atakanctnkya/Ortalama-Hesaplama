/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AtakanCetinkaya.HarfNotuHesapla;

/**
 *
 * @author ataka
 */
public class HarfNotuHesaplama {

    public static String harfnotu = null; //harfnotu isimli nesne oluşturuyoruz.

    public HarfNotuHesaplama(float ortalama) { //oluşturduğumuz yapıcı metoda 'ortalama' isimli parametre giriyoruz.
        if (ortalama >= 90) { //Ortalama 90'nın üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz AA, 4'lük sistemdeki karşılığı 4.0'dır";//Sout ile ekrana yazdırıyoruz.
        } else if (ortalama >= 85) { //Ortalama 85'in üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz BA, 4'lük sistemdeki karşılığı 3.5'tir";//Sout ile ekrana yazdırıyoruz.
        } else if (ortalama >= 80) { //Ortalama 80'in üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz BB, 4'lük sistemdeki karşılığı 3.0'dir";//Sout ile ekrana yazdırıyoruz.
        } else if (ortalama >= 75) { //Ortalama 75'in üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz CB, 4'lük sistemdeki karşılığı 2.5'tur";//Sout ile ekrana yazdırıyoruz.
        } else if (ortalama >= 70) { //Ortalama 70'in üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz CC, 4'lük sistemdeki karşılığı 2.0'dır";//Sout ile ekrana yazdırıyoruz.
        } else if (ortalama >= 65) { //Ortalama 65'in üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz DC, 4'lük sistemdeki karşılığı 1.5'tur";//Sout ile ekrana yazdırıyoruz.
        } else if (ortalama >= 60) { //Ortalama 60'ın üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz DD, 4'lük sistemdeki karşılığı 1.0'dır.";//Sout ile ekrana yazdırıyoruz.
        } else { //Ortalama 0'ın üzerinde ise bu kod bloğu çalışacaktır.
            harfnotu = "Harf Notunuz FF, 4'lük sistemdeki karşılığı 0.0'dır.";//Sout ile ekrana yazdırıyoruz.

        }
        System.out.println(harfnotu); // ekranan harf notuna atanmış değeri yazdırıyoruz.
    }
    
    public static String Yazdir (){ //yazdır isimli nesne oluşturuyoruz.
        return harfnotu; // harf notuna döndürüyoruz.
    }
}
