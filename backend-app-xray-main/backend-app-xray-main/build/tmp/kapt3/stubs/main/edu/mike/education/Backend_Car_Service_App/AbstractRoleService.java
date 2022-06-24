package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/AbstractRoleService;", "Ledu/mike/education/Backend_Car_Service_App/RoleService;", "roleRepository", "Ledu/mike/education/Backend_Car_Service_App/RoleRepository;", "roleMapper", "Ledu/mike/education/Backend_Car_Service_App/RoleMapper;", "(Ledu/mike/education/Backend_Car_Service_App/RoleRepository;Ledu/mike/education/Backend_Car_Service_App/RoleMapper;)V", "getRoleMapper", "()Ledu/mike/education/Backend_Car_Service_App/RoleMapper;", "getRoleRepository", "()Ledu/mike/education/Backend_Car_Service_App/RoleRepository;", "create", "Ledu/mike/education/Backend_Car_Service_App/RoleDetails;", "roleInput", "Ledu/mike/education/Backend_Car_Service_App/RoleInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
@org.springframework.stereotype.Service()
public class AbstractRoleService implements edu.mike.education.Backend_Car_Service_App.RoleService {
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.RoleRepository roleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.RoleMapper roleMapper = null;
    
    public AbstractRoleService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.RoleRepository roleRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.RoleMapper roleMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.RoleRepository getRoleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.RoleMapper getRoleMapper() {
        return null;
    }
    
    /**
     * Find all roles
     * @return a list of roles
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Set<edu.mike.education.Backend_Car_Service_App.RoleDetails> findAll() {
        return null;
    }
    
    /**
     * Get one role by id
     * @param id of the role
     * @return the role found x
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.RoleDetails findById(long id) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Save and flush a role entity in the database
     * @param roleInput
     * @return the role created
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.RoleDetails create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RoleInput roleInput) {
        return null;
    }
    
    /**
     * Update a role entity in the database
     * @param userInput the dto input for role
     * @return the new role created
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.RoleDetails update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RoleInput roleInput) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Delete a service by id from Database
     * @param id of the user
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public void deleteById(long id) throws java.util.NoSuchElementException {
    }
}