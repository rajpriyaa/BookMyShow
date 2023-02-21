package com.project.BookMyShow.Converter;

import com.project.BookMyShow.Dto.EntryDto.UserEntryDto;
import com.project.BookMyShow.Dto.ResponseDto.UserResponseDto;
import com.project.BookMyShow.Model.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserConverter {

//    The code appears to be a Java utility class called UserConverter, which provides two static methods for converting between
//    User entity objects and UserEntryDto and UserResponseDto DTOs (Data Transfer Objects).
//    The @UtilityClass annotation at the top of the class indicates that
//    this is a utility class and all the methods in this class should be static.
//    public static User DtoToEntity(UserEntryDto userDto) is a static method
//    that takes a UserEntryDto object and returns a User entity object. It uses the builder pattern to create a new User object with the name and mobNo set from the userDto object.
//    public static UserResponseDto EntityToDto(User user) is a static method
//    that takes a User entity object and returns a UserResponseDto DTO object.

    public static User DtoToEntity(UserEntryDto userDto){
        return User.builder().name(userDto.getName()).mobNo(userDto.getMobNo()).build();
    }

    public static UserResponseDto EntityToDto(User user){
        return UserResponseDto.builder().id(user.getId()).name(user.getName()).mobNo(user.getMobNo()).build();
    }
}
