package com.bct.java.praticesets;

	interface ConstructorInterface{
		Hello display(String say);
	}
	
	class Hello{
		//constructor
		Hello(String say) {
			System.out.println("Gm guys "+ say);
		}
	}
	public class SetA { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInterface ref = Hello::new;
		ref.display("How ya all doin??");
	}
	}


