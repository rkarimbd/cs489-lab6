package cs489.ads.adsystem.service.Imp;

import cs489.ads.adsystem.model.Dentist;
import cs489.ads.adsystem.repository.DentistRepository;
import cs489.ads.adsystem.service.DentistService;
import org.springframework.stereotype.Service;

@Service
public class DentistServiceImp implements DentistService {

    public DentistServiceImp(DentistRepository dentistRepository) {
        this.dentistRepository = dentistRepository;
    }

    DentistRepository dentistRepository;
    @Override
    public Dentist addNewDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }
}
