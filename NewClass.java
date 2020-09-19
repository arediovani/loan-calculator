
package simple.loanin.calculator;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleae enter the paymet");
        int a = sc.nextInt();
        System.out.println("Please enter the ");
        calculations cs = new calculations(12, 12, 15);
        System.out.println(cs.getPayment());
        

    }

}

