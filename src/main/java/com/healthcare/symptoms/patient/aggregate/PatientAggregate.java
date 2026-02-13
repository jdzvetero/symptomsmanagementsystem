package com.healthcare.symptoms.patient.aggregate;

import com.healthcare.symptoms.patient.command.CreatePatientCommand;
import com.healthcare.symptoms.patient.event.PatientCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class PatientAggregate {

    @AggregateIdentifier
    private String patient_id;


    public PatientAggregate() {
    }


    @CommandHandler
    public PatientAggregate(CreatePatientCommand command) {
        // Validate command data (e.g., check for null or empty fields)
        if (command.getPatient_id() == null || command.getPatient_id().isEmpty()) {
            throw new IllegalArgumentException("patient ID cannot be null or empty");
        }

        AggregateLifecycle.apply(new PatientCreatedEvent(
                command.getPatient_id(),
                command.getFirst_name(),
                command.getLast_name(),
                command.getDate_of_birth(),
                command.getGender()
        ));

    }

    @EventSourcingHandler
    public void on(PatientCreatedEvent event) {
        this.patient_id = event.getPatient_id();
}

}