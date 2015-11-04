// Ze zadání tří stran určete, jaký je to trojúhelník

package vlastnostitrojuhelnika;

import java.util.Scanner;

public class VlastnostiTrojuhelnika {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.print("Vlož 1. stranu: ");
        int a = vstup.nextInt();
        System.out.print("Vlož 2. stranu: ");
        int b = vstup.nextInt();
        System.out.print("Vlož 3. stranu: ");
        int c = vstup.nextInt();
        
        // existence trojúhelníka
        if (! (a+b>c && a+c>b && b+c>a)) {
            System.out.println("Takový trojúhelní neexistuje.");
        } else {
            // rovnoramenný může být pravoúhlý, ostroúhlý i tupoúhlý
            if ((a==b && a!=c) || (b==c && b!=a) || (c==a && c!=b)) {
                System.out.println("Trojúhelník je rovnoramenný.");
            }
            // pravoúhlost
            if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
                System.out.println("Trojúhelník je pravoúhlý.");
            } else if (a*a+b*b>c*c && a*a+c*c>b*b && b*b+c*c>a*a) {
                System.out.println("Trojúhelník je ostroúhlý.");
                // ostroúhlý může být rovnostranný
                if (a==b && b==c) {
                    System.out.println("Trojúhelník je rovnostranný.");
                }
            } else {
                System.out.println("Trojúhelník je tupoúhlý.");
            }
        }
    }
    
}
