import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double mat,fizik,türkce,kimya,müzik;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double total=0;

        System.out.print("MAT NOTU: ");
        mat = scanner.nextDouble();
        total += (mat>=0 && mat<=100)?(mat):(0);

        System.out.print("fizik NOTU: ");
        fizik = scanner.nextDouble();
        total += (fizik>=0 && fizik<=100)?(fizik):(0);


        System.out.print("türkce NOTU: ");
        türkce = scanner.nextDouble();
        total += (türkce>=0 && türkce<=100)?(türkce):(0);


        System.out.print("kimya NOTU: ");
        kimya = scanner.nextDouble();
        total += (kimya>=0 && kimya<=100)?(kimya):(0);


        System.out.print("müzik NOTU: ");
        müzik = scanner.nextDouble();
        total += (müzik>=0 && müzik<=100)?(müzik):(0);


        double ortalama = total/5;
        if(ortalama<55){
            System.out.println("kaldın");
        }else{
            System.out.println("geçtin");
        }

    }
}
