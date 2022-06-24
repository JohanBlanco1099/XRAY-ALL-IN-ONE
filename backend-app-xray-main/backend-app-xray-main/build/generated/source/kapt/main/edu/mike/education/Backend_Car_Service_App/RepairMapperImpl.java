package edu.mike.education.Backend_Car_Service_App;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-16T14:44:59-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class RepairMapperImpl implements RepairMapper {

    @Override
    public RepairResult repairToRepairResult(Repair repair) {
        if ( repair == null ) {
            return null;
        }

        RepairResult repairResult = new RepairResult();

        repairResult.setId( repair.getId() );
        repairResult.setVehicle( vehicleToVehicleResult( repair.getVehicle() ) );
        repairResult.setStatus( statusToStatusDetails( repair.getStatus() ) );
        repairResult.setUserList( userSetToUserResultList( repair.getUserList() ) );
        repairResult.setServiceList( serviceSetToServiceResultList( repair.getServiceList() ) );

        return repairResult;
    }

    @Override
    public Repair repairInputToRepair(RepairInput repairInput) {
        if ( repairInput == null ) {
            return null;
        }

        Long id = null;
        Set<Service> serviceList = null;
        Set<User> userList = null;
        Vehicle vehicle = null;
        Status status = null;

        id = repairInput.getId();
        serviceList = serviceResultListToServiceSet( repairInput.getServiceList() );
        userList = userResultListToUserSet( repairInput.getUserList() );
        vehicle = vehicleResultToVehicle( repairInput.getVehicle() );
        status = statusDetailsToStatus( repairInput.getStatus() );

        Repair repair = new Repair( id, serviceList, userList, vehicle, status );

        return repair;
    }

    @Override
    public List<RepairResult> repairListToRepairListResult(List<Repair> repairList) {
        if ( repairList == null ) {
            return null;
        }

        List<RepairResult> list = new ArrayList<RepairResult>( repairList.size() );
        for ( Repair repair : repairList ) {
            list.add( repairToRepairResult( repair ) );
        }

        return list;
    }

    @Override
    public void repairInputToRepair(RepairInput dto, Repair repair) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            repair.setId( dto.getId() );
        }
        if ( repair.getServiceList() != null ) {
            Set<Service> set = serviceResultListToServiceSet( dto.getServiceList() );
            if ( set != null ) {
                repair.getServiceList().clear();
                repair.getServiceList().addAll( set );
            }
        }
        else {
            Set<Service> set = serviceResultListToServiceSet( dto.getServiceList() );
            if ( set != null ) {
                repair.setServiceList( set );
            }
        }
        if ( repair.getUserList() != null ) {
            Set<User> set1 = userResultListToUserSet( dto.getUserList() );
            if ( set1 != null ) {
                repair.getUserList().clear();
                repair.getUserList().addAll( set1 );
            }
        }
        else {
            Set<User> set1 = userResultListToUserSet( dto.getUserList() );
            if ( set1 != null ) {
                repair.setUserList( set1 );
            }
        }
        if ( dto.getVehicle() != null ) {
            if ( repair.getVehicle() == null ) {
                repair.setVehicle( new Vehicle() );
            }
            vehicleResultToVehicle1( dto.getVehicle(), repair.getVehicle() );
        }
        if ( dto.getStatus() != null ) {
            if ( repair.getStatus() == null ) {
                repair.setStatus( new Status() );
            }
            statusDetailsToStatus1( dto.getStatus(), repair.getStatus() );
        }
    }

    protected VehicleResult vehicleToVehicleResult(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleResult vehicleResult = new VehicleResult();

        vehicleResult.setId( vehicle.getId() );
        vehicleResult.setVin_num( vehicle.getVin_num() );
        vehicleResult.setSerial_num( vehicle.getSerial_num() );
        vehicleResult.setBrand( vehicle.getBrand() );
        vehicleResult.setCar_type( vehicle.getCar_type() );
        vehicleResult.setEngine_type( vehicle.getEngine_type() );

        return vehicleResult;
    }

    protected StatusDetails statusToStatusDetails(Status status) {
        if ( status == null ) {
            return null;
        }

        StatusDetails statusDetails = new StatusDetails();

        statusDetails.setId( status.getId() );
        statusDetails.setDescription( status.getDescription() );

        return statusDetails;
    }

    protected PrivilegeDetails privilegeToPrivilegeDetails(Privilege privilege) {
        if ( privilege == null ) {
            return null;
        }

        PrivilegeDetails privilegeDetails = new PrivilegeDetails();

        privilegeDetails.setId( privilege.getId() );
        privilegeDetails.setName( privilege.getName() );

        return privilegeDetails;
    }

    protected List<PrivilegeDetails> privilegeSetToPrivilegeDetailsList(Set<Privilege> set) {
        if ( set == null ) {
            return null;
        }

        List<PrivilegeDetails> list = new ArrayList<PrivilegeDetails>( set.size() );
        for ( Privilege privilege : set ) {
            list.add( privilegeToPrivilegeDetails( privilege ) );
        }

        return list;
    }

    protected RoleDetails roleToRoleDetails(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDetails roleDetails = new RoleDetails();

        roleDetails.setId( role.getId() );
        roleDetails.setName( role.getName() );
        roleDetails.setPrivilegeList( privilegeSetToPrivilegeDetailsList( role.getPrivilegeList() ) );

        return roleDetails;
    }

    protected List<RoleDetails> roleSetToRoleDetailsList(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        List<RoleDetails> list = new ArrayList<RoleDetails>( set.size() );
        for ( Role role : set ) {
            list.add( roleToRoleDetails( role ) );
        }

        return list;
    }

    protected UserResult userToUserResult(User user) {
        if ( user == null ) {
            return null;
        }

        UserResult userResult = new UserResult();

        userResult.setId( user.getId() );
        userResult.setFirstName( user.getFirstName() );
        userResult.setLastName( user.getLastName() );
        userResult.setEmail( user.getEmail() );
        userResult.setPassword( user.getPassword() );
        userResult.setEnabled( user.getEnabled() );
        userResult.setTokenExpired( user.getTokenExpired() );
        userResult.setCreateDate( user.getCreateDate() );
        userResult.setRoleList( roleSetToRoleDetailsList( user.getRoleList() ) );

        return userResult;
    }

    protected List<UserResult> userSetToUserResultList(Set<User> set) {
        if ( set == null ) {
            return null;
        }

        List<UserResult> list = new ArrayList<UserResult>( set.size() );
        for ( User user : set ) {
            list.add( userToUserResult( user ) );
        }

        return list;
    }

    protected ServiceResult serviceToServiceResult(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceResult serviceResult = new ServiceResult();

        serviceResult.setId( service.getId() );
        serviceResult.setDescription( service.getDescription() );

        return serviceResult;
    }

    protected List<ServiceResult> serviceSetToServiceResultList(Set<Service> set) {
        if ( set == null ) {
            return null;
        }

        List<ServiceResult> list = new ArrayList<ServiceResult>( set.size() );
        for ( Service service : set ) {
            list.add( serviceToServiceResult( service ) );
        }

        return list;
    }

    protected Service serviceResultToService(ServiceResult serviceResult) {
        if ( serviceResult == null ) {
            return null;
        }

        Service service = new Service();

        service.setId( serviceResult.getId() );
        service.setDescription( serviceResult.getDescription() );

        return service;
    }

    protected Set<Service> serviceResultListToServiceSet(List<ServiceResult> list) {
        if ( list == null ) {
            return null;
        }

        Set<Service> set = new LinkedHashSet<Service>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( ServiceResult serviceResult : list ) {
            set.add( serviceResultToService( serviceResult ) );
        }

        return set;
    }

    protected Privilege privilegeDetailsToPrivilege(PrivilegeDetails privilegeDetails) {
        if ( privilegeDetails == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = privilegeDetails.getId();
        name = privilegeDetails.getName();

        Set<User> userList = null;
        Set<Role> roleList = null;

        Privilege privilege = new Privilege( id, name, userList, roleList );

        return privilege;
    }

    protected Set<Privilege> privilegeDetailsListToPrivilegeSet(List<PrivilegeDetails> list) {
        if ( list == null ) {
            return null;
        }

        Set<Privilege> set = new LinkedHashSet<Privilege>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( PrivilegeDetails privilegeDetails : list ) {
            set.add( privilegeDetailsToPrivilege( privilegeDetails ) );
        }

        return set;
    }

    protected Role roleDetailsToRole(RoleDetails roleDetails) {
        if ( roleDetails == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDetails.getId() );
        role.setName( roleDetails.getName() );
        role.setPrivilegeList( privilegeDetailsListToPrivilegeSet( roleDetails.getPrivilegeList() ) );

        return role;
    }

    protected Set<Role> roleDetailsListToRoleSet(List<RoleDetails> list) {
        if ( list == null ) {
            return null;
        }

        Set<Role> set = new LinkedHashSet<Role>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( RoleDetails roleDetails : list ) {
            set.add( roleDetailsToRole( roleDetails ) );
        }

        return set;
    }

    protected User userResultToUser(UserResult userResult) {
        if ( userResult == null ) {
            return null;
        }

        Long id = null;
        String firstName = null;
        String lastName = null;
        String password = null;
        String email = null;
        Date createDate = null;
        boolean enabled = false;
        boolean tokenExpired = false;
        Set<Role> roleList = null;

        id = userResult.getId();
        firstName = userResult.getFirstName();
        lastName = userResult.getLastName();
        password = userResult.getPassword();
        email = userResult.getEmail();
        createDate = userResult.getCreateDate();
        if ( userResult.getEnabled() != null ) {
            enabled = userResult.getEnabled();
        }
        if ( userResult.getTokenExpired() != null ) {
            tokenExpired = userResult.getTokenExpired();
        }
        roleList = roleDetailsListToRoleSet( userResult.getRoleList() );

        Set<Repair> repairList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList, repairList );

        return user;
    }

    protected Set<User> userResultListToUserSet(List<UserResult> list) {
        if ( list == null ) {
            return null;
        }

        Set<User> set = new LinkedHashSet<User>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( UserResult userResult : list ) {
            set.add( userResultToUser( userResult ) );
        }

        return set;
    }

    protected Vehicle vehicleResultToVehicle(VehicleResult vehicleResult) {
        if ( vehicleResult == null ) {
            return null;
        }

        Vehicle vehicle = new Vehicle();

        vehicle.setId( vehicleResult.getId() );
        vehicle.setVin_num( vehicleResult.getVin_num() );
        vehicle.setSerial_num( vehicleResult.getSerial_num() );
        vehicle.setBrand( vehicleResult.getBrand() );
        vehicle.setCar_type( vehicleResult.getCar_type() );
        vehicle.setEngine_type( vehicleResult.getEngine_type() );

        return vehicle;
    }

    protected Status statusDetailsToStatus(StatusDetails statusDetails) {
        if ( statusDetails == null ) {
            return null;
        }

        Status status = new Status();

        status.setId( statusDetails.getId() );
        status.setDescription( statusDetails.getDescription() );

        return status;
    }

    protected void vehicleResultToVehicle1(VehicleResult vehicleResult, Vehicle mappingTarget) {
        if ( vehicleResult == null ) {
            return;
        }

        if ( vehicleResult.getId() != null ) {
            mappingTarget.setId( vehicleResult.getId() );
        }
        if ( vehicleResult.getVin_num() != null ) {
            mappingTarget.setVin_num( vehicleResult.getVin_num() );
        }
        if ( vehicleResult.getSerial_num() != null ) {
            mappingTarget.setSerial_num( vehicleResult.getSerial_num() );
        }
        if ( vehicleResult.getBrand() != null ) {
            mappingTarget.setBrand( vehicleResult.getBrand() );
        }
        if ( vehicleResult.getCar_type() != null ) {
            mappingTarget.setCar_type( vehicleResult.getCar_type() );
        }
        if ( vehicleResult.getEngine_type() != null ) {
            mappingTarget.setEngine_type( vehicleResult.getEngine_type() );
        }
    }

    protected void statusDetailsToStatus1(StatusDetails statusDetails, Status mappingTarget) {
        if ( statusDetails == null ) {
            return;
        }

        if ( statusDetails.getId() != null ) {
            mappingTarget.setId( statusDetails.getId() );
        }
        if ( statusDetails.getDescription() != null ) {
            mappingTarget.setDescription( statusDetails.getDescription() );
        }
    }
}
