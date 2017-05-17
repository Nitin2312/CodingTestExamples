package com.nitin.java8;
 
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
 
public class PersonPrediate 
{
    public static Predicate<Person> isAdultMale() {
    	
        return p -> p.getAge() > 21 && p.getName().equalsIgnoreCase("Nitin");
    }
     
   
    public static List<Person> filterEmployees (List<Person> employees, Predicate<Person> predicate) {
        return employees.stream().filter( predicate ).collect(Collectors.<Person>toList());
    }
} 