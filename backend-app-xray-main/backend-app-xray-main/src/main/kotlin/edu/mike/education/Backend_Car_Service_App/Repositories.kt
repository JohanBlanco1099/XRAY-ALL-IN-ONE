package edu.mike.education.Backend_Car_Service_App

import org.springframework.context.annotation.Description
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface VehicleRepository: JpaRepository<Vehicle, Long>

@Repository
interface UserRepository: JpaRepository<User, Long>{
    fun findByEmail(@Param("email") email: String): Optional<User>
}

@Repository
interface StatusRepository: JpaRepository<Status, Long>

@Repository
interface RoleRepository: JpaRepository<Role,Long>{
    fun findByName(@Param("role") role: String): Optional<Role>
}


@Repository
interface ServiceRepository: JpaRepository<Service,Long> {
    fun findByDescription(@Param("description") description: String): Optional<Service>
    fun deleteByDescription(@Param("description") description: String)
}

@Repository
interface PrivilegeRepository: JpaRepository<Privilege,Long>

@Repository
interface RepairRepository: JpaRepository<Repair,Long>