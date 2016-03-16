package com.rentabook.persistent.daos;
import com.rentabook.persistent.domain.DomainObject;
import com.rentabook.persistent.domain.User;
public interface IuserDAO extends GenaricDAO<User> {

	public boolean isAAuthanticUser(String userName,  String password);
	void registerUser(String firstName, String lastName, String email, String password);
}
