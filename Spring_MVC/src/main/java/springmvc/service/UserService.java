package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.model.User;
import springmvc.dao.UserDao;

@Service
public class UserService {												//User Registration using SpringMVC and SpringORM

	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}
