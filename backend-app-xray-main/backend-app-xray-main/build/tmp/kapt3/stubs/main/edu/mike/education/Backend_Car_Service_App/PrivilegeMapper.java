package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/PrivilegeMapper;", "", "privilegeInputToPrivilege", "Ledu/mike/education/Backend_Car_Service_App/Privilege;", "privilegeInput", "Ledu/mike/education/Backend_Car_Service_App/PrivilegeInput;", "privilegeListToPrivilegeDetailsList", "", "Ledu/mike/education/Backend_Car_Service_App/PrivilegeDetails;", "privilegeList", "", "privilegeToPrivilegeDetails", "privilege", "backend-CarServiceApp"})
public abstract interface PrivilegeMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Set<edu.mike.education.Backend_Car_Service_App.PrivilegeDetails> privilegeListToPrivilegeDetailsList(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.mike.education.Backend_Car_Service_App.Privilege> privilegeList);
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.PrivilegeDetails privilegeToPrivilegeDetails(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.Privilege privilege);
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.Privilege privilegeInputToPrivilege(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.PrivilegeInput privilegeInput);
}