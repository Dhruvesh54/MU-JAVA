// package Program;

import java.util.Scanner;

public class p_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter purchase price : ");
        int purchase = scanner.nextInt();

        System.out.print("Enter selling price : ");
        int selling = scanner.nextInt();

        float proffit = selling - purchase;
        float loss = purchase - selling;

        float per = (proffit*100)/purchase;
        float perlos = (loss*100)/purchase;
        
        if (proffit >= loss) {
            System.out.println("Profite is : " + per + "%");
        } else {
            System.out.println("Loss is : " + perlos + "%");
            
        }
    }
}
