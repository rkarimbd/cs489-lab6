package cs489.ads.adsystem.service;

import cs489.ads.adsystem.model.Dentist;
import org.springframework.stereotype.Service;


public interface DentistService {
    Dentist addNewDentist(Dentist dentist);
}
