package com.employee.crud.service;

import com.employee.crud.data.UserData;
import com.employee.crud.entity.User;



import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private List<User> userData = UserData.userData();

    public List<User> getAllUser() {
        return userData;
    }

    public void addUser(User user) {

        userData.add(user);
    }

}
