package cs489.ads.adsystem.service.Imp;

import cs489.ads.adsystem.model.Surgery;
import cs489.ads.adsystem.repository.SurgeryRepository;
import cs489.ads.adsystem.service.SurgeryService;
import org.springframework.stereotype.Service;

@Service
public class SurgeryServiceImp implements SurgeryService {

    public SurgeryServiceImp(SurgeryRepository surgeryRepository) {
        this.surgeryRepository = surgeryRepository;
    }

    SurgeryRepository surgeryRepository;
    @Override
    public Surgery addSurgery(Surgery surgery) {
        return surgeryRepository.save(surgery);
    }
}
