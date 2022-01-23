package basics;

import java.util.Scanner;

public class Iteratorex {
	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the value of A");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = a+1;
		int c = a+2;
		System.out.println("Enter the Value of X");
		int x = in.nextInt();
		 while (a <= x)
         {
             a = a * a;
            
         }
		 System.out.println(a);
         while (b <= 2 * x)
         {
             b = b * b;
            
         }
         System.out.println(b);


         while (c <= 3 * x)
         {
             c = c * c;
            
         }
         System.out.println(c);
}
}
