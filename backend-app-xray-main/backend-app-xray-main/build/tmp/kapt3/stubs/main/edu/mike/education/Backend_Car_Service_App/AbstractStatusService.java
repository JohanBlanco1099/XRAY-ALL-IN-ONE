package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/AbstractStatusService;", "Ledu/mike/education/Backend_Car_Service_App/StatusService;", "statusRepository", "Ledu/mike/education/Backend_Car_Service_App/StatusRepository;", "statusMapper", "Ledu/mike/education/Backend_Car_Service_App/StatusMapper;", "(Ledu/mike/education/Backend_Car_Service_App/StatusRepository;Ledu/mike/education/Backend_Car_Service_App/StatusMapper;)V", "getStatusMapper", "()Ledu/mike/education/Backend_Car_Service_App/StatusMapper;", "getStatusRepository", "()Ledu/mike/education/Backend_Car_Service_App/StatusRepository;", "findAll", "", "Ledu/mike/education/Backend_Car_Service_App/StatusDetails;", "findById", "id", "", "backend-CarServiceApp"})
@org.springframework.stereotype.Service()
public class AbstractStatusService implements edu.mike.education.Backend_Car_Service_App.StatusService {
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.StatusRepository statusRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.StatusMapper statusMapper = null;
    
    public AbstractStatusService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.StatusRepository statusRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.StatusMapper statusMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.StatusRepository getStatusRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.StatusMapper getStatusMapper() {
        return null;
    }
    
    /**
     * Find all Statys
     *
     * @return a list of status
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<edu.mike.education.Backend_Car_Service_App.StatusDetails> findAll() {
        return null;
    }
    
    /**
     * Get one Status by id
     *
     * @param id of the status
     * @return the status found
     */
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.util.NoSuchElementException.class})
    @java.lang.Override()
    public edu.mike.education.Backend_Car_Service_App.StatusDetails findById(long id) throws java.util.NoSuchElementException {
        return null;
    }
}