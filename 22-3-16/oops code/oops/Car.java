package oops;

public class Car extends Vehicle implements VehicleInterface ,Interface1{

	int numDoors;
//	int a = 20;
	
	 Car(double speed){
		 super(speed);
		 System.out.println("Car's Constructor ");
	 }
	
	
	 public void printDescription(){
		 super.printDescription();
		 System.out.println("Car  : Color " + color + " Num Wheels :"+numWheels+"  Num Doors :"+numDoors);
	 }
	
	 public int getNumDoors(){
		 return numDoors;
	 }


	public String getType() {
	//	System.out.println(a);
		return "car";
	}
//	 
	
//	public void getType(){
//		
//	}
//	 
}
