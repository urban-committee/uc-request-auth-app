package com.urban.committee.listener;


import com.urban.committee.entity.User;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

public class UserEntityListener {

    @PrePersist
    public void setDefaultValues(User user) {
        if (user.getCreatedby() == null) {
            user.setCreatedby("ADMIN");
        }
        if (user.getCreatedOn()==null){
            user.setCreatedOn(LocalDateTime.now());
        }
    }
}

