package cs489.ads.adsystem.repository;

import cs489.ads.adsystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoointmentRepository  extends JpaRepository<Appointment,Integer> {
}
