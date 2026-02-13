package com.healthcare.symptoms.symptoms.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SymptomsCommand {

    @TargetAggregateIdentifier

    private String symptom_id;
    private String patient_id;
    private String description;


}

