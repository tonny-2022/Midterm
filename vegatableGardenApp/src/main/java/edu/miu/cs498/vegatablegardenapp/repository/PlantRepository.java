package edu.miu.cs498.vegatablegardenapp.repository;

import edu.miu.cs498.vegatablegardenapp.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlantRepository extends JpaRepository<Plant,Integer> {
    public List<Plant> getAllByOrderByName();
    public List<Plant> getAllByOrderByPlantDate();
}
