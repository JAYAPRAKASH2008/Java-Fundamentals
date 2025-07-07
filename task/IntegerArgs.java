package task;

public class IntegerArgs {

	public static void main(String[] args) {
		String a=args[0];
		String b=args[1];
		int c=Integer.parseInt(a)+Integer.parseInt(b);
		System.out.println("The sum of "+a+" and "+b+" is "+c);
	}

}
