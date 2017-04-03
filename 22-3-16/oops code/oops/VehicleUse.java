package oops;

import java.util.Scanner;

public class VehicleUse {

	public static<T extends ComapreInterface<T>> void sort(T[] input){
		
		for(int i = 0; i < input.length -1; i++){
			for(int j = 0; j < input.length - i - 1; j++){
				if(input[j].compareTo( input[j+1]) == 1){
					T temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
	}
	
	
	public static void print(Vehicle v){
		
		v.printDescription();
	}
	
	public static void main(String[] args) {
		
		Vehicle[] varray = new Vehicle[10];
		
//		for(int i = 0; i < varray.length; i++){
//			System.out.println(varray[i]);
//		}
		
		for(int i = 0; i < varray.length; i++){
			varray[i] = new Vehicle(100-i);
		//	varray[i].speed = 100-i;
		}
		
		sort(varray);
		
		for(int i = 0; i < varray.length; i++){
			System.out.println(varray[i].speed);
		}
		
	//	Vehicle v = new  Vehicle(100);
//		Car c = new Car(80.8);
//		Vehicle vc;
//		vc= new Car(70);
//		System.out.println(vc.a);
//		VehicleInterface vI = new Car(10);
		
//		Student s = new Student();
		//print(s);
//		Scanner s  = new Scanner(System.in);
//		int num = s.nextInt();
//		Vehicle vc ;
//		if(num < 10){
//			vc = new Car(90);
//		}
//		else{
//			vc = new  Truck(80);
//		}
//		
//		//= new Car(80);
//		vc.printDescription();
//		vc.getNumDoors();
		
//		System.out.println(c.color +" "+ c.numWheels+" "+c.numDoors);
//		v.printDescription();
//		c.printDescription();
	}

}
