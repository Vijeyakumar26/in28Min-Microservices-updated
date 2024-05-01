package com.minutes.DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
		Predicate<User> predicate = user -> user.getId().equals(userId);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteUser(int userId){
		Predicate<User> predicate = user -> user.getId().equals(userId);
		users.removeIf(predicate);
	}
	
	public User saveUser(User user){
		user.setId(++userIdCounter);
		users.add(user);
		return user;
	}
}
