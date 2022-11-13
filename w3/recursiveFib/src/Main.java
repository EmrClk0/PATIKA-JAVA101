import java.util.Scanner;

public class Main {

    public  static  void fibonacci(int elementsNum,int num1, int num2, int num3){
        if(elementsNum>0){

            num3 = num1+num2;
            System.out.println(num1+" + "+num2+" = "+num3);

            num1=num2;
            num2 = num3;
            elementsNum--;
            fibonacci(elementsNum,num1,num2,num3);
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman Sayısı: ");
        int elementsNum = scanner.nextInt();

        int num1=0, num2=1,num3=0;
        fibonacci(elementsNum,num1,num2,num3);



    }
}
