package home02;

public class Task3 {

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
        return dec;//
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        System.out.println(task3.toDec("0b1110101010")+task3.toDec("0b10111001"));
        System.out.println(task3.toDec("0b10111010")+task3.toDec("0b10010100"));

    }
}
