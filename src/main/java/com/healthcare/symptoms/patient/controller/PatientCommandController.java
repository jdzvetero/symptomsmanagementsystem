package com.healthcare.symptoms.patient.controller;


import com.healthcare.symptoms.patient.dto.PatientDto;
import com.healthcare.symptoms.patient.service.PatientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/patients")
@Slf4j
public class PatientCommandController {
    private final PatientService patientService;

    public PatientCommandController(PatientService patientService) {
        this.patientService = patientService;
    }


    @PostMapping
    public ResponseEntity<String> createPatient(@RequestBody PatientDto request ) {
        log.info("Received request to create patient: {}", request);
         String id =  patientService.createPersonCommand(request);
         return ResponseEntity.status(HttpStatus.CREATED).body(id);


}
}




