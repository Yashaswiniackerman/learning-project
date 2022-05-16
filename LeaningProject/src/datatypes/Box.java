package datatypes;
import java.util.Scanner;

public class Box {
	double dblWidth;
	double dblHeight;
	double dblDepth;
//static variables
    static     int boxid;

public Box()
{
}
public double calcVolume()
{
	//local  variable
double dblTemp;
dblTemp = dblWidth* dblHeight* dblDepth;
return dblTemp;
}

public static void main(String args[])
{
	Box box1 = new Box();
	box1.dblHeight= 12.22;
	box1.dblWidth = 5.1;
	box1.dblDepth = 2.1;
	System.out.println("Volume of the box is" +box1.calcVolume());
	
	Box box2 = new Box();
	box2.dblHeight = 20.00;
	box2.dblWidth = 10.22;
	box2.dblDepth = 2;
	System.out.println("Volume of the box is" + box2.calcVolume());
}

}
