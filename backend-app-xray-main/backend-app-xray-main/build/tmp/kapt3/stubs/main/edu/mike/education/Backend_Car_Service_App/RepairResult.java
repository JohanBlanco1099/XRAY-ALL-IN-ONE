package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u00a2\u0006\u0002\u0010\rJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tH\u00c6\u0003JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020,H\u00d6\u0001J\t\u0010-\u001a\u00020.H\u00d6\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006/"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/RepairResult;", "", "id", "", "vehicle", "Ledu/mike/education/Backend_Car_Service_App/VehicleResult;", "status", "Ledu/mike/education/Backend_Car_Service_App/StatusDetails;", "userList", "", "Ledu/mike/education/Backend_Car_Service_App/UserResult;", "serviceList", "Ledu/mike/education/Backend_Car_Service_App/ServiceResult;", "(Ljava/lang/Long;Ledu/mike/education/Backend_Car_Service_App/VehicleResult;Ledu/mike/education/Backend_Car_Service_App/StatusDetails;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getServiceList", "()Ljava/util/List;", "setServiceList", "(Ljava/util/List;)V", "getStatus", "()Ledu/mike/education/Backend_Car_Service_App/StatusDetails;", "setStatus", "(Ledu/mike/education/Backend_Car_Service_App/StatusDetails;)V", "getUserList", "setUserList", "getVehicle", "()Ledu/mike/education/Backend_Car_Service_App/VehicleResult;", "setVehicle", "(Ledu/mike/education/Backend_Car_Service_App/VehicleResult;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ledu/mike/education/Backend_Car_Service_App/VehicleResult;Ledu/mike/education/Backend_Car_Service_App/StatusDetails;Ljava/util/List;Ljava/util/List;)Ledu/mike/education/Backend_Car_Service_App/RepairResult;", "equals", "", "other", "hashCode", "", "toString", "", "backend-CarServiceApp"})
public final class RepairResult {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    private edu.mike.education.Backend_Car_Service_App.VehicleResult vehicle;
    @org.jetbrains.annotations.Nullable()
    private edu.mike.education.Backend_Car_Service_App.StatusDetails status;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> userList;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> serviceList;
    
    @org.jetbrains.annotations.NotNull()
    public final edu.mike.education.Backend_Car_Service_App.RepairResult copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    edu.mike.education.Backend_Car_Service_App.VehicleResult vehicle, @org.jetbrains.annotations.Nullable()
    edu.mike.education.Backend_Car_Service_App.StatusDetails status, @org.jetbrains.annotations.Nullable()
    java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> userList, @org.jetbrains.annotations.Nullable()
    java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> serviceList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RepairResult() {
        super();
    }
    
    public RepairResult(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    edu.mike.education.Backend_Car_Service_App.VehicleResult vehicle, @org.jetbrains.annotations.Nullable()
    edu.mike.education.Backend_Car_Service_App.StatusDetails status, @org.jetbrains.annotations.Nullable()
    java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> userList, @org.jetbrains.annotations.Nullable()
    java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> serviceList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final edu.mike.education.Backend_Car_Service_App.VehicleResult component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final edu.mike.education.Backend_Car_Service_App.VehicleResult getVehicle() {
        return null;
    }
    
    public final void setVehicle(@org.jetbrains.annotations.Nullable()
    edu.mike.education.Backend_Car_Service_App.VehicleResult p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final edu.mike.education.Backend_Car_Service_App.StatusDetails component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final edu.mike.education.Backend_Car_Service_App.StatusDetails getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    edu.mike.education.Backend_Car_Service_App.StatusDetails p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> getUserList() {
        return null;
    }
    
    public final void setUserList(@org.jetbrains.annotations.Nullable()
    java.util.List<edu.mike.education.Backend_Car_Service_App.UserResult> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> getServiceList() {
        return null;
    }
    
    public final void setServiceList(@org.jetbrains.annotations.Nullable()
    java.util.List<edu.mike.education.Backend_Car_Service_App.ServiceResult> p0) {
    }
}