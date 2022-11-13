import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int column;
    private int row;
    private String[][] realMap;
    private  String[][] gameMap;

    public MineSweeper(int column, int row){
        this.column = column;
        this.row = row;

        this.realMap = new String[column][row];
        this.gameMap = new String[column][row];
        this.putTheMines();
        this.PrepareGameMap();
    }


    public void putTheMines(){
        int mines=(this.column * this.row)/4;

        for(int x=0; x<column; x++){
            for(int y=0; y<row; y++){
                this.realMap[x][y]="-";
            }
        }

        int column,row;
        Random random = new Random();

        for(int i=0; i<mines; i++){
            column = random.nextInt(this.column);
            row = random.nextInt(this.row);


            if(this.realMap[column][row].equals("-")){
                this.realMap[column][row]="*";
            }else{
                i--;
            }
        }
    }
    public  void PrepareGameMap(){
        for(int x=0; x<column; x++){
            for(int y=0; y<row; y++){
                this.gameMap[x][y]="-";
            }
        }

    }
    public void PrintThe2DArray(Object[][] array){
        for(int x=0; x<column; x++){
            for(int y=0; y<row; y++){
                System.out.print(array[x][y]+" ");
            }
            System.out.println("");
        }
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int column, row;
        this.PrintThe2DArray(this.realMap);
        do {
            System.out.print("satır indexi : ");
            column =  scanner.nextInt();
            System.out.print("sütün indexi : ");
            row =  scanner.nextInt();

            if(column<0 || column>this.column-1 || row<0 || row>this.row-1  ){
                System.out.println("HATALI İNDEXLEME");
                continue;
            }

            if(this.realMap[column][row].equals("*")){
                System.out.println("MAYINA BASTINIZ...");
                this.PrintThe2DArray(this.realMap);
                break;
            }else{
                // cevresindeki mayın sayısını yazdırcaz;
                this.gameMap[column][row] = Integer.toString(this.NumbersOfMinesAround(column,row));
                this.PrintThe2DArray(this.gameMap);
            }


        }while(true);
    }




    public int NumbersOfMinesAround(int column, int row){
        int mines=0;
        if(column==0){ //0. index

            if(row==0){
                mines += (this.realMap[column][row+1].equals("*"))?(1):(0);
                mines += (this.realMap[column+1][row].equals("*"))?(1):(0);


            }else if(row==this.row-1){ // en sağda
                mines += (this.realMap[column][row-1].equals("*"))?(1):(0);
                mines += (this.realMap[column+1][row].equals("*"))?(1):(0);

            }else{
                mines += (this.realMap[column][row-1].equals("*"))?(1):(0);
                mines += (this.realMap[column][row+1].equals("*"))?(1):(0);
                mines += (this.realMap[column+1][row].equals("*"))?(1):(0);

            }

        }else if(column==this.column-1){ // sonuncu index
            if(row==0){

                mines += (this.realMap[column-1][row].equals("*"))?(1):(0);
                mines += (this.realMap[column][row+1].equals("*"))?(1):(0);

            }else if(row==this.row-1){
                mines += (this.realMap[column][row-1].equals("*"))?(1):(0);
                mines += (this.realMap[column-1][row].equals("*"))?(1):(0);


            }else{
                mines += (this.realMap[column][row-1].equals("*"))?(1):(0);
                mines += (this.realMap[column][row+1].equals("*"))?(1):(0);
                mines += (this.realMap[column-1][row].equals("*"))?(1):(0);
            }

        }else{ //ortalar
            if(row==0){
                mines += (this.realMap[column-1][row].equals("*"))?(1):(0);
                mines += (this.realMap[column+1][row].equals("*"))?(1):(0);
                mines += (this.realMap[column][row+1].equals("*"))?(1):(0);

            }else if(row==this.row-1){
                mines += (this.realMap[column-1][row].equals("*"))?(1):(0);
                mines += (this.realMap[column+1][row].equals("*"))?(1):(0);
                mines += (this.realMap[column][row-1].equals("*"))?(1):(0);


            }else{
                mines += (this.realMap[column-1][row].equals("*"))?(1):(0);
                mines += (this.realMap[column+1][row].equals("*"))?(1):(0);
                mines += (this.realMap[column][row+1].equals("*"))?(1):(0);
                mines += (this.realMap[column][row-1].equals("*"))?(1):(0);

            }
        }

        return mines;
    }



}
