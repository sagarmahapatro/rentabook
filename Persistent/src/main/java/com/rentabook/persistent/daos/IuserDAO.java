package com.rentabook.persistent.daos;

public interface IuserDAO {

	public boolean isAAuthanticUser(String userName,  String password);
	void registerUser(String firstName, String lastName, String email, String password);
}
