package home02;

public class Task1 {

    int toBin(int num) {
        int[] bin = new int[10];
        for (int i = 0;i<10 ; i++) {
            bin[i] = num % 2;
            num = num / 2;
        }
        for (int i = 0;i<10 ; i++) {
            num = 10*num + bin[9-i];
        }
        return num;
    }
    int toOct(int num){
        int[] oct = new int[10];
        for (int i = 0;i<10 ; i++) {
            oct[i] = num % 8;
            num = num / 8;
        }
        for (int i = 0;i<10 ; i++) {
            num = 10*num + oct[9-i];
        }
        return num;
    }

    String toHex(int num){
        String hexString=new String();
        int hexInt=0;
        while (num!=0){
            hexInt=num%16;
            switch (hexInt){ // так можно делать?
                case 10 : hexString+= "A" ; break;
                case 11 : hexString+= "B" ; break;
                case 12 : hexString+= "C" ; break;
                case 13 : hexString+= "D" ; break;
                case 14 : hexString+= "E" ; break;
                case 15 : hexString+= "F" ; break;
                default : hexString+= String.valueOf(hexInt); break;
            }
            num=num/16;
        }
        return  new StringBuilder(hexString).reverse().toString();
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int x=949,y=763;
        System.out.println(task1.toBin(x));
        System.out.println(task1.toBin(y));
        System.out.println(task1.toOct(x));
        System.out.println(task1.toOct(y));
        System.out.println(task1.toHex(x));
        System.out.println(task1.toHex(y));
    }
}
