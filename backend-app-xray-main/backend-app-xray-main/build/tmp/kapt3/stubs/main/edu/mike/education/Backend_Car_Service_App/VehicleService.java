package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

/**
 * ---VEHICLES---
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/VehicleService;", "", "create", "Ledu/mike/education/Backend_Car_Service_App/VehicleResult;", "vehicleInput", "Ledu/mike/education/Backend_Car_Service_App/VehicleInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
public abstract interface VehicleService {
    
    /**
     * Find all vehicle
     * @return a list of vehicles
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.VehicleResult> findAll();
    
    /**
     * Get one vehicle by id
     * @param id of the vehicle
     * @return the vehicle found
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.VehicleResult findById(long id);
    
    /**
     * Save and flush a vehicle entity in the database
     * @param vehicleInput
     * @return the vehicle created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.VehicleResult create(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.VehicleInput vehicleInput);
    
    /**
     * Update a vehicle entity in the database
     * @param vehicleInput the dto input for vehicle
     * @return the new vehicle created
     */
    @org.jetbrains.annotations.Nullable()
    public abstract edu.mike.education.Backend_Car_Service_App.VehicleResult update(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.VehicleInput vehicleInput);
    
    /**
     * Delete a vehicle by id from Database
     * @param id of the vehicle
     */
    public abstract void deleteById(long id);
}