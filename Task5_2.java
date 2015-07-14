package home02;

import java.util.Random;


public class Task5_2 {
//
    public static void main(String[] args) {
        Random r=new Random();
        int[][] mas=new int[7][4];
        int[] max={1,1,1,1,1,1,1};
        int index=0;
        for (int i=0;i<7;i++) {
            for (int y = 0; y < 4; y++) {
                mas[i][y] = r.nextInt(10) - 5;
                System.out.println("mas[" + (i+1) + "][" + (y+1) + "] = " + mas[i][y]);
                max[i]=max[i]*mas[i][y];
            }
            if (max[i]<0) max[i]=-max[i];
            if(max[index]<max[i]) index=i;
        }
        System.out.println(index+1);
    }
}
