package com.addressbook.controller;
import com.addressbook.model.Person;
public class PersonController
{
	public static void main(String... args)
	{
		Person person = new Person();
		person.setName("priyali");
	
		System.out.println("Person name is :" + person.getName());
	}
}
