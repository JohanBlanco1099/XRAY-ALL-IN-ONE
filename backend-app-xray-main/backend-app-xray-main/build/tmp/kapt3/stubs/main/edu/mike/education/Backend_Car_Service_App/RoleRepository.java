package edu.mike.education.Backend_Car_Service_App;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Ledu/mike/education/Backend_Car_Service_App/RoleRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Ledu/mike/education/Backend_Car_Service_App/Role;", "", "findByName", "Ljava/util/Optional;", "role", "", "backend-CarServiceApp"})
@org.springframework.stereotype.Repository()
public abstract interface RoleRepository extends org.springframework.data.jpa.repository.JpaRepository<edu.mike.education.Backend_Car_Service_App.Role, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<edu.mike.education.Backend_Car_Service_App.Role> findByName(@org.jetbrains.annotations.NotNull()
    @org.springframework.data.repository.query.Param(value = "role")
    java.lang.String role);
}