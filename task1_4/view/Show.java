package task1_4.view;
import task1_4.execute.TurnOn;

import java.util.Arrays;   //Used only to perform my result;
import java.util.Scanner;

public class Show {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Matrix size: ");
        int input = in.nextInt();

        TurnOn Matrix = new TurnOn(input);

      int[][] Result = Matrix.Turning(Matrix.Pure);


        for (int i = 0; i < input; i++) {

            System.out.println(Arrays.toString(Matrix.Pure[i]));
        }

        System.out.println("//////////////////////////////////////////////////////////////////////" );

        for (int i = 0; i < input; i++) {


            System.out.println(Arrays.toString(Result[i]));
        }

    }
}
