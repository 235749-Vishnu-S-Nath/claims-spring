package com.ust.claims.api.claims;

import com.ust.claims.api.hospital.Hospital;
import com.ust.claims.api.patient.Patient;
import com.ust.claims.api.policy.Policy;
import com.ust.claims.api.specialist.Specialist;
import com.ust.claims.api.treatment.Treatment;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "claims_details")
public class Claims {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int claimsId;
    private int capableAmount;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;

    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private Specialist specialist;

    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private boolean status;
}
