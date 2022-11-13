

    public class Main {
        public  static  double harmonik(double number){
            double result=0;

            for(double i=1; i<=number; i++){
                result += (double)(1/i);
            }
            return  result;

        }

        public static void main(String[] args) {
            // write your code here
            int array[]={2,5,3,5,7};
            double total=0;
            for(int x:array)
                total += harmonik(x);

            System.out.println("dizideki sayıların harmonik ortalaması: " + (total/array.length));





        }
    }


