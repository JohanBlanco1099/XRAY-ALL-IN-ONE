package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/StatusMapper;", "", "statusListToStatusDetailsList", "", "Ledu/mike/education/Backend_Car_Service_App/StatusDetails;", "statusList", "Ledu/mike/education/Backend_Car_Service_App/Status;", "statusToStatusDetails", "status", "backend-CarServiceApp"})
public abstract interface StatusMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.StatusDetails statusToStatusDetails(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.Status status);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.StatusDetails> statusListToStatusDetailsList(@org.jetbrains.annotations.Nullable()
    java.util.List<edu.mike.education.Backend_Car_Service_App.Status> statusList);
}