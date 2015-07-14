package home02;

import java.util.Scanner;

public class Task6_2 {//



    void prime(int num,int delitel, int prostoe){
        if (prostoe<num) {
            if (delitel < prostoe) {
                if(prostoe % delitel == 0)  prime(num, 2, ++prostoe );
                else prime(num, ++delitel, prostoe  );
            }
            else{
                System.out.println(prostoe);
                prime(num,2,++prostoe);
            }
        }
    }

    public static void main(String[] args) {
        Task6_2 task6_2 = new Task6_2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        Integer num = scanner.nextInt();
        task6_2.prime(num,2,2);
//        System.out.println(task6_2.prime(num));

    }
}
