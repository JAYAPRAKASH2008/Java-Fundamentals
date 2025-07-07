package task;

public class PrimePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23;
		int count=0;
		for(int i=10;i<99;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(n);
		}

	}

}
