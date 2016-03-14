package com.rentabook.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rentabook.dtos.UserInfoDTO;
import com.rentabook.persistent.daos.IuserDAO;
import com.rentabook.services.IUserManagmentService;

@Service("usermanagmentservice")

public class UserManagmentService implements IUserManagmentService {

	@Autowired
	@Qualifier("userDAO")
	IuserDAO userDAO = null;
	
	@Override
	public void registerUser(String firstName, String lastName, String emailID,
			String password) {
		// TODO Auto-generated method stub
		userDAO.registerUser(firstName, lastName, emailID, password);

	}

	@Override
	public UserInfoDTO authonticateUser(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoDTO getUserInfoDTO(String userName, String mailID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAAdminUser(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void unregisterUser(UserInfoDTO userInfoDTO) {
		// TODO Auto-generated method stub

	}

}
