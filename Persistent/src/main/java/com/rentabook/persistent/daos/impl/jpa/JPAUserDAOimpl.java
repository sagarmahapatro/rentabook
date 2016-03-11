package com.rentabook.persistent.daos.impl.jpa;

import com.rentabook.persistent.daos.IuserDAO;

public class JPAUserDAOimpl implements IuserDAO {
	public boolean isAAuthanticUser(String userName,  String password){
		return false;
	}
	public void registerUser(String firstName, String lastName, String email, String password){
		
	}

}
