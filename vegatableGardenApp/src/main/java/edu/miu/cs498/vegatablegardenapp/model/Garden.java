package edu.miu.cs498.vegatablegardenapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Garden {
    public Garden(String name, Double size) {
        this.name = name;
        this.size = size;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer Id;
    private String name;
    private Double size;
    @OneToMany(mappedBy = "garden")
    private List<Plant> plantList;

    @Override
    public String toString() {
        return "Garden{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", plantList=" + plantList +
                '}';
    }
}
