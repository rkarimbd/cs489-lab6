package cs489.ads.adsystem.service;

import cs489.ads.adsystem.model.Appointment;
import org.springframework.stereotype.Service;



public interface AppointmentService {
    Appointment addNewAppointment(Appointment appointment);
}
