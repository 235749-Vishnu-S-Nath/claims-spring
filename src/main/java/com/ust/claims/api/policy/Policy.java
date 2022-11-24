package com.ust.claims.api.policy;

import com.ust.claims.api.claims.Claims;
import com.ust.claims.api.hospital.Hospital;
import com.ust.claims.api.specialist.Specialist;
import com.ust.claims.api.treatment.Treatment;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name="policy_details")
public class Policy {
    @Id
    private int policyId;
    private String policyName;
    private long policyPremiumAmount;
    private String insuranceName;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "policy")
    private Set<Claims> claimsSet;
}
