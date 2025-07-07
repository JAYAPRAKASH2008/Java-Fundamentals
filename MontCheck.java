package task;
import java.util.Scanner;
public class MontCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int M=s.nextInt();
		switch(M) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febraury");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		default:
			System.out.println("Invalid Month");
		}
	}

}
