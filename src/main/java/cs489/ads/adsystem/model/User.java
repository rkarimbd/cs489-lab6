package cs489.ads.adsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String Name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_Id")
    private Role roleId;


}
