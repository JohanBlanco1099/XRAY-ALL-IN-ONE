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
public class ServiceMapperImpl implements ServiceMapper {

    @Override
    public ServiceResult serviceToServiceResult(Service service) {
        if ( service == null ) {
            return null;
        }

        ServiceResult serviceResult = new ServiceResult();

        serviceResult.setId( service.getId() );
        serviceResult.setDescription( service.getDescription() );

        return serviceResult;
    }

    @Override
    public Service serviceInputToService(ServiceInput serviceInput) {
        if ( serviceInput == null ) {
            return null;
        }

        Service service = new Service();

        service.setId( serviceInput.getId() );
        service.setDescription( serviceInput.getDescription() );

        return service;
    }

    @Override
    public List<ServiceResult> serviceListToServiceListResult(List<Service> serviceList) {
        if ( serviceList == null ) {
            return null;
        }

        List<ServiceResult> list = new ArrayList<ServiceResult>( serviceList.size() );
        for ( Service service : serviceList ) {
            list.add( serviceToServiceResult( service ) );
        }

        return list;
    }

    @Override
    public void serviceInputToService(ServiceInput dto, Service service) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            service.setId( dto.getId() );
        }
        if ( dto.getDescription() != null ) {
            service.setDescription( dto.getDescription() );
        }
    }
}
