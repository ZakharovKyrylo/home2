package org.sourceit.zakharov.home02;

public class Task2_2 {
    public static void main(String[] args) {
        ToDec toDec=new ToDec();

        String num2_1="111000111";
        String num2_2="100011011";

        System.out.println(ToDec.toDec(num2_1));
        System.out.println(ToDec.toDec(num2_2));

    }
}

class ToDec{
        public static int toDec(String s){
        int[] strToInt= new int[s.length()];
        int dec=0;
            int i=0;
            while (s.length()>0){
            if (s.endsWith("0")) strToInt[i] = 0 ;
            else strToInt[i] = 1;
            s = s.substring(0, s.length() - 1);
            if((i==0)&(strToInt[i] == 0)) dec = 0;
            else  dec= (int) (dec+Math.pow((strToInt[i]*2),i));
            i++;
        }
        return dec;
    }
}