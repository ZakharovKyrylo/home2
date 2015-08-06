package org.sourceit.zakharov.home02;

public class Task3_2 extends Task2_2 {

    public static void main(String[] args) {
        ToDec toDec=new ToDec();
        System.out.println(ToDec.toDec("1110101010")+ToDec.toDec("10111001"));
        System.out.println(ToDec.toDec("10111010")+ToDec.toDec("10010100"));

    }
}
