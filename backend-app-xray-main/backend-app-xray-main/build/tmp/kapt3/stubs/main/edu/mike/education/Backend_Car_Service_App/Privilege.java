package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0003JH\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018\u00a8\u0006\'"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/Privilege;", "", "id", "", "name", "", "userList", "", "Ledu/mike/education/Backend_Car_Service_App/User;", "roleList", "Ledu/mike/education/Backend_Car_Service_App/Role;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getRoleList", "()Ljava/util/Set;", "setRoleList", "(Ljava/util/Set;)V", "getUserList", "setUserList", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)Ledu/mike/education/Backend_Car_Service_App/Privilege;", "equals", "", "other", "hashCode", "", "toString", "backend-CarServiceApp"})
@javax.persistence.Table(name = "privilege")
@javax.persistence.Entity()
public final class Privilege {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
    @javax.persistence.Id()
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.ManyToMany(mappedBy = "roleList", fetch = javax.persistence.FetchType.LAZY)
    private java.util.Set<edu.mike.education.Backend_Car_Service_App.User> userList;
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.ManyToMany(mappedBy = "privilegeList", fetch = javax.persistence.FetchType.LAZY)
    private java.util.Set<edu.mike.education.Backend_Car_Service_App.Role> roleList;
    
    @org.jetbrains.annotations.NotNull()
    public final edu.mike.education.Backend_Car_Service_App.Privilege copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.Set<edu.mike.education.Backend_Car_Service_App.User> userList, @org.jetbrains.annotations.Nullable()
    java.util.Set<edu.mike.education.Backend_Car_Service_App.Role> roleList) {
        return null;
    }
    
    public Privilege(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.Set<edu.mike.education.Backend_Car_Service_App.User> userList, @org.jetbrains.annotations.Nullable()
    java.util.Set<edu.mike.education.Backend_Car_Service_App.Role> roleList) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<edu.mike.education.Backend_Car_Service_App.User> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<edu.mike.education.Backend_Car_Service_App.User> getUserList() {
        return null;
    }
    
    public final void setUserList(@org.jetbrains.annotations.Nullable()
    java.util.Set<edu.mike.education.Backend_Car_Service_App.User> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<edu.mike.education.Backend_Car_Service_App.Role> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Set<edu.mike.education.Backend_Car_Service_App.Role> getRoleList() {
        return null;
    }
    
    public final void setRoleList(@org.jetbrains.annotations.Nullable()
    java.util.Set<edu.mike.education.Backend_Car_Service_App.Role> p0) {
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
}