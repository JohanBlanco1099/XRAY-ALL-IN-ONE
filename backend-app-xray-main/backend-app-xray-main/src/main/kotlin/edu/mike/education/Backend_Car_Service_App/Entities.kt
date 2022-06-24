package edu.mike.education.Backend_Car_Service_App

import java.util.*
import javax.persistence.*



@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long?= null,
    var firstName: String?= null,
    var lastName: String?= null,
    var password: String?= null,
    var email: String?= null,
    var createDate: Date?= null,
    var enabled: Boolean,
    var tokenExpired: Boolean,
    // Entity Relationship
    @ManyToMany
    @JoinTable(
        name = "user_role",
        joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")]
    )

    var roleList: Set<Role>?= null,
    @ManyToMany(mappedBy = "userList", fetch = FetchType.LAZY)
    var repairList: Set<Repair>?= null,

    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        if (id != other.id) return false
        if (email != other.email) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + email.hashCode()
        return result
    }

    override fun toString(): String {
        return "User(id=$id, firstName='$firstName', lastName='$lastName', password='$password', email='$email', createDate=$createDate, enabled=$enabled, tokenExpired=$tokenExpired, roleList=$roleList)"
    }

}


@Entity
@Table(name = "role")
data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var name: String?= null,
    // Entity Relationship
    @ManyToMany
    @JoinTable(
        name = "role_privilege",
        joinColumns = [JoinColumn(name = "role_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "privilege_id", referencedColumnName = "id")]
    )
    var privilegeList: Set<Privilege>? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Role) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Role(id=$id, name='$name', privilegeList=$privilegeList)"
    }

}

@Entity
@Table(name = "privilege")
data class Privilege(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long? = null,
    var name: String,
    // Entity Relationship
    @ManyToMany(mappedBy = "roleList", fetch = FetchType.LAZY)
    var userList: Set<User>? = null,
    @ManyToMany(mappedBy = "privilegeList", fetch = FetchType.LAZY)
    var roleList: Set<Role>? = null,

    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Privilege) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Privilege(id=$id, name='$name', userList=$userList, roleList=$roleList)"
    }
}


@Entity
@Table(name="repair")
data class Repair(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    // Entity Relationship
    @ManyToMany
    @JoinTable(
        name = "repair_service",
        joinColumns = [JoinColumn(name = "repair_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "service_id", referencedColumnName = "id")]
    )
    var serviceList:Set<Service>,
    @ManyToMany
    @JoinTable(
        name = "repair_users",
        joinColumns = [JoinColumn(name = "repair_id", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")]
    )
    var userList:Set<User>,
    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false, referencedColumnName = "id")
    var vehicle: Vehicle,
    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false, referencedColumnName = "id")
    var status: Status

    ){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Repair) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Repair(id=$id)"
    }
}

@Entity
@Table(name="vehicle")
data class Vehicle(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var vin_num: Int?= null,
    var serial_num: Int?= null,
    var brand: String?= null,
    var car_type: String?= null,
    var engine_type: String?= null,
    // Entity Relationship
    @OneToMany(mappedBy = "vehicle")
    var repairList: Set<Repair>?= null
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vehicle) return false


        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Vehicle(id=$id, vin_num=$vin_num, serial_num=$serial_num, brand=$brand, car_type=$car_type, engine_type=$engine_type)"
    }


}




@Entity
@Table(name="status")
data class Status(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var description: String?= null,
    // Entity
    @OneToMany(mappedBy = "status")
    var repairList: Set<Repair>?= null
){


    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "status(id=$id, description='$description')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Status) return false

        if (id != other.id) return false

        return true
    }
}




@Entity
@Table(name="service")
data class Service(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var description: String?=null,
    // Entity Relationship
    @ManyToMany(mappedBy = "serviceList", fetch = FetchType.LAZY)
    var repairList: Set<Repair>? = null,
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Service) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Service(id=$id, description='$description')"
    }
}