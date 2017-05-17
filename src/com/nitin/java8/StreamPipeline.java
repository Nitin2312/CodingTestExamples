package com.nitin.java8;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class StreamPipeline {
	
	public static void main(String args[]){
		Arrays.stream(Object.class.getMethods()).map(method->method.getName()).distinct().forEach(System.out::println);
		
		//predicate function
		Stream.of("hello", "world")
	    .filter(str -> str.startsWith("h"))
	    .forEach(System.out::println);
		
		Person p = new Person("Nitin",23);
		//use of Predicate Function Conditions are defined like this below
		 Predicate<String> nullCheck1 = arg -> arg != null;
	     Predicate<String> emptyCheck = arg -> arg.length() > 15;
	     Predicate<String> nullAndEmptyCheck = nullCheck1.and(emptyCheck);
	     
	     Predicate<Person> nullCheck = arg ->arg!=null;
	     System.out.println("Lambda"+nullCheck.test(p));
	     
	     String helloStr = "hello";
	     System.out.println(nullAndEmptyCheck.test(helloStr));
	     
	     String nullStr = null;
	     System.out.println(nullAndEmptyCheck.test(nullStr));
	}
	

}
