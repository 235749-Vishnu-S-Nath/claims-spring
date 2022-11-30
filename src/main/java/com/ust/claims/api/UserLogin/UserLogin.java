package com.ust.claims.api.UserLogin;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="user_details")
public class UserLogin {
    @Id
    private String username;
    private String password;
    private int patientId;
}
