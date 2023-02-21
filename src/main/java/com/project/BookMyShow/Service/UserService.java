package com.project.BookMyShow.Service;

import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.project.BookMyShow.Model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    public void addUser(UserEntryDto userDto);

    //    method called addUser that takes a single parameter of type UserEntryDto.
//    The method returns void, indicating that it does not return a value.ser(int id);
// this method is used to add a new user to some kind of user database or repository.
//    The UserEntryDto parameter likely contains information about the user that is needed to create
//        a new user record,
//    such as the user's name, email address, and password.
    public UserResponseDto getUser(int id);

//    The code appears to be a Java method signature that defines a
//    public method called getUser that takes a single parameter of type int and
//    returns an instance of UserResponseDto.
//    Based on the method name and parameter type,
//    we can assume that this method is used to retrieve information about a
//    user with a given id from some kind of user database or repository.


}
