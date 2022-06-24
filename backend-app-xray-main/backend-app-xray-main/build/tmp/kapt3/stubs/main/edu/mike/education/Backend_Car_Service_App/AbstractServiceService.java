package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/AbstractServiceService;", "Ledu/mike/education/Backend_Car_Service_App/ServiceService;", "serviceRepository", "Ledu/mike/education/Backend_Car_Service_App/ServiceRepository;", "serviceMapper", "Ledu/mike/education/Backend_Car_Service_App/ServiceMapper;", "(Ledu/mike/education/Backend_Car_Service_App/ServiceRepository;Ledu/mike/education/Backend_Car_Service_App/ServiceMapper;)V", "getServiceMapper", "()Ledu/mike/education/Backend_Car_Service_App/ServiceMapper;", "getServiceRepository", "()Ledu/mike/education/Backend_Car_Service_App/ServiceRepository;", "create", "Ledu/mike/education/Backend_Car_Service_App/ServiceResult;", "serviceInput", "Ledu/mike/education/Backend_Car_Service_App/ServiceInput;", "deleteByDescription", "", "description", "", "deleteById", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
@org.springframework.stereotype.Service()
public class AbstractServiceService implements edu.mike.education.Backend_Car_Service_App.ServiceService {
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.ServiceRepository serviceRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.ServiceMapper serviceMapper = null;
    
    public AbstractServiceService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.ServiceRepository serviceRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.ServiceMapper serviceMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.ServiceRepository getServiceRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.ServiceMapper getServiceMapper() {
        return null;
    }
    
    /**
     * Find all servicex
     * @return a list of services
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> findAll() {
        return null;
    }
    
    /**
     * Get one service by id
     * @param id of the service
     * @return the service found
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.ServiceResult findById(long id) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Save and flush a service entity in the database
     * @param serviceInput
     * @return the service created
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.ServiceResult create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.ServiceInput serviceInput) {
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
    public edu.mike.education.Backend_Car_Service_App.ServiceResult update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.ServiceInput serviceInput) throws java.util.NoSuchElementException {
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
    
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public void deleteByDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String description) throws java.util.NoSuchElementException {
    }
}