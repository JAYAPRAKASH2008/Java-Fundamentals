package task;
import java.util.Scanner;
public class PrintInterset {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String gen=s.next();
		int age=s.nextInt();	
		if(gen.equals("Female")) {
			if(age>1 && age<58) {
				System.out.println("8.2%");
			}
			else if(age>59 && age<100) {
				System.out.println("9.2%");
			}
		}
		else if(gen.equals("Male") ){
			if(age>1 && age<58) {
				System.out.println("8.4%");
			}
			else if(age>59 && age<100) {
				System.out.println("10.5%");
			}
		}

	}

}
