package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0011"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/ServiceService;", "", "create", "Ledu/mike/education/Backend_Car_Service_App/ServiceResult;", "serviceInput", "Ledu/mike/education/Backend_Car_Service_App/ServiceInput;", "deleteByDescription", "", "description", "", "deleteById", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
public abstract interface ServiceService {
    
    /**
     * Find all Services
     * @return a list of services
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> findAll();
    
    /**
     * Get one service by id
     * @param id of the service
     * @return the service found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.ServiceResult findById(long id);
    
    /**
     * Save and flush a service entity in the database
     * @param serviceInput
     * @return the service created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.ServiceResult create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.ServiceInput serviceInput);
    
    /**
     * Update a service entity in the database
     * @param serviceInput the dto input for service
     * @return the new service created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.ServiceResult update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.ServiceInput serviceInput);
    
    /**
     * Delete a service by id from Database
     * @param id of the service
     */
    public abstract void deleteById(long id);
    
    public abstract void deleteByDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String description);
}