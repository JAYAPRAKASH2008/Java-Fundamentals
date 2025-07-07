package task;
import java.util.Scanner;
public class AlphabeticalOrder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char fchar=s.next().charAt(0);
		char lchar=s.next().charAt(0);
		
			if(fchar>lchar) {
			System.out.println(lchar+" "+fchar);	
				}
			else  {
				System.out.println(fchar+ " "+lchar);
			}
		}
		
		

	}

