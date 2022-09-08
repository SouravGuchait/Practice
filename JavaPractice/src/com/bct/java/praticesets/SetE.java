package com.bct.java.praticesets;
import java.util.function.IntBinaryOperator;

//default interfaces
interface Myinterface{
	//default Method
	default void newMethod() {
		System.out.println("newly added default method");
	}
	//Abstract Method
	public void existingMethod(String str);
}

/*already existing public and abstract method
 * we must  need to implement this method in implementation classes
 */
//Inheritance concept
class Example implements Myinterface{
	public void myMethod() {
		System.out.println("Message is: ");
	}
}



//creating or own functional reference
interface Functionalinterface {
	//single abstract method
	public int addMethod(int a,int b);
	public static void main(String[] args) {
		//Lambda Operation
		Functionalinterface sum=(a,b) -> a+b;
		System.out.println("result+ "+sum.addMethod(12,100));
		
		//predefined functional interface
		//lambda expression
		System.out.println("!--Printed by predefined interface--!");
		IntBinaryOperator add=(a,b) -> a+b;
		System.out.println("Result = "+add.applyAsInt(12, 100));
		Example instan = new Example();
		//calling the default method of interface
		instan.newMethod();
		//calling the abstract method of interface
		instan.existingMethod("Java 8 is not easy to learn");
	}

}

