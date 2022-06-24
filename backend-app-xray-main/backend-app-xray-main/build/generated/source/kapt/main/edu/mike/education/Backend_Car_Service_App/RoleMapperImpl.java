package edu.mike.education.Backend_Car_Service_App;

import java.util.ArrayList;
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
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Set<RoleDetails> roleListToRoleDetailsList(List<Role> roleList) {
        if ( roleList == null ) {
            return null;
        }

        Set<RoleDetails> set = new LinkedHashSet<RoleDetails>( Math.max( (int) ( roleList.size() / .75f ) + 1, 16 ) );
        for ( Role role : roleList ) {
            set.add( roleToRoleDetails( role ) );
        }

        return set;
    }

    @Override
    public RoleDetails roleToRoleDetails(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDetails roleDetails = new RoleDetails();

        roleDetails.setId( role.getId() );
        roleDetails.setName( role.getName() );
        roleDetails.setPrivilegeList( privilegeSetToPrivilegeDetailsList( role.getPrivilegeList() ) );

        return roleDetails;
    }

    @Override
    public Role roleInputToRole(RoleInput roleInput) {
        if ( roleInput == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleInput.getId() );
        role.setName( roleInput.getName() );

        return role;
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
}
