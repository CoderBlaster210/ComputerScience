import java.util.Scanner;
public class TwoDArrays34{
    public static void main(String[]args){
        int[][] a = new int[4][6];
        int max = -10000;
        int min = 10000;
        int sum = 0;
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                int num = (int)(Math.random()*71)+7;
                sum+=num;
                if(num>max)
                    max = num;
                if(num<min)
                    min = num;
                a[row][col] = num;
                System.out.print(a[row][col]  + "\t");
            }
            System.out.println();
        }
        System.out.print("The sum is " + sum + " and the max is " + max + " and the min is " + min);
        System.out.println();


        //Problem 2

        int[][] table = new int[5][4];
        int i = 2;
        int j = 1;
        int num1 = 0;
        for(int row = 0; row < table.length; row++){
            for(int col = 0; col < table[row].length; col++){
                if(col == 0)
                    num1 = (int)Math.pow(2, i);
                else if (col == 1)
                    num1 = (int)Math.pow(3, i);
                else if (col == 2)
                    num1 = (int)Math.pow(4, j);
                else if (col == 3)
                    num1 = (int)Math.pow(5, i);
                table[row][col] = num1;
                System.out.print(table[row][col] + "\t");
            }
            System.out.println();
            i++;
            j++;
        }
        System.out.println();

        //Problem 3

        String[][] table1 = new String[3][3];
        String ast = "";
        int counter = 0;
        for(int row = 0; row < table1.length; row++){
            for(int col = 0; col < table1[row].length; col++) {
                ast += "*";
                counter++;
                table1[row][col] = ast;
                System.out.print(table1[row][col] + "\t");
            }
            System.out.println();
            ast = "";
            counter = 0;
        }
    }
}