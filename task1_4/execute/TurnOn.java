package task1_4.execute;
import java.util.Random;


public class TurnOn {
    public int[][]Pure;


    public TurnOn(int length){

    Pure = this.generateMatrix(length);


    }

    public int[][] generateMatrix(int length){
        int [][] Matrix = new int[length][length];
        Random random=new Random();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <length ; j++) {
                Matrix[i][j] = (random.nextInt(14864)-7432);
            }

        }

        return Matrix;
    }

    public int[][] Turning(int[][]Pure){
        int length = Pure.length;
        int[][] Transposed = new int[length][length];
        for (int i = 0; i < length; i++) {
            int[] temp = new int[length];
            for (int j = 0; j <length ; j++) {


                temp[j]=Pure[j][i];

            }

            Transposed[length-1-i]=temp;



        }

        return Transposed;

    }


}
