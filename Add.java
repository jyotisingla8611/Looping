package Assignment3;
import java.util.Scanner;
public class Add {
   public static void main(String ar[])
   {
		@SuppressWarnings("resource")
		Scanner obj=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter 2 numbers");
		n1=obj.nextInt();
		n2=obj.nextInt();
		System.out.println("Sum is as = "+sum(n1,n2));
   }
   public static int sum(int x,int y)
   {
	   return x+y;
   }
}
