import java.util.Scanner;
public class CharBoolDemo{
	public static void main(String[] args) {

	int x= 0,y =1;
	System.out.println((x < 1) || (y-- < 1));
	System.out.println("x= "+ x + ", y = " + y);
	
	Scanner sc = new Scanner(System.in);
	String name;
	name = sc.next();
	System.out.println(name);
	System.out.println((x < 1) | (y-- < 1));
	System.out.println("x= " + x + ", y = " + y);
	} 

}