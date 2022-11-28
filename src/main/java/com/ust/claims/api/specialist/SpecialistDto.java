package com.ust.claims.api.specialist;

import com.ust.claims.api.treatment.Treatment;
import lombok.Data;

@Data
public class SpecialistDto {

    private int specialistID;
    private String specialistName;
    private String qualification;
    private long specialistContactNumber;
    private int treatmentId;
}
