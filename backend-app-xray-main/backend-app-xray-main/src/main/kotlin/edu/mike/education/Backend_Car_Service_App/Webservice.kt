package edu.mike.education.Backend_Car_Service_App

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

//Todas las pruebas sirven correctamente
/**                          ---STATUS---                    **/
@RestController
@RequestMapping("\${url.status}")
class StatusController(private val statusService: StatusService) {

    /**
     * WS to find all elements of type status
     * @return A list of elements of type status
     */
    @GetMapping
    @ResponseBody
    fun findAll() = statusService.findAll()

    /**
     * WS to find one status by the id
     * @param id to find status
     * @return the status found
     */
    @Throws(NoSuchElementException::class)
    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = statusService.findById(id)
}

/**                           ---VEHICLES---                    **/

@RestController
@RequestMapping("\${url.vehicles}")
class VehicleController(private val vehicleService: VehicleService) {

    @GetMapping
    @ResponseBody
    fun findAll() = vehicleService.findAll()

    @Throws(NoSuchElementException::class)
    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = vehicleService.findById(id)


    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody vehicleInput: VehicleInput): VehicleResult? {
        return vehicleService.create(vehicleInput)
    }

    @Throws(NoSuchElementException::class)
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun update(@RequestBody vehicleInput: VehicleInput): VehicleResult? {
        return vehicleService.update(vehicleInput)
    }

    @Throws(NoSuchElementException::class)
    @DeleteMapping("{id}")
    @ResponseBody
    fun deleteById(@PathVariable id: Long) {
        vehicleService.deleteById(id)
    }
}



/**                           ---Users---                    **/

@RestController
@RequestMapping("\${url.users}")
class UserController(private val userService: UserService) {

    @GetMapping
    @ResponseBody
    fun findAll() = userService.findAll()

    @Throws(NoSuchElementException::class)
    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = userService.findById(id)

    @Throws(NoSuchElementException::class)
    @GetMapping("email/{username}")
    @ResponseBody
    fun findByEmail(@PathVariable username: String) = userService.findByEmail(username)


    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody userInput: UserInput): UserResult? {
        return userService.create(userInput)
    }

    @Throws(NoSuchElementException::class)
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun update(@RequestBody userInput: UserInput): UserResult? {
        return userService.update(userInput)
    }

    @Throws(NoSuchElementException::class)
    @DeleteMapping("{id}")
    @ResponseBody
    fun deleteById(@PathVariable id: Long) {
        userService.deleteById(id)
    }
}

/**                           ---SERVICES---                    **/
@RestController
@RequestMapping("\${url.services}")
class ServiceController(private val serviceService: ServiceService) {

    @GetMapping
    @ResponseBody
    fun findAll() = serviceService.findAll()

    @Throws(NoSuchElementException::class)
    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = serviceService.findById(id)


    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody serviceInput: ServiceInput): ServiceResult? {
        return serviceService.create(serviceInput)
    }

    @Throws(NoSuchElementException::class)
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun update(@RequestBody serviceInput: ServiceInput): ServiceResult? {
        return serviceService.update(serviceInput)
    }

    @Throws(NoSuchElementException::class)
    @DeleteMapping("{id}")
    @ResponseBody
    fun deleteById(@PathVariable id: Long) {
        serviceService.deleteById(id)
    }
}

/**                           ---ROLES---                    **/
@RestController
@RequestMapping("\${url.roles}")
class RoleController(private val roleService: RoleService) {

    @GetMapping
    @ResponseBody
    fun findAll() = roleService.findAll()

    @Throws(NoSuchElementException::class)
    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = roleService.findById(id)


    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody roleInput: RoleInput): RoleDetails? {
        return roleService.create(roleInput)
    }

    @Throws(NoSuchElementException::class)
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun update(@RequestBody roleInput: RoleInput): RoleDetails? {
        return roleService.update(roleInput)
    }

    @Throws(NoSuchElementException::class)
    @DeleteMapping("{id}")
    @ResponseBody
    fun deleteById(@PathVariable id: Long) {
        roleService.deleteById(id)
    }
}
/**                           ---PRIVILEGES---                    **/
@RestController
@RequestMapping("\${url.privileges}")
class PrivilegesController(private val privilegeService: PrivilegeService) {

    @GetMapping
    @ResponseBody
    fun findAll() = privilegeService.findAll()

    @Throws(NoSuchElementException::class)
    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = privilegeService.findById(id)


    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody privilegeInput: PrivilegeInput): PrivilegeDetails? {
        return privilegeService.create(privilegeInput)
    }

    @Throws(NoSuchElementException::class)
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun update(@RequestBody privilegeInput: PrivilegeInput): PrivilegeDetails? {
        return privilegeService.update(privilegeInput)
    }

    @Throws(NoSuchElementException::class)
    @DeleteMapping("{id}")
    @ResponseBody
    fun deleteById(@PathVariable id: Long) {
        privilegeService.deleteById(id)
    }
}

/**                           ---Repairs---                    **/

@RestController
@RequestMapping("\${url.repairs}")
class RepairController(private val repairService: RepairService) {

    @GetMapping
    @ResponseBody
    fun findAll() = repairService.findAll()

    @Throws(NoSuchElementException::class)
    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = repairService.findById(id)


    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun create(@RequestBody repairInput: RepairInput): RepairResult? {
        return repairService.create(repairInput)
    }

    @Throws(NoSuchElementException::class)
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE], produces = [MediaType.APPLICATION_JSON_VALUE])
    @ResponseBody
    fun update(@RequestBody repairInput: RepairInput): RepairResult? {
        return repairService.update(repairInput)
    }

    @Throws(NoSuchElementException::class)
    @DeleteMapping("{id}")
    @ResponseBody
    fun deleteById(@PathVariable id: Long) {
        repairService.deleteById(id)
    }
}

