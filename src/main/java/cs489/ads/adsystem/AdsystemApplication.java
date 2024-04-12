package cs489.ads.adsystem;

import cs489.ads.adsystem.model.*;
import cs489.ads.adsystem.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdsystemApplication implements CommandLineRunner {

	private final AddressService addressService;
	private final PatientService patientService;

	private  final SurgeryService surgeryService;

	private  final DentistService dentistService;

	private  final AppointmentService appointmentService;

	public AdsystemApplication(AddressService addressService, PatientService patientService,SurgeryService surgeryService,
							   DentistService dentistService, AppointmentService appointmentService) {
		this.addressService = addressService;
		this.patientService = patientService;
		this.surgeryService=surgeryService;
		this.dentistService=dentistService;
		this.appointmentService=appointmentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AdsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("----------Creating New Appointment-----------");

		Patient patient1 = addNewPatient("Reza", "641-233-9385");
		Surgery surgery = addNewSurgery("ENT surgery");
		Dentist dentist= addNewDentist("Prince");

		Appointment appointment= addAppointment(LocalDate.of(2024,4,11),patient1,surgery,dentist);


	}

	private Address addNewAddress(String street, String city, String state, String zipCode) {
		Address address = new Address( null,street,  city,  state,  zipCode);
		return addressService.newAddress(address);
	}

	private Patient addNewPatient(String name, String contactPhone) {


		List<Appointment> appointmentList=new ArrayList<>();

		Address address2 = new Address(null,"1000 n 4th str", "Fiarfield", "IA", "52557");
		Patient  patient = new Patient( null,name,  contactPhone,  address2,appointmentList);

		return patientService.addNewPatient(patient);



	}

	private Surgery addNewSurgery(String name) {

		Address address2 = new Address(null,"1000 n 4th str", "Fiarfield", "IA", "52558");
		Surgery  surgery = new Surgery( null,name,  address2);

		return surgeryService.addSurgery(surgery);



	}

	private Dentist addNewDentist(String name) {

		List<Appointment> appointmentList=new ArrayList<>();
		Dentist dentist=new Dentist(null,name,appointmentList);
       return  dentistService.addNewDentist(dentist);



	}

	private Appointment addAppointment(LocalDate AppointmentDate,Patient patientid, Surgery surgeryid,Dentist dentistid) {


		Appointment appointment=new Appointment(null,AppointmentDate, patientid,surgeryid,dentistid);
		return  appointmentService.addNewAppointment(appointment);



	}

}
