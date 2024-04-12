package cs489.ads.adsystem.repository;


import cs489.ads.adsystem.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, Integer> {
}
