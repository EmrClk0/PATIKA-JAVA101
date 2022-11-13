import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int matematik, fizik, kimya, turkce, tarih, muzik;


        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        matematik = scan.nextInt();

        System.out.print("Fizik notu: ");
        fizik = scan.nextInt();

        System.out.print("Kimya notu: ");
        kimya = scan.nextInt();

        System.out.print("Türkçe notu: ");
        turkce = scan.nextInt();

        System.out.print("Tarih notu: ");
        tarih = scan.nextInt();

        System.out.print("Müzik notu: ");
        muzik = scan.nextInt();


        int toplam = matematik+ fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;
        System.out.println("Not ortalama: " + ortalama);

        String str = ortalama > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);
    }
}
