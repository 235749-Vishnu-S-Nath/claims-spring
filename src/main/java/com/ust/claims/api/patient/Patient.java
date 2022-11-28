package com.ust.claims.api.patient;

import com.ust.claims.api.claims.Claims;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name = "patient_details")
public class Patient {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int patientId;
    private String patientName;
    private int patientAge;
    private char patientGender;
    private String patientAddress;
    private long patientContactNumber;
    private String patientPictureUrl;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private boolean status;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "patient")
    private Set<Claims> claimsSet;


}
