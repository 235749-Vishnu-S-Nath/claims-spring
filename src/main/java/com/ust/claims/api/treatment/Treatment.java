package com.ust.claims.api.treatment;

import com.ust.claims.api.claims.Claims;
import com.ust.claims.api.hospital.Hospital;
import com.ust.claims.api.specialist.Specialist;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name="treatment_details")
public class Treatment {
    @Id
    private int treatmentId;
    private String treatmentName;
    private String treatmentDescription;
    private double treatmentAmount;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private boolean status;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "treatment")
    private Set<Specialist> specialistSet;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "treatment")
    private Set<Claims> claimsSet;
}
