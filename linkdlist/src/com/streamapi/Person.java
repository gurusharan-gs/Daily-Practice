package com.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

//		List<Person> list = new ArrayList<>();
//		list.add(new Person(1, "sagr", 18));

		List<Person> list = Arrays.asList(new Person(1, "sachin", 23), 
				new Person(2, "ramesh", 21),
				new Person(3, "ravi", 24), 
				new Person(4, "umesh", 21), 
				new Person(5, "prabhakar", 24));
		
		Person person = list.stream().filter(s -> "ravi".equals(s.getName())).findAny().orElse(null);
	    System.out.println(person);

	}

}
