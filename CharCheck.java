package task;
import java.util.Scanner;
public class CharCheck {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(Character.isAlphabetic(ch)) {
			System.out.print("Character");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
