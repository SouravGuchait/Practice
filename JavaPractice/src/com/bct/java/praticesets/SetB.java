package com.bct.java.praticesets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SetB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArrays= {
				"Guuchi","Kazu","Bullzi","Diamond","Stab"
		};
		/*Method reference to and instance method of an arbitrary object of a particular type
		 * 
		 */
		Arrays.sort(stringArrays,String::compareToIgnoreCase);
		for (String data:stringArrays) {
			System.out.println(data);
		}
	}

}