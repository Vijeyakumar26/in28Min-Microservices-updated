package com.minutes.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.minutes.beans.User;

@Component
public class UserDAOService {
	
	private static List<User> users = new ArrayList<>();
	private static int userIdCounter = 0;
		
	static {
		users.add(new User(++userIdCounter,"Adam",LocalDate.now().minusYears(23)));
		users.add(new User(++userIdCounter,"Hubbard",LocalDate.now().minusYears(35)));
		users.add(new User(++userIdCounter,"Mike",LocalDate.now().minusYears(27)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User findUser(int userId){
		return users.stream().filter(u -> u.getId().equals(userId)).findFirst().get();
	}
	
	public User saveUser(User user){
		user.setId(++userIdCounter);
		users.add(user);
		return user;
	}
}
