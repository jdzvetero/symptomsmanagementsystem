package com.healthcare.symptoms.patient.projection;

import com.healthcare.symptoms.patient.entity.Patient;
import com.healthcare.symptoms.patient.event.PatientCreatedEvent;
import com.healthcare.symptoms.patient.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class PatientProjection {

    private final PatientRepository patientRepository;

    @EventHandler
    public void onPatientCreatedEvent(PatientCreatedEvent event) {
        log.info("Handling SampleCreatedEvent for sampleId: {}", event.getPatient_id());

        // Create entity from event data
        Patient patient = new Patient();
        patient.setPatient_id(event.getPatient_id());
        patient.setFirstName(event.getFirst_name());
        patient.setLastName(event.getLast_name());
        patient.setDateOfBirth(event.getDate_of_birth());
        patient.setGender(event.getGender());

        patientRepository.save(patient);
        log.info("Sample saved to database: {}", patient.getPatient_id());


    }


}
