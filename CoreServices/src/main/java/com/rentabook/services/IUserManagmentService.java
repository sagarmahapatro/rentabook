package com.rentabook.services;

import com.rentabook.dtos.UserInfoDTO;

public interface IUserManagmentService {
  	
   void registerUser(String firstName, String lastName, String emailID, String password);
   boolean authonticateUser(String userName, String password);
   UserInfoDTO getUserInfoDTO(String userName, String mailID);
   boolean isAAdminUser(String mailID);
   boolean isASuperUser(String mailID);
   void unregisterUser(UserInfoDTO userInfoDTO);
}
