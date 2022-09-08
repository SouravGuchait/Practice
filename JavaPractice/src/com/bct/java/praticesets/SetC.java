package com.bct.java.praticesets;

import java.util.function.BiFunction;

@FunctionalInterface
interface MyInterface{
	//A Method --abstract Method
	public void display();
}
// ---> make reference to the abstract method and instance method
//Method reference to an instance method of an object- Object::instanceMethod


//Method reference to the static method of the class,
class Addition{
	static int add(int x,int y) {
	//static-> we never need to create an object
		
		return x+y;
	}
}
public class SetC {
	/*
	 * Method references is the short hand notation of lambda expression to call 
	 * a method
	 * 
	 * Syntax=> str -> System.out.println(str);
	 * System.out::println
	 */
	
	//Method reference to an instance method of an object - Object::instanceMethod
	public void myMethod(){
		System.out.println("Instance Method");
		System.out.println("!-----I have referred by the abstract------!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CREATE OBJECT TO A CLASS
		SetC obj= new SetC();
		//Method reference using the object of the class
		MyInterface ref = obj::myMethod;
		//calling method of functional reference
		ref.display();
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		//if i wanted to call the instance method directly...!!!
//		obj.myMethod();

		
//		Addition instance = new Addition();
//		instance.add(10,10);
		//Create an object to class addition
		BiFunction<Integer,Integer,Integer> addition = Addition::add;
		int sum =addition.apply(11, 58);
		System.out.println("Addition of given number is: "+sum);
		
	}

}
