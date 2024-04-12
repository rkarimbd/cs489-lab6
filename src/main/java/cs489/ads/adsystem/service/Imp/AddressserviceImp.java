package cs489.ads.adsystem.service.Imp;

import cs489.ads.adsystem.model.Address;
import cs489.ads.adsystem.repository.AddressRepository;
import cs489.ads.adsystem.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressserviceImp  implements AddressService {

    private AddressRepository addressRepository;

    public  AddressserviceImp(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
    @Override
    public Address newAddress(Address address) {
        return addressRepository.save(address);
    }
}
