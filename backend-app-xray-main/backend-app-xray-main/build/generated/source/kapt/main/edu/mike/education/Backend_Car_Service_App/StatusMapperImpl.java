package edu.mike.education.Backend_Car_Service_App;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-16T14:44:58-0600",
    comments = "version: 1.5.0.RC1, compiler: IncrementalProcessingEnvironment from kotlin-annotation-processing-gradle-1.6.10.jar, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class StatusMapperImpl implements StatusMapper {

    @Override
    public StatusDetails statusToStatusDetails(Status status) {
        if ( status == null ) {
            return null;
        }

        StatusDetails statusDetails = new StatusDetails();

        statusDetails.setId( status.getId() );
        statusDetails.setDescription( status.getDescription() );

        return statusDetails;
    }

    @Override
    public List<StatusDetails> statusListToStatusDetailsList(List<Status> statusList) {
        if ( statusList == null ) {
            return null;
        }

        List<StatusDetails> list = new ArrayList<StatusDetails>( statusList.size() );
        for ( Status status : statusList ) {
            list.add( statusToStatusDetails( status ) );
        }

        return list;
    }
}
