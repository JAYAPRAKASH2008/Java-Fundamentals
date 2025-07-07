package task;
import java.util.Scanner;
public class UpperToLower {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch>'A' && ch<'z') {
			ch=(char)(ch+32);
		}
		else {
			ch=(char)(ch-32);
		}

	}

}
