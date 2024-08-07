package com.urban.committee.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user_current_address")
@Builder
public class UserCurrentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String country;
    private String zipCode;
    private String street;

}
