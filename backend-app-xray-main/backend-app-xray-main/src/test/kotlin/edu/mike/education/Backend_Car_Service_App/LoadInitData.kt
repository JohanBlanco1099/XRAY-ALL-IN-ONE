package edu.mike.education.Backend_Car_Service_App

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Profile
import org.springframework.test.context.jdbc.Sql

@Profile("initlocal")
@SpringBootTest
@Sql("/import-database.sql")
/**
 * This class will load the initial data into the database
 */
class LoadInitData (
    @Autowired
    val vehicleRepository: VehicleRepository,
) {

    @Test
    fun testVehicleFindAll() {
        val vehicleList: List<Vehicle> = vehicleRepository.findAll()
        Assertions.assertTrue(vehicleList.size == 3)
    }
}