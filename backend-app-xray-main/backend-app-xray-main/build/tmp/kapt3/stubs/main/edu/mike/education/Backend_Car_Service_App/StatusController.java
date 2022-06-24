package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

/**
 * ---STATUS---
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/StatusController;", "", "statusService", "Ledu/mike/education/Backend_Car_Service_App/StatusService;", "(Ledu/mike/education/Backend_Car_Service_App/StatusService;)V", "findAll", "", "Ledu/mike/education/Backend_Car_Service_App/StatusDetails;", "findById", "id", "", "backend-CarServiceApp"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${url.status}"})
@org.springframework.web.bind.annotation.RestController()
public class StatusController {
    private final edu.mike.education.Backend_Car_Service_App.StatusService statusService = null;
    
    public StatusController(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.StatusService statusService) {
        super();
    }
    
    /**
     * WS to find all elements of type status
     * @return A list of elements of type status
     */
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.GetMapping()
    public java.util.List<edu.mike.education.Backend_Car_Service_App.StatusDetails> findAll() {
        return null;
    }
    
    /**
     * WS to find one status by the id
     * @param id to find status
     * @return the status found
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.GetMapping(value = {"{id}"})
    public edu.mike.education.Backend_Car_Service_App.StatusDetails findById(@org.springframework.web.bind.annotation.PathVariable()
    long id) throws java.util.NoSuchElementException {
        return null;
    }
}