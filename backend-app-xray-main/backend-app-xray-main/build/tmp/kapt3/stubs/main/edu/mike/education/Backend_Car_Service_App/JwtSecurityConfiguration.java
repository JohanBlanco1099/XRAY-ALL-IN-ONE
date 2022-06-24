package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/JwtSecurityConfiguration;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "()V", "URL_SIGNUP", "", "getURL_SIGNUP", "()Ljava/lang/String;", "URL_UNSECURE", "getURL_UNSECURE", "userDetailsService", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "configure", "", "authenticationManagerBuilder", "Lorg/springframework/security/config/annotation/authentication/builders/AuthenticationManagerBuilder;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "backend-CarServiceApp"})
@org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity(securedEnabled = true)
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@org.springframework.context.annotation.Configuration()
@org.springframework.context.annotation.Profile(value = {"!initlocal"})
public class JwtSecurityConfiguration extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Value(value = "${url.unsecure}")
    private final java.lang.String URL_UNSECURE = null;
    @org.jetbrains.annotations.Nullable()
    @org.springframework.beans.factory.annotation.Value(value = "${url.user.signup}")
    private final java.lang.String URL_SIGNUP = null;
    @javax.annotation.Resource()
    private final org.springframework.security.core.userdetails.UserDetailsService userDetailsService = null;
    
    public JwtSecurityConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getURL_UNSECURE() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getURL_SIGNUP() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {java.security.NoSuchAlgorithmException.class})
    @org.springframework.context.annotation.Bean()
    public org.springframework.security.crypto.password.PasswordEncoder passwordEncoder() throws java.security.NoSuchAlgorithmException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder authenticationManagerBuilder) throws java.lang.Exception {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @java.lang.Override()
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
}