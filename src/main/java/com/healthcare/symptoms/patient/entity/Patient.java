package com.healthcare.symptoms.patient.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity (name = "patients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    private String patient_id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;


}
