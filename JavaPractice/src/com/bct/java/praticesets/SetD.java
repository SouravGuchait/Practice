package com.bct.java.praticesets;

import java.util.ArrayList;
import java.util.List;

public class SetD {

	public static void main(String[] args) {
		// create a collection
        List<String> names = new ArrayList<String>();
        // add the elements to the list
        names.add("sachin");
        names.add("anil");
        names.add("wipro");
        names.add("technology");
        names.add("banglore");
        
        //Create an integer based collection and check the even and odd numbers using lambda Stream
        List<Integer>numbers = new ArrayList<Integer>();
        
        numbers.add(10);
        numbers.add(89);
        numbers.add(69);
        numbers.add(55);
        numbers.add(42);
        numbers.add(33);
        numbers.add(75);
        
        
        
        // i would like to count the number of elements present in the list
        int count=0;
        for (String ele:names ){
            if(ele.length()<6)
                count++;
            }
            System.out.println("there are "+count+" strings with length less than 6");
            System.out.println("----------------------------------------------------");
    
    
        // lets apply stream now! using lambda expression
        int number = (int) names.stream().filter(ele -> ele.length()<6).count();
        System.out.println("there are "+number+" string with length less than 6");
        
        numbers.stream().filter(nu -> nu%2==0).forEach(System.out::println);
        
    }
	}
