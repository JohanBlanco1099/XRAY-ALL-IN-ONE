package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

/**
 * ---Users---
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/UserService;", "", "create", "Ledu/mike/education/Backend_Car_Service_App/UserResult;", "userInput", "Ledu/mike/education/Backend_Car_Service_App/UserInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
public abstract interface UserService {
    
    /**
     * Find all user
     * @return a list of users
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> findAll();
    
    /**
     * Get one user by id
     * @param id of the user
     * @return the user found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.UserResult findById(long id);
    
    /**
     * Save and flush a user entity in the database
     * @param userInput
     * @return the user created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.UserResult create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserInput userInput);
    
    /**
     * Update a user entity in the database
     * @param userInput the dto input for user
     * @return the new user created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.UserResult update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.UserInput userInput);
    
    /**
     * Delete a user by id from Database
     * @param id of the user
     */
    public abstract void deleteById(long id);
}