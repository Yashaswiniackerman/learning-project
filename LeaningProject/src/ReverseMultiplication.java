
	import java.util.Scanner;
	
	public class ReverseMultiplication {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = 0;
			System.out.println("Please enter any number");
			num = sc.nextInt();
			for(int i=10; i>=0; i--)
			{
				System.out.println(num+"X"+i+"="+num*i);
			}
		}
}
