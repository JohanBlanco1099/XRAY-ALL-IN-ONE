package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

/**
 * ---Repairs---
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/RepairService;", "", "create", "Ledu/mike/education/Backend_Car_Service_App/RepairResult;", "repairInput", "Ledu/mike/education/Backend_Car_Service_App/RepairInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
public abstract interface RepairService {
    
    /**
     * Find all repair
     * @return a list of repair
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.RepairResult> findAll();
    
    /**
     * Get one repair by id
     * @param id of the repair
     * @return the repair found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.RepairResult findById(long id);
    
    /**
     * Save and flush a repair entity in the database
     * @param repairInput
     * @return the repair created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.RepairResult create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RepairInput repairInput);
    
    /**
     * Update a repair entity in the database
     * @param repairInput the dto input for repair
     * @return the new repair created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.RepairResult update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RepairInput repairInput);
    
    /**
     * Delete a repair by id from Database
     * @param id of the repair
     */
    public abstract void deleteById(long id);
}