import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public  static  int findMin(int array[], int num){
        int min=num;
        Arrays.sort(array);
        for (int i= (array.length-1); i>=0; i--){
            if(array[i]<num){
                min = array[i];
                break;
            }

        }
        return min;

    }


    public  static  int findMax(int array[], int num){
        int max=num;
        Arrays.sort(array);
        for (int i= 0; i<array.length; i++){
            if(array[i]>num){
                max = array[i];
                break;
            }

        }
        return max;

    }
    public static void main(String[] args) {
	// write your code here
        int array[] = {15,12,788,1,-1,-778,2,0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Girilen Sayı : ");
        int number =scanner.nextInt();


        System.out.println("sayıya en yakın küçük: "+ findMin(array,number));
        System.out.println("sayıya en yakın büyük: "+ findMax(array,number));


    }
}
