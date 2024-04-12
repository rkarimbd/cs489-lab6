package cs489.ads.adsystem.model;


import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Appointments")
public class Appointment {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer  AppointmentID;
    private LocalDate AppointmentDate;



    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private  Patient  patient;
    @ManyToOne
    @JoinColumn(name = "surgery_id", nullable = false)
    private  Surgery surgery;

    @ManyToOne
    @JoinColumn(name = "dentist_id", nullable = false)
    private Dentist dentist;



}
