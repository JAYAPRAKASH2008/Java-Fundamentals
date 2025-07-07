package task;
import java.util.Scanner;
public class ColorCode {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char str=s.next().charAt(0);
		switch(str) {
		case 'G':
			System.out.println("Green");
			break;
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		default:
			System.out.println("Invalid Code");
		}
	
	}

}
