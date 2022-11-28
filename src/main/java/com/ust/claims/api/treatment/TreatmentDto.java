package com.ust.claims.api.treatment;

import lombok.Data;


@Data
public class TreatmentDto {
    private int treatmentId;
    private String treatmentName;
    private String treatmentDescription;
    private double treatmentAmount;
}