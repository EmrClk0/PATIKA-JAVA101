import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double a,b,c,u,uc,ua;
        Scanner input = new Scanner(System.in);
        System.out.print("A Kenarının Uzunluğunu Giriniz :");
        a = input.nextDouble();
        System.out.print("B Kenarının Uzunluğunu Giriniz :");
        b = input.nextDouble();
        System.out.print("C Kenarının Uzunluğunu Giriniz :");
        c = input.nextDouble();

        u=(double) (a+b+c)/2;
        uc=2*u;



        ua = Math.sqrt( u*(u - a)*(u - b)*(u - c));

        System.out.println("Üçgenin Çevresi : " + uc);
        System.out.println("Üçgenin Alanı   : " + ua);
    }
}
