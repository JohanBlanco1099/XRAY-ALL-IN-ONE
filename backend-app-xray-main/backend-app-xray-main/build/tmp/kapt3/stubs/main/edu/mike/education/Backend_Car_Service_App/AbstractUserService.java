package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/AbstractUserService;", "Ledu/mike/education/Backend_Car_Service_App/UserService;", "userRepository", "Ledu/mike/education/Backend_Car_Service_App/UserRepository;", "userMapper", "Ledu/mike/education/Backend_Car_Service_App/UserMapper;", "(Ledu/mike/education/Backend_Car_Service_App/UserRepository;Ledu/mike/education/Backend_Car_Service_App/UserMapper;)V", "getUserMapper", "()Ledu/mike/education/Backend_Car_Service_App/UserMapper;", "getUserRepository", "()Ledu/mike/education/Backend_Car_Service_App/UserRepository;", "create", "Ledu/mike/education/Backend_Car_Service_App/UserResult;", "userInput", "Ledu/mike/education/Backend_Car_Service_App/UserInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
@org.springframework.stereotype.Service()
public class AbstractUserService implements edu.mike.education.Backend_Car_Service_App.UserService {
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.UserMapper userMapper = null;
    
    public AbstractUserService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.UserMapper userMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.UserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.UserMapper getUserMapper() {
        return null;
    }
    
    /**
     * Find all users
     * @return a list of users
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> findAll() {
        return null;
    }
    
    /**
     * Get one user by id
     * @param id of the user
     * @return the user found
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.UserResult findById(long id) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Save and flush a user entity in the database
     * @param userInput
     * @return the user created
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.UserResult create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserInput userInput) {
        return null;
    }
    
    /**
     * Update a user entity in the database
     * @param userInput the dto input for user
     * @return the new user created
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.UserResult update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserInput userInput) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Delete a user by id from Database
     * @param id of the user
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public void deleteById(long id) throws java.util.NoSuchElementException {
    }
}