package com.rentabook.persistent.daos;
import java.util.Collection;
import java.util.List;

import com.rentabook.persistent.domain.Role;
import com.rentabook.persistent.domain.User;
public interface IuserDAO extends GenaricDAO<User> {

	public boolean isAAuthanticUser(String userName,  String password);
	void registerUser(String firstName, String lastName, String email, String password);
	Collection<Role> getUserRoles(String mailID);
}
