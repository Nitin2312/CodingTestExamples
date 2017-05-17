package com.nitin.java8;

import static com.nitin.java8.PersonPrediate.filterEmployees;
import static com.nitin.java8.PersonPrediate.isAdultMale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionTest {

	
	public static void main(String args[]){
		
		Person p1= new Person("Nitin", 28);
		Person p2= new Person("Rama", 28);
		Person p3= new Person("DhanPal", 28);
		List<Person> personList  =  new ArrayList<Person>();
		personList.addAll(Arrays.asList(new Person[]{p1,p2,p3}));
		
		
		
		
		List<Person>filterList = filterEmployees(personList, isAdultMale());
		for(int i =0;i<filterList.size();i++)
			System.out.println(filterList.get(i).getAge()+" "+ filterList.get(i).getName());
		
	}

	

	
	

}
