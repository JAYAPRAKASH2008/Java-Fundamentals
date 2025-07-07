package task;


	class Student{
		int marks[];
		String name,Class;
		int sum=0;
	Student(int marks[],String name,String Class){
		this.marks=marks;
		this.name=name;
		this.Class=Class;
		}
	 void getElemnt() {
		 for(int i=0;i<marks.length;i++) {
			 System.out.println(marks[i]);
			 sum+=marks[i];
			 
		 }
		 System.out.println(sum);		//its not return method call no return
		 
	 }
//	public void total(int marks) {
//		marks+=marks;
//		System.out.println(marks);
//	}
}
public class ConstructorPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33,22,12};
		Student s= new Student(arr,"jp","green") ;
		s.getElemnt();
		
		//System.out.print(s.getElemnt() ," "+s.name+" "+s.Class);
	}

}
