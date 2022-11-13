import java.util.Arrays;

public class Main {

    public static  void  ciftTekrar(int[] array){
        Arrays.sort(array);
        for (int i=1; i<array.length-1; i++){
            if(array[i]%2==0){
                if(array[i]==array[i+1] && array[i]!= array[i-1]){
                    System.out.println(array[i]);
                }
            }else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        int[] array = {2,324,542,312,4,123,3,3,2,1,5,7,4,3,5,2,5,96,3,2,8,31,7,1,6,31,4,1};
        ciftTekrar(array);
    }
}
