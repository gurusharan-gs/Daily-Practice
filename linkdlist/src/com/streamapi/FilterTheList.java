package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTheList {
	
	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("guru", "gurusharan","sharan", "ravi","umesh", "sachin");
		List<String> list = nameList.stream().filter(name -> name.startsWith("s")).collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
