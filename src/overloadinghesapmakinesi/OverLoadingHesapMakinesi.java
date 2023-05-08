/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadinghesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author ERTAM-PC
 */
public class OverLoadingHesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesap Makinesi Programı {Hoşgeldiniz...}\n**************************************");
         String islemler = "1.İşlem : Toplama\n"
                     + "2.işlem : Çıkarma\n"
                     + "3.işlem : Çarpma\n"
                     + "4.işlem : Bölme\n"
                     + "Çıkış İçin 5'e Basınız";
     
           System.out.println(islemler);
           
           while (true) 
        {            
           System.out.println("***************************************\n Hangi Numaralı İşlemi Yapacaksınız ?");
           int giris = scanner.nextInt();
           if (giris==1) 
           {
               System.out.println("2 Sayı Toplayacaksanız 1,3 Sayı toplayacaksanız 2'ye basın.");
               int islsayisi=scanner.nextInt();
               if (islsayisi==1) 
               {
                 System.out.println("Toplanacak Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 ekranaYazdır(toplama(a,b));
               }
               else if (islsayisi==2) 
               {
                 System.out.println("Toplanacak Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 c=scanner.nextInt();
                 ekranaYazdır(toplama(a,b,c));
               }
               else
               {
                   System.out.println("Uygun Metod Bulunamıyor");
               }
           }
           else if (giris==2) 
           {
            System.out.println("2 Sayı Çıkaracaksanız 1,3 Sayı çıkaracaksanız 2'ye basın.");
               int islsayisi=scanner.nextInt();
               if (islsayisi==1) 
               {
                   System.out.println("Çıkarılacak Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 ekranaYazdır(cıkarma(a,b));
               }
               else if (islsayisi==2) 
               {
                   System.out.println("Çıkarılacak Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 c=scanner.nextInt();
                 ekranaYazdır(cıkarma(a,b,c));
               }
               else
               {
                   System.out.println("Uygun Metod Bulunamıyor");
               }
           }
           else if (giris==3) 
           {
               System.out.println("2 Sayı Çarpacaksanız 1,3 Sayı çarpacaksanız 2'ye basın.");
               int islsayisi=scanner.nextInt();
               if (islsayisi==1) 
               {
                   System.out.println("Çarpılacak Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 ekranaYazdır(carpma(a,b));
               }
               else if (islsayisi==2) 
               {
                   System.out.println("Çarpılacak Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 c=scanner.nextInt();
                 ekranaYazdır(carpma(a,b,c));
               }
               else
               {
                   System.out.println("Uygun Metod Bulunamıyor");
               }
           }
           else if (giris==4) 
           {
               System.out.println("2 Sayı Bölecekseniz 1,3 Sayı bölecekseniz 2'ye basın.");
               int islsayisi=scanner.nextInt();
               if (islsayisi==1) 
               {
                   System.out.println("Bölünecek Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 ekranaYazdır(bolme(a,b));
               }
               else if (islsayisi==2) 
               {
                   System.out.println("Bölünecek Sayıları Giriniz");
                 a=scanner.nextInt();
                 b=scanner.nextInt();
                 c=scanner.nextInt();
                 ekranaYazdır(bolme(a,b,c));
               }
               else
               {
                   System.out.println("Uygun Metod Bulunamıyor");
               }
           }
           else {
               System.out.println("Makinemizi kullandıgınız için teşekkür eder yine bekleriz :)");
               break;
           }
        }
           
    }
    public static int toplama (int a,int b, int c)
    {
       int sonuc = a+b+c;
       return sonuc;
    }
    public static int cıkarma (int a,int b, int c)
    {
        int sonuc = a-b-c;
       return sonuc;
    }
    public static int carpma (int a,int b, int c)
    {
        int sonuc = a*b*c;
       return sonuc;
    }
    public static int bolme (int a,int b, int c)
    {
        int sonuc = a/b/c;
       return sonuc;
    }
    public static int toplama (int a,int b)
    {
        int sonuc = a+b;
       return sonuc;
    }
    public static int carpma (int a,int b)
    {
        int sonuc = a*b;
       return sonuc;
    }
    public static int cıkarma (int a,int b)
    {
        int sonuc = a-b;
       return sonuc;
    }
    public static int bolme (int a,int b)
    {
        int sonuc = a/b;
       return sonuc;
    }
    public static void ekranaYazdır(int İşlem)
            {
                System.out.println("İşlemin Sonucu: "+İşlem);
            }
    
}
