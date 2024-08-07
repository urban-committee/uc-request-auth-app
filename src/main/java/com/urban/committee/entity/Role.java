package com.urban.committee.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.urban.committee.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @JsonIgnore
    @Enumerated(EnumType.STRING)
    private RoleEnum name;

    public Role() {

    }

    public Role(RoleEnum name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleEnum getName() {
        return name;
    }

    public void setName(RoleEnum name) {
        this.name = name;
    }
}
