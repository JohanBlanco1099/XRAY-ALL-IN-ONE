package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

/**
 * ---SERVICES---
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH\u0017J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/ServiceController;", "", "serviceService", "Ledu/mike/education/Backend_Car_Service_App/ServiceService;", "(Ledu/mike/education/Backend_Car_Service_App/ServiceService;)V", "create", "Ledu/mike/education/Backend_Car_Service_App/ServiceResult;", "serviceInput", "Ledu/mike/education/Backend_Car_Service_App/ServiceInput;", "deleteById", "", "id", "", "findAll", "", "findById", "update", "backend-CarServiceApp"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"${url.services}"})
@org.springframework.web.bind.annotation.RestController()
public class ServiceController {
    private final edu.mike.education.Backend_Car_Service_App.ServiceService serviceService = null;
    
    public ServiceController(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.ServiceService serviceService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.GetMapping()
    public java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.GetMapping(value = {"{id}"})
    public edu.mike.education.Backend_Car_Service_App.ServiceResult findById(@org.springframework.web.bind.annotation.PathVariable()
    long id) throws java.util.NoSuchElementException {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PostMapping(consumes = {"application/json"}, produces = {"application/json"})
    public edu.mike.education.Backend_Car_Service_App.ServiceResult create(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    edu.mike.education.Backend_Car_Service_App.ServiceInput serviceInput) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.PutMapping(consumes = {"application/json"}, produces = {"application/json"})
    public edu.mike.education.Backend_Car_Service_App.ServiceResult update(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    edu.mike.education.Backend_Car_Service_App.ServiceInput serviceInput) throws java.util.NoSuchElementException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @org.springframework.web.bind.annotation.ResponseBody()
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"{id}"})
    public void deleteById(@org.springframework.web.bind.annotation.PathVariable()
    long id) throws java.util.NoSuchElementException {
    }
}