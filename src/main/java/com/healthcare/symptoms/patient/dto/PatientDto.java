package com.healthcare.symptoms.patient.dto;

import lombok.Value;

@Value
public class PatientDto {
     String patient_id;
     String first_name;
     String last_name;
     String date_of_birth;
     String gender;
}
