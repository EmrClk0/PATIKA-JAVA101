import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("num1: ");
        int num1 = scanner.nextInt();

        System.out.print("num2: ");
        int num2 = scanner.nextInt();
        int ebob=1,ekok=1;

        int minNum = (num1>num2)?(num2):(num1);

        for(int i=1; i<=minNum; i++){
            if(num1%i==0 && num2%i==0)
                ebob = i;
        }

        ekok = (num1*num2)/ebob;

        System.out.println("ebob: "+ ebob);
        System.out.println("ekok: "+ekok);
    }
}
