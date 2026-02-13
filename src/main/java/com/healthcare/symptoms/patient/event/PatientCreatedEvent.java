package com.healthcare.symptoms.patient.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientCreatedEvent {

    private String patient_id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String gender;

}
