package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0003H\'J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/RepairMapper;", "", "repairInputToRepair", "Ledu/mike/education/Backend_Car_Service_App/Repair;", "repairInput", "Ledu/mike/education/Backend_Car_Service_App/RepairInput;", "", "dto", "repair", "repairListToRepairListResult", "", "Ledu/mike/education/Backend_Car_Service_App/RepairResult;", "repairList", "repairToRepairResult", "backend-CarServiceApp"})
public abstract interface RepairMapper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.RepairResult repairToRepairResult(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.Repair repair);
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.mike.education.Backend_Car_Service_App.Repair repairInputToRepair(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RepairInput repairInput);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<edu.mike.education.Backend_Car_Service_App.RepairResult> repairListToRepairListResult(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.mike.education.Backend_Car_Service_App.Repair> repairList);
    
    @org.mapstruct.BeanMapping(nullValuePropertyMappingStrategy = org.mapstruct.NullValuePropertyMappingStrategy.IGNORE)
    public abstract void repairInputToRepair(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.RepairInput dto, @org.jetbrains.annotations.NotNull()
    @org.mapstruct.MappingTarget()
    edu.mike.education.Backend_Car_Service_App.Repair repair);
}