package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J \u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/RestExceptionHandler;", "Lorg/springframework/web/servlet/mvc/method/annotation/ResponseEntityExceptionHandler;", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "buildResponseEntity", "Lorg/springframework/http/ResponseEntity;", "", "apiError", "Ledu/mike/education/Backend_Car_Service_App/ApiError;", "elementNotFound", "ex", "Ljava/lang/Exception;", "request", "Lorg/springframework/web/context/request/WebRequest;", "handleAll", "backend-CarServiceApp"})
@org.springframework.web.bind.annotation.ControllerAdvice()
public class RestExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {
    @org.jetbrains.annotations.NotNull()
    private final org.slf4j.Logger logger = null;
    
    public RestExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public org.springframework.http.ResponseEntity<java.lang.Object> buildResponseEntity(@org.jetbrains.annotations.NotNull()
    edu.mike.education.Backend_Car_Service_App.ApiError apiError) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.util.NoSuchElementException.class})
    public org.springframework.http.ResponseEntity<java.lang.Object> elementNotFound(@org.jetbrains.annotations.NotNull()
    java.lang.Exception ex, @org.jetbrains.annotations.NotNull()
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.lang.Exception.class})
    public org.springframework.http.ResponseEntity<java.lang.Object> handleAll(@org.jetbrains.annotations.NotNull()
    java.lang.Exception ex, @org.jetbrains.annotations.NotNull()
    org.springframework.web.context.request.WebRequest request) {
        return null;
    }
}