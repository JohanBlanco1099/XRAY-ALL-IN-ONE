package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0012J \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0016H\u0012J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00162\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0012J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/AppUserDetailsService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "userRepository", "Ledu/mike/education/Backend_Car_Service_App/UserRepository;", "roleRepository", "Ledu/mike/education/Backend_Car_Service_App/RoleRepository;", "roleMapper", "Ledu/mike/education/Backend_Car_Service_App/RoleMapper;", "(Ledu/mike/education/Backend_Car_Service_App/UserRepository;Ledu/mike/education/Backend_Car_Service_App/RoleRepository;Ledu/mike/education/Backend_Car_Service_App/RoleMapper;)V", "getRoleMapper", "()Ledu/mike/education/Backend_Car_Service_App/RoleMapper;", "getRoleRepository", "()Ledu/mike/education/Backend_Car_Service_App/RoleRepository;", "getUserRepository", "()Ledu/mike/education/Backend_Car_Service_App/UserRepository;", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "roles", "", "Ledu/mike/education/Backend_Car_Service_App/Role;", "getGrantedAuthorities", "", "privileges", "", "getPrivileges", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "backend-CarServiceApp"})
@org.springframework.transaction.annotation.Transactional()
@org.springframework.stereotype.Service()
public class AppUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.RoleRepository roleRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final edu.mike.education.Backend_Car_Service_App.RoleMapper roleMapper = null;
    
    public AppUserDetailsService(@org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.RoleRepository roleRepository, @org.jetbrains.annotations.NotNull()
    @org.springframework.beans.factory.annotation.Autowired()
    edu.mike.education.Backend_Car_Service_App.RoleMapper roleMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.UserRepository getUserRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.RoleRepository getRoleRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public edu.mike.education.Backend_Car_Service_App.RoleMapper getRoleMapper() {
        return null;
    }
    
    /**
     * Locates the user based on the username. In the actual implementation, the search
     * may possibly be case sensitive, or case insensitive depending on how the
     * implementation instance is configured. In this case, the `UserDetails`
     * object that comes back may have a username that is of a different case than what
     * was actually requested..
     * @param username the username identifying the user whose data is required.
     * @return a fully populated user record (never `null`)
     * @throws UsernameNotFoundException if the user could not be found or the user has no
     * GrantedAuthority
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Throws(exceptionClasses = {org.springframework.security.core.userdetails.UsernameNotFoundException.class})
    @java.lang.Override()
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
        return null;
    }
    
    private java.util.Collection<org.springframework.security.core.GrantedAuthority> getAuthorities(java.util.List<edu.mike.education.Backend_Car_Service_App.Role> roles) {
        return null;
    }
    
    private java.util.List<java.lang.String> getPrivileges(java.util.List<edu.mike.education.Backend_Car_Service_App.Role> roles) {
        return null;
    }
    
    private java.util.List<org.springframework.security.core.GrantedAuthority> getGrantedAuthorities(java.util.List<java.lang.String> privileges) {
        return null;
    }
}