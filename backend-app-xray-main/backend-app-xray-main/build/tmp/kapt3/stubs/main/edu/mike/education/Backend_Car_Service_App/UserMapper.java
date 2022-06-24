package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@org.mapstruct.Mapper(imports = {java.time.LocalDateTime.class}, componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001a\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0003H\'J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\u0012"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/UserMapper;", "", "userInputToUser", "Ledu/mike/education/Backend_Car_Service_App/User;", "userInput", "Ledu/mike/education/Backend_Car_Service_App/UserInput;", "", "dto", "user", "userListToUserListResult", "", "Ledu/mike/education/Backend_Car_Service_App/UserResult;", "userList", "userLoginInput", "Ledu/mike/education/Backend_Car_Service_App/UserLoginInput;", "userSignUpInput", "Ledu/mike/education/Backend_Car_Service_App/UserSignUpInput;", "userToUserResult", "backend-CarServiceApp"})
public abstract interface UserMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.UserResult userToUserResult(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.User user);
    
    @org.jetbrains.annotations.NotNull()
    @org.mapstruct.Mapping(target = "createDate", defaultExpression = "java(new java.util.Date())")
    public abstract edu.mike.education.Backend_Car_Service_App.User userInputToUser(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserInput userInput);
    
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    public abstract void userInputToUser(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserInput dto, @org.jetbrains.annotations.NotNull()
    @org.mapstruct.MappingTarget()
    edu.mike.education.Backend_Car_Service_App.User user);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> userListToUserListResult(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.mike.education.Backend_Car_Service_App.User> userList);
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.User userLoginInput(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserLoginInput userLoginInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.User userSignUpInput(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserSignUpInput userSignUpInput);
}