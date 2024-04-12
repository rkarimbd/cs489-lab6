package cs489.ads.adsystem.repository;

import cs489.ads.adsystem.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepositroy  extends JpaRepository<Patient,Integer> {

}
