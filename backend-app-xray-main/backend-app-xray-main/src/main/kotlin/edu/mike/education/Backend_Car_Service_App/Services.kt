package edu.mike.education.Backend_Car_Service_App

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import kotlin.NoSuchElementException


/**                          ---STATUS---                    **/
interface StatusService {
    /**
     * Find all Status
     *
     * @return a list of status
     */
    fun findAll(): List<StatusDetails>?

    /**
     * Get one Status by id
     *
     * @param id of the Status
     * @return the Status found
     */
    fun findById(id: Long): StatusDetails?
}

@Service
class AbstractStatusService(
    @Autowired
    val statusRepository: StatusRepository,

    @Autowired
    val statusMapper: StatusMapper,

    ) : StatusService {
    /**
     * Find all Statys
     *
     * @return a list of status
     */
    override fun findAll(): List<StatusDetails>? {
        return statusMapper.statusListToStatusDetailsList(
            statusRepository.findAll()
        )
    }

    /**
     * Get one Status by id
     *
     * @param id of the status
     * @return the status found
     */
    @Throws(NoSuchElementException::class)
    override fun findById(id: Long): StatusDetails? {
        val status: Status = statusRepository.findById(id).orElse(null)
            ?: throw NoSuchElementException(String.format("The Status with the id: %s not found!", id))
        return statusMapper.statusToStatusDetails(status)
    }
}

/**                           ---VEHICLES---                    **/

interface VehicleService {
    /**
     * Find all vehicle
     * @return a list of vehicles
     */
    fun findAll(): List<VehicleResult>?

    /**
     * Get one vehicle by id
     * @param id of the vehicle
     * @return the vehicle found
     */
    fun findById(id: Long): VehicleResult?

    /**
     * Save and flush a vehicle entity in the database
     * @param vehicleInput
     * @return the vehicle created
     */
    fun create(vehicleInput: VehicleInput): VehicleResult?

    /**
     * Update a vehicle entity in the database
     * @param vehicleInput the dto input for vehicle
     * @return the new vehicle created
     */
    fun update(vehicleInput: VehicleInput): VehicleResult?

    /**
     * Delete a vehicle by id from Database
     * @param id of the vehicle
     */
    fun deleteById(id: Long)
}

@Service
class AbstractVehicleService(

    @Autowired
    val vehicleRepository: VehicleRepository,

    @Autowired
    val vehicleMapper: VehicleMapper ,
) : VehicleService {
    /**
     * Find all vehicule
     * @return a list of vehicule
     */
    override fun findAll(): List<VehicleResult>? {
        return vehicleMapper.vehicleListToVehicleListResult(
            vehicleRepository.findAll()
        )
    }

    /**
     * Get one vehicule by id
     * @param id of the vehicle
     * @return the vehicle found
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun findById(id: Long): VehicleResult? {
        val vehicle: Vehicle = vehicleRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The vehicle with the id: %s not found!", id))
        return vehicleMapper.vehicleToVehicleResult(vehicle)
    }

    /**
     * Save and flush a vehicle entity in the database
     * @param vehicleInput
     * @return the vehicle created
     */
    override fun create(vehicleInput: VehicleInput): VehicleResult? {
        val vehicle: Vehicle = vehicleMapper.vehicleInputToVehicle(vehicleInput)
        return vehicleMapper.vehicleToVehicleResult(
            vehicleRepository.save(vehicle)
        )
    }

    /**
     * Update a vehicle entity in the database
     * @param vehicleInput the dto input for Vehicle
     * @return the new vehicle created
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun update(vehicleInput: VehicleInput): VehicleResult? {
        val vehicle: Vehicle = vehicleRepository.findById(vehicleInput.id!!).orElse(null)
            ?: throw java.util.NoSuchElementException(
                String.format(
                    "The Vehicle with the id: %s not found!",
                    vehicleInput.id
                )
            )
        val vehicleUpdate: Vehicle = vehicle
        vehicleMapper.vehicleInputToVehicle(vehicleInput, vehicleUpdate)
        return vehicleMapper.vehicleToVehicleResult(vehicleRepository.save(vehicleUpdate))
    }

    /**
     * Delete a vehicle by id from Database
     * @param id of the Vehicle
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun deleteById(id: Long) {
        vehicleRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The Vehicle with the id: %s not found!", id))
        vehicleRepository.deleteById(id)
    }

}

/**                           ---Users---                    **/
interface UserService {
    /**
     * Find all user
     * @return a list of users
     */
    fun findAll(): List<UserResult>?

    /**
     * Get one user by id
     * @param id of the user
     * @return the user found
     */
    fun findById(id: Long): UserResult?

    /**
     * Get one user by id
     * @param email of the user
     * @return the user found
     */
    fun findByEmail(email: String): UserResult?

    /**
     * Save and flush a user entity in the database
     * @param userInput
     * @return the user created
     */
    fun create(userInput: UserInput): UserResult?

    /**
     * Update a user entity in the database
     * @param userInput the dto input for user
     * @return the new user created
     */
    fun update(userInput: UserInput): UserResult?

    /**
     * Delete a user by id from Database
     * @param id of the user
     */
    fun deleteById(id: Long)
}

@Service
class AbstractUserService(
    @Autowired
    val userRepository: UserRepository,
    @Autowired
    val userMapper: UserMapper ,
) : UserService {
    /**
     * Find all users
     * @return a list of users
     */
    override fun findAll(): List<UserResult>? {
        return userMapper.userListToUserListResult(
            userRepository.findAll()
        )
    }

    /**
     * Get one user by id
     * @param id of the user
     * @return the user found
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun findById(id: Long): UserResult? {
        val user : User  = userRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The user with the id: %s not found!", id))
        return userMapper.userToUserResult(user)
    }

    /**
     * Get one user by id
     * @param email of the user
     * @return the user found
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun findByEmail(email: String): UserResult? {
        val user : User  = userRepository.findByEmail(email).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The user with the email: %s not found!", email))
        return userMapper.userToUserResult(user)
    }

    /**
     * Save and flush a user entity in the database
     * @param userInput
     * @return the user created
     */
    override fun create(userInput: UserInput): UserResult? {
        val user:User = userMapper.userInputToUser(userInput)
        return userMapper.userToUserResult(
            userRepository.save(user)
        )
    }

    /**
     * Update a user entity in the database
     * @param userInput the dto input for user
     * @return the new user created
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun update(userInput: UserInput): UserResult? {
        val user:User = userRepository.findById(userInput.id!!).orElse(null)
            ?: throw java.util.NoSuchElementException(
                String.format(
                    "The user with the id: %s not found!",
                    userInput.id
                )
            )
        val userUpdate: User = user
        userMapper.userInputToUser(userInput, userUpdate)
        return userMapper.userToUserResult(userRepository.save(userUpdate))
    }

    /**
     * Delete a user by id from Database
     * @param id of the user
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun deleteById(id: Long) {
        userRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The user with the id: %s not found!", id))
        userRepository.deleteById(id)
    }

}

interface ServiceService {
    /**
     * Find all Services
     * @return a list of services
     */
    fun findAll(): List<ServiceResult>?

    /**
     * Get one service by id
     * @param id of the service
     * @return the service found
     */
    fun findById(id: Long): ServiceResult?

    /**
     * Save and flush a service entity in the database
     * @param serviceInput
     * @return the service created
     */
    fun create(serviceInput: ServiceInput): ServiceResult?

    /**
     * Update a service entity in the database
     * @param serviceInput the dto input for service
     * @return the new service created
     */
    fun update(serviceInput: ServiceInput): ServiceResult?

    /**
     * Delete a service by id from Database
     * @param id of the service
     */
    fun deleteById(id: Long)

    fun deleteByDescription(description: String)
}

@Service
class AbstractServiceService(
    @Autowired
    val serviceRepository: ServiceRepository,
    @Autowired
    val serviceMapper: ServiceMapper,
) : ServiceService {
    /**
     * Find all servicex
     * @return a list of services
     */
    override fun findAll(): List<ServiceResult>? {
        return serviceMapper.serviceListToServiceListResult(
            serviceRepository.findAll()
        )
    }

    /**
     * Get one service by id
     * @param id of the service
     * @return the service found
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun findById(id: Long): ServiceResult? {
        val service : edu.mike.education.Backend_Car_Service_App.Service  = serviceRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The service with the id: %s not found!", id))
        return serviceMapper.serviceToServiceResult(service)
    }

    /**
     * Save and flush a service entity in the database
     * @param serviceInput
     * @return the service created
     */
    override fun create(serviceInput: ServiceInput): ServiceResult?{
        val service:edu.mike.education.Backend_Car_Service_App.Service = serviceMapper.serviceInputToService(serviceInput)
        return serviceMapper.serviceToServiceResult(
            serviceRepository.save(service)
        )
    }

    /**
     * Update a user entity in the database
     * @param userInput the dto input for user
     * @return the new user created
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun update(serviceInput: ServiceInput): ServiceResult? {
        val service:edu.mike.education.Backend_Car_Service_App.Service = serviceRepository.findById(serviceInput.id!!).orElse(null)
            ?: throw java.util.NoSuchElementException(
                String.format(
                    "The service with the id: %s not found!",
                    serviceInput.id
                )
            )
        val serviceUpdate: edu.mike.education.Backend_Car_Service_App.Service = service
        serviceMapper.serviceInputToService(serviceInput, serviceUpdate)
        return serviceMapper.serviceToServiceResult(serviceRepository.save(serviceUpdate))
    }

    /**
     * Delete a service by id from Database
     * @param id of the user
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun deleteById(id: Long) {
        serviceRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The service with the id: %s not found!", id))
        serviceRepository.deleteById(id)
    }

    //TODO: Falta agregar el eliminar por descripcion en el repositorio de servicio
    @Throws(java.util.NoSuchElementException::class)
    override fun deleteByDescription(description: String) {
        serviceRepository.findByDescription(description).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The service with the description: %s not found!", description))
        serviceRepository.deleteByDescription(description)
    }


}

interface RoleService {
    /**
     * Find all Roles
     * @return a list of roles
     */
    fun findAll(): Set<RoleDetails>?

    /**
     * Get one role by id
     * @param id of the role
     * @return the role found
     */
    fun findById(id: Long): RoleDetails?

    /**
     * Save and flush a role entity in the database
     * @param roleInput
     * @return the role created
     */
    fun create(roleInput: RoleInput): RoleDetails?

    /**
     * Update a role entity in the database
     * @param roleInput the dto input for role
     * @return the new role created
     */
    fun update(roleInput: RoleInput): RoleDetails?

    /**
     * Delete a role by id from Database
     * @param id of the role
     */
    fun deleteById(id: Long)

}

@Service
class AbstractRoleService(
    @Autowired
    val roleRepository: RoleRepository,
    @Autowired
    val roleMapper: RoleMapper,
) : RoleService {
    /**
     * Find all roles
     * @return a list of roles
     */
    override fun findAll(): Set<RoleDetails>? {
        return roleMapper.roleListToRoleDetailsList(
            roleRepository.findAll()
        )
    }

    /**
     * Get one role by id
     * @param id of the role
     * @return the role found x
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun findById(id: Long): RoleDetails? {
        val role : Role  = roleRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The role with the id: %s not found!", id))
        return roleMapper.roleToRoleDetails(role)
    }

    /**
     * Save and flush a role entity in the database
     * @param roleInput
     * @return the role created
     */
    override fun create(roleInput: RoleInput): RoleDetails?{
        val role:Role = roleMapper.roleInputToRole(roleInput)
        return roleMapper.roleToRoleDetails(
            roleRepository.save(role)
        )
    }

    /**
     * Update a role entity in the database
     * @param userInput the dto input for role
     * @return the new role created
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun update(roleInput: RoleInput): RoleDetails? {
        val role:Role = roleRepository.findById(roleInput.id!!).orElse(null)
            ?: throw java.util.NoSuchElementException(
                String.format(
                    "The role with the id: %s not found!",
                    roleInput.id
                )
            )
        val roleUpdate: Role = role
        roleMapper.roleInputToRole(roleInput)
        return roleMapper.roleToRoleDetails(roleRepository.save(roleUpdate))
    }

    /**
     * Delete a service by id from Database
     * @param id of the user
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun deleteById(id: Long) {
        roleRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The role with the id: %s not found!", id))
        roleRepository.deleteById(id)
    }




}
interface PrivilegeService {
    /**
     * Find all Privileges
     * @return a list of privileges
     */
    fun findAll(): Set<PrivilegeDetails>?

    /**
     * Get one role by id
     * @param id of the role
     * @return the role found
     */
    fun findById(id: Long): PrivilegeDetails?

    /**
     * Save and flush a privilege entity in the database
     * @param privilegeInput
     * @return the privilege created
     */
    fun create(privilegeInput: PrivilegeInput): PrivilegeDetails?

    /**
     * Update a privilege entity in the database
     * @param privilegeInput the dto input for role
     * @return the new privilege created
     */
    fun update(privilegeInput: PrivilegeInput): PrivilegeDetails?

    /**
     * Delete a privilege by id from Database
     * @param id of the privilege
     */
    fun deleteById(id: Long)

}
@Service
class AbstractPrivilegeService(
    @Autowired
    val privilegeRepository: PrivilegeRepository,
    @Autowired
    val privilegeMapper: PrivilegeMapper,
) : PrivilegeService {
    /**
     * Find all Privileges
     * @return a list of privileges
     */
    override fun findAll(): Set<PrivilegeDetails>? {
        return privilegeMapper.privilegeListToPrivilegeDetailsList(
            privilegeRepository.findAll()
        )
    }

    /**
     * Get one privilege by id
     * @param id of the privilege
     * @return the privilege found x
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun findById(id: Long): PrivilegeDetails? {
        val privilege: Privilege  = privilegeRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The role with the id: %s not found!", id))
        return privilegeMapper.privilegeToPrivilegeDetails(privilege)
    }

    /**
     * Save and flush a privilege entity in the database
     * @param privilegeInput
     * @return the privilege created
     */
    override fun create(privilegeInput: PrivilegeInput): PrivilegeDetails?{
        val privilege : Privilege = privilegeMapper.privilegeInputToPrivilege(privilegeInput)
        return privilegeMapper.privilegeToPrivilegeDetails(
            privilegeRepository.save(privilege)
        )
    }

    /**
     * Update a privilege entity in the database
     * @param privilegeInput the dto input for privilege
     * @return the new privilege created
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun update(privilegeInput: PrivilegeInput): PrivilegeDetails? {
        val privilege : Privilege = privilegeRepository.findById(privilegeInput.id!!).orElse(null)
            ?: throw java.util.NoSuchElementException(
                String.format(
                    "The privilege with the id: %s not found!",
                    privilegeInput.id
                )
            )
        val privilegeUpdate: Privilege = privilege
        privilegeMapper.privilegeInputToPrivilege(privilegeInput)
        return privilegeMapper.privilegeToPrivilegeDetails(privilegeRepository.save(privilegeUpdate))
    }

    /**
     * Delete a privilege by id from Database
     * @param id of the privilege
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun deleteById(id: Long) {
        privilegeRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The privilege with the id: %s not found!", id))
        privilegeRepository.deleteById(id)
    }

}

/**                           ---Repairs---                    **/

interface RepairService {
    /**
     * Find all repair
     * @return a list of repair
     */
    fun findAll(): List<RepairResult>?

    /**
     * Get one repair by id
     * @param id of the repair
     * @return the repair found
     */
    fun findById(id: Long): RepairResult?

    /**
     * Save and flush a repair entity in the database
     * @param repairInput
     * @return the repair created
     */
    fun create(repairInput: RepairInput): RepairResult?

    /**
     * Update a repair entity in the database
     * @param repairInput the dto input for repair
     * @return the new repair created
     */
    fun update(repairInput: RepairInput): RepairResult?

    /**
     * Delete a repair by id from Database
     * @param id of the repair
     */
    fun deleteById(id: Long)
}

@Service
class AbstractRepairService(

    @Autowired
    val repairRepository: RepairRepository,
    @Autowired
    val repairMapper: RepairMapper ,
) : RepairService {

    /**
     * Find all repair
     * @return a list of repair
     */
    override fun findAll(): List<RepairResult>? {
        return repairMapper.repairListToRepairListResult(
            repairRepository.findAll()
        )
    }

    /**
     * Get one repair by id
     * @param id of the repair
     * @return the repair found
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun findById(id: Long): RepairResult? {
        val repair:Repair = repairRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The repair with the id: %s not found!", id))
        return repairMapper.repairToRepairResult(repair)
    }

    /**
     * Save and flush a repair entity in the database
     * @param repairInput
     * @return the repair created
     */
    override fun create(repairInput: RepairInput): RepairResult? {
        val repair:Repair = repairMapper.repairInputToRepair(repairInput)
        return repairMapper.repairToRepairResult(
            repairRepository.save(repair)
        )
    }

    /**
     * Update a repair entity in the database
     * @param repairInput the dto input for repair
     * @return the new repair created
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun update(repairInput: RepairInput): RepairResult? {
        val repair:Repair = repairRepository.findById(repairInput.id!!).orElse(null)
            ?: throw java.util.NoSuchElementException(
                String.format(
                    "The repair with the id: %s not found!",
                    repairInput.id
                )
            )
        val repairUpdate: Repair = repair
        repairMapper.repairInputToRepair(repairInput, repairUpdate)
        return repairMapper.repairToRepairResult(repairRepository.save(repairUpdate))
    }

    /**
     * Delete a repair by id from Database
     * @param id of the repair
     */
    @Throws(java.util.NoSuchElementException::class)
    override fun deleteById(id: Long) {
        repairRepository.findById(id).orElse(null)
            ?: throw java.util.NoSuchElementException(String.format("The repair with the id: %s not found!", id))
        repairRepository.deleteById(id)
    }

}

// Security

@Service
@Transactional
class AppUserDetailsService(
    @Autowired
    val userRepository: UserRepository,
    @Autowired
    val roleRepository: RoleRepository,
    @Autowired
    val roleMapper: RoleMapper,
) : UserDetailsService {

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
    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String): UserDetails {
        var userAuth: org.springframework.security.core.userdetails.User
        val user: User = (userRepository.findByEmail(username).orElse(null)
            ?: return org.springframework.security.core.userdetails.User(
                "", "", true, true, true, true,
                getAuthorities(
                    Arrays.asList(
                        roleRepository.findByName("ROLE_USER").get())))) as User
        userAuth = org.springframework.security.core.userdetails.User(
            user.email, user.password, user.enabled, true, true,
            true, getAuthorities(user.roleList!!.toMutableList()))

        return userAuth
    }

    private fun getAuthorities(
        roles: MutableList<Role>,
    ): Collection<GrantedAuthority?>? {
        return getGrantedAuthorities(getPrivileges(roles))
    }

    private fun getPrivileges(roles: MutableList<Role>?): List<String> {
        val privileges: MutableList<String> = ArrayList()
        val collection: MutableList<Privilege> = ArrayList()
        if (roles != null) {
            for (role in roles) {
                collection.addAll(role.privilegeList!!)
            }
        }
        for (item in collection) {
            privileges.add(item.name)
        }
        return privileges
    }

    private fun getGrantedAuthorities(privileges: List<String>): List<GrantedAuthority?>? {
        val authorities: MutableList<GrantedAuthority?> = ArrayList()
        for (privilege in privileges) {
            authorities.add(SimpleGrantedAuthority(privilege))
        }
        return authorities
    }

}


