package edu.miu.cs498.vegatablegardenapp.service;

import edu.miu.cs498.vegatablegardenapp.model.Plant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PlantService {

public List<Plant> getAllPlants();

public Optional<Plant> saveNewPlant(Plant plant);

public  Optional<Plant> updatePlantById(Integer Id,Plant plant);

public void deletePlantById(Integer Id);

List<Plant> getAllByOrderByName();
List<Plant>getAllOrderByDate();
}
