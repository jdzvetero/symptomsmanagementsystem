package com.healthcare.symptoms.patient.service;

import com.healthcare.symptoms.patient.dto.PatientDto;

public interface IPatientService {

    String createPersonCommand(PatientDto request);
    default void updatePersonCommand(){};
   default void deletePersonCommand(){};


}
