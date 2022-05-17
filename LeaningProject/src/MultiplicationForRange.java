import java.util.Scanner;
public class MultiplicationForRange {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int num,range;
		System.out.println("Enter  the number:");
		num = sc.nextInt();
		System.out.println("Enter the range:");
		range = sc.nextInt();
		for(int i=1; i<=range; i++)
		{
			System.out.println(num+"x"+i+"="+num*i);
			
		}
			
	}
	

}
