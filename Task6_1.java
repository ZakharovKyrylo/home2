package org.sourceit.zakharov.home02;

import java.util.Scanner;

public class Task6_1 {

    int summ(int n){

        return n < 1 ? 0 : n + summ(n - 1);

    }
    public static void main(String[] args) {
        Task6_1 task6_1 = new Task6_1();

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        Integer num=scanner.nextInt();
        System.out.println();
        System.out.println(task6_1.summ(num));
    }
}
