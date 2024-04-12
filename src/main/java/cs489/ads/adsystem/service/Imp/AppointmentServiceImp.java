package cs489.ads.adsystem.service.Imp;

import cs489.ads.adsystem.model.Appointment;
import cs489.ads.adsystem.repository.AppoointmentRepository;
import cs489.ads.adsystem.service.AppointmentService;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImp implements AppointmentService {

    public AppointmentServiceImp(AppoointmentRepository appoointmentRepository) {
        this.appoointmentRepository = appoointmentRepository;
    }

    AppoointmentRepository appoointmentRepository;
    @Override
    public Appointment addNewAppointment(Appointment appointment) {
        return appoointmentRepository.save(appointment);
    }
}
