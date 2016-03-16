package com.rentabook.services.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rentabook.dtos.UserInfoDTO;
import com.rentabook.persistent.daos.IuserDAO;
import com.rentabook.services.IUserManagmentService;


@Service("usermanagmentservice")
@Transactional
public class UserManagmentService implements IUserManagmentService {

	private static final Logger logger = Logger.getLogger(UserManagmentService.class);
	
	@Autowired
	@Qualifier("userDAO")
	IuserDAO userDAO = null;
	
	@Override
	public void registerUser(String firstName, String lastName, String emailID,
			String password) {
		logger.debug(" registerUser has been called");
		logger.debug(" params firstName "+firstName);
		logger.debug(" params lastName "+lastName);
		logger.debug(" params emailID "+emailID);
		logger.debug(" params password "+password);
		// TODO Auto-generated method stub
		userDAO.registerUser(firstName, lastName, emailID, password);

	}

	@Override
	public boolean authonticateUser(String userName, String password) {
		// TODO Auto-generated method stub
		return userDAO.isAAuthanticUser(userName, password);
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
