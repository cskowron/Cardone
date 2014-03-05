package impl;

import model.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DAO.UserDAO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public User findUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}

}
