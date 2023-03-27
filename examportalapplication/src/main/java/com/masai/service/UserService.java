package com.masai.service;

import java.util.Set;

import com.masai.model.User;
import com.masai.model.UserRole;

public interface UserService {
	
	public User creatUser(User user, Set<UserRole> userRoles)throws Exception;
	

}
