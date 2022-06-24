package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/RoleService;", "", "create", "Ledu/mike/education/Backend_Car_Service_App/RoleDetails;", "roleInput", "Ledu/mike/education/Backend_Car_Service_App/RoleInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
public abstract interface RoleService {
    
    /**
     * Find all Roles
     * @return a list of roles
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.Set<edu.mike.education.Backend_Car_Service_App.RoleDetails> findAll();
    
    /**
     * Get one role by id
     * @param id of the role
     * @return the role found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.RoleDetails findById(long id);
    
    /**
     * Save and flush a role entity in the database
     * @param roleInput
     * @return the role created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.RoleDetails create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RoleInput roleInput);
    
    /**
     * Update a role entity in the database
     * @param roleInput the dto input for role
     * @return the new role created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.RoleDetails update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RoleInput roleInput);
    
    /**
     * Delete a role by id from Database
     * @param id of the role
     */
    public abstract void deleteById(long id);
}