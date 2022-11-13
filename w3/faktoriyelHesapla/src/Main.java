import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static  int faktoriyel(int num){
        int result=1;
        for(int i=1; i<=num; i++)
            result *=i;
        return result;
    }

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("n elemean ");
        int n = scanner.nextInt();

        System.out.print("r eleman: ");
        int r = scanner.nextInt();

        int result = faktoriyel(n)/(faktoriyel(r)*(n-r));
        System.out.println("result: "+ result);
    }
}
