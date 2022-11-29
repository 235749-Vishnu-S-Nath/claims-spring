package com.ust.claims.api.specialist;

import com.ust.claims.api.claims.Claims;
import com.ust.claims.api.treatment.Treatment;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@Table(name="specialist_details")
public class Specialist {
    @Id
    private int specialistId;
    private String specialistName;
    private String qualification;
    private long specialistContactNumber;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "treatment_id")
    private Treatment treatment;

}


