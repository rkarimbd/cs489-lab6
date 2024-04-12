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
@Table(name="Surgerys")

public class Surgery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SurgeryID;
    private  String Name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AddressID")
    private  Address address;

    //private List<Appointment> appointmentList;

}
