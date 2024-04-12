package cs489.ads.adsystem.service.Imp;

import cs489.ads.adsystem.model.Address;
import cs489.ads.adsystem.model.Patient;
import cs489.ads.adsystem.repository.AddressRepository;
import cs489.ads.adsystem.repository.PatientRepositroy;
import cs489.ads.adsystem.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PatientServiceImp implements PatientService {



    PatientRepositroy patientRepositroy;

    public PatientServiceImp(PatientRepositroy patientRepositroy) {
        this.patientRepositroy = patientRepositroy;

    }


    @Override
    public Patient addNewPatient(Patient patient) {

        return patientRepositroy.save(patient);
    }


}
