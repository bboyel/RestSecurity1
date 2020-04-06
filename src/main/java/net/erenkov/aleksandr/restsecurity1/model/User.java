package net.erenkov.aleksandr.restsecurity1.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)                                                //Связь многие ко многим
    @JoinTable(name = "user_roles",                                                     //связь через таблицу ...
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")}, //Связь первого поля
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}) //Связь второго
    private List<Role> roles;                           //Как узнают - где какой id?

}
