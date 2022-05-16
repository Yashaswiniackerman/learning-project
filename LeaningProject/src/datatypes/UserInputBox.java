package datatypes;

import java.util.Scanner;

public class UserInputBox
{
	double dblWidth;
	double dblHeight;
	double dblDepth;
	
// static variables
	static int boxid;
public UserInputBox(double dblWidth, double dblHeight, double dblDepth) {
	this.dblWidth = dblWidth;
	this.dblHeight = dblHeight;
	this.dblDepth = dblDepth;
}
public UserInputBox()
{
}
public void calcVolume() 
{

	//local variable
double dblTemp;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the width of the box");
	double w=sc.nextDouble();
	System.out.println("Enter the height of the box");
	double h=sc.nextDouble();
	System.out.println("Enter the depth of the  box");
	double v=sc.nextDouble();
	UserInputBox b1 =     new UserInputBox(w,h,v);
	System.out.println("volume of the box is" +b1.calcVolume());
}
}