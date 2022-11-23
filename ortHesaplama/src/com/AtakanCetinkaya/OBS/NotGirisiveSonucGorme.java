/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AtakanCetinkaya.OBS;

import com.AtakanCetinkaya.HarfNotuHesapla.HarfNotuHesaplama;
import com.AtakanCetinkaya.OrtalamaHesapla.VF;
import com.AtakanCetinkaya.OrtalamaHesapla.VFD;
import com.AtakanCetinkaya.OrtalamaHesapla.VOPF;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ataka
 */
public class NotGirisiveSonucGorme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        int vize, yilsonu, proje, odev, devamsizlik; // 5 adet değişken tanımlıyoruz.

        Scanner girdi = new Scanner(System.in); //Scanner kısmında girdi adında bir nesne oluşturduk. Bu nesne sayesinde metodlara erişebileceğiz.

        try { /*Klavyeden arasınav, yilsonu, proje, odev ya da devamsızlık değerleri girildiğinde veri türüyle uyuşmamazlık yaşanırsa bize hatayı
             versin diye 'try Catch' yapısından yararlanıyoruz.*/

            do {
                System.out.print("Lütfen Arasınav Notunuzu Giriniz..:"); //Kullanıcıyı yönlendirerek arasınav notu bilgilerini istediyoruz.
                vize = girdi.nextInt(); // Girilen notu vize değişkenine atıyoruz.
            } while (vize < 0 || vize > 100);// vize 0 dan küçük ve 100 den büyük ise do nun içine gir.
            do
            {
                System.out.print("Lütfen Ödev Notunuzu Giriniz..:"); //Kullanıcıyı yönlendirerek ödev notu bilgilerini istiyoruz.
                odev = girdi.nextInt(); // Girilen notu odev değişkenine atıyoruz.
            }
            while(odev < 0 || odev > 100);// vize 0 dan küçük ve 100 den büyük ise do nun içine gir.
            do
            {
              System.out.print("Lütfen Proje Notunuzu Giriniz..:"); //Kullanıcıyı yönlendirerek proje notu bilgilerini istiyoruz.
              proje = girdi.nextInt(); // Girilen notu proje değişkenine atıyoruz.   
            }
            while(proje < 0 || proje > 100);// vize 0 dan küçük ve 100 den büyük ise do nun içine gir.
             do
            {
              System.out.print("Lütfen Final Notunuzu Giriniz..:"); //Kullanıcıyı yönlendirerek final notu bilgilerini istiyoruz.
              yilsonu = girdi.nextInt();// Girilen notu yilsonu değişkenine atıyoruz.   
            }
            while(yilsonu< 0 || yilsonu > 100);// vize 0 dan küçük ve 100 den büyük ise do nun içine gir.
           
              System.out.print("Lütfen Devamsızlık Yaptığınız Gün Sayısını Giriniz..:"); //Kullanıcıyı yönlendirerek devamsızlık bilgilerini istiyoruz.
              devamsizlik = girdi.nextInt(); // Girilen gün sayısını devamsizlik değişkenine atıyoruz.
          
            

            System.out.println(".:::LÜTFEN SEÇİMİNİZİ YAPINIZ:::.");  // Yapılacak işlem seçeneğini kullanıcı ekranına getiriyoruz.
            System.out.println("1- Vize Notunun %40'ı, Final Notunun %60'ı Hesaplanan Ders Notu Ortalaması");
            System.out.println("2- Vize Notunun %30'u, Proje Notunun %20'si, Ödevin %20'si, Final Notunun %30'u \n"
                    + "Hesaplanan Ders Notu Ortalaması");
            System.out.println("3- Vize Notunun %40'ı, Final Notunun %60'ı ve 14 Puandan Çıkartılan Devamsızlık Gün \n"
                    + "Sayısına Göre Ders Notu");
            System.out.println("Notunuzu Hesaplama Seçiminiz..:"); //Kullanıcıya 3 seçimden birini seçtiriyoruz.
            int secim = girdi.nextInt(); //klavyeden girilen değeri secim değişkenine atıyoruz.

            VF vf = new VF(); //VF sınıfından "vf" isimli nesne oluşturuyoruz.
            VFD vfd = new VFD(); //VFD sınıfından "vfd" isimli nesne oluşturuyoruz.
            VOPF vopf = new VOPF(); //VFD sınıfından "vopf" isimli nesne oluşturuyoruz.
            float ortalama = 0; //ortalama adında bir değişten tanımlayıp başlangıç değerini sıfır olarak belirliyoruz.

            
            switch (secim) { //switch-case yapısıyla klavyeden girilen seçim numarası itibariyle aşağıdaki hesaplamalar yapılacak.
                case 1: //klavyeden "1" tuşuna basıldığında
                    ortalama = vf.Hesapla(vize, yilsonu); //vf sınıfındaki hesapla metoduna vize ve yılsonu değerlerini gönderdik. Hesaplaması yapılacak ve o değer ortalama değişkenine atanacak.
                      //sonucu ortalama ile birlikte ekrana yazdırıyoruz.
                    break;
                case 2: //klavyeden "2" tuşuna basıldığında
                    ortalama = vopf.Hesapla(vize, odev, proje, yilsonu); //vopf sınıfındaki hesapla metoduna vize,ödev,proje,yılsonu değerlerini gönderdik. Hesaplaması yapılacak ve o değer ortalama değişkenine atanacak.
                     //sonucu ortalama ile birlikte ekrana yazdırıyoruz.
                    break;
                case 3: //klavyeden "3" tuşuna basıldığında
                    ortalama = vfd.Hesapla(vize, yilsonu, devamsizlik); //vdf sınıfındaki hesapla metoduna vize,yılsonu,devamsızlık değerlerini gönderdik. Hesaplaması yapılacak ve o değer ortalama değişkenine atanacak.
                      //sonucu ortalama ile birlikte ekrana yazdırıyoruz.
                    break;
                default: //klavyeden 1,2,3 dışında bir tuşa basıldıdğında
                    System.out.println("1,2,3 dışında farklı bir karaktere bastınız..!"); //uyarıyı ekrana yazdırıyoruz.
            }
            System.out.println("Seçiminize Göre Not Ortalamanız..:"+ ortalama); //Ekrana ortalamayı yazdırıyoruz.

            HarfNotuHesaplama hnh = new HarfNotuHesaplama(ortalama); //HarfNotuHesaplama sınıfından "hnh" isimli nesne oluşturup ortalama değerini gönderiyoruz.
            String harfnotu = null; //harfnotu değişkenini null a eşitliyoruz
            harfnotu = HarfNotuHesaplama.Yazdir();

            File dosya = new File("sonuçlar.txt"); // File sınıfından dosya isimli nesne oluşturuyoruz.
            if (!dosya.exists()) { // dosya olup olmadığını kontrol ediyoruz.
                dosya.createNewFile(); //yeni dosya oluşturulsun.
            }
            FileWriter fw = new FileWriter(dosya, true); // yazdırmak için FileWriter sınıfı ekledik
            BufferedWriter bw = new BufferedWriter(fw); // txt dosyasına yazılması için BufferedWriter sınıfı eklenir.
            bw.write(harfnotu); //harf notunu nesnesini yazdıran komut
            bw.newLine(); //alt satıra geçiren komut
            bw.write(String.valueOf(ortalama)); //ortalama nesnesini yazdıran komut
            bw.newLine();//alt satıra geçiren komut
            bw.close(); //bw nesnesini kapatmaya yarayan komut
            fw.close(); //fw nesnesini kapatmaya yarayan komut
            

        } catch (InputMismatchException hata) { //Input kullanma sebebimiz, girişte veri türüyle uyuşmayan bir durum girildiğinde hatayı yakalamaya yarıyor.
            System.out.println("Lütfen sadece sayı giriniz..:" + hata); //ekrana sayı girmemiz için bizi uyarıyor.
        }

    }

}
