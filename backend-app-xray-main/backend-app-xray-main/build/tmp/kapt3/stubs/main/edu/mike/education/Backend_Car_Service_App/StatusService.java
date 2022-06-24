package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

/**
 * ---STATUS---
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/StatusService;", "", "findAll", "", "Ledu/mike/education/Backend_Car_Service_App/StatusDetails;", "findById", "id", "", "backend-CarServiceApp"})
public abstract interface StatusService {
    
    /**
     * Find all Status
     *
     * @return a list of status
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.StatusDetails> findAll();
    
    /**
     * Get one Status by id
     *
     * @param id of the Status
     * @return the Status found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.StatusDetails findById(long id);
}