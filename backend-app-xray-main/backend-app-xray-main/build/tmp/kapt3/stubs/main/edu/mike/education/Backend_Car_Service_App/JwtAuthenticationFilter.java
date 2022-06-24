package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/JwtAuthenticationFilter;", "Lorg/springframework/security/web/authentication/UsernamePasswordAuthenticationFilter;", "authenticationManager", "Lorg/springframework/security/authentication/AuthenticationManager;", "(Lorg/springframework/security/authentication/AuthenticationManager;)V", "authManager", "loginUrl", "", "getLoginUrl", "()Ljava/lang/Void;", "attemptAuthentication", "Lorg/springframework/security/core/Authentication;", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "successfulAuthentication", "", "filterChain", "Ljavax/servlet/FilterChain;", "authentication", "backend-CarServiceApp"})
public final class JwtAuthenticationFilter extends org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter {
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Value(value = "${url.login}")
    private final java.lang.Void loginUrl = null;
    private final org.springframework.security.authentication.AuthenticationManager authManager = null;
    
    public JwtAuthenticationFilter(@org.jetbrains.annotations.NotNull()
    org.springframework.security.authentication.AuthenticationManager authenticationManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Void getLoginUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {org.springframework.security.core.AuthenticationException.class})
    @java.lang.Override()
    public org.springframework.security.core.Authentication attemptAuthentication(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response) throws org.springframework.security.core.AuthenticationException {
        return null;
    }
    
    @java.lang.Override()
    protected void successfulAuthentication(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain filterChain, @org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication authentication) {
    }
}