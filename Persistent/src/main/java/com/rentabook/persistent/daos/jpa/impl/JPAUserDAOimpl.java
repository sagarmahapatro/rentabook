package com.rentabook.persistent.daos.jpa.impl;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.rentabook.persistent.daos.IuserDAO;
import com.rentabook.persistent.daos.jpa.AbsractJPADAO;
import com.rentabook.persistent.domain.Role;
import com.rentabook.persistent.domain.User;

@Repository("userDAO")
public class JPAUserDAOimpl extends AbsractJPADAO<User> implements IuserDAO {

	private static final Logger logger = Logger.getLogger(JPAUserDAOimpl.class);

	public JPAUserDAOimpl() {
		super(User.class);
	}

	public boolean isAAuthanticUser(String email, String password) {
		logger.debug(" isAAuthanticUser method is called");
		boolean result = false;
		User user = entityManager.createNamedQuery("findUserByEmailID", User.class).setParameter("email", email)
				.getSingleResult();
		if (user != null) {
			result = user.getPassword().equals(password);
		}
		logger.debug(" isAAuthanticUser return value  is " + result);
		return result;
	}

	public void registerUser(String firstName, String lastName, String email, String password) {
		logger.debug(" registerUser method has been called");
		logger.debug(" param firstName " + firstName);
		logger.debug(" param firstName " + lastName);
		logger.debug(" param firstName " + email);
		logger.debug(" param firstName " + password);

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		this.save(user);

	}

	public Collection<Role> getUserRoles(String mailID) {
		User user = (User) entityManager.createNamedQuery("findUserByEmailID", User.class).setParameter("email",
				mailID);
		return user.getUserRoles();
	}
}
