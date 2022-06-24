package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014\u00a8\u0006\r"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/JwtAuthorizationFilter;", "Lorg/springframework/security/web/authentication/www/BasicAuthenticationFilter;", "authenticationManager", "Lorg/springframework/security/authentication/AuthenticationManager;", "(Lorg/springframework/security/authentication/AuthenticationManager;)V", "doFilterInternal", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "filterChain", "Ljavax/servlet/FilterChain;", "backend-CarServiceApp"})
public final class JwtAuthorizationFilter extends org.springframework.security.web.authentication.www.BasicAuthenticationFilter {
    
    public JwtAuthorizationFilter(@org.jetbrains.annotations.NotNull()
    org.springframework.security.authentication.AuthenticationManager authenticationManager) {
        super(null);
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @java.lang.Override()
    protected void doFilterInternal(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    javax.servlet.FilterChain filterChain) throws java.io.IOException {
    }
}