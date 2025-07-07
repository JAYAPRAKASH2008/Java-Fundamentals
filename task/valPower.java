package task;

 class Car {
//	void start() {
//		System.out.println("Start engine");
		int speed;
		String type;
		Car(String type,int speed){
			this.type=type;
			this.speed=speed; //local scope
		}

}
class wheel extends Car{
//	void start() {
	String trans;
	wheel(String trans){
		super("4W",100);
		this.trans=trans;
	}
	//	System.out.println("Moving car..");
		
//}
}
class valPower{
	public static void main(String[] args) {
		
		wheel a=new wheel("train");
	System.out.println(a.trans+" "+a.type+" "+a.speed);
		
	}

}
