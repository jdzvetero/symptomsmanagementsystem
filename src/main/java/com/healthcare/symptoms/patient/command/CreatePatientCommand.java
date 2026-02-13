package com.healthcare.symptoms.patient.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePatientCommand {

    @TargetAggregateIdentifier
    private String patient_id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String gender;



}
