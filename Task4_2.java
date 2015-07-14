package home02;

public class Task4_2 extends Task2_2 {

    public static void main(String[] args) {
        ToDec toDec=new ToDec();
        System.out.println(ToDec.toDec("1000000100")-ToDec.toDec("101010001"));
        System.out.println(ToDec.toDec("1010111101")-ToDec.toDec("111000010"));

    }
}
//