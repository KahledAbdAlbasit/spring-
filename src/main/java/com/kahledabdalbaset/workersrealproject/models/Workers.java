package com.kahledabdalbaset.workersrealproject.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "workers")
public class Workers {
    @Id
    @Column(name = "worker_ssn")
    private int workerSsn;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(name = "e_mail")
    private String email;

    private String password;
    private String photo;
    private String address;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "midel_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "admin_ssn")
    private int adminSsn;

    // Constructor, getters, setters, and other methods
    // ...
    public enum Sex {
        Male,
        Female
    }
}

