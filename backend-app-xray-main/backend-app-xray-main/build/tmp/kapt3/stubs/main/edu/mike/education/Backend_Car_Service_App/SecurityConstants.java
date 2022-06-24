package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/SecurityConstants;", "", "()V", "APPLICATION_JSON", "", "TOKEN_AUDIENCE", "TOKEN_ISSUER", "TOKEN_LIFETIME", "", "TOKEN_PREFIX", "TOKEN_SECRET", "getTOKEN_SECRET", "()Ljava/lang/String;", "TOKEN_TYPE", "UTF_8", "backend-CarServiceApp"})
public final class SecurityConstants {
    @org.jetbrains.annotations.NotNull()
    public static final edu.mike.education.Backend_Car_Service_App.SecurityConstants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_TYPE = "JWT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_ISSUER = "secure-api";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_AUDIENCE = "secure-app";
    public static final long TOKEN_LIFETIME = 864000000L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_PREFIX = "Bearer ";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String APPLICATION_JSON = "application/json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UTF_8 = "UTF-8";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TOKEN_SECRET = null;
    
    private SecurityConstants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTOKEN_SECRET() {
        return null;
    }
}