package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/AbstractRepairService;", "Ledu/mike/education/Backend_Car_Service_App/RepairService;", "repairRepository", "Ledu/mike/education/Backend_Car_Service_App/RepairRepository;", "repairMapper", "Ledu/mike/education/Backend_Car_Service_App/RepairMapper;", "(Ledu/mike/education/Backend_Car_Service_App/RepairRepository;Ledu/mike/education/Backend_Car_Service_App/RepairMapper;)V", "getRepairMapper", "()Ledu/mike/education/Backend_Car_Service_App/RepairMapper;", "getRepairRepository", "()Ledu/mike/education/Backend_Car_Service_App/RepairRepository;", "create", "Ledu/mike/education/Backend_Car_Service_App/RepairResult;", "repairInput", "Ledu/mike/education/Backend_Car_Service_App/RepairInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
@org.springframework.stereotype.Service()
public class AbstractRepairService implements edu.mike.education.Backend_Car_Service_App.RepairService {
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.RepairRepository repairRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.RepairMapper repairMapper = null;
    
    public AbstractRepairService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.RepairRepository repairRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.RepairMapper repairMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.RepairRepository getRepairRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.RepairMapper getRepairMapper() {
        return null;
    }
    
    /**
     * Find all repair
     * @return a list of repair
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<edu.mike.education.Backend_Car_Service_App.RepairResult> findAll() {
        return null;
    }
    
    /**
     * Get one repair by id
     * @param id of the repair
     * @return the repair found
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.RepairResult findById(long id) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Save and flush a repair entity in the database
     * @param repairInput
     * @return the repair created
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.RepairResult create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RepairInput repairInput) {
        return null;
    }
    
    /**
     * Update a repair entity in the database
     * @param repairInput the dto input for repair
     * @return the new repair created
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.RepairResult update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RepairInput repairInput) throws java.util.NoSuchElementException {
        return null;
    }
    
    /**
     * Delete a repair by id from Database
     * @param id of the repair
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public void deleteById(long id) throws java.util.NoSuchElementException {
    }
}