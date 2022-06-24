package edu.mike.education.Backend_Car_Service_App;

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
public class PrivilegeMapperImpl implements PrivilegeMapper {

    @Override
    public Set<PrivilegeDetails> privilegeListToPrivilegeDetailsList(List<Privilege> privilegeList) {
        if ( privilegeList == null ) {
            return null;
        }

        Set<PrivilegeDetails> set = new LinkedHashSet<PrivilegeDetails>( Math.max( (int) ( privilegeList.size() / .75f ) + 1, 16 ) );
        for ( Privilege privilege : privilegeList ) {
            set.add( privilegeToPrivilegeDetails( privilege ) );
        }

        return set;
    }

    @Override
    public PrivilegeDetails privilegeToPrivilegeDetails(Privilege privilege) {
        if ( privilege == null ) {
            return null;
        }

        PrivilegeDetails privilegeDetails = new PrivilegeDetails();

        privilegeDetails.setId( privilege.getId() );
        privilegeDetails.setName( privilege.getName() );

        return privilegeDetails;
    }

    @Override
    public Privilege privilegeInputToPrivilege(PrivilegeInput privilegeInput) {
        if ( privilegeInput == null ) {
            return null;
        }

        Long id = null;
        String name = null;

        id = privilegeInput.getId();
        name = privilegeInput.getName();

        Set<User> userList = null;
        Set<Role> roleList = null;

        Privilege privilege = new Privilege( id, name, userList, roleList );

        return privilege;
    }
}
