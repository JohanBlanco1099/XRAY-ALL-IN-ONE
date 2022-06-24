package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/AbstractPrivilegeService;", "Ledu/mike/education/Backend_Car_Service_App/PrivilegeService;", "privilegeRepository", "Ledu/mike/education/Backend_Car_Service_App/PrivilegeRepository;", "privilegeMapper", "Ledu/mike/education/Backend_Car_Service_App/PrivilegeMapper;", "(Ledu/mike/education/Backend_Car_Service_App/PrivilegeRepository;Ledu/mike/education/Backend_Car_Service_App/PrivilegeMapper;)V", "getPrivilegeMapper", "()Ledu/mike/education/Backend_Car_Service_App/PrivilegeMapper;", "getPrivilegeRepository", "()Ledu/mike/education/Backend_Car_Service_App/PrivilegeRepository;", "create", "Ledu/mike/education/Backend_Car_Service_App/PrivilegeDetails;", "privilegeInput", "Ledu/mike/education/Backend_Car_Service_App/PrivilegeInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
@org.springframework.stereotype.Service()
public class AbstractPrivilegeService implements edu.mike.education.Backend_Car_Service_App.PrivilegeService {
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.PrivilegeRepository privilegeRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.PrivilegeMapper privilegeMapper = null;
    
    public AbstractPrivilegeService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.PrivilegeRepository privilegeRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.PrivilegeMapper privilegeMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.PrivilegeRepository getPrivilegeRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.PrivilegeMapper getPrivilegeMapper() {
        return null;
    }
    
    /**
     * Find all Privileges
     * @return a list of privileges
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.Set<edu.mike.education.Backend_Car_Service_App.PrivilegeDetails> findAll() {
        return null;
    }
    
    /**
     * Get one privilege by id
     * @param id of the privilege
     * @return the privilege found x
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.PrivilegeDetails findById(long id) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Save and flush a privilege entity in the database
     * @param privilegeInput
     * @return the privilege created
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.PrivilegeDetails create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.PrivilegeInput privilegeInput) {
        return null;
    }
    
    /**
     * Update a privilege entity in the database
     * @param privilegeInput the dto input for privilege
     * @return the new privilege created
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.PrivilegeDetails update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.PrivilegeInput privilegeInput) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Delete a privilege by id from Database
     * @param id of the privilege
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public void deleteById(long id) throws java.util.NoSuchElementException {
    }
}