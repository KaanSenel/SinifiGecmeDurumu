import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int not = 0;
        int ders = 0;
        double ortalama;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        int matematik=scanner.nextInt();
        if(notDogrula(matematik)){
            not+=matematik;
            ders++;
        }


        System.out.print("Fizik notunuz : ");
        int fizik=scanner.nextInt();
        if(notDogrula(fizik)){
            not+=fizik;
            ders++;
        }

        System.out.print("Kimya notunuz : ");
        int kimya=scanner.nextInt();
        if(notDogrula(kimya)){
            not+=kimya;
            ders++;
        }

        System.out.print("Türkçe notunuz : ");
        int turkce=scanner.nextInt();
        if(notDogrula(turkce)){
            not+=turkce;
            ders++;
        }

        System.out.print("Müzik notunuz : ");
        int muzik=scanner.nextInt();
        if(notDogrula(muzik)){
            not+=muzik;
            ders++;
        }

        ortalama=not/ders;
        if(ortalama>=55)
            System.out.println("Dersleri geçtiniz");
        else
            System.out.println("Derslerden kaldınız");
    }

    public static boolean notDogrula(int note){
        return note>=0 && note<=100 ? true : false;
    }
}
