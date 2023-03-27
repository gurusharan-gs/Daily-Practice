package com.masai;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.model.Role;
import com.masai.model.User;
import com.masai.model.UserRole;
import com.masai.service.UserService;

@SpringBootApplication
public class ExamportalapplicationApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamportalapplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

//		user set
		User user = new User();
		user.setFristName("guru");
		user.setLastName("ulagadde");
		user.setUsername("guru143");
		user.setEmail("guru143@gmail.com");
		user.setPassword("abc");
		user.setPhone("8494800588");

//		role set
		Role role = new Role();
		role.setRoleId(10);
		role.setRoleName("ADMIN");

		Set<UserRole> userRoleSet = new HashSet<>();
		UserRole userRole = new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);

		userRoleSet.add(userRole);
		

		User user1 = this.userService.creatUser(user, userRoleSet);
		System.out.println(user1.getUsername());

	}

}
