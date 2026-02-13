package com.healthcare.symptoms.patient.repository;

import com.healthcare.symptoms.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PatientRepository extends JpaRepository<Patient, String> {


}
