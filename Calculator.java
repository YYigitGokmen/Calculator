
import java.sql.SQLOutput;
import java.util.Scanner;


public class Calculator {

 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
int n1, n2,select;

     System.out.print("İlk Sayıyı Giriniz: ");
    n1=input.nextInt();

     System.out.print("İkinci Sayıyı Giriniz: ");
    n2= input.nextInt();

     System.out.println("1-Toplama\n2- Çıkartma\n3-Çarpma\n4-Bölme ");
     System.out.print("Seciminiz nedir: ");
    select= input.nextInt();

    switch (select){
        case 1:
            System.out.println("Toplama Sonucu: "+ (n1+n2));

            break;
        case 2:
            System.out.println("Çıkarma Sonucu: "+ (n1-n2));
            break;
        case 3:
             System.out.println("Çıkarma Sonucu: "+ (n1*n2));
            break;
        case 4:
            System.out.println("Bölme Sonucu: "+ (n1/n2));
        break;
        default:
             System.out.println("Hatalı İşlem Yaptınız");

    }

 }

}
