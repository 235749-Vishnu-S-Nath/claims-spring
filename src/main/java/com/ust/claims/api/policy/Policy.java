package com.ust.claims.api.policy;

import com.ust.claims.api.claims.Claims;
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
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private boolean status;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "policy")
    private Set<Claims> claimsSet;
}
