package cs489.ads.adsystem.repository;

import cs489.ads.adsystem.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
