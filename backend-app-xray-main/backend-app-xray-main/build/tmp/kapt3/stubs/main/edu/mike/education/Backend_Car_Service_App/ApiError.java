package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/ApiError;", "", "localDateTime", "", "status", "Lorg/springframework/http/HttpStatus;", "message", "debugMessage", "apiSubErrors", "", "Ledu/mike/education/Backend_Car_Service_App/ApiSubError;", "(Ljava/lang/String;Lorg/springframework/http/HttpStatus;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getApiSubErrors", "()Ljava/util/List;", "setApiSubErrors", "(Ljava/util/List;)V", "getDebugMessage", "()Ljava/lang/String;", "getLocalDateTime", "getMessage", "getStatus", "()Lorg/springframework/http/HttpStatus;", "addSubError", "", "apiError", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "backend-CarServiceApp"})
public final class ApiError {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String localDateTime = null;
    @org.jetbrains.annotations.NotNull()
    private final org.springframework.http.HttpStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String debugMessage = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<edu.mike.education.Backend_Car_Service_App.ApiSubError> apiSubErrors;
    
    @org.jetbrains.annotations.NotNull()
    public final edu.mike.education.Backend_Car_Service_App.ApiError copy(@org.jetbrains.annotations.NotNull()
    java.lang.String localDateTime, @org.jetbrains.annotations.NotNull()
    org.springframework.http.HttpStatus status, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String debugMessage, @org.jetbrains.annotations.NotNull()
    java.util.List<edu.mike.education.Backend_Car_Service_App.ApiSubError> apiSubErrors) {
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
    
    public ApiError(@org.jetbrains.annotations.NotNull()
    java.lang.String localDateTime, @org.jetbrains.annotations.NotNull()
    org.springframework.http.HttpStatus status, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String debugMessage, @org.jetbrains.annotations.NotNull()
    java.util.List<edu.mike.education.Backend_Car_Service_App.ApiSubError> apiSubErrors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.http.HttpStatus component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.http.HttpStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDebugMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<edu.mike.education.Backend_Car_Service_App.ApiSubError> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<edu.mike.education.Backend_Car_Service_App.ApiSubError> getApiSubErrors() {
        return null;
    }
    
    public final void setApiSubErrors(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.mike.education.Backend_Car_Service_App.ApiSubError> p0) {
    }
    
    public final void addSubError(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.ApiSubError apiError) {
    }
}