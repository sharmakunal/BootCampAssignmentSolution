package oops;

public  class Vehicle implements ComapreInterface<Vehicle> {
	
	String color;
	double speed;
	protected  int numWheels;
	 int a = 10;
	 
	public  Vehicle(double speed){
		this.speed = speed;
	 }
	 
	 public void printDescription(){
		 System.out.println("Vehicle  : Color " + color + " Num Wheels :"+numWheels);
	 }

	@Override
	public int compareTo(Vehicle second) {
		if(this.speed > second.speed ){
			return 1;
		}
		else if(this.speed < second.speed){
			return -1;
		}
		return 0;
	}
	 
	//
//public abstract String getType();
	 
	
}
