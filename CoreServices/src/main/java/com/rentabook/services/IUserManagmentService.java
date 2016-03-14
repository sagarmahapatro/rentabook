package com.rentabook.services;

import com.rentabook.dtos.UserInfoDTO;

public interface IUserManagmentService {
   void registerUser(String firstName, String lastName, String emailID, String password);
   UserInfoDTO authonticateUser(String userName, String password);
   UserInfoDTO getUserInfoDTO(String userName, String mailID);
   boolean isAAdminUser(UserInfoDTO userInfoDTO);
   void unregisterUser(UserInfoDTO userInfoDTO);
}
