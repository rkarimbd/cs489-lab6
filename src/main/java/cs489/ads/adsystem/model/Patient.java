package cs489.ads.adsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Patients")
public class Patient {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PatientID;
    private  String Name;
    private  String ContactPhone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AddressID") // Specify the foreign key column in the Patients table

    private Address address;


    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL) // MappedBy points to the owning side (Appointment)

    private List<Appointment> appointmentList;



}

