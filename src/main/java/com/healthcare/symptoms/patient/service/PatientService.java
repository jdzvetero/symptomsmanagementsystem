package com.healthcare.symptoms.patient.service;

import com.healthcare.symptoms.patient.command.CreatePatientCommand;
import com.healthcare.symptoms.patient.dto.PatientDto;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PatientService implements IPatientService {

     private final CommandGateway commandGateway;


        public PatientService(CommandGateway commandGateway) {
            this.commandGateway = commandGateway;
        }

    @Override
    public String createPersonCommand(PatientDto request) {
        String patient_id = UUID.randomUUID().toString();

        CreatePatientCommand command = new CreatePatientCommand (
                patient_id,
                request.getFirst_name(),
                request.getLast_name(),
                request.getDate_of_birth(),
                request.getGender()
        );
        commandGateway.send(command);
        return  patient_id;
    }


}
