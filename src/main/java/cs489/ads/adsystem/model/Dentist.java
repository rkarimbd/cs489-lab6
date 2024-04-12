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
@Table(name="Dentists")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer DentistID;
    private  String Name;

    @OneToMany(mappedBy = "dentist", cascade = CascadeType.ALL) // MappedBy points to the owning side (Appointment)
    private List<Appointment> appointmentList; // This is already defined in Appointment


}
