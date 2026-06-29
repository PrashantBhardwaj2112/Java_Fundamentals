package BasicsJava;

import java.util.Scanner;

public class twoKaTable {
    public static void mulitple(int a) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + a * i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(1!=0)
        {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if(a == -1){
                break;
            }
            mulitple(a);
    }
}

}
