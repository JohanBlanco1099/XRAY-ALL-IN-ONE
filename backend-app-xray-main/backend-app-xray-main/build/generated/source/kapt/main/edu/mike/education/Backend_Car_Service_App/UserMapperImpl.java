package edu.mike.education.Backend_Car_Service_App;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-16T14:44:58-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResult userToUserResult(User user) {
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

    @Override
    public User userInputToUser(UserInput userInput) {
        if ( userInput == null ) {
            return null;
        }

        Date createDate = null;
        Long id = null;
        String firstName = null;
        String lastName = null;
        String password = null;
        String email = null;
        boolean enabled = false;
        Set<Role> roleList = null;

        if ( userInput.getCreateDate() != null ) {
            createDate = userInput.getCreateDate();
        }
        else {
            createDate = new java.util.Date();
        }
        id = userInput.getId();
        firstName = userInput.getFirstName();
        lastName = userInput.getLastName();
        password = userInput.getPassword();
        email = userInput.getEmail();
        if ( userInput.getEnabled() != null ) {
            enabled = userInput.getEnabled();
        }
        roleList = roleDetailsListToRoleSet( userInput.getRoleList() );

        boolean tokenExpired = false;
        Set<Repair> repairList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList, repairList );

        return user;
    }

    @Override
    public void userInputToUser(UserInput dto, User user) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            user.setId( dto.getId() );
        }
        if ( dto.getFirstName() != null ) {
            user.setFirstName( dto.getFirstName() );
        }
        if ( dto.getLastName() != null ) {
            user.setLastName( dto.getLastName() );
        }
        if ( dto.getPassword() != null ) {
            user.setPassword( dto.getPassword() );
        }
        if ( dto.getEmail() != null ) {
            user.setEmail( dto.getEmail() );
        }
        if ( dto.getCreateDate() != null ) {
            user.setCreateDate( dto.getCreateDate() );
        }
        if ( dto.getEnabled() != null ) {
            user.setEnabled( dto.getEnabled() );
        }
        if ( user.getRoleList() != null ) {
            Set<Role> set = roleDetailsListToRoleSet( dto.getRoleList() );
            if ( set != null ) {
                user.getRoleList().clear();
                user.getRoleList().addAll( set );
            }
        }
        else {
            Set<Role> set = roleDetailsListToRoleSet( dto.getRoleList() );
            if ( set != null ) {
                user.setRoleList( set );
            }
        }
    }

    @Override
    public List<UserResult> userListToUserListResult(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserResult> list = new ArrayList<UserResult>( userList.size() );
        for ( User user : userList ) {
            list.add( userToUserResult( user ) );
        }

        return list;
    }

    @Override
    public User userLoginInput(UserLoginInput userLoginInput) {
        if ( userLoginInput == null ) {
            return null;
        }

        String password = null;

        password = userLoginInput.getPassword();

        Long id = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        Date createDate = null;
        boolean enabled = false;
        boolean tokenExpired = false;
        Set<Role> roleList = null;
        Set<Repair> repairList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList, repairList );

        return user;
    }

    @Override
    public User userSignUpInput(UserSignUpInput userSignUpInput) {
        if ( userSignUpInput == null ) {
            return null;
        }

        String firstName = null;
        String lastName = null;
        String password = null;
        String email = null;

        firstName = userSignUpInput.getFirstName();
        lastName = userSignUpInput.getLastName();
        password = userSignUpInput.getPassword();
        email = userSignUpInput.getEmail();

        Long id = null;
        Date createDate = null;
        boolean enabled = false;
        boolean tokenExpired = false;
        Set<Role> roleList = null;
        Set<Repair> repairList = null;

        User user = new User( id, firstName, lastName, password, email, createDate, enabled, tokenExpired, roleList, repairList );

        return user;
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
}
