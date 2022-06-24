package edu.mike.education.Backend_Car_Service_App

import org.mapstruct.*
import java.time.LocalDateTime


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface RoleMapper {
    fun roleListToRoleDetailsList(
        roleList: MutableList<Role>,
    ): Set<RoleDetails>

    fun roleToRoleDetails(
        role: Role,
    ): RoleDetails

    fun roleInputToRole(
        roleInput: RoleInput,
    ): Role
}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface PrivilegeMapper {

    fun privilegeListToPrivilegeDetailsList(
        privilegeList: MutableList<Privilege>,
    ): Set<PrivilegeDetails>

    fun privilegeToPrivilegeDetails(
        privilege: Privilege
    ): PrivilegeDetails

    fun privilegeInputToPrivilege(
        privilegeInput: PrivilegeInput,
    ): Privilege
}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface StatusMapper {
    fun statusToStatusDetails(
        status: Status
    ): StatusDetails

    fun statusListToStatusDetailsList(
        statusList:  List<Status>?,
    ): List<StatusDetails>
}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface VehicleMapper {

    fun vehicleToVehicleResult(
        vehicle: Vehicle
    ): VehicleResult

    fun vehicleInputToVehicle(
        vehicleInput: VehicleInput
    ): Vehicle

    fun vehicleListToVehicleListResult(
        vehicleList: List<Vehicle>,
    ): List<VehicleResult>

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun vehicleInputToVehicle(dto: VehicleInput, @MappingTarget vehicle: Vehicle)
}




@Mapper(
    imports = [LocalDateTime::class],
    componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE
)
interface UserMapper {
    fun userToUserResult(
       user: User
    ): UserResult

    @Mapping(target = "createDate", defaultExpression = "java(new java.util.Date())")
    fun userInputToUser(
        userInput: UserInput
    ): User

    //Para los updates
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun userInputToUser(dto: UserInput, @MappingTarget user: User )

    fun userListToUserListResult(
        userList: List<User>,
    ): List<UserResult>

    fun userLoginInput(
        userLoginInput: UserLoginInput
    ): User

    fun userSignUpInput(
        userSignUpInput: UserSignUpInput
    ): User
}




@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface ServiceMapper {

    fun serviceToServiceResult(
        service: Service
    ): ServiceResult

    fun serviceInputToService(
        serviceInput: ServiceInput
    ): Service

    fun serviceListToServiceListResult(
        serviceList: List<Service>
    ): List<ServiceResult>

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun serviceInputToService(dto: ServiceInput, @MappingTarget service: Service)



}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface RepairMapper {

    fun repairToRepairResult(
        repair: Repair
    ): RepairResult

    fun repairInputToRepair(
        repairInput: RepairInput
    ): Repair

    fun repairListToRepairListResult(
        repairList: List<Repair>,
    ): List<RepairResult>

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    fun repairInputToRepair(dto: RepairInput, @MappingTarget repair: Repair)
}





