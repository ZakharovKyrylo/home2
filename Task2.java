package org.sourceit.zakharov.home02;

public class Task2 {

        int toDec(String s){
            String s1=s.replace('b','0');
            int[] strToInt= new int[s.length()];
            int dec=0;
            for (int i=0;i<s.length();i++){//переводим строку в масив
                if (s1.endsWith("0")) strToInt[i] = 0 ;
                else strToInt[i] = 1;
                s1 = s1.substring(0, s1.length() - 1);
                if((i==0)&(strToInt[i] == 0)) dec = 0;
                else  dec= (int) (dec+Math.pow((strToInt[i]*2),i));
            }
            return dec;
    }

    public static void main(String[] args) {
        Task2 task2=new Task2();

        String num2_1="0b111000111";
        String num2_2="0b100011011";

        System.out.println(task2.toDec(num2_1));
        System.out.println(task2.toDec(num2_2));



        //System.out.println(Integer.parseInt("111000111",2));
    }
}



