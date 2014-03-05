package DAO;

import model.User;

public interface UserDAO {

	public User findUserByUserName(String userName);
	public void insert(User user);
 
}