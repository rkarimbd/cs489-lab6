package cs489.ads.adsystem.repository;

import cs489.ads.adsystem.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist,Integer> {
}
