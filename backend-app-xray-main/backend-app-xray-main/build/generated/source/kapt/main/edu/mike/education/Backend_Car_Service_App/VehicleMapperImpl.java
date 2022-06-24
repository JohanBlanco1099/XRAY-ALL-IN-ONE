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
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public VehicleResult vehicleToVehicleResult(Vehicle vehicle) {
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

    @Override
    public Vehicle vehicleInputToVehicle(VehicleInput vehicleInput) {
        if ( vehicleInput == null ) {
            return null;
        }

        Vehicle vehicle = new Vehicle();

        vehicle.setId( vehicleInput.getId() );
        vehicle.setVin_num( vehicleInput.getVin_num() );
        vehicle.setSerial_num( vehicleInput.getSerial_num() );
        vehicle.setBrand( vehicleInput.getBrand() );
        vehicle.setCar_type( vehicleInput.getCar_type() );
        vehicle.setEngine_type( vehicleInput.getEngine_type() );

        return vehicle;
    }

    @Override
    public List<VehicleResult> vehicleListToVehicleListResult(List<Vehicle> vehicleList) {
        if ( vehicleList == null ) {
            return null;
        }

        List<VehicleResult> list = new ArrayList<VehicleResult>( vehicleList.size() );
        for ( Vehicle vehicle : vehicleList ) {
            list.add( vehicleToVehicleResult( vehicle ) );
        }

        return list;
    }

    @Override
    public void vehicleInputToVehicle(VehicleInput dto, Vehicle vehicle) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            vehicle.setId( dto.getId() );
        }
        if ( dto.getVin_num() != null ) {
            vehicle.setVin_num( dto.getVin_num() );
        }
        if ( dto.getSerial_num() != null ) {
            vehicle.setSerial_num( dto.getSerial_num() );
        }
        if ( dto.getBrand() != null ) {
            vehicle.setBrand( dto.getBrand() );
        }
        if ( dto.getCar_type() != null ) {
            vehicle.setCar_type( dto.getCar_type() );
        }
        if ( dto.getEngine_type() != null ) {
            vehicle.setEngine_type( dto.getEngine_type() );
        }
    }
}
