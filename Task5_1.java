package home02;

import java.util.Random;

public class Task5_1 {

    public static void main(String[] args) {
        Random r=new Random();
        int[][] mas=new int[8][5];
        for (int i=0;i<8;i++)
            for (int y=0;y<5;y++)
            {
                mas[i][y]=r.nextInt(89)+10;
                System.out.println("mas[" + (i+1) + "][" + (y+1) + "] = " + mas[i][y]);
            }
    }//
}
