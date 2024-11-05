package edu.miu.cs498.vegatablegardenapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private  String type;
    private String plantDate;
    @ManyToOne
    private Garden garden;


    public Plant(String name, String type, String plantDate,Garden garden) {
        this.name = name;
        this.type = type;
        this.plantDate = plantDate;
        this.garden=garden;
    }


    public Plant(String name, String type, String plantDate) {
        this.name = name;
        this.type = type;
        this.plantDate = plantDate;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", plantDate=" + plantDate +
                ", garden=" + garden +
                '}';
    }
}
